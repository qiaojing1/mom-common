package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * influxDb列名 枚举
 *
 * @ClassName InfluxDbColumnsEnum
 * @author: Qiao
 * @create: 2021/11/29 13:32
 * @Version 1.0
 **/
public enum InfluxDbColumnsEnum implements IEnum<Object> {

    TIME("1", "time"),
    SYSTEMNO("2", "SystemNo"),
    DEVICECODE("3", "deviceCode"),
    ;

    private String value;

    private String name;

    InfluxDbColumnsEnum(String value, String name) {
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
        for (InfluxDbColumnsEnum element : InfluxDbColumnsEnum.values()) {
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
        for (InfluxDbColumnsEnum element : InfluxDbColumnsEnum.values()) {
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
        for (InfluxDbColumnsEnum element : InfluxDbColumnsEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (InfluxDbColumnsEnum element : InfluxDbColumnsEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
