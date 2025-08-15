package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 工艺路线类型 枚举
 * @author DING WEI
 * @date 2024/12/5 16:21
 * @version 1.0
 */
public enum RouteTypeEnum implements IEnum<Object> {

    STANDARD("1", "标准工艺"),
    REWORK("2", "返工工艺"),
    ;

    private final String value;

    private final String name;

    RouteTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RouteTypeEnum element : RouteTypeEnum.values()) {
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
        for (RouteTypeEnum element : RouteTypeEnum.values()) {
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
