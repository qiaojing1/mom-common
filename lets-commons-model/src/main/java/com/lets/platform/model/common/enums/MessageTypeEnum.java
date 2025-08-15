package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 消息类型 枚举
 *
 * @ClassName MessageTypeEnum
 * @author: QIAO
 * @create: 2021/08/17 13:32
 * @Version 1.0
 **/
public enum MessageTypeEnum implements IEnum<Object> {

    PLATFORM("1", "系统平台","PLATFORM"),
    ENTERPRISEWECHART("2", "企业微信","ENTERPRISEWECHART"),
    DINGDING("3", "钉钉消息","DINGDING"),
    SMS("4", "短信","SMS"),
    EMAIL("5", "邮箱","EMAIL"),
    PHONEVOICE("6", "电话语音","PHONEVOICE"),
    PLATFORM_BROADCAST("7", "平台广播","PLATFORM_BROADCAST");

    private String value;

    private String source;
    private String name;

    MessageTypeEnum(String value, String source,String name) {
        this.value = value;
        this.source = source;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }
    public String getName() {
        return source;
    }
    public String getCodeName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MessageTypeEnum element : MessageTypeEnum.values()) {
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
        for (MessageTypeEnum element : MessageTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static MessageTypeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MessageTypeEnum element : MessageTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }
}
