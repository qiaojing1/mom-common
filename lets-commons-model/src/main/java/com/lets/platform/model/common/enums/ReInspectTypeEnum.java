package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 复检类型
 * @author DING WEI
 * @date 2024/12/24 16:08
 * @version 1.0
 */
public enum ReInspectTypeEnum implements IEnum<Object> {

    DEVICE("1", "按设备"),
    FACTORY_MODE("2", "按生产单元"),
    ;

    private String value;

    private String name;

    ReInspectTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ReInspectTypeEnum getEnumByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ReInspectTypeEnum element : ReInspectTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReInspectTypeEnum element : ReInspectTypeEnum.values()) {
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
        for (ReInspectTypeEnum element : ReInspectTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
