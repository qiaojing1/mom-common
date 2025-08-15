package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

/**
 * 是否 枚举
 *
 * @author FZY
 * @version 1.0
 * @date 2022/11/08
 */
public enum BarcodePrefixEnum implements IEnum<Object> {
    MATERIAL("M-", "material"),
    CONTAINER("C-", "container"),
    ;

    private final String value;
    @Getter
    private final String type;

    BarcodePrefixEnum(String value, String type) {
        this.value = value;
        this.type = type;
    }

    public static boolean contains(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (BarcodePrefixEnum element : BarcodePrefixEnum.values()) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static boolean anyPrefixTo(String barcode) {
        if (StrUtil.isEmpty(barcode)) {
            return false;
        }
        for (BarcodePrefixEnum element : BarcodePrefixEnum.values()) {
            if (element.prefixTo(barcode)) {
                return true;
            }
        }
        return false;
    }

    public boolean prefixTo(String barcode) {
        if (StrUtil.isEmpty(barcode)) {
            return false;
        }
        return barcode.startsWith(this.value);
    }


    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
