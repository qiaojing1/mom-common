package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产单元类型 枚举
 *
 * @version 1.0
 * @ClassName FactoryModeTypeEnum
 * @author: DING WEI
 * @create: 2021/05/13 16:09
 **/
public enum FactoryModeTypeEnum implements IEnum<Object> {

    FACTORY("1", "工厂"),
    WORK_SHOP("2", "车间"),
    PRODUCE_LINE("3", "产线");

    private String value;
    private String name;

    FactoryModeTypeEnum(String value, String name) {
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
        for (FactoryModeTypeEnum element : FactoryModeTypeEnum.values()) {
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
        for (FactoryModeTypeEnum element : FactoryModeTypeEnum.values()) {
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
        for (FactoryModeTypeEnum element : FactoryModeTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (FactoryModeTypeEnum element : FactoryModeTypeEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
