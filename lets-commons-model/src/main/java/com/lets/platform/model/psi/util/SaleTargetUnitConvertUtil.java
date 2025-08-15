package com.lets.platform.model.psi.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

/**
 * 销售目标 倍率转换
 * @author: DING WEI
 * @date: 2024/5/15 9:40
 */
public class SaleTargetUnitConvertUtil {

    public static BigDecimal unitConvert(String sourceUnit, String targetUnit, BigDecimal sourceAmount) {
        if (StringUtils.isBlank(sourceUnit) || StringUtils.isBlank(targetUnit) || StringUtils.equals(sourceUnit, targetUnit)) {
            return sourceAmount;
        } else {
            return new BigDecimal(sourceUnit).divide(new BigDecimal(targetUnit), 10, BigDecimal.ROUND_HALF_UP).multiply(sourceAmount);
        }
    }

    public static BigDecimal getUnitConvertMultiplier(String sourceUnit, String targetUnit) {
        if (StringUtils.isBlank(sourceUnit) || StringUtils.isBlank(targetUnit)) {
            return BigDecimal.ONE;
        }
        return new BigDecimal(sourceUnit).divide(new BigDecimal(targetUnit), 10, BigDecimal.ROUND_HALF_UP);
    }
}
