package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;
import com.lets.platform.model.tpm.enums.*;
public enum SpotOrderType {
    BYDEVICE("1","按设备"),
    BYWHOPSHOP("2","按车间"),
    BYPRODUCE("3","按产线"),
    BYCAUSEDEP("4","按部门");
    String code;

    String message;


    private SpotOrderType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static SpotOrderType getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        SpotOrderType[] values = SpotOrderType.values();
        for (SpotOrderType roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }

        return null;
    }
}
