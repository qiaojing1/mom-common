package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 预警类型 枚举
 * @author DING WEI
 * @date 2022/10/26 9:31
 * @version 1.0
 */
public enum NoticeTypeEnum implements IEnum<Object> {

    DEVICE("1", "设备预警"),
    ENERGY("2", "能源预警"),
    ORDER("3", "单据预警"),
    ;

    private String value;

    private String name;

    NoticeTypeEnum(String value, String name) {
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
        for (NoticeTypeEnum element : NoticeTypeEnum.values()) {
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
        for (NoticeTypeEnum element : NoticeTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
