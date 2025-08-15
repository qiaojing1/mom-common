package com.lets.platform.model.tpm.enums;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import com.lets.platform.model.tpm.enums.*;
public enum RelationDeviceTypeEnum {
    ALL("0","全部设备"),
    CHOOSE("1","选择设备");
    String code;

    String message;

    private RelationDeviceTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static RelationDeviceTypeEnum getEnumByCode(String code) {
        RelationDeviceTypeEnum[] values = RelationDeviceTypeEnum.values();
        for (RelationDeviceTypeEnum roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (RelationDeviceTypeEnum element : RelationDeviceTypeEnum.values()) {
            if (value.equals(element.getCode())) {
                return element.getMessage();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        RelationDeviceTypeEnum[] values = RelationDeviceTypeEnum.values();
        for (RelationDeviceTypeEnum roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        return Arrays.asList(ALL.getMessage(), CHOOSE.getMessage());
    }
}
