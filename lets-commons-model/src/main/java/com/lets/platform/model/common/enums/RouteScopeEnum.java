package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 工艺路线适用范围 枚举
 * @author DING WEI
 * @date 2023/11/15 8:54
 * @version 1.0
 */
public enum RouteScopeEnum implements IEnum<Object> {

    GROUP("0", "分组"),
    MATERIAL("1", "物料"),
    MATERIAL_GROUP("2", "物料分组"),
    COMMON("3", "通用"),
    ;

    private final String value;

    private final String name;

    RouteScopeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RouteScopeEnum element : RouteScopeEnum.values()) {
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
        for (RouteScopeEnum element : RouteScopeEnum.values()) {
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
