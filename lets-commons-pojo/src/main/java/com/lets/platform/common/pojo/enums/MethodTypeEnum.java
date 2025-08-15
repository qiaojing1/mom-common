package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 方法来源 枚举
 *
 * @author fzy
 * @since 2023-04-06
 */
public enum MethodTypeEnum implements IEnum<Object> {
    /**
     * 判断操作来源于 保存/更新/删除
     */
    SAVE("save", "保存"),
    UPDATE("update", "更新"),
    DELETE("delete", "删除"),
    DISABLE("disable", "禁用"),
    ENABLE("enable", "启用"),
    OPEN("open", "开启"),
    CLOSE("close", "关闭"),
    ;

    private final String value;

    @Getter
    private final String source;

    MethodTypeEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MethodTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getSource();
            }
        }
        return null;
    }
}
