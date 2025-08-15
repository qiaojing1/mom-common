package com.lets.platform.common.pojo.enums;

/**
 * 全局 枚举
 * @ClassName GlobalEnum
 * @author: DING WEI
 * @create: 2021/04/23 16:25
 * @Version 1.0
 **/
public enum GlobalEnum {

    AUTHORIZATION("Authorization", "令牌消息头KEY"),
    BEARER("Bearer", "令牌前缀");

    private String code;
    private String message;

    GlobalEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
