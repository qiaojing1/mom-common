package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 维修知识库创建来源[1:手动创建，2:维修转]
 * @author DING WEI
 * @date 2025/3/3 11:02
 * @version 1.0
 */
public enum RepairLibCreateSourceEnum implements IEnum<Object> {

    MANUAL("1", "手动创建"),
    REPAIR("2", "维修转"),
    ;

    private String value;

    private String name;

    RepairLibCreateSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RepairLibCreateSourceEnum element : RepairLibCreateSourceEnum.values()) {
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
        for (RepairLibCreateSourceEnum element : RepairLibCreateSourceEnum.values()) {
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
