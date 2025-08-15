package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 机器人运输类型
 * @author DING WEI
 * @date 2023/3/6 11:47
 * @version 1.0
 */
public enum RobotTransportTypeEnum implements IEnum<Object> {

    ORDINARY("1", "一般运输"),
    ORDER("2", "工单运输"),
    CALL_OUT("3", "呼叫"),
    ;

    private String value;

    private String name;

    RobotTransportTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RobotTransportTypeEnum element : RobotTransportTypeEnum.values()) {
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
        for (RobotTransportTypeEnum element : RobotTransportTypeEnum.values()) {
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
