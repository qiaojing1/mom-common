package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;

public enum PhotographyControlMethodEnum {
    NO("N","不控制"),
    YES("Y","必须拍照"),
    ;
    String code;

    String message;


    private PhotographyControlMethodEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static PhotographyControlMethodEnum getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        PhotographyControlMethodEnum[] values = PhotographyControlMethodEnum.values();
        for (PhotographyControlMethodEnum roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }

        return null;
    }

    public static String getNameByCode(String code) {
        PhotographyControlMethodEnum[] values = PhotographyControlMethodEnum.values();
        for (PhotographyControlMethodEnum roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        PhotographyControlMethodEnum[] values = PhotographyControlMethodEnum.values();
        for (PhotographyControlMethodEnum roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }
}
