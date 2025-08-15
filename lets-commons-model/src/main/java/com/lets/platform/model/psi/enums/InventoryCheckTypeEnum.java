package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 物料属性
 */
public enum InventoryCheckTypeEnum implements IEnum<Object> {

    ALL(0, "全盘"),
    DYNAMIC(1, "动盘");

    private final Integer value;

    @Getter
    private final String name;

    InventoryCheckTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InventoryCheckTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (InventoryCheckTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (InventoryCheckTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static InventoryCheckTypeEnum getEnum(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (InventoryCheckTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

}
