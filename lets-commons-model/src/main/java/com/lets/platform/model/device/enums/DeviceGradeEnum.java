package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备等级 枚举
 *
 * @version 1.0
 * @ClassName DeviceGradeEnum
 * @author: DING WEI
 * @create: 2021/05/13 16:09
 **/
public enum DeviceGradeEnum implements IEnum<Object> {

    A("A", "A"),
    B("B", "B"),
    C("C", "C");

    private String value;
    private String name;

    DeviceGradeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public Object getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return "";
        }
        for (DeviceGradeEnum element : DeviceGradeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DeviceGradeEnum element : DeviceGradeEnum.values()) {
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
        for (DeviceGradeEnum element : DeviceGradeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (DeviceGradeEnum element : DeviceGradeEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
