package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 机器人状态
 * @author Qiao
 * @date 9/17/21 10:52
 * @version 1.0
 */
public enum AgvTaskStatusEnum implements IEnum<Object> {

    NEW("0", "已创建"),
    ING("1", "正在执行"),
    END("2", "已结束"),
    CANCEL("3", "取消完成"),

    ;

    private String value;

    private String name;

    AgvTaskStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (AgvTaskStatusEnum element : AgvTaskStatusEnum.values()) {
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
        for (AgvTaskStatusEnum element : AgvTaskStatusEnum.values()) {
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
