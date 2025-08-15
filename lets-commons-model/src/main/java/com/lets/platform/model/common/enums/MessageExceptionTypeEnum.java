package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 推送类型 枚举
 * @author DING WEI
 * @date 2022/12/20 16:28
 * @version 1.0
 */
public enum MessageExceptionTypeEnum implements IEnum<Object> {

    COLLECTOR_ERROR("1", "采集器异常"),
    SERVER_ERROR("2", "服务异常"),
    SYS_ERROR("3", "系统异常"),
    ;

    private String value;

    private String name;


    MessageExceptionTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MessageExceptionTypeEnum element : MessageExceptionTypeEnum.values()) {
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
        for (MessageExceptionTypeEnum element : MessageExceptionTypeEnum.values()) {
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
