package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 库存维度[material_id, store_id, area_id, position_id, batch_number, material_specific]
 * @author DING WEI
 * @date 2025/7/17 11:03
 * @version 1.0
 */
public enum ObsoleteInventoryDimEnum implements IEnum<Object> {

    MATERIAL("material_id", "物料"),
    STORE("store_id", "库区"),
    AREA("area_id", "库区"),
    POSITION("position_id", "库位"),
    BATCH_NUMBER("batch_number", "批号"),
    MATERIAL_SPECIFIC("material_specific", "特征属性"),

    ;

    private final String value;

    @Getter
    private final String name;

    ObsoleteInventoryDimEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ObsoleteInventoryDimEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ObsoleteInventoryDimEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (ObsoleteInventoryDimEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
