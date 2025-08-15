package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Arrays;
import java.util.List;

/**
 * 运行情况
 * @author DING WEI
 * @date 2/14/22 7:16 PM
 * @version 1.0
 */
public enum RunningSituation {
    NORMAL("1","正常运行"),
    REPAIR("2","故障报修"),
    DEACTIVATE("3","停用"),
    SCRAP("4","报废"),
    ;
    String code;

    String message;


    private RunningSituation(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static RunningSituation getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        RunningSituation[] values = RunningSituation.values();
        for (RunningSituation roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }
        return null;
    }

    public static String getName(String code) {
        RunningSituation[] values = RunningSituation.values();
        for (RunningSituation roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        RunningSituation[] values = RunningSituation.values();
        for (RunningSituation roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }
}
