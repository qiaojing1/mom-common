package com.lets.platform.common.pojo.enums;

/**
 * 鉴权相关枚举
 * @ClassName AccessEnum
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
public enum AccessEnum {

    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数质检失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");

    private int code;
    private String message;

    private AccessEnum(int code, String message) {
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
