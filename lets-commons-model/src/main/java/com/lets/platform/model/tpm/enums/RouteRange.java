package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;
import com.lets.platform.model.tpm.enums.*;
public enum RouteRange {
    WPRKSHOP("1","车间"),
    PRODUCELINE("2","产线"),
    AREA("3","区域"),

    DEVICE("4","设备"),
    FACTORY_MODE("5", "生产单元");
    String code;

    String message;


    private RouteRange(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static RouteRange getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        RouteRange[] values = RouteRange.values();
        for (RouteRange roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }

        return null;
    }
}
