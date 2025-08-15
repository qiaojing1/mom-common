package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 执行状态[1:未执行,2:已执行]
 * @author zhangweiyan
 * @date 2024/11/27 14:35
 * @version 1.0
 */
public enum ExecuteStatusEnum implements IEnum<Object> {

    EXECUTE("1","未执行"),
    NOT_EXECUTE("2","已执行"),

    ;

    private String value;

    private String name;

    ExecuteStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ExecuteStatusEnum element : ExecuteStatusEnum.values()) {
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
        for (ExecuteStatusEnum element : ExecuteStatusEnum.values()) {
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
