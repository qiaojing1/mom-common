package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * BOM有效状态
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/7 17:16
 */
public enum BomEffectivenessStatusEnum implements IEnum<Object> {

    EFFECTIVE("1", "有效"),
    //    INVALID("2", "无效"),
    ENDLESS_LOOP("3", "死循环"),
    DATA_INCOMPLETE("4", "数据不完整"),

    ;

    private String value;

    @Getter
    private String name;

    BomEffectivenessStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BomEffectivenessStatusEnum element : values()) {
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
        for (BomEffectivenessStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> all = new ArrayList<>();
        for (BomEffectivenessStatusEnum element : values()) {
            all.add(element.getName());
        }
        return all;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }


}
