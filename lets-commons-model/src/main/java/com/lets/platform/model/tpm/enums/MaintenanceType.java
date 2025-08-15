package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 保养类型
 */
public enum MaintenanceType {
    DAILY("1","日常保养"),
    FIRST_LEVEL("2","专业保养"),
    SECOND_LEVEL("3","二级保养"),
    OVERHAUL("4","设备大修"),
    ;
    String code;

    String message;


    private MaintenanceType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static MaintenanceType getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        MaintenanceType[] values = MaintenanceType.values();
        for (MaintenanceType roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }

        return null;
    }

    public static String getNameByCode(String code) {
        MaintenanceType[] values = MaintenanceType.values();
        for (MaintenanceType roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        MaintenanceType[] values = MaintenanceType.values();
        for (MaintenanceType roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }
}
