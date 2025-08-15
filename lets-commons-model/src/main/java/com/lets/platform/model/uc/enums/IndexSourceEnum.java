package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 首页来源[1:方案设计,2:工具配置]
 * @author DING WEI
 * @date 2024/1/4 16:59
 * @version 1.0
 */
public enum IndexSourceEnum implements IEnum<Object> {

    SCHEME_DESIGN("1", "方案设计"),
    TOOL_CONFIG("2", "工具配置");

    private String value;

    private String name;

    IndexSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (IndexSourceEnum element : IndexSourceEnum.values()) {
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
        for (IndexSourceEnum element : IndexSourceEnum.values()) {
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
