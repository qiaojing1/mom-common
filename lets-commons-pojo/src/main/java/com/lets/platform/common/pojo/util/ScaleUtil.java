package com.lets.platform.common.pojo.util;

import cn.hutool.core.util.StrUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ScaleUtil {
    public static BigDecimal setScale(BigDecimal number, Integer scale, String roundingMode) {
        if (number == null) {
            return null;
        }
        if (scale == null || StrUtil.isEmpty(roundingMode)) {
            return null;
        }
        return number.setScale(scale, RoundingMode.valueOf(Integer.parseInt(roundingMode)));
    }
    public static BigDecimal setScale(BigDecimal number, String scale, String roundingMode) {
        if (number == null) {
            return null;
        }
        if ( StrUtil.isEmpty(scale)|| StrUtil.isEmpty(roundingMode)) {
            return null;
        }
        return number.setScale(Integer.parseInt(scale), RoundingMode.valueOf(Integer.parseInt(roundingMode)));
    }

    public static BigDecimal setScale(BigDecimal number, Integer scale, Integer roundingMode) {
        if (number == null) {
            return null;
        }
        if (scale == null || roundingMode == null ) {
            return null;
        }
        return number.setScale(scale, RoundingMode.valueOf(roundingMode));
    }

    public static BigDecimal setScale(String number, Integer scale, String roundingMode) {
        if (StrUtil.isEmpty(number)) {
            return null;
        }
        if (scale == null || StrUtil.isEmpty(roundingMode)) {
            return null;
        }
        return new BigDecimal(number).setScale(scale, RoundingMode.valueOf(Integer.parseInt(roundingMode)));
    }
}
