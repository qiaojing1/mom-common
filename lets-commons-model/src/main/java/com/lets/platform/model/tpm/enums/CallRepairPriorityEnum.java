package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 维修优先级[1:最高,2:较高,3:普通]
 * @author DING WEI
 * @date 2024/12/20 10:53
 * @version 1.0
 */
public enum CallRepairPriorityEnum implements IEnum<Object> {

    HIGHEST("1","最高"),
    HIGHER("2","较高"),
    ORDINARY("3", "普通"),
    ;

    private String value;

    private String name;

    CallRepairPriorityEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CallRepairPriorityEnum element : CallRepairPriorityEnum.values()) {
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
        for (CallRepairPriorityEnum element : CallRepairPriorityEnum.values()) {
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
