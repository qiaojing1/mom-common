package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 可用枚举类;
 *
 * @author Qiao
 * @Date 2017年10月18日
 */
public enum YesOrNo implements IEnum<Object> {

    YES("Y", "是"),
    NO("N", "否");

    private final String code;
    private final String desc;

    private YesOrNo(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static YesOrNo getEnumByCode(String code) {
        if (code.equals("Y")) {
            return YES;
        } else if (code.equals("N")) {
            return NO;
        }
        return null;
    }

    public static String getCodeByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return "";
        }
        for (YesOrNo element : YesOrNo.values()) {
            if (element.getDescription().equals(name)) {
                return element.getValue();
            }
        }
        return null;
    }

    public static Integer getIntValue(String code) {
        if (YES.equals(code)) {
            return 1;
        }
        return 0;
    }

    public static String getValue(Integer intValue) {
        if (intValue == 1) {
            return YES.getValue();
        }
        return NO.getValue();
    }

    public static String getValue(boolean value) {
        if (value) {
            return YES.getValue();
        }
        return NO.getValue();
    }

    public static String getNameByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return NO.getDescription();
        }
        for (YesOrNo element : YesOrNo.values()) {
            if (element.getValue().equals(code)) {
                return element.getDescription();
            }
        }
        return null;
    }

    public static String getNameByCodeReverse(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        if (YES.getValue().equals(code)) {
            return NO.getDescription();
        } else {
            return YES.getDescription();
        }
    }

    public static boolean containsName(String name) {
        if (!StringUtils.isEmpty(name)) {
            YesOrNo[] var1 = values();
            for (YesOrNo element : var1) {
                if (name.equals(element.getDescription())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return false;
        }
        for (YesOrNo element : YesOrNo.values()) {
            if (code.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllCode() {
        List<String> allCode = new ArrayList<>();
        for (YesOrNo element : YesOrNo.values()) {
            allCode.add(element.getValue());
        }
        return allCode;
    }

    public static List<String> getAllDesc() {
        List<String> all = new ArrayList<>();
        for (YesOrNo element : YesOrNo.values()) {
            all.add(element.getDescription());
        }
        return all;
    }

    public boolean equals(String code) {
        return this.code.equals(code);
    }

    @Override
    public String getValue() {
        return code;
    }

    public String getDescription() {
        return desc;
    }
}
