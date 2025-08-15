package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * 组织属性 枚举
 *
 * @ClassName OrgAttributeEnum
 * @author:qiao
 * @create: 2021/04/30 13:32
 * @Version 1.0
 **/
public enum OrgAttributeEnum implements IEnum<Object> {

    MALE("1", "虚拟组织"),
    FEMALE("2", "实体组织"),;

    private String value;

    private String describe;

    OrgAttributeEnum(String value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getOrgAttributeName(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (OrgAttributeEnum element : OrgAttributeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
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
        for (OrgAttributeEnum element : OrgAttributeEnum.values()) {
            if (describe.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }

    public static Set<String> getAllDescribe() {
        Set<String> allDescribe = new HashSet<>();
        for (OrgAttributeEnum element : OrgAttributeEnum.values()) {
            allDescribe.add(element.getDescribe());
        }
        return allDescribe;
    }
}
