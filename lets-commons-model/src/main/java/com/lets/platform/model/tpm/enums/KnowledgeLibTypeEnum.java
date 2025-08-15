package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 维修知识库类型[1:故障代码,2:故障类型]
 * @author DING WEI
 * @date 2024/11/26 9:47
 * @version 1.0
 */
public enum KnowledgeLibTypeEnum implements IEnum<Object> {

    FAULT_CODE("1","故障代码"),
    FAULT_TYPE("2","故障类型"),
    ;

    private String value;

    private String name;

    KnowledgeLibTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (KnowledgeLibTypeEnum element : KnowledgeLibTypeEnum.values()) {
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
        for (KnowledgeLibTypeEnum element : KnowledgeLibTypeEnum.values()) {
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
