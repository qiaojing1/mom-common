package com.lets.platform.model.tpm.enums;

import java.util.Arrays;
import java.util.List;

/**
 * 处置方式 枚举
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2025年2月12日11:27:24
 */
public enum DisposalWayEnum {

    SCRAP("1", "报废"),
    TRANSFER("2", "调拨"),
    SALE("3", "出售"),
    ;

    String code;

    String message;

    private DisposalWayEnum(String code, String message) {
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
        DisposalWayEnum[] values = DisposalWayEnum.values();
        for (DisposalWayEnum roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType.getMessage();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        DisposalWayEnum[] values = DisposalWayEnum.values();
        for (DisposalWayEnum roleType : values) {
            if (roleType.getMessage().equals(name)) {
                return roleType.getCode();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        return Arrays.asList(SCRAP.getMessage(), TRANSFER.getMessage(), SALE.getMessage());
    }
}
