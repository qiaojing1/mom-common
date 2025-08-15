package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * 签到对象类型 枚举
 * @author DING WEI
 * @date 2025/6/24 14:45
 * @version 1.0
 */
public enum SignInObjectTypeEnum implements IEnum<Object> {

    DISTRIBUTOR("1", "经销商"),
    CUSTOMER("2", "客户"),
    ;

    private String value;

    private String describe;

    SignInObjectTypeEnum(String value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (SignInObjectTypeEnum element : SignInObjectTypeEnum.values()) {
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
        for (SignInObjectTypeEnum element : SignInObjectTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static Set<String> getAllDescribe() {
        Set<String> allDescribe = new HashSet<>();
        for (SignInObjectTypeEnum element : SignInObjectTypeEnum.values()) {
            allDescribe.add(element.getDescribe());
        }
        return allDescribe;
    }
}
