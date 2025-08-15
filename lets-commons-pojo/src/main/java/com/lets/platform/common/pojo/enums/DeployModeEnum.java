package com.lets.platform.common.pojo.enums;

/**
 * 部署方式 枚举
 * @ClassName DeployModeEnum
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
public enum DeployModeEnum {

    STANDALONE("standalone", "单机"),
    CLUSTER("cluster", "集群"),
    ;

    private String code;
    private String message;

    private DeployModeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
