package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 填写部位
 * @author DING WEI
 * @date 2022/5/7 13:49
 * @version 1.0
 */
public enum WritePartEnum implements IEnum<Object> {

    FIRST("1", "第一部分", "填写生产位置"),
    SECOND("2", "第二部分", "填写工艺流程"),
    THIRD("3", "第三部分", "审核"),
    ;

    private String value;

    private String name;

    private String msgType;

    WritePartEnum(String value, String name, String msgType) {
        this.value = value;
        this.name = name;
        this.msgType = msgType;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (WritePartEnum element : WritePartEnum.values()) {
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
        for (WritePartEnum element : WritePartEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getMsgType(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WritePartEnum element : WritePartEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getMsgType();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getMsgType() {
        return msgType;
    }

    public String getName() {
        return name;
    }

}
