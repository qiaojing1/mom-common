package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;

public enum ProjectRouteOrderStatus {
    WAIT_REPONSE("1","待响应"),
    HANDLE("2","巡检中"),
    COMPLETE("3","已完成"),
    WAIT_AUDIT("4","待审核"),
    WAIT_DISTRIBUTE("5","待下发"),
    ;

    String code;

    String message;

    private ProjectRouteOrderStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static String getName(@NotBlank(message = "code不能为空") String code) {
        ProjectRouteOrderStatus[] values = ProjectRouteOrderStatus.values();
        for (ProjectRouteOrderStatus roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }
        return null;
    }

    public static ProjectRouteOrderStatus getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        ProjectRouteOrderStatus[] values = ProjectRouteOrderStatus.values();
        for (ProjectRouteOrderStatus roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }
        return null;
    }
}
