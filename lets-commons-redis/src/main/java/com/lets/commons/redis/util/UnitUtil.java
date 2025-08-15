package com.lets.commons.redis.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.ttl.TransmittableThreadLocal;
import com.lets.platform.client.psi.MaterialUnitConvertClient;
import com.lets.platform.client.psi.UnitClient;
import com.lets.platform.model.base.cache.MaterialUnitConvertCacheModel;
import com.lets.platform.model.base.cache.UnitCacheModel;
import com.lets.platform.model.psi.entity.PsiUnit;
import org.redisson.api.RList;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class UnitUtil {

    private static final String UNIT_CACHE_KEY_PREFIX = "tenancy_units:";
    private static final String MATERIAL_CONVERT_CACHE_KEY_PREFIX = "tenancy_material_unit_converts:";
    private static final TransmittableThreadLocal<String> tenancyIdCache = new TransmittableThreadLocal<>();
    private static final TransmittableThreadLocal<Map<String, UnitCacheModel>> localUnitIdCache = new TransmittableThreadLocal<>();
    private static final TransmittableThreadLocal<Map<String, List<MaterialUnitConvertCacheModel>>> localMaterialUnitConvertCache = new TransmittableThreadLocal<>();

    private static RedissonClient redissonClient;
    private static UnitClient unitClient;
    private static MaterialUnitConvertClient materialUnitConvertClient;

    @Autowired
    public UnitUtil(RedissonClient redissonClient, UnitClient unitClient, MaterialUnitConvertClient materialUnitConvertClient) {
        UnitUtil.redissonClient = redissonClient;
        UnitUtil.unitClient = unitClient;
        UnitUtil.materialUnitConvertClient = materialUnitConvertClient;
    }

    public static void setTenancyId(String tenancyId) {
        tenancyIdCache.set(tenancyId);
    }

    public static void clearLocalCache() {
        tenancyIdCache.remove();
        localUnitIdCache.remove();
        localMaterialUnitConvertCache.remove();
    }

    public static void removeRedis() {
        String tenancyId = tenancyIdCache.get();
        if (StrUtil.isNotEmpty(tenancyId)) {
            redissonClient.getMap(UNIT_CACHE_KEY_PREFIX + tenancyId).delete();
            redissonClient.getList(MATERIAL_CONVERT_CACHE_KEY_PREFIX + tenancyId).delete();
        } else {
            redissonClient.getKeys().deleteByPattern(UNIT_CACHE_KEY_PREFIX + "*");
            redissonClient.getKeys().deleteByPattern(MATERIAL_CONVERT_CACHE_KEY_PREFIX + "*");
        }
    }

    private static List<MaterialUnitConvertCacheModel> getMaterialUnitConvertList(String materialId) {
        return Optional.ofNullable(localMaterialUnitConvertCache.get())
                       .map(map -> map.get(materialId))
                       .orElseGet(() -> loadConvertMapFromCache().getOrDefault(materialId, Collections.emptyList()));
    }

    private static Map<String, UnitCacheModel> getUnitIdMap() {
        return Optional.ofNullable(localUnitIdCache.get())
                       .orElseGet(() -> {
                           Map<String, UnitCacheModel> map = loadUnitListFromCache();
                           localUnitIdCache.set(map);
                           return map;
                       });
    }

    public static BigDecimal getFactor(String materialId, String sourceUnitId, String targetUnitId) {
        UnitCacheModel sourceUnit = getUnitById(sourceUnitId);
        UnitCacheModel targetUnit = getUnitById(targetUnitId);
        if (sourceUnit == null || targetUnit == null) {return null;}

        if (sourceUnitId.equals(targetUnitId)) {
            return BigDecimal.ONE;
        }

        BigDecimal[] factor = getFactor(materialId, sourceUnit, targetUnit);
        return factor != null ? factor[1].divide(factor[0], 10, RoundingMode.HALF_UP) : null;
    }

    private static BigDecimal[] getFactor(String materialId, UnitCacheModel sourceUnit, UnitCacheModel targetUnit) {
        if (sourceUnit.getId().equals(targetUnit.getId())) {
            return new BigDecimal[]{BigDecimal.ONE, BigDecimal.ONE};
        }

        List<MaterialUnitConvertCacheModel> convertList = getMaterialUnitConvertList(materialId);
        MaterialUnitConvertCacheModel directConvert = convertList.stream()
                                                                 .filter(item -> item.getSourceUnitId().equals(sourceUnit.getId()) && item.getTargetUnitParentCode().equals(targetUnit.getParentCode()))
                                                                 .findFirst().orElse(null);

        if (directConvert != null) {
            BigDecimal[] factor = new BigDecimal[]{directConvert.getSourceFactor(), directConvert.getTargetFactor()};
            if (targetUnit.getId().equals(directConvert.getTargetUnitId())) {
                return factor;
            }
            UnitCacheModel baseUnit = getUnitById(directConvert.getTargetUnitId());
            if (baseUnit != null) {
                BigDecimal[] baseToTargetFactor = getFactor(baseUnit, targetUnit);
                if (baseToTargetFactor != null) {
                    factor[0] = factor[0].multiply(baseToTargetFactor[0]);
                    factor[1] = factor[1].multiply(baseToTargetFactor[1]);
                    return factor;
                }
            }
        }

        MaterialUnitConvertCacheModel reverseConvert = convertList.stream()
                                                                  .filter(item -> item.getTargetUnitParentCode().equals(sourceUnit.getParentCode()) && item.getSourceUnitId()
                                                                                                                                                           .equals(targetUnit.getId()))
                                                                  .findFirst().orElse(null);

        if (reverseConvert != null) {
            BigDecimal[] factor = new BigDecimal[]{reverseConvert.getTargetFactor(), reverseConvert.getSourceFactor()};
            if (sourceUnit.getId().equals(reverseConvert.getTargetUnitId())) {
                return factor;
            }
            UnitCacheModel baseUnit = getUnitById(reverseConvert.getTargetUnitId());
            if (baseUnit != null) {
                BigDecimal[] factors = getFactor(sourceUnit, baseUnit);
                factor[0] = factor[0].multiply(factors[0]);
                factor[1] = factor[1].multiply(factors[1]);
                return factor;
            }
        }

        return getFactor(sourceUnit, targetUnit);
    }

    private static BigDecimal[] getFactor(UnitCacheModel sourceUnit, UnitCacheModel targetUnit) {
        if (sourceUnit == null || targetUnit == null || !sourceUnit.getParentCode().equals(targetUnit.getParentCode())) {
            return null;
        }

        if (sourceUnit.getId().equals(targetUnit.getId())) {
            return new BigDecimal[]{BigDecimal.ONE, BigDecimal.ONE};
        }

        BigDecimal[] factor = new BigDecimal[]{sourceUnit.getSourceFactor(), sourceUnit.getTargetFactor()};
        factor[0] = factor[0].multiply(targetUnit.getTargetFactor());
        factor[1] = factor[1].multiply(targetUnit.getSourceFactor());
        return factor;
    }

    private static Map<String, UnitCacheModel> loadUnitListFromCache() {
        String tenancyId = tenancyIdCache.get();
        RMap<String, String> redisUnits = redissonClient.getMap(UNIT_CACHE_KEY_PREFIX + tenancyId);
        if (!redisUnits.isExists()) {
            return fetchAndCacheUnits().stream().filter(Objects::nonNull).collect(Collectors.toMap(UnitCacheModel::getId, Function.identity()));
        }
        Map<String, UnitCacheModel> map = new HashMap<>();
        redisUnits.forEach((key, value) -> map.put(key, UnitCacheModel.fromJsonString(value)));
        return map;
    }

    private static List<UnitCacheModel> fetchAndCacheUnits() {
        List<UnitCacheModel> unitList = getUnitInDatabase();
        insertOrUpdateUnitBatch(unitList);
        return unitList;
    }

    private static List<UnitCacheModel> getUnitInDatabase() {
        String tenancyId = tenancyIdCache.get();
        List<PsiUnit> unitList = unitClient.getTenancyUnitList(tenancyId).handler();

        if (unitList == null || unitList.isEmpty()) {
            return Collections.emptyList();
        }

        return unitList.stream().map(UnitCacheModel::new).collect(Collectors.toList());
    }

    private static Map<String, List<MaterialUnitConvertCacheModel>> loadConvertMapFromCache() {
        String tenancyId = tenancyIdCache.get();
        RList<MaterialUnitConvertCacheModel> redisConverts = redissonClient.getList(MATERIAL_CONVERT_CACHE_KEY_PREFIX + tenancyId);
        if (!redisConverts.isExists()) {
            return insertOrUpdateMaterialUnitConvertBatch();
        }
        return insertOrUpdateLocalMaterialUnitConvertBatch(new ArrayList<>(redisConverts));
    }

    private static UnitCacheModel insertOrUpdateUnit(String unitId) {
        String tenancyId = tenancyIdCache.get();
        RMap<String, String> redisUnits = redissonClient.getMap(UNIT_CACHE_KEY_PREFIX + tenancyId);
        PsiUnit unit = unitClient.findById4Do(unitId).handler();

        if (unit == null) {
            redisUnits.remove(unitId);
            Map<String, UnitCacheModel> unitIdMap = localUnitIdCache.get();
            if (unitIdMap != null) {
                unitIdMap.put(unitId, null);
            }
            return null;
        }

        UnitCacheModel unitData = new UnitCacheModel(unit);
        redisUnits.put(unit.getId(), unitData.toJsonString());

        updateLocalUnitCache(unitData);
        return unitData;
    }

    private static void updateLocalUnitCache(UnitCacheModel unitData) {
        Map<String, UnitCacheModel> unitIdMap = Optional.ofNullable(localUnitIdCache.get()).orElseGet(HashMap::new);
        unitIdMap.put(unitData.getId(), unitData);
        localUnitIdCache.set(unitIdMap);
    }

    private static void insertOrUpdateUnitBatch(List<UnitCacheModel> unitList) {
        String tenancyId = tenancyIdCache.get();
        RMap<String, String> redisUnits = redissonClient.getMap(UNIT_CACHE_KEY_PREFIX + tenancyId);
        unitList.forEach(unit -> {
            redisUnits.put(unit.getId(), unit.toJsonString());
            updateLocalUnitCache(unit);
        });
    }

    private static Map<String, List<MaterialUnitConvertCacheModel>> insertOrUpdateMaterialUnitConvertBatch() {
        String tenancyId = tenancyIdCache.get();
        RList<MaterialUnitConvertCacheModel> redisConverts = redissonClient.getList(MATERIAL_CONVERT_CACHE_KEY_PREFIX + tenancyId);
        List<MaterialUnitConvertCacheModel> materialUnitConvertList = materialUnitConvertClient.getList().handler().stream()
                                                                                               .map(MaterialUnitConvertCacheModel::new).collect(Collectors.toList());
        redisConverts.clear();
        if (CollUtil.isEmpty(materialUnitConvertList)) {
            redisConverts.add(new MaterialUnitConvertCacheModel(null));
        } else {
            redisConverts.addAll(materialUnitConvertList);
        }
        return insertOrUpdateLocalMaterialUnitConvertBatch(materialUnitConvertList);
    }

    private static Map<String, List<MaterialUnitConvertCacheModel>> insertOrUpdateLocalMaterialUnitConvertBatch(List<MaterialUnitConvertCacheModel> convertList) {
        Map<String, List<MaterialUnitConvertCacheModel>> convertMap = convertList.stream().filter(convert -> StrUtil.isNotEmpty(convert.getMaterialId()))
                                                                                 .collect(Collectors.groupingBy(MaterialUnitConvertCacheModel::getMaterialId,
                                                                                                                Collectors.toList()));
        localMaterialUnitConvertCache.set(convertMap);
        return convertMap;
    }

    public static UnitCacheModel getUnitById(String unitId) {
        if (StrUtil.isEmpty(unitId)) {
            return null;
        }
        return Optional.ofNullable(getUnitIdMap().get(unitId))
                       .orElseGet(() -> insertOrUpdateUnit(unitId));
    }

    public static Boolean convertable(String materialId, String sourceUnitId, String targetUnitId) {
        UnitCacheModel sourceUnit = getUnitById(sourceUnitId);
        UnitCacheModel targetUnit = getUnitById(targetUnitId);
        return sourceUnit != null && targetUnit != null && (sourceUnitId.equals(targetUnitId) || getFactor(materialId, sourceUnit, targetUnit) != null);
    }

    public static BigDecimal convert(BigDecimal value, String materialId, String sourceUnitId, String targetUnitId) {
        UnitCacheModel targetUnit = getUnitById(targetUnitId);
        if (targetUnit == null) {return null;}
        return convert(value, materialId, sourceUnitId, targetUnitId, targetUnit.getAccuracy(), targetUnit.getRoundOffType());
    }

    public static BigDecimal convert(BigDecimal value, String materialId, String sourceUnitId, String targetUnitId, Integer accuracy, String roundingMode) {
        return convert(value, materialId, sourceUnitId, targetUnitId, accuracy, RoundingMode.valueOf(Integer.parseInt(roundingMode)));
    }

    public static BigDecimal convert(BigDecimal value, String materialId, String sourceUnitId, String targetUnitId, Integer accuracy, Integer roundingMode) {
        return convert(value, materialId, sourceUnitId, targetUnitId, accuracy, RoundingMode.valueOf(roundingMode));
    }

    public static BigDecimal convert(BigDecimal value, String materialId, String sourceUnitId, String targetUnitId, Integer accuracy, RoundingMode roundingMode) {
        if (value == null || value.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.ZERO;
        }

        if (StrUtil.isEmpty(sourceUnitId) || StrUtil.isEmpty(targetUnitId)) {
            return null;
        }

        UnitCacheModel sourceUnit = getUnitById(sourceUnitId);
        UnitCacheModel targetUnit = getUnitById(targetUnitId);

        if (sourceUnit == null || targetUnit == null) {return null;}

        if (sourceUnitId.equals(targetUnitId)) {
            return value.setScale(accuracy, roundingMode);
        }

        BigDecimal[] factor = getFactor(materialId, sourceUnit, targetUnit);
        if (factor != null) {
            return value.multiply(factor[1]).divide(factor[0], accuracy, roundingMode);
        }
        return null;
    }

    @PostConstruct
    public void init() {
        removeRedis();
    }
}
