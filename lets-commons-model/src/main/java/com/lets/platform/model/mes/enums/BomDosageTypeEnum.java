package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * BOM用量类型
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum BomDosageTypeEnum implements IEnum<Object> {

    CHANGE("1", "变动"),
    FIX("2", "固定"),

    ;

    private String value;

    @Getter
    private String name;

    BomDosageTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BomDosageTypeEnum element : values()) {
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
        for (BomDosageTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> all = new ArrayList<>();
        for (BomDosageTypeEnum element : values()) {
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
