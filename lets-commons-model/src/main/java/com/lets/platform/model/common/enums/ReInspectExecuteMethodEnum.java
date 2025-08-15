package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 计划执行方式[1:按复检次数,2:按指定日期]
 * @author DING WEI
 * @date 2025/7/14 15:10
 * @version 1.0
 */
public enum ReInspectExecuteMethodEnum implements IEnum<Object> {

    TIMES("1", "按复检次数"),
    DATE("2", "按指定日期"),
    ;

    private String value;

    private String name;

    ReInspectExecuteMethodEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ReInspectExecuteMethodEnum getEnumByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ReInspectExecuteMethodEnum element : ReInspectExecuteMethodEnum.values()) {
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
        for (ReInspectExecuteMethodEnum element : ReInspectExecuteMethodEnum.values()) {
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
        for (ReInspectExecuteMethodEnum element : ReInspectExecuteMethodEnum.values()) {
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
