package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Arrays;
import java.util.List;
import com.lets.platform.model.tpm.enums.*;

/**
 * 点巡检 周期
 * @author DING WEI
 * @date 2/14/22 7:16 PM
 * @version 1.0
 */
public enum ConfigCycle {
    DAY("1","每天"),
    WEEK("2","每周"),
    MONTH("3","每月"),
    QUARTER("4","每季度"),
    HALF_YEAR("5","每半年"),
    YEAR("6","每年"),
    ;
    String code;

    String message;


    private ConfigCycle(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ConfigCycle getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        ConfigCycle[] values = ConfigCycle.values();
        for (ConfigCycle roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }
        return null;
    }

    public static String getName(String code) {
        ConfigCycle[] values = ConfigCycle.values();
        for (ConfigCycle roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        ConfigCycle[] values = ConfigCycle.values();
        for (ConfigCycle roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        return Arrays.asList(DAY.getMessage(), WEEK.getMessage(), MONTH.getMessage(), YEAR.getMessage());
    }
}
