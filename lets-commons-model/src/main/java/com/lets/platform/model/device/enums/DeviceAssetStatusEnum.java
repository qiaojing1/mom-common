package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备资产状态 枚举
 * 1正常
 * @version 1.0
 * @ClassName DeviceAssetStatusEnum
 * @author: zhangweiyan
 * @create: 2024/10/29 16:09
 **/
public enum DeviceAssetStatusEnum implements IEnum<Object> {

    NORMAL("1", "正常"),
    IDLE("2", "闲置"),
    SCRAP("3", "报废"),
    ON_SITE_MAINTENANCE("4", "厂内维修"),
    OUTSOURCING_MAINTENANCE("5", "委外维修"),
    IN_MAINTENANCE("6", "保养中"),
    FAULT_REPAIR("7", "故障报修"),
    ;

    private String value;
    private String name;

    DeviceAssetStatusEnum(String value, String name) {
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
        for (DeviceAssetStatusEnum element : DeviceAssetStatusEnum.values()) {
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
        for (DeviceAssetStatusEnum element : DeviceAssetStatusEnum.values()) {
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
        for (DeviceAssetStatusEnum element : DeviceAssetStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (DeviceAssetStatusEnum element : DeviceAssetStatusEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }

    public static List<String> getNegativeStatus() {
        List<String> negativeStatus = new ArrayList<>();
        negativeStatus.add(NORMAL.getValue());
        return negativeStatus;
    }
}
