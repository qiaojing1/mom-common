package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

/**
 * 适用物料范围
 */
public enum InspectPlanMaterialScopeEnum implements IEnum<Object> {

    ALL("0", "通用"),
    MATERIAL("1", "物料"),
    MATERIAL_GROUP("2", "物料分组"),
    ;

    private final String value;

    @Getter
    private final String name;

    InspectPlanMaterialScopeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StrUtil.isEmpty(name)) {
            return null;
        }
        for (InspectPlanMaterialScopeEnum element : InspectPlanMaterialScopeEnum.values()) {
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
        for (InspectPlanMaterialScopeEnum element : InspectPlanMaterialScopeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static InspectPlanMaterialScopeEnum getEnum(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (InspectPlanMaterialScopeEnum element : InspectPlanMaterialScopeEnum.values()) {
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
