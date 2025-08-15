package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 推送类型 枚举
 * @author DING WEI
 * @date 2022/12/20 16:28
 * @version 1.0
 */
public enum MessageSendTypeEnum implements IEnum<Object> {

    ALARM("1", "告警"),
    WARN("2", "预警"),
    EXCEPTION("3", "异常提醒"),
    ;

    private String value;

    private String name;


    MessageSendTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MessageSendTypeEnum element : MessageSendTypeEnum.values()) {
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
        for (MessageSendTypeEnum element : MessageSendTypeEnum.values()) {
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
