package com.lets.platform.model.collection.enums;

import org.hibernate.validator.constraints.NotBlank;

public enum EnergyTypePlanEnum {
    Electricity("1","用电"),
    Water("2","用水"),
    Gas("3","用气"),
    ;
    String code;

    String message;


    private EnergyTypePlanEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static EnergyTypePlanEnum getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        EnergyTypePlanEnum[] values = EnergyTypePlanEnum.values();
        for (EnergyTypePlanEnum roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }

        return null;
    }

    public static String getMessageByCode(@NotBlank(message = "code不能为空") String code) {
        EnergyTypePlanEnum[] values = EnergyTypePlanEnum.values();
        for (EnergyTypePlanEnum roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }

        return null;
    }

    public static String getCodeByMessage(@NotBlank(message = "message不能为空") String message) {
        EnergyTypePlanEnum[] values = EnergyTypePlanEnum.values();
        for (EnergyTypePlanEnum roleType : values) {
            if (roleType.getMessage().equals(message)) {
                return roleType.getCode();
            }
        }

        return null;
    }
}
