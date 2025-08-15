package com.lets.platform.model.tpm.enums;

import java.util.Arrays;
import java.util.List;
import com.lets.platform.model.tpm.enums.*;

/**
 * 点巡检性质 枚举
 * @author DING WEI
 * @date 2/14/22 7:16 PM
 * @version 1.0
 */
public enum ConfigNature {

    QUALITATIVE("1","定性"),
    RATION("2","定量"),;

    String code;

    String message;

    private ConfigNature(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static String getName(String code) {
        ConfigNature[] values = ConfigNature.values();
        for (ConfigNature roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        ConfigNature[] values = ConfigNature.values();
        for (ConfigNature roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        return Arrays.asList(QUALITATIVE.getMessage(), RATION.getMessage());
    }
}
