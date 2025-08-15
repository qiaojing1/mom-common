package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 制程检验计划 工序范围
 */
public enum InspectPlanProcessScopEnum implements IEnum<Object> {

    ALL("0", "通用"),
    PROCESS("1", "工序"),
    PROCESS_GROUP("2", "工序分组"),
    ;

    private final String value;

    @Getter
    private final String name;

    InspectPlanProcessScopEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InspectPlanProcessScopEnum element : InspectPlanProcessScopEnum.values()) {
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
        for (InspectPlanProcessScopEnum element : InspectPlanProcessScopEnum.values()) {
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

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
