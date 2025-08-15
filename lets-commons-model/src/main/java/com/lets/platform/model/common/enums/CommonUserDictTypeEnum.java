package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 用户数据字典类型
 * @author DING WEI
 * @date 2023/7/15 9:06
 * @version 1.0
 */
public enum CommonUserDictTypeEnum implements IEnum<Object> {

    GROUP("1", "分组"),
    DICT("2", "字典项"),
    ;

    private String value;

    private String name;

    CommonUserDictTypeEnum(String value, String name) {
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
        for (CommonUserDictTypeEnum element : values()) {
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
        for (CommonUserDictTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
