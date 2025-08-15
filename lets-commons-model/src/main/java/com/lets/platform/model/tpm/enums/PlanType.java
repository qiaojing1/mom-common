package com.lets.platform.model.tpm.enums;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import com.lets.platform.model.tpm.enums.*;
public enum PlanType {
    SINGLE("1","执行一次"),
    REPEAT("2","重复执行");
    String code;

    String message;

    private PlanType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static PlanType getEnumByCode(String code) {
        PlanType[] values = PlanType.values();
        for (PlanType roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PlanType element : PlanType.values()) {
            if (value.equals(element.getCode())) {
                return element.getMessage();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        PlanType[] values = PlanType.values();
        for (PlanType roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        return Arrays.asList(SINGLE.getMessage(), REPEAT.getMessage());
    }
}
