package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * 签到任务类型 枚举
 * @author DING WEI
 * @date 2025/6/24 14:45
 * @version 1.0
 */
public enum SignInTaskTypeEnum implements IEnum<Object> {

    CHECK("1", "检验"),
    ;

    private String value;

    private String describe;

    SignInTaskTypeEnum(String value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isBlank(value)) {
            return value;
        }
        for (SignInTaskTypeEnum element : SignInTaskTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
            }
        }
        return null;
    }

    public String getDescribe() {
        return describe;
    }

    public static boolean contains(String value) {
        if (StringUtils.isBlank(value)) {
            return false;
        }
        for (SignInTaskTypeEnum element : SignInTaskTypeEnum.values()) {
            if (value.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }

    public static Set<String> getAllDescribe() {
        Set<String> allDescribe = new HashSet<>();
        for (SignInTaskTypeEnum element : SignInTaskTypeEnum.values()) {
            allDescribe.add(element.getDescribe());
        }
        return allDescribe;
    }
}
