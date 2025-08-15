package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Arrays;
import java.util.List;

/**
 * 计划执行方式
 * @author zhangweiyan
 * @date 11/11/24 7:16 PM
 * @version 1.0
 */
public enum PlanExecutionMethodEnum {
    SINGLE("1","每周期内执行一次"),
    CYCLE("2","每周期内重复执行"),
    ;
    String code;

    String message;


    private PlanExecutionMethodEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static PlanExecutionMethodEnum getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        PlanExecutionMethodEnum[] values = PlanExecutionMethodEnum.values();
        for (PlanExecutionMethodEnum roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }
        return null;
    }

    public static String getName(String code) {
        PlanExecutionMethodEnum[] values = PlanExecutionMethodEnum.values();
        for (PlanExecutionMethodEnum roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        PlanExecutionMethodEnum[] values = PlanExecutionMethodEnum.values();
        for (PlanExecutionMethodEnum roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        return Arrays.asList(SINGLE.getMessage(), CYCLE.getMessage());
    }
}
