package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 日期 枚举
 * @author DING WEI
 * @date 2023/11/21 11:31
 * @version 1.0
 */
public enum FormatEnum implements IEnum<Object> {

    yy("yy", "年(2码)"),
    yyyy("yyyy", "年(4码)"),
    yyMM("yyMM", "年(2码)/月"),
    yyyyMM("yyyyMM", "年(4码)/月"),
    yyMMdd("yyMMdd", "年(2码)/月/日"),
    yyyyMMdd("yyyyMMdd", "年(4码)/月/日"),
    yyMMddHHmmss("yyMMddHHmmss", "年(2码)/月/日/时/分/秒"),
    yyyyMMddHHmmss("yyyyMMddHHmmss", "年(4码)/月/日/时/分/秒"),
    ;

    private final String value;

    private final String name;

    FormatEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (FormatEnum element : FormatEnum.values()) {
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
        for (FormatEnum element : FormatEnum.values()) {
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
