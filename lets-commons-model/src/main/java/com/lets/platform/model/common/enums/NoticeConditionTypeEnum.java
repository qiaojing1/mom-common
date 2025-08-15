package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 紧急程度 枚举
 * @author DING WEI
 * @date 2022/10/26 9:31
 * @version 1.0
 */
public enum NoticeConditionTypeEnum implements IEnum<Object> {

    FIXED("1", "固定值"),
    VARIABLE("2", "参数"),
    ;

    private String value;

    private String name;

    NoticeConditionTypeEnum(String value, String name) {
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
        for (NoticeConditionTypeEnum element : NoticeConditionTypeEnum.values()) {
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
        for (NoticeConditionTypeEnum element : NoticeConditionTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
