package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 阅读状态 枚举
 * @author DING WEI
 * @date 2022/12/20 16:28
 * @version 1.0
 */
public enum ReadStatusEnum implements IEnum<Object> {

    UNREAD("0", "未读"),
    READ("1", "已读"),
    ;

    private String value;

    private String source;

    ReadStatusEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReadStatusEnum element : ReadStatusEnum.values()) {
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
        for (ReadStatusEnum element : ReadStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
