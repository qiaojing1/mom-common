package com.lets.platform.model.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * ORACLE数据库连接方式
 * 格式一：jdbc:oracle:thin:@//<host>:<port>/<service_name>
 * 格式二：jdbc:oracle:thin:@<host>:<port>:<SID>
 * 格式三：jdbc:oracle:thin:@<TNSName>
 * 格式一是通过 SERVICE_NAME 连接Oracle数据库，适合于单实例和多实例数据库
 * 格式二是通过实例名SID连接数据库，RAC环境下实例名不唯一，不能充分利用数据库资源
 * 格式三为通过本地配置的TNSNAME
 * @author DING WEI
 * @date 2022/5/12 10:54
 * @version 1.0
 */
public enum OracleConnectType {

    SID("1","sid"),

    SERVICE("2","服务名"),

    TNS("3","tns");

    private String type;

    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    OracleConnectType(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static List<String> getAllType() {
        List<String> allType = new ArrayList<>();
        for (OracleConnectType value : OracleConnectType.values()) {
            allType.add(value.getType());
        }
        return allType;
    }
}
