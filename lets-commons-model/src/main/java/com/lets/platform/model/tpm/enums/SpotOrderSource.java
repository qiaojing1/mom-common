package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;
import com.lets.platform.model.tpm.enums.*;
public enum SpotOrderSource {
    MANUAL("1","人工"),
    AUTOMATIC("2","自动"),
    ;
    String code;

    String message;


    private SpotOrderSource(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static SpotOrderSource getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        SpotOrderSource[] values = SpotOrderSource.values();
        for (SpotOrderSource roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }

        return null;
    }

    public static String getNameByCode(String code) {
        SpotOrderSource[] values = SpotOrderSource.values();
        for (SpotOrderSource roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        SpotOrderSource[] values = SpotOrderSource.values();
        for (SpotOrderSource roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }
}
