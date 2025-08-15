package com.lets.platform.util;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson.JSON;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.util.DateUtil;
import com.lets.platform.common.pojo.util.IdUtil;
import com.lets.platform.model.collection.domain.EnergyDo;
import com.lets.platform.model.collection.dto.energy.EnergySaveDto;
import com.lets.platform.model.collection.enums.PowerSignEnum;
import com.lets.platform.model.collection.vo.energy.EnergyConfigVo;
import com.lets.platform.model.collection.vo.energy.EnergyPeriodConfigVo;
import com.lets.platform.model.collection.vo.energy.WaterPowerGasInfluxVo;
import com.lets.platform.model.common.entity.CommonDevice;
import com.lets.platform.model.device.enums.TypeClassifyEnum;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 计算能耗
 * @author DING WEI
 * @date 2024/12/31 9:04
 * @version 1.0
 */
@Slf4j
@Data
@Builder
public class CalculationEnergy {

    private Integer year;
    private Integer month;
    private Integer day;
    private Integer yearMonthDay;
    private String tenancyId;
    private LocalDateTime startTime;
    private Boolean hasPeriodConfig;
    private StringBuilder executeMsg;

    private EnergyConfigVo energyConfigVo;
    private List<CommonDevice> deviceDoList;
    private List<String> waterDeviceIds;
    private List<String> powerDeviceIds;
    private List<String> gasDeviceIds;
    private List<WaterPowerGasInfluxVo> waterInfluxData;
    private List<WaterPowerGasInfluxVo> powerInfluxData;
    private List<WaterPowerGasInfluxVo> gasInfluxData;

    public EnergySaveDto calculation() {
        if (Objects.isNull(executeMsg)) {
            executeMsg = new StringBuilder();
        }
        EnergySaveDto saveDto = new EnergySaveDto();

        if (Objects.nonNull(energyConfigVo)) {
            // 计算水的消耗量以及价格
            List<EnergyDo> waterSaves = new ArrayList<>();
            if (CollUtil.isNotEmpty(waterInfluxData)) {
                BigDecimal waterPrice = energyConfigVo.getWaterPrice();
                if (Objects.isNull(waterPrice)) {
                    executeMsg.append("没有查询到水价。");
                }
                // 根据设备分组
                Map<String, List<WaterPowerGasInfluxVo>> groupByDeviceId = waterInfluxData.stream().collect(Collectors.groupingBy(WaterPowerGasInfluxVo::getDeviceId));
                for (String waterDeviceId : waterDeviceIds) {
                    List<WaterPowerGasInfluxVo> values = groupByDeviceId.get(waterDeviceId);
                    if (CollUtil.isNotEmpty(values)) {
                        EnergyDo amountDo = new EnergyDo();
                        amountDo.setId(IdUtil.getStrId());
                        amountDo.setDeviceId(waterDeviceId);
                        amountDo.setTenancyId(tenancyId);
                        amountDo.setYear(year);
                        amountDo.setMonth(month);
                        amountDo.setDay(day);
                        amountDo.setYearMonthDay(yearMonthDay);
                        values = RemoveSurplusData.removeSurplusData(values, startTime, Boolean.FALSE);
                        calTotal4NotPower(values, TypeClassifyEnum.WATER.getValue(), amountDo, "" + year + month + day);
                        // 价格
                        if (Objects.nonNull(waterPrice)) {
                            amountDo.setTotalPrice(amountDo.getTotalAmount().multiply(waterPrice));
                            amountDo.setPrice(waterPrice);
                        }
                        waterSaves.add(amountDo);
                    }
                }
            } else {
                executeMsg.append("从时序库没有查询到水相关数据。");
            }
            // 计算气的消耗量以及价格
            List<EnergyDo> gasSaves = new ArrayList<>();
            if (CollUtil.isNotEmpty(gasInfluxData)) {
                BigDecimal gasPrice = energyConfigVo.getGasPrice();
                if (Objects.isNull(gasPrice)) {
                    executeMsg.append("没有查询到气价。");
                }
                // 根据设备分组
                Map<String, List<WaterPowerGasInfluxVo>> groupByDeviceId = gasInfluxData.stream().collect(Collectors.groupingBy(WaterPowerGasInfluxVo::getDeviceId));
                for (String gasDeviceId : gasDeviceIds) {
                    List<WaterPowerGasInfluxVo> values = groupByDeviceId.get(gasDeviceId);
                    if (CollUtil.isNotEmpty(values)) {
                        EnergyDo amountDo = new EnergyDo();
                        amountDo.setId(IdUtil.getStrId());
                        amountDo.setDeviceId(gasDeviceId);
                        amountDo.setTenancyId(tenancyId);
                        amountDo.setYear(year);
                        amountDo.setMonth(month);
                        amountDo.setDay(day);
                        amountDo.setYearMonthDay(yearMonthDay);
                        values = RemoveSurplusData.removeSurplusData(values, startTime, Boolean.FALSE);
                        calTotal4NotPower(values, TypeClassifyEnum.GAS.getValue(), amountDo, "" + year + month + day);
                        // 价格
                        if (Objects.nonNull(gasPrice)) {
                            amountDo.setTotalPrice(amountDo.getTotalAmount().multiply(gasPrice));
                            amountDo.setPrice(gasPrice);
                        }
                        gasSaves.add(amountDo);
                    }
                }
            } else {
                executeMsg.append("从时序库没有查询到电相关数据。");
            }

            // 计算电的消耗量以及价格
            List<EnergyDo> powerSaves = new ArrayList<>();
            if (CollUtil.isNotEmpty(powerInfluxData)) {
                BigDecimal powerPrice = energyConfigVo.getPowerPrice();
                BigDecimal tipPrice = powerPrice;
                BigDecimal peakPrice = powerPrice;
                BigDecimal flatPrice = powerPrice;
                BigDecimal valleyPrice = powerPrice;
                Boolean powerIsAve = energyConfigVo.getPowerIsAve();
                if (Objects.nonNull(powerIsAve) && !powerIsAve) {
                    tipPrice = energyConfigVo.getTipPrice();
                    peakPrice = energyConfigVo.getPeakPrice();
                    flatPrice = energyConfigVo.getFlatPrice();
                    valleyPrice = energyConfigVo.getValleyPrice();
                    executeMsg.append("电价使用尖峰平谷电价；");
                    if (Objects.isNull(tipPrice)) {
                        executeMsg.append("未获取到尖价，");
                    } else {
                        executeMsg.append("尖价").append(tipPrice);
                    }
                    if (Objects.isNull(peakPrice)) {
                        executeMsg.append("未获取到峰价，");
                    } else {
                        executeMsg.append("峰价").append(peakPrice);
                    }
                    if (Objects.isNull(flatPrice)) {
                        executeMsg.append("未获取到平价，");
                    } else {
                        executeMsg.append("平价").append(flatPrice);
                    }
                    if (Objects.isNull(valleyPrice)) {
                        executeMsg.append("未获取到谷价，");
                    } else {
                        executeMsg.append("谷价").append(valleyPrice);
                    }
                } else {
                    executeMsg.append("电价使用均价").append(powerPrice).append("。");
                }
                String priceConfig = RemoveSurplusData.getPriceConfig(tipPrice, peakPrice, flatPrice, valleyPrice, powerPrice, powerIsAve);
                // 根据设备分组
                Map<String, List<WaterPowerGasInfluxVo>> groupByDeviceId = powerInfluxData.stream().collect(Collectors.groupingBy(WaterPowerGasInfluxVo::getDeviceId));
                for (String powerDeviceId : powerDeviceIds) {
                    List<WaterPowerGasInfluxVo> values = groupByDeviceId.get(powerDeviceId);
                    if (CollUtil.isNotEmpty(values)) {
                        EnergyDo amountDo = new EnergyDo();
                        amountDo.setId(IdUtil.getStrId());
                        amountDo.setDeviceId(powerDeviceId);
                        amountDo.setTenancyId(tenancyId);
                        amountDo.setYear(year);
                        amountDo.setMonth(month);
                        amountDo.setDay(day);
                        amountDo.setYearMonthDay(yearMonthDay);
                        values = RemoveSurplusData.removeSurplusData(values, startTime, Boolean.FALSE);
                        calTotal4Power(values, energyConfigVo, amountDo, String.valueOf(yearMonthDay));
                        // 价格
                        if (Objects.nonNull(tipPrice)) {
                            amountDo.setTipPrice(amountDo.getTipAmount().multiply(tipPrice));
                        }
                        if (Objects.nonNull(peakPrice)) {
                            amountDo.setPeakPrice(amountDo.getPeakAmount().multiply(peakPrice));
                        }
                        if (Objects.nonNull(flatPrice)) {
                            amountDo.setFlatPrice(amountDo.getFlatAmount().multiply(flatPrice));
                        }
                        if (Objects.nonNull(valleyPrice)) {
                            amountDo.setValleyPrice(amountDo.getValleyAmount().multiply(valleyPrice));
                        }
                        // 如果没有配置时段按照均价计费处理，总价=均价x总量
                        if (hasPeriodConfig) {
                            amountDo.setTotalPrice(amountDo.getTipPrice().add(amountDo.getPeakPrice()).add(amountDo.getFlatPrice()).add(amountDo.getValleyPrice()));
                        } else {
                            amountDo.setTotalPrice(amountDo.getTotalAmount().multiply(powerPrice).setScale(2, BigDecimal.ROUND_HALF_UP));
                        }
                        amountDo.setPowerPriceConfig(priceConfig);
                        powerSaves.add(amountDo);
                    }
                }
                if (CollUtil.isNotEmpty(powerSaves)) {
                    powerSaves.get(0).setPowerPeriod(RemoveSurplusData.getPowerPeriod(energyConfigVo));
                }
            } else {
                executeMsg.append("从时序库没有查询到气相关数据。");
            }
            saveDto.setTenancyId(tenancyId);
            saveDto.setYearMonthDay(yearMonthDay);
            saveDto.setWaterPriceId(energyConfigVo.getWaterPriceId());
            saveDto.setWaterSaves(waterSaves);
            saveDto.setPowerSaves(powerSaves);
            saveDto.setGasPriceId(energyConfigVo.getGasPriceId());
            saveDto.setGasSaves(gasSaves);
        }
        return saveDto;
    }

    /**
     * 处理尖峰平谷标识
     *
     * @param values
     * @param energyConfigVo
     * @return
     * @author DING WEI
     * @date 2022/12/6 17:34
     * @version 1.0
     */
    public Map<String, Integer[]> handleTipPeakFlatValley(List<WaterPowerGasInfluxVo> values, EnergyConfigVo energyConfigVo) {
        Map<String, Integer[]> periodMap = new HashMap<>();
        List<EnergyPeriodConfigVo> tipPeriod = energyConfigVo.getTipPeriod();
        List<EnergyPeriodConfigVo> peakPeriod = energyConfigVo.getPeakPeriod();
        List<EnergyPeriodConfigVo> flatPeriod = energyConfigVo.getFlatPeriod();
        List<EnergyPeriodConfigVo> valleyPeriod = energyConfigVo.getValleyPeriod();
        for (WaterPowerGasInfluxVo value : values) {
            Integer time = Integer.parseInt(GlobalConstant.EMPTY_STR + value.getHour() + value.minuteAsStr() + value.secondAsStr());
            if (CollUtil.isNotEmpty(tipPeriod)) {
                for (EnergyPeriodConfigVo tip : tipPeriod) {
                    Integer[] period = tip.getPeriod();
                    String periodSign = tip.getPeriodSign();
                    periodMap.put(periodSign, period);
                    Integer min = period[0];
                    Integer max = period[1];
                    if (DateUtil.isBetween(min, max, time)) {
                        value.getPowerSigns().add(PowerSignEnum.TIP.getValue());
                        value.getPeriodSigns().add(periodSign);
                        break;
                    }
                }
            }
            if (CollUtil.isNotEmpty(peakPeriod)) {
                for (EnergyPeriodConfigVo peak : peakPeriod) {
                    Integer[] period = peak.getPeriod();
                    String periodSign = peak.getPeriodSign();
                    periodMap.put(periodSign, period);
                    Integer min = period[0];
                    Integer max = period[1];
                    if (DateUtil.isBetween(min, max, time)) {
                        value.getPowerSigns().add(PowerSignEnum.PEAK.getValue());
                        value.getPeriodSigns().add(periodSign);
                        break;
                    }
                }
            }
            if (CollUtil.isNotEmpty(flatPeriod)) {
                for (EnergyPeriodConfigVo flat : flatPeriod) {
                    Integer[] period = flat.getPeriod();
                    String periodSign = flat.getPeriodSign();
                    periodMap.put(periodSign, period);
                    Integer min = period[0];
                    Integer max = period[1];
                    if (DateUtil.isBetween(min, max, time)) {
                        value.getPowerSigns().add(PowerSignEnum.FLAT.getValue());
                        value.getPeriodSigns().add(periodSign);
                        break;
                    }
                }
            }
            if (CollUtil.isNotEmpty(valleyPeriod)) {
                for (EnergyPeriodConfigVo valley : valleyPeriod) {
                    Integer[] period = valley.getPeriod();
                    String periodSign = valley.getPeriodSign();
                    periodMap.put(periodSign, period);
                    Integer min = period[0];
                    Integer max = period[1];
                    if (DateUtil.isBetween(min, max, time)) {
                        value.getPowerSigns().add(PowerSignEnum.VALLEY.getValue());
                        value.getPeriodSigns().add(periodSign);
                        break;
                    }
                }
            }
        }
        return periodMap;
    }

    public List<BigDecimal> calTotal4NotPower(List<WaterPowerGasInfluxVo> values, String typeClassify, EnergyDo amountDo, String timeRange) {
        List<BigDecimal> all = new ArrayList<>();
        BigDecimal total = BigDecimal.ZERO;
        if (CollUtil.isNotEmpty(values)) {
            for (WaterPowerGasInfluxVo value : values) {
                if (TypeClassifyEnum.WATER.getValue().equals(typeClassify)) {
                    all.add(value.getWater());
                } else {
                    all.add(value.getGas());
                }
            }
            WaterPowerGasInfluxVo first = values.get(GlobalConstant.ZERO);
            if (Objects.nonNull(first)) {
                amountDo.setEndTime(first.getTime());
            }
            WaterPowerGasInfluxVo last = values.get(values.size() - GlobalConstant.ONE);
            if (Objects.nonNull(last)) {
                amountDo.setStartTime(last.getTime());
            }
            if (TypeClassifyEnum.WATER.getValue().equals(typeClassify)) {
                total = first.waterNotNull().subtract(last.waterNotNull());
                log.info("计算[{}]范围内的数据,开始{}({})--结束{}({})", timeRange, amountDo.getStartTime(), last.waterNotNull(), amountDo.getEndTime(), first.waterNotNull());
            } else {
                total = first.gasNotNull().subtract(last.gasNotNull());
                log.info("计算[{}]范围内的数据,开始{}({})--结束{}({})", timeRange, amountDo.getStartTime(), last.gasNotNull(), amountDo.getEndTime(), first.gasNotNull());
            }
        }
        amountDo.setTotalAmount(total);
        return all;
    }

    public List<BigDecimal> calTotal4Power(List<WaterPowerGasInfluxVo> values, EnergyConfigVo energyConfigVo, EnergyDo energyDo, String timeRange) {
        List<BigDecimal> allPoint = new ArrayList<>();
        List<BigDecimal> allUselessPoint = new ArrayList<>();
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal uselessTotal = BigDecimal.ZERO;
        BigDecimal tip = BigDecimal.ZERO;
        BigDecimal peak = BigDecimal.ZERO;
        BigDecimal flat = BigDecimal.ZERO;
        BigDecimal valley = BigDecimal.ZERO;
        if (CollUtil.isNotEmpty(values)) {
            // 判断尖峰平谷
            Map<String, Integer[]> periodMap = handleTipPeakFlatValley(values, energyConfigVo);
            hasPeriodConfig = CollUtil.isNotEmpty(periodMap);
            // 根据yearMonthDay分组
            Map<Integer, List<WaterPowerGasInfluxVo>> groupByYearMonthDay = values.stream().collect(Collectors.groupingBy(WaterPowerGasInfluxVo::getYearMonthDay));
            List<Integer> days = new ArrayList<>(groupByYearMonthDay.keySet());
            Collections.sort(days);
            for (int i = days.size() - 1; i >= 0; i--) {
                Integer day = days.get(i);
                List<WaterPowerGasInfluxVo> oneDayValues = groupByYearMonthDay.get(day);
                List<WaterPowerGasInfluxVo> tipPoint = new ArrayList<>();
                List<WaterPowerGasInfluxVo> peakPoint = new ArrayList<>();
                List<WaterPowerGasInfluxVo> flatPoint = new ArrayList<>();
                List<WaterPowerGasInfluxVo> valleyPoint = new ArrayList<>();
                for (WaterPowerGasInfluxVo value : oneDayValues) {
                    BigDecimal power = value.getPower();
                    BigDecimal uselessPower = value.getUselessPower();
                    if (Objects.nonNull(power)) {
                        allPoint.add(power);
                        List<String> powerSigns = value.getPowerSigns();
                        List<String> periodSigns = value.getPeriodSigns();
                        if (powerSigns.contains(PowerSignEnum.TIP.getValue())) {
                            int index = powerSigns.indexOf(PowerSignEnum.TIP.getValue());
                            WaterPowerGasInfluxVo tipValue = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(value)), WaterPowerGasInfluxVo.class);
                            tipValue.setPowerSign(PowerSignEnum.TIP.getValue());
                            tipValue.setPeriodSign(periodSigns.get(index));
                            tipPoint.add(tipValue);
                        }
                        if (powerSigns.contains(PowerSignEnum.PEAK.getValue())) {
                            int index = powerSigns.indexOf(PowerSignEnum.PEAK.getValue());
                            WaterPowerGasInfluxVo peakValue = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(value)), WaterPowerGasInfluxVo.class);
                            peakValue.setPowerSign(PowerSignEnum.PEAK.getValue());
                            peakValue.setPeriodSign(periodSigns.get(index));
                            peakPoint.add(peakValue);
                        }
                        if (powerSigns.contains(PowerSignEnum.FLAT.getValue())) {
                            int index = powerSigns.indexOf(PowerSignEnum.FLAT.getValue());
                            WaterPowerGasInfluxVo flatValue = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(value)), WaterPowerGasInfluxVo.class);
                            flatValue.setPowerSign(PowerSignEnum.FLAT.getValue());
                            flatValue.setPeriodSign(periodSigns.get(index));
                            flatPoint.add(flatValue);
                        }
                        if (powerSigns.contains(PowerSignEnum.VALLEY.getValue())) {
                            int index = powerSigns.indexOf(PowerSignEnum.VALLEY.getValue());
                            WaterPowerGasInfluxVo valleyValue = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(value)), WaterPowerGasInfluxVo.class);
                            valleyValue.setPowerSign(PowerSignEnum.VALLEY.getValue());
                            valleyValue.setPeriodSign(periodSigns.get(index));
                            valleyPoint.add(valleyValue);
                        }
                    }
                    if (Objects.nonNull(uselessPower)) {
                        allUselessPoint.add(uselessPower);
                    }
                }
                tip = tip.add(getEveryPeriodPower(tipPoint, values, periodMap));
                peak = peak.add(getEveryPeriodPower(peakPoint, values, periodMap));
                flat = flat.add(getEveryPeriodPower(flatPoint, values, periodMap));
                valley = valley.add(getEveryPeriodPower(valleyPoint, values, periodMap));
            }
            if (CollUtil.isNotEmpty(allPoint)) {
                WaterPowerGasInfluxVo first = values.get(GlobalConstant.ZERO);
                WaterPowerGasInfluxVo last = values.get(values.size() - GlobalConstant.ONE);
                if (Objects.nonNull(first)) {
                    energyDo.setEndTime(first.getTime());
                }
                if (Objects.nonNull(last)) {
                    energyDo.setStartTime(last.getTime());
                }
                BigDecimal firstTotal = allPoint.get(GlobalConstant.ZERO);
                BigDecimal endTotal = allPoint.get(allPoint.size() - GlobalConstant.ONE);
                log.info("计算[{}]范围内的数据,开始{}({})--结束{}({})", timeRange, energyDo.getStartTime(), endTotal, energyDo.getEndTime(), firstTotal);
                total = firstTotal.subtract(endTotal);
            }
            if (CollUtil.isNotEmpty(allUselessPoint)) {
                uselessTotal = allUselessPoint.get(GlobalConstant.ZERO).subtract(allUselessPoint.get(allUselessPoint.size() - GlobalConstant.ONE));
            }
        }
        energyDo.setTotalAmount(total);
        energyDo.setUselessTotalAmount(uselessTotal);
        energyDo.setTipAmount(tip);
        energyDo.setPeakAmount(peak);
        energyDo.setFlatAmount(flat);
        energyDo.setValleyAmount(valley);
        log.info("用电小时时间点报表具体数值 :{}", JSON.toJSONString(energyDo));
        return allPoint;
    }

    private BigDecimal getEveryPeriodPower(List<WaterPowerGasInfluxVo> points, List<WaterPowerGasInfluxVo> values, Map<String, Integer[]> periodMap) {
        BigDecimal value = BigDecimal.ZERO;
        if (CollUtil.isNotEmpty(points)) {
            Map<String, List<WaterPowerGasInfluxVo>> groupByPeriodSign = points.stream().collect(Collectors.groupingBy(WaterPowerGasInfluxVo::getPeriodSign));
            for (Map.Entry<String, List<WaterPowerGasInfluxVo>> entry : groupByPeriodSign.entrySet()) {
                List<WaterPowerGasInfluxVo> onePeriodValues = entry.getValue();
                if (CollUtil.isNotEmpty(onePeriodValues)) {
                    WaterPowerGasInfluxVo first = onePeriodValues.get(GlobalConstant.ZERO);
                    WaterPowerGasInfluxVo last = onePeriodValues.get(onePeriodValues.size() - GlobalConstant.ONE);
                    BigDecimal subtract = last.powerNotNull();
                    Integer hour = last.getHour();
                    String minute = last.minuteAsStr();
                    String second = last.secondAsStr();
                    String periodSign = last.getPeriodSign();
                    // 如果该区间的第一条数据时分秒不等于该时段的开始时间,则往前取一条
                    Boolean isNotSameTime = Boolean.FALSE;
                    Integer[] periodConfig = periodMap.get(periodSign);
                    if (Objects.nonNull(periodConfig) && periodConfig.length > GlobalConstant.ZERO) {
                        Integer periodStart = periodConfig[0];
                        isNotSameTime = !(Integer.parseInt((hour + minute + second)) == periodStart);
                    }
                    if (CollUtil.isNotEmpty(values) && isNotSameTime) {
                        Map<Integer, WaterPowerGasInfluxVo> valuesMap = values.stream().collect(Collectors.toMap(WaterPowerGasInfluxVo::getIndex, a -> a, (k1, k2) -> k1));
                        Integer nextIndex = last.getIndex() + GlobalConstant.ONE;
                        WaterPowerGasInfluxVo nextInfluxVo = valuesMap.get(nextIndex);
                        if (Objects.nonNull(nextInfluxVo)) {
                            subtract = nextInfluxVo.powerNotNull();
                        }
                    }
                    value = value.add(first.powerNotNull().subtract(subtract));
                }
            }
        }
        return value;
    }

}
