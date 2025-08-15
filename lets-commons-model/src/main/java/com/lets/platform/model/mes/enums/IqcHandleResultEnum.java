package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * IQC 不合格品处理结果 枚举
 */
public enum IqcHandleResultEnum implements IEnum<String> {

    GIVE_IN_RECEIVE("5", "让步接收"),
    DECIDE_RETURN("6", "判退"),
    UNDETERMINED("8", "待定"),
    ;

    private final String value;

    @Getter
    private final String name;

    IqcHandleResultEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (IqcHandleResultEnum element : IqcHandleResultEnum.values()) {
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
        for (IqcHandleResultEnum element : IqcHandleResultEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

    @Override
    public String getValue() {
        return value;
    }

}
