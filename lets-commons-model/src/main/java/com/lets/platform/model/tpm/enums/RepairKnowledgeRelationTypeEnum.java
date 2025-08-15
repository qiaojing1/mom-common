package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 维修知识关联类型 枚举
 * @author DING WEI
 * @date 2022/7/12 9:16
 * @version 1.0
 */
public enum RepairKnowledgeRelationTypeEnum implements IEnum<Object> {

    DEVICE("1","设备"),
    TYPE("2","类型"),
    MODEL("3","型号"),
    ALL("4","所有设备");

    ;

    private String value;

    private String name;

    RepairKnowledgeRelationTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RepairKnowledgeRelationTypeEnum element : RepairKnowledgeRelationTypeEnum.values()) {
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
        for (RepairKnowledgeRelationTypeEnum element : RepairKnowledgeRelationTypeEnum.values()) {
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
