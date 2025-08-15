package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 采集消息类型 枚举
 *
 * @ClassName CollectionMsgTypeEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum CollectionMsgTypeEnum implements IEnum<Object> {

    WARN("1", "告警"),
    NOTICE("2", "预警"),
    ERROR_OFFLINE("3", "异常掉线"),
    ;

    private String value;

    private String name;

    CollectionMsgTypeEnum(String value, String name) {
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
        for (CollectionMsgTypeEnum element : CollectionMsgTypeEnum.values()) {
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
        for (CollectionMsgTypeEnum element : CollectionMsgTypeEnum.values()) {
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
        for (CollectionMsgTypeEnum element : CollectionMsgTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (CollectionMsgTypeEnum element : CollectionMsgTypeEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
