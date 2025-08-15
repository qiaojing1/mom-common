package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 工艺文档适用范围
 */
public enum ScopeOfApplicationEnum implements IEnum<Object> {
    CURRENCY("currency", "通用"),
    BOM("BOM", "BOM"),
    MATERIAL("material", "物料"),
    PROCESS_ROUTING("processRouting", "工艺路线"),
    MO_ORDER("moOrder", "生产订单"),
    ;

    private String value;

    private String source;

    ScopeOfApplicationEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ScopeOfApplicationEnum element : ScopeOfApplicationEnum.values()) {
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
        for (ScopeOfApplicationEnum element : ScopeOfApplicationEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
