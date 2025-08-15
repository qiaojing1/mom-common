package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public enum MrpSupplyAndDemandTypeEnum implements IEnum<Object> {

    SUPPLY(0, "供应"),
    DEMAND(1, "需求"),
    ;

    private final Integer value;

    @Getter
    private final String name;


    MrpSupplyAndDemandTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StrUtil.isEmpty(name)) {
            return null;
        }
        for (MrpSupplyAndDemandTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        for (MrpSupplyAndDemandTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (MrpSupplyAndDemandTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (MrpSupplyAndDemandTypeEnum element : values()) {
            names.add(element.getName());
        }
        return names;
    }

    public static boolean containsValue(Integer value) {
        for (MrpSupplyAndDemandTypeEnum element : MrpSupplyAndDemandTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (MrpSupplyAndDemandTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }

}
