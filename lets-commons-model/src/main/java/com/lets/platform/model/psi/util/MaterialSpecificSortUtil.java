package com.lets.platform.model.psi.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.common.vo.MaterialSpecific;
import com.lets.platform.model.psi.entity.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 物料特征属性排序
 */
public class MaterialSpecificSortUtil {

    public static <T extends MaterialSpecific> String getMaterialSpecific(List<T> specifics) {
        StringBuilder materialSpecific = new StringBuilder();
        if (CollUtil.isNotEmpty(specifics)) {
            specifics = specifics.stream()
                                 .filter(x -> StringUtils.isNotBlank(x.getValue()))
                                 .sorted(Comparator.comparing(T::getSpecificId).thenComparing(T::getValue)).collect(Collectors.toList());
            if (CollUtil.isNotEmpty(specifics)) {
                for (int i = 0; i < specifics.size(); i++) {
                    T specific = specifics.get(i);
                    materialSpecific.append(specific.getSpecificId());
                    materialSpecific.append(GlobalConstant.COLON_HALF_ANGLE);
                    String value = specific.getValue();
                    if (StringUtils.isBlank(specific.getName())) {
                        specific.setName(value);
                    }
                    materialSpecific.append(value);
                    if (i < specifics.size() - 1) {
                        materialSpecific.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
                    }
                }
            }
        }
        return materialSpecific.toString();
    }

    public static <T extends MaterialSpecific> String getMaterialSpecificName(List<T> specifics) {
        StringBuilder materialSpecific = new StringBuilder();
        if (CollUtil.isNotEmpty(specifics)) {
            specifics = specifics.stream()
                                 .filter(x -> StringUtils.isNotBlank(x.getValue()))
                                 .sorted(Comparator.comparing(T::getSpecificId).thenComparing(T::getValue)).collect(Collectors.toList());
            if (CollUtil.isNotEmpty(specifics)) {
                for (int i = 0; i < specifics.size(); i++) {
                    T specific = specifics.get(i);
                    materialSpecific.append(specific.getSpecificName());
                    materialSpecific.append(GlobalConstant.COLON_HALF_ANGLE);
                    String value = specific.getValue();
                    if (StringUtils.isBlank(specific.getName())) {
                        specific.setName(value);
                    }
                    materialSpecific.append(specific.getName());
                    if (i < specifics.size() - 1) {
                        materialSpecific.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
                    }
                }
            }
        }
        return materialSpecific.toString();
    }

    public static <T extends MaterialSpecific> List<T> getMaterialSpecificList(String specifics) {
        if (StrUtil.isEmpty(specifics)) {
            return new ArrayList<>();
        }
        String[] specificsArr = specifics.split(GlobalConstant.SEMICOLON_HALF_ANGLE);
        List<T> specificList = new ArrayList<>();
        for (int i = 0; i < specificsArr.length; i++) {
            String[] specificArr = specificsArr[i].split(GlobalConstant.COLON_HALF_ANGLE);
            T specific = (T) new MaterialSpecific();
            specific.setSpecificId(specificArr[0]);
            specific.setValue(specificArr[1]);
            specificList.add(specific);
        }
        return specificList;
    }

    public static <T extends MaterialSpecific> List<T> getMaterialSpecificList(String specifics, String specificNames) {
        if (StrUtil.isEmpty(specifics) || StrUtil.isEmpty(specificNames)) {
            return new ArrayList<>();
        }
        String[] specificsArr = specifics.split(GlobalConstant.SEMICOLON_HALF_ANGLE);
        String[] specificNamesArr = specificNames.split(GlobalConstant.SEMICOLON_HALF_ANGLE);
        List<T> specificList = new ArrayList<>();
        for (int i = 0; i < specificsArr.length; i++) {
            String[] specificArr = specificsArr[i].split(GlobalConstant.COLON_HALF_ANGLE);
            String[] specificNameArr = specificNamesArr[i].split(GlobalConstant.COLON_HALF_ANGLE);

            T specific = (T) new MaterialSpecific();
            specific.setSpecificId(specificArr[0]);
            specific.setSpecificName(specificNameArr[0]);
            specific.setValue(specificArr[1]);
            specific.setName(specificNameArr[1]);
            specificList.add(specific);
        }
        return specificList;
    }

    public static <T extends MaterialSpecific> List<T> getMaterialSpecificList(String specifics, String specificNames, Class<T> clazz) {
        if (StrUtil.isEmpty(specifics) || StrUtil.isEmpty(specificNames)) {
            return new ArrayList<>();
        }
        String[] specificsArr = specifics.split(GlobalConstant.SEMICOLON_HALF_ANGLE);
        String[] specificNamesArr = specificNames.split(GlobalConstant.SEMICOLON_HALF_ANGLE);
        List<T> specificList = new ArrayList<>();
        for (int i = 0; i < specificsArr.length; i++) {
            String[] specificArr = specificsArr[i].split(GlobalConstant.COLON_HALF_ANGLE);
            String[] specificNameArr = specificNamesArr[i].split(GlobalConstant.COLON_HALF_ANGLE);

            T specific;
            try {
                specific = clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            specific.setSpecificId(specificArr[0]);
            specific.setSpecificName(specificNameArr[0]);
            specific.setValue(specificArr[1]);
            specific.setName(specificNameArr[1]);
            specificList.add(specific);
        }
        return specificList;
    }

    public static String[] getShowAndMaterialSpecific(List<PsiProducePlanSpecific> detailSpecific) {
        String[] keyAndShow = new String[2];
        StringBuilder materialSpecific = new StringBuilder();
        StringBuilder showMaterialSpecific = new StringBuilder();
        if (CollUtil.isNotEmpty(detailSpecific)) {
            detailSpecific = detailSpecific.stream()
                                           .filter(x -> StringUtils.isNotBlank(x.getValue()))
                                           .sorted(Comparator.comparing(PsiProducePlanSpecific::getSpecificId).thenComparing(PsiProducePlanSpecific::getValue)).collect(Collectors.toList());
            if (CollUtil.isNotEmpty(detailSpecific)) {
                for (int i = 0; i < detailSpecific.size(); i++) {
                    PsiProducePlanSpecific specific = detailSpecific.get(i);
                    materialSpecific.append(specific.getSpecificId());
                    materialSpecific.append(GlobalConstant.COLON_HALF_ANGLE);
                    showMaterialSpecific.append(specific.getSpecificName());
                    showMaterialSpecific.append(GlobalConstant.COLON_HALF_ANGLE);
                    String value = specific.getValue();
                    if (StringUtils.isBlank(specific.getName())) {
                        specific.setName(value);
                    }
                    materialSpecific.append(value);
                    showMaterialSpecific.append(specific.getName());
                    if (i < detailSpecific.size() - 1) {
                        materialSpecific.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
                        showMaterialSpecific.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
                    }
                }
            }
        }
        keyAndShow[0] = materialSpecific.toString();
        keyAndShow[1] = showMaterialSpecific.toString();
        return keyAndShow;
    }

    public static <T extends MaterialSpecific> String getKey(PsiStoreMaterial storeMaterial, List<T> specificList) {
        StringBuilder key = new StringBuilder();
        String materialIdKey = storeMaterial.getMaterialId();
        key.append(materialIdKey).append(GlobalConstant.AT);
        String storeIdKey = StringUtils.isBlank(storeMaterial.getStoreId()) ? GlobalConstant.EMPTY_STR : storeMaterial.getStoreId();
        key.append(storeIdKey).append(GlobalConstant.AT);
        String areaIdKey = StringUtils.isBlank(storeMaterial.getAreaId()) ? GlobalConstant.EMPTY_STR : storeMaterial.getAreaId();
        key.append(areaIdKey).append(GlobalConstant.AT);
        String positionIdKey = StringUtils.isBlank(storeMaterial.getPositionId()) ? GlobalConstant.EMPTY_STR : storeMaterial.getPositionId();
        key.append(positionIdKey).append(GlobalConstant.AT);
        String batchNumberKey = Objects.isNull(storeMaterial.getBatchNumber()) ? GlobalConstant.EMPTY_STR : storeMaterial.getBatchNumber();
        key.append(batchNumberKey).append(GlobalConstant.AT);
        String specificKey = MaterialSpecificSortUtil.getMaterialSpecific(specificList);
        storeMaterial.setMaterialSpecific(specificKey);
        key.append(specificKey);
        return key.toString();
    }

    public static <T extends MaterialSpecific> String getShortKey(PsiStoreMaterial storeMaterial, List<T> specificList) {
        StringBuilder key = new StringBuilder();
        String materialIdKey = storeMaterial.getMaterialId();
        key.append(materialIdKey).append(GlobalConstant.AT);
        String storeIdKey = StringUtils.isBlank(storeMaterial.getStoreId()) ? GlobalConstant.EMPTY_STR : storeMaterial.getStoreId();
        key.append(storeIdKey).append(GlobalConstant.AT);
        String batchNumberKey = Objects.isNull(storeMaterial.getBatchNumber()) ? GlobalConstant.EMPTY_STR : storeMaterial.getBatchNumber();
        key.append(batchNumberKey).append(GlobalConstant.AT);
        String specificKey = MaterialSpecificSortUtil.getMaterialSpecific(specificList);
        storeMaterial.setMaterialSpecific(specificKey);
        key.append(specificKey);
        return key.toString();
    }

    public static <T extends MaterialSpecific> String getMaterialAndSpecificKey(PsiStoreMaterial storeMaterial, List<T> specificList) {
        StringBuilder key = new StringBuilder();
        String materialIdKey = storeMaterial.getMaterialId();
        key.append(materialIdKey).append(GlobalConstant.AT);
        String specificKey = MaterialSpecificSortUtil.getMaterialSpecific(specificList);
        storeMaterial.setMaterialSpecific(specificKey);
        key.append(specificKey);
        return key.toString();
    }

    public static <T extends MaterialSpecific> String getKey(PsiMaterialStoreNumberQuery query, List<T> specificList, String materialSpecific) {
        StringBuilder key = new StringBuilder();
        String materialIdKey = query.getMaterialId();
        key.append(materialIdKey).append(GlobalConstant.AT);
        String storeIdKey = StringUtils.isBlank(query.getStoreId()) ? GlobalConstant.EMPTY_STR : query.getStoreId();
        key.append(storeIdKey).append(GlobalConstant.AT);
        String areaIdKey = StringUtils.isBlank(query.getAreaId()) ? GlobalConstant.EMPTY_STR : query.getAreaId();
        key.append(areaIdKey).append(GlobalConstant.AT);
        String positionIdKey = StringUtils.isBlank(query.getPositionId()) ? GlobalConstant.EMPTY_STR : query.getPositionId();
        key.append(positionIdKey).append(GlobalConstant.AT);
        String batchNumberKey = Objects.isNull(query.getBatchNumber()) ? GlobalConstant.EMPTY_STR : query.getBatchNumber();
        key.append(batchNumberKey).append(GlobalConstant.AT);
        if (StringUtils.isBlank(materialSpecific)) {
            String specificKey = MaterialSpecificSortUtil.getMaterialSpecific(specificList);
            query.setMaterialSpecific(specificKey);
            key.append(specificKey);
        } else {
            query.setMaterialSpecific(materialSpecific);
            key.append(materialSpecific);
        }
        return key.toString();
    }

    public static <T extends MaterialSpecific> String getMaterialAndSpecificKey(PsiMaterialStoreNumberQuery query, List<T> specificList, String materialSpecific) {
        StringBuilder key = new StringBuilder();
        String materialIdKey = query.getMaterialId();
        key.append(materialIdKey).append(GlobalConstant.AT);
        if (StringUtils.isBlank(materialSpecific)) {
            String specificKey = MaterialSpecificSortUtil.getMaterialSpecific(specificList);
            query.setMaterialSpecific(specificKey);
            key.append(specificKey);
        } else {
            query.setMaterialSpecific(materialSpecific);
            key.append(materialSpecific);
        }
        return key.toString();
    }

    public static <T extends MaterialSpecific> String getShortKey(PsiMaterialStoreNumberQuery query, List<T> specificList, String materialSpecific) {
        StringBuilder key = new StringBuilder();
        String materialIdKey = query.getMaterialId();
        key.append(materialIdKey).append(GlobalConstant.AT);
        String storeIdKey = StringUtils.isBlank(query.getStoreId()) ? GlobalConstant.EMPTY_STR : query.getStoreId();
        key.append(storeIdKey).append(GlobalConstant.AT);
        String batchNumberKey = Objects.isNull(query.getBatchNumber()) ? GlobalConstant.EMPTY_STR : query.getBatchNumber();
        key.append(batchNumberKey).append(GlobalConstant.AT);
        if (StringUtils.isBlank(materialSpecific)) {
            String specificKey = MaterialSpecificSortUtil.getMaterialSpecific(specificList);
            query.setMaterialSpecific(specificKey);
            key.append(specificKey);
        } else {
            query.setMaterialSpecific(materialSpecific);
            key.append(materialSpecific);
        }
        return key.toString();
    }

    public static <T extends MaterialSpecific> String getKey(PsiStoreMaterialRecord record, List<T> specificList) {
        StringBuilder key = new StringBuilder();
        String materialIdKey = record.getMaterialId();
        key.append(materialIdKey).append(GlobalConstant.AT);
        String storeIdKey = record.getStoreId();
        key.append(storeIdKey).append(GlobalConstant.AT);
        String areaIdKey = StringUtils.isBlank(record.getAreaId()) ? GlobalConstant.EMPTY_STR : record.getAreaId();
        key.append(areaIdKey).append(GlobalConstant.AT);
        String positionIdKey = StringUtils.isBlank(record.getPositionId()) ? GlobalConstant.EMPTY_STR : record.getPositionId();
        key.append(positionIdKey).append(GlobalConstant.AT);
        String batchNumberKey = Objects.isNull(record.getBatchNumber()) ? GlobalConstant.EMPTY_STR : record.getBatchNumber();
        key.append(batchNumberKey).append(GlobalConstant.AT);
        String specificKey = MaterialSpecificSortUtil.getMaterialSpecific(specificList);
        record.setMaterialSpecific(specificKey);
        if (StrUtil.isBlank(record.getShowMaterialSpecific())) {
            record.setShowMaterialSpecific(MaterialSpecificSortUtil.getMaterialSpecificName(specificList));
        }
        key.append(specificKey);
        return key.toString();
    }

    public static <T extends MaterialSpecific> String getKey(PsiPurchaseReturnStockInOrderDetail orderDetail, List<T> specificList) {
        StringBuilder key = new StringBuilder();
        String materialIdKey = orderDetail.getMaterialId();
        key.append(materialIdKey).append(GlobalConstant.AT);
        String storeIdKey = orderDetail.getStoreId();
        key.append(storeIdKey).append(GlobalConstant.AT);
        String areaIdKey = StringUtils.isBlank(orderDetail.getAreaId()) ? GlobalConstant.EMPTY_STR : orderDetail.getAreaId();
        key.append(areaIdKey).append(GlobalConstant.AT);
        String positionIdKey = StringUtils.isBlank(orderDetail.getPositionId()) ? GlobalConstant.EMPTY_STR : orderDetail.getPositionId();
        key.append(positionIdKey).append(GlobalConstant.AT);
        String batchNumberKey = Objects.isNull(orderDetail.getBatchNumber()) ? GlobalConstant.EMPTY_STR : orderDetail.getBatchNumber();
        key.append(batchNumberKey).append(GlobalConstant.AT);
        String specificKey = MaterialSpecificSortUtil.getMaterialSpecific(specificList);
        orderDetail.setMaterialSpecific(specificKey);
        if (StrUtil.isBlank(orderDetail.getShowMaterialSpecific())) {
            orderDetail.setShowMaterialSpecific(MaterialSpecificSortUtil.getMaterialSpecificName(specificList));
        }
        key.append(specificKey);
        return key.toString();
    }

    public static boolean isSame(String key1, String key2) {
        if (key1 == null) {
            key1 = "";
        }
        if (key2 == null) {
            key2 = "";
        }
        return key1.equals(key2);
    }
}
