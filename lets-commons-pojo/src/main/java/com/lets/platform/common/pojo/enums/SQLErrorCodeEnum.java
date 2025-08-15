package com.lets.platform.common.pojo.enums;

/**
 * SQL异常编码 枚举
 * @ClassName SQLErrorCodeEnum
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
public enum SQLErrorCodeEnum {

    // Unknown column 'xxx' in 'field list'
    UN_EXIST_FIELD_MYSQL(1054, "字段不存在"),
    UN_EXIST_FIELD_SQLServer(207, "字段不存在"),
    UN_EXIST_FIELD_ORACLE(904, "字段不存在"),
    // Table 'xxx' doesn't
    UN_EXIST_TABLE_MYSQL(1146, "表不存在"),
    UN_EXIST_TABLE_SQLServer(208, "表不存在"),
    UN_EXIST_TABLE_ORACLE(942, "表不存在"),
    ;

    private int code;
    private String message;

    private SQLErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
