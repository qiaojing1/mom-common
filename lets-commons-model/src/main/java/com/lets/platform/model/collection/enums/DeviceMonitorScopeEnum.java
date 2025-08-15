package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备监控范围 枚举
 *
 * @ClassName DeviceMonitorScopeEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum DeviceMonitorScopeEnum implements IEnum<Object> {

    RUNNING_MONITOR("1", "运行监控"),
    ENERGY_MONITOR("2", "能耗监控"),
    WARN_MONITOR("3", "报警监控"),
    ENVIRONMENT_MONITOR("4", "环境监控"),
    ;

    private String value;

    private String name;

    DeviceMonitorScopeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DeviceMonitorScopeEnum element : DeviceMonitorScopeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DeviceMonitorScopeEnum element : DeviceMonitorScopeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (DeviceMonitorScopeEnum element : DeviceMonitorScopeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return false;
        }
        for (DeviceMonitorScopeEnum element : DeviceMonitorScopeEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllValue() {
        List<String> allValue = new ArrayList<>();
        for (DeviceMonitorScopeEnum element : DeviceMonitorScopeEnum.values()) {
            allValue.add(element.getValue());
        }
        return allValue;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (DeviceMonitorScopeEnum element : DeviceMonitorScopeEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
