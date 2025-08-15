package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 复检人员指定方式
 * @author DING WEI
 * @date 2024/12/24 16:08
 * @version 1.0
 */
public enum ReInspectUserMethodEnum implements IEnum<Object> {

    USER("1", "按人员"),
    FACTORY_MODE("2", "按生产单元"),
    ;

    private String value;

    private String name;

    ReInspectUserMethodEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ReInspectUserMethodEnum getEnumByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ReInspectUserMethodEnum element : ReInspectUserMethodEnum.values()) {
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
        for (ReInspectUserMethodEnum element : ReInspectUserMethodEnum.values()) {
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
        for (ReInspectUserMethodEnum element : ReInspectUserMethodEnum.values()) {
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
