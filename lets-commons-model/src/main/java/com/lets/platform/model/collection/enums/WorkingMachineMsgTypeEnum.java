package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;

/**
 * @author zhangweiyan
 * @EnumName WorkingMachineMsgTypeEnum
 * @Description 客户端发送消息队列的消息类型
 * @Date 2024/1/31 08:47
 **/
public enum WorkingMachineMsgTypeEnum implements IEnum<Object> {
    LOGIN("USER_LOGIN", "用户登录"),
    LOGOUT("USER_LOGOUT", "用户退出"),
    CHAN_IDLE("CHAN_IDLE", "试验通道空闲"),
    CHAN_RUN("CHAN_RUN", "试验通道运行"),
    CHAN_CHANGE("CHAN_CHANGED", "试验通道变更"),
    ;

    private final String value;

    private final String name;

    WorkingMachineMsgTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public static WorkingMachineMsgTypeEnum getSelfByValue(String value) {
        for (WorkingMachineMsgTypeEnum obj : WorkingMachineMsgTypeEnum.values()) {
            if (obj.getValue().equals(value)) {
                return obj;
            }
        }
        return null;
    }
}
