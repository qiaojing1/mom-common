package com.lets.platform.util;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson.JSON;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.collection.vo.energy.EnergyConfigVo;
import com.lets.platform.model.collection.vo.energy.EnergyPeriodConfigVo;
import com.lets.platform.model.collection.vo.energy.WaterPowerGasInfluxVo;
import lombok.SneakyThrows;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取截止到实际开始时间之前的一条数据
 * @author: DING WEI
 * @date: 2022/12/6 14:22
 */
public class RemoveSurplusData {

    /**
     * 删除多余的数据
     * @param values
     * @param actualStartTime
     * @return
     * @author DING WEI
     * @date 2022/12/6 17:41
     * @version 1.0
     */
    public static List<WaterPowerGasInfluxVo> removeSurplusData(List<WaterPowerGasInfluxVo> values, LocalDateTime actualStartTime, Boolean isContain) {
        if (CollUtil.isNotEmpty(values)) {
            List<WaterPowerGasInfluxVo> newValues = new ArrayList<>();
            for (int i = 0; i < values.size(); i++) {
                WaterPowerGasInfluxVo value = values.get(i);
                value.setIndex(i);
                value.setPowerSigns(new ArrayList<>());
                value.setPeriodSigns(new ArrayList<>());
                LocalDateTime time = value.getTime();
                if (time.isBefore(actualStartTime)) {
                    if (isContain) {
                        newValues.add(value);
                    } else {
                        if (i > GlobalConstant.ZERO) {
                            Integer yearMonthDay = value.getYearMonthDay();
                            WaterPowerGasInfluxVo preValue = values.get(i - GlobalConstant.ONE);
                            Integer preYearMonthDay = preValue.getYearMonthDay();
                            if (yearMonthDay < preYearMonthDay) {
                                // 上一个点位不是整点
                                boolean isZeroClock = preValue.getHour().equals(GlobalConstant.ZERO)
                                        && preValue.getMinute().equals(GlobalConstant.ZERO) && preValue.getSecond().equals(GlobalConstant.ZERO);
                                if (!isZeroClock) {
                                    value.setHour(preValue.getHour());
                                    value.setMinute(preValue.getMinute());
                                    value.setSecond(preValue.getSecond());
                                    newValues.add(value);
                                }
                            }
                        }
                    }
                    break;
                } else {
                    newValues.add(value);
                }
            }
            return newValues;
        }
        return values;
    }
    public static List<List<WaterPowerGasInfluxVo>> splitByTime4UseEnergyReport4Day(List<WaterPowerGasInfluxVo> values, LocalDateTime actualStartTime) {
        List<List<WaterPowerGasInfluxVo>> result = new ArrayList<>();
        List<WaterPowerGasInfluxVo> beforeValues = new ArrayList<>();
        List<WaterPowerGasInfluxVo> afterValues = new ArrayList<>();
        if (CollUtil.isNotEmpty(values)) {
            for (int i = 0; i < values.size(); i++) {
                WaterPowerGasInfluxVo value = values.get(i);
                value.setIndex(i);
                value.setPowerSigns(new ArrayList<>());
                value.setPeriodSigns(new ArrayList<>());
                LocalDateTime time = value.getTime();
                if (time.isBefore(actualStartTime)) {
                    beforeValues.add(value);
                } else {
                    afterValues.add(value);
                }
            }
        }
        result.add(beforeValues);
        result.add(afterValues);
        return result;
    }

    public static WaterPowerGasInfluxVo getFirstData(List<WaterPowerGasInfluxVo> preData,
                                                     List<WaterPowerGasInfluxVo> thisData,
                                                     LocalDateTime actualStartTime,
                                                     Integer startInterval,
                                                     DateTimeFormatter formatter) {
        if (CollUtil.isNotEmpty(preData)) {
            if (CollUtil.isNotEmpty(thisData)) {
                WaterPowerGasInfluxVo thisLast = thisData.get(thisData.size() - GlobalConstant.ONE);
                Integer hour = thisLast.getHour();
                Integer minute = thisLast.getMinute();
                Integer second = thisLast.getSecond();
                boolean isZeroStart = startInterval.equals(hour) && minute.equals(GlobalConstant.ZERO) && second.equals(GlobalConstant.ZERO);
                if (!isZeroStart) {
                    String actualStartFormat = actualStartTime.format(formatter);
                    String thisLastFormat = thisLast.getTime().format(formatter);
                    if (!thisLastFormat.equals(actualStartFormat)) {
                        return preData.get(GlobalConstant.ZERO);
                    }
                }
            } else {
                return preData.get(GlobalConstant.ZERO);
            }
        }
        return null;
    }
    public static WaterPowerGasInfluxVo getLastData(List<WaterPowerGasInfluxVo> nextData) {
        if (CollUtil.isNotEmpty(nextData)) {
            WaterPowerGasInfluxVo first = nextData.get(nextData.size() - GlobalConstant.ONE);
            Integer minute = first.getMinute();
            Integer second = first.getSecond();
            boolean isZeroStart = minute.equals(GlobalConstant.ZERO) && second.equals(GlobalConstant.ZERO);
            if (isZeroStart) {
                return first;
            }
        }
        return null;
    }

    /**
     * 获取价格配置信息
     * @param tipPrice 尖
     * @param peakPrice 峰
     * @param flatPrice 平
     * @param valleyPrice 谷
     * @param powerPrice 均价
     * @param isAve 是否均价
     * @return
     * @author DING WEI
     * @date 2022/12/7 9:06
     * @version 1.0
     */
    public static String getPriceConfig(BigDecimal tipPrice, BigDecimal peakPrice, BigDecimal flatPrice, BigDecimal valleyPrice, BigDecimal powerPrice, Boolean isAve) {
        Map<String, Object> priceConfig = new HashMap<>();
        priceConfig.put("isAve", isAve);
        priceConfig.put("tipPrice", tipPrice);
        priceConfig.put("peakPrice", peakPrice);
        priceConfig.put("flatPrice", flatPrice);
        priceConfig.put("valleyPrice", valleyPrice);
        priceConfig.put("powerPrice", powerPrice);
        return JSON.toJSONString(priceConfig);
    }

    /**
     * 获取电尖峰平谷时段
     * @param energyConfigVo
     * @return
     * @author DING WEI
     * @date 2022/12/7 9:07
     * @version 1.0
     */
    public static String getPowerPeriod(EnergyConfigVo energyConfigVo) {
        Map<String, Object> powerPeriod = new HashMap<>();
        List<EnergyPeriodConfigVo> tipPeriod = energyConfigVo.getTipPeriod();
        powerPeriod.put("tipTime", tipPeriod);
        List<EnergyPeriodConfigVo> peakTime = energyConfigVo.getPeakPeriod();
        powerPeriod.put("peakTime", peakTime);
        List<EnergyPeriodConfigVo> flatTime = energyConfigVo.getFlatPeriod();
        powerPeriod.put("flatTime", flatTime);
        List<EnergyPeriodConfigVo> valleyTime = energyConfigVo.getValleyPeriod();
        powerPeriod.put("valleyTime", valleyTime);
        return JSON.toJSONString(powerPeriod);
    }

    @SneakyThrows
    public static WaterPowerGasInfluxVo build24And0(WaterPowerGasInfluxVo influxVo, DateTimeFormatter formatter) {
        // 判断时间是否为00:00:00
        Integer hour = influxVo.getHour();
        Integer minute = influxVo.getMinute();
        Integer second = influxVo.getSecond();
        if (GlobalConstant.ZERO.equals(hour) && GlobalConstant.ZERO.equals(minute) && GlobalConstant.ZERO.equals(second)) {
            WaterPowerGasInfluxVo copyValue = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(influxVo)), WaterPowerGasInfluxVo.class);
            LocalDate parse = LocalDate.parse(influxVo.getYearMonthDay().toString(), formatter);
            parse = parse.plusDays(-1);
            copyValue.setYear(parse.getYear());
            copyValue.setMonth(parse.getMonthValue());
            copyValue.setDay(parse.getDayOfMonth());
            copyValue.setHour(GlobalConstant.HOUR_OF_ONE_DAY);
            copyValue.setYearMonthDay(Integer.parseInt(copyValue.getYear() + copyValue.monthAsStr() + copyValue.dayAsStr()));
            return copyValue;
        }
        return null;
    }
}
