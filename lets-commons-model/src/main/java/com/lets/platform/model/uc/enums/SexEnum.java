package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.I18nTypeEnum;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 状态 枚举
 *
 * @ClassName SexEnum
 * @author:qiao
 * @create: 2021/04/30 13:32
 * @Version 1.0
 **/
public enum SexEnum implements IEnum<Object> {

    MALE("0", "男", "man"),
    FEMALE("1", "女", "woman"),;

    private String value;

    private String describe;

    private String english;

    SexEnum(String value, String describe, String english) {
        this.value = value;
        this.describe = describe;
        this.english = english;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getEnglish() {
        return english;
    }

    public static String getSexName(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (SexEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
            }
        }
        return null;
    }

    public static String getCode(String name, String lang) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SexEnum element : values()) {
            if (I18nTypeEnum.ZH_CH.getValue().equals(lang)) {
                if (name.equals(element.getDescribe())) {
                    return element.getValue();
                }
            } else if (I18nTypeEnum.EN_US.getValue().equals(lang)) {
                if (name.equals(element.getEnglish())) {
                    return element.getValue();
                }
            }
        }
        return null;
    }

    public String getDescribe() {
        return describe;
    }

    public static boolean containsDescribe(String describe) {
        if (StringUtils.isEmpty(describe)) {
            return false;
        }
        for (SexEnum element : values()) {
            if (describe.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllDescribe() {
        List<String> allDescribe = new ArrayList<>();
        for (SexEnum element : values()) {
            allDescribe.add(element.getDescribe());
        }
        return allDescribe;
    }

    public static List<String> getAllName(String lang) {
        List<String> allName = new ArrayList<>();
        for (SexEnum element : values()) {
            if (I18nTypeEnum.ZH_CH.getValue().equals(lang)) {
                allName.add(element.getDescribe());
            } else if (I18nTypeEnum.EN_US.getValue().equals(lang)) {
                allName.add(element.getEnglish());
            }
        }
        return allName;
    }
}
