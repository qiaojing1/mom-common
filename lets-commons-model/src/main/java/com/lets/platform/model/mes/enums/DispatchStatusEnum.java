package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * 派工状态 枚举
 * @author Qiao
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum DispatchStatusEnum implements IEnum<Object> {

    UN_PRODUCE("0", "未生产"),
    PRODUCE_ING("1", "生产中"),
    SUSPEND_ING("2", "暂停中"),
    COMPLETE("3", "已完成"),
    ;

    private String value;

    private String name;

    DispatchStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DispatchStatusEnum element : DispatchStatusEnum.values()) {
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
        for (DispatchStatusEnum element : DispatchStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getCanReceiveStatus() {
        return Arrays.asList(UN_PRODUCE.getValue(), PRODUCE_ING.getValue());
    }


    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}
