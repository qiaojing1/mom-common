package com.lets.platform.model.mes.enums.processPlan;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 计划类型[1主计划、2返修计划、3子计划、4增补计划]
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum PlanTypeEnum implements IEnum<Object> {

    MAIN_PLAN("1", "主计划"),
    REPAIR_PLAN("2", "返修计划"),
    CHILD_PLAN("3", "子计划"),
    ADD_PLAN("4", "增补计划"),
    ;

    private String value;

    private String name;

    PlanTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PlanTypeEnum element : PlanTypeEnum.values()) {
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
        for (PlanTypeEnum element : PlanTypeEnum.values()) {
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
