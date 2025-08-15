package com.lets.platform.model.base.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准产能单位
 * @author DING WEI
 * @date 2025/1/7 17:16
 * @version 1.0
 */
public enum StandardCapacityUnitEnum implements IEnum<Object> {

    DAY("day", "单位/天"),
    HOUR("hour", "单位/时"),
    MINUTE("minute", "单位/分"),
    ;

    private final String value;

    private final String name;

    StandardCapacityUnitEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (StandardCapacityUnitEnum element : values()) {
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
        for (StandardCapacityUnitEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (StandardCapacityUnitEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getNames() {
        List<String> nameList = new ArrayList<>();
        for (StandardCapacityUnitEnum element : values()) {
            nameList.add(element.getName());
        }
        return nameList;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (StandardCapacityUnitEnum element : values()) {
            if (value.equals(element.getValue().toString())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (StandardCapacityUnitEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
