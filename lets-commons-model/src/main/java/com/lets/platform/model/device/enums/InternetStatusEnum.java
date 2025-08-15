package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 物联状态 枚举
 *
 * @version 1.0
 * @ClassName InternetStatusEnum
 * @author: DING WEI
 * @create: 2021/05/13 16:09
 **/
public enum InternetStatusEnum implements IEnum<Object> {

    NOT_INTERNET("0", "未联网"),
    YES_INTERNET("1", "已联网");

    private String value;
    private String name;

    InternetStatusEnum(String value, String name) {
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
        for (InternetStatusEnum element : InternetStatusEnum.values()) {
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
        for (InternetStatusEnum element : InternetStatusEnum.values()) {
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
        for (InternetStatusEnum element : InternetStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (InternetStatusEnum element : InternetStatusEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
