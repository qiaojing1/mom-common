package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备状态大类 枚举
 *
 * @ClassName CollectorTypeEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum DeviceStatusTypeEnum implements IEnum<Object> {

    RUNNING("1", "运行"),
    FREE("2", "空闲"),
    SHUTDOWN("3", "故障"),
    STOP("4", "停机"),
    ;

    private String value;

    private String name;

    DeviceStatusTypeEnum(String value, String name) {
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
        for (DeviceStatusTypeEnum element : DeviceStatusTypeEnum.values()) {
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
        for (DeviceStatusTypeEnum element : DeviceStatusTypeEnum.values()) {
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
        for (DeviceStatusTypeEnum element : DeviceStatusTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (DeviceStatusTypeEnum element : DeviceStatusTypeEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }

    public static List<String> getAllCode() {
        List<String> allCode = new ArrayList<>();
        allCode.add(FREE.getValue());
        allCode.add(SHUTDOWN.getValue());
        allCode.add(STOP.getValue());
        return allCode;
    }
}
