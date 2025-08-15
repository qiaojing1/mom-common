package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 自动线运行方式 1自动、2手动
 * @author DING WEI
 * @date 2024/7/2 14:03
 * @version 1.0
 */
public enum RunModeEnum implements IEnum<Object> {

    AUTO("1", "自动"),
    MANUAL("2", "手动"),
    ;

    private String value;

    private String name;

    RunModeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RunModeEnum element : RunModeEnum.values()) {
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
        for (RunModeEnum element : RunModeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
