package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 能源分项 枚举
 *
 * @version 1.0
 * @ClassName EngryTypeEnum
 * @author: DING WEI
 * @create: 2021/05/13 16:09
 **/
public enum EngryTypeEnum implements IEnum<Object> {

    LIGHTING("1", "照明"),
    CONDITIONER("2", "空调"),
    SOCKET("3", "插座"),
    SPECIAL("4", "特殊用电");

    private String value;
    private String name;

    EngryTypeEnum(String value, String name) {
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
        for (EngryTypeEnum element : EngryTypeEnum.values()) {
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
        for (EngryTypeEnum element : EngryTypeEnum.values()) {
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
        for (EngryTypeEnum element : EngryTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (EngryTypeEnum element : EngryTypeEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
