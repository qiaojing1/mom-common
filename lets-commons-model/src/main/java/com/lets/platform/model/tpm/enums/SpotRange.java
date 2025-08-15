package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;
import com.lets.platform.model.tpm.enums.*;
public enum SpotRange {
    ALL("1","全部点检项"),
    PUBLIC("2","共有点检项");
    String code;

    String message;


    private SpotRange(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static SpotRange getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        SpotRange[] values = SpotRange.values();
        for (SpotRange roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }

        return null;
    }
}
