package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 舍入类型 枚举
 * @author DING WEI
 * @date 2023/7/3 13:49
 * @version 1.0
 */
public enum RoundOffTypeUnitEnum implements IEnum<Object> {

    ROUND_HALF_UP("4", "四舍五入"),
    ROUND_UP("0", "直接进位"),
    ROUND_DOWN("1", "直接舍位"),
    ;

    private String value;

    private String name;

    RoundOffTypeUnitEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RoundOffTypeUnitEnum element : values()) {
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
        for (RoundOffTypeUnitEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (RoundOffTypeUnitEnum element : values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
