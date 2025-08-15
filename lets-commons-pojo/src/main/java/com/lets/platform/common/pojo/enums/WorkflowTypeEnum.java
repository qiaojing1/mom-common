package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

public enum WorkflowTypeEnum implements IEnum<Object> {

    APPROVAL_PROCESS("1", "审批流程"),
    OPERATION_PROCESS("2", "业务流程"),
    ;

    private final String value;

    @Getter
    private final String name;

    WorkflowTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (WorkflowTypeEnum element : WorkflowTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static WorkflowTypeEnum getEnumByValue(String value) {
        for (WorkflowTypeEnum element : WorkflowTypeEnum.values()) {
            if (element.getValue().equals(value)) {
                return element;
            }
        }
        return null;
    }


    @Override
    public String getValue() {
        return value;
    }
}
