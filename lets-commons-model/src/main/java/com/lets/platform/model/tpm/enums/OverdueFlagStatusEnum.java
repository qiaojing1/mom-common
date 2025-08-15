package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 逾期状态
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2025/04/08 14:35
 */
public enum OverdueFlagStatusEnum implements IEnum<Object> {

    NORMAL("1", "正常"),
    NOT_ANSWER("2", "逾期未接"),
    NOT_INSPECT("3", "逾期未检"),
    ;

    private String value;

    private String name;

    OverdueFlagStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OverdueFlagStatusEnum element : OverdueFlagStatusEnum.values()) {
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
        for (OverdueFlagStatusEnum element : OverdueFlagStatusEnum.values()) {
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
