package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;
import com.lets.platform.model.tpm.enums.*;
public enum CheckType {
    SPOTCHECK("1","设备点检"),
    SPOTINSPECTION("2","设备巡检");
    String code;

    String message;


    private CheckType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static CheckType getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        CheckType[] values = CheckType.values();
        for (CheckType roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }

        return null;
    }
}
