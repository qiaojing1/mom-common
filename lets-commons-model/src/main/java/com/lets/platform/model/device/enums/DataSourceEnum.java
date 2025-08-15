package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据来源 枚举
 * @author DING WEI
 * @date 2023/10/30 16:23
 * @version 1.0
 */
public enum DataSourceEnum implements IEnum<Object> {

    COLLECT("1", "采集"),
    CALCULATE("2", "计算");

    private String value;
    private String name;

    DataSourceEnum(String value, String name) {
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
        for (DataSourceEnum element : DataSourceEnum.values()) {
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
        for (DataSourceEnum element : DataSourceEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (DataSourceEnum element : DataSourceEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (DataSourceEnum element : DataSourceEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
