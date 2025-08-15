package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

/**
 * 检验类型
 */
public enum MaterialRangeEnum implements IEnum<String> {
    ALL("0", "通用"),
    MATERIAL("1", "物料"),
    MATERIAL_GROUP("2", "物料分组"),
    MATERIAL_EXT("3", "扩展规格属性"),
    ;

    private final String value;

    @Getter
    private final String name;

    MaterialRangeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StrUtil.isEmpty(name)) {
            return null;
        }
        for (MaterialRangeEnum element : MaterialRangeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (MaterialRangeEnum element : MaterialRangeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static MaterialRangeEnum getEnum(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (MaterialRangeEnum element : MaterialRangeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }


    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
