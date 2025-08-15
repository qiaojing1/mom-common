package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * BOM有效交叉类型
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum BomEffectivenessCheckTypeEnum implements IEnum<Object> {

    CHECK_MATERIAL("1", "检查产品"),
    CHECK_BOM("2", "检查BOM"),

    ;

    private String value;

    private String name;

    BomEffectivenessCheckTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BomEffectivenessCheckTypeEnum element : values()) {
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
        for (BomEffectivenessCheckTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> all = new ArrayList<>();
        for (BomEffectivenessCheckTypeEnum element : values()) {
            all.add(element.getName());
        }
        return all;
    }

    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}
