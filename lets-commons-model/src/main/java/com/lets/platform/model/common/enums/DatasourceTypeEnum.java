package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 数据库类型 枚举
 * @author DING WEI
 * @date 2022/5/12 10:18
 * @version 1.0
 */
public enum DatasourceTypeEnum implements IEnum<Object> {

    MYSQL("1", "MySQL", "com.mysql.cj.jdbc.Driver", "jdbc:mysql://%ip:%port/%dbName?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC&useOldAliasMetadataBehavior=true&characterEncoding=UTF-8"),
    /**
     * oracle.jdbc.driver.OracleDriver
     */
    ORACLE("2", "ORACLE", "oracle.jdbc.OracleDriver", "jdbc:oracle:thin:@//%ip:%port/%dbName"),
    SQLSERVER("3", "Sqlserver", "com.microsoft.sqlserver.jdbc.SQLServerDriver", "jdbc:sqlserver://%ip:%port;DatabaseName=%dbName"),
    ;

    private String value;

    private String name;

    private String driverClassName;

    private String urlTemp;

    DatasourceTypeEnum(String value, String name, String driverClassName, String urlTemp) {
        this.value = value;
        this.name = name;
        this.driverClassName = driverClassName;
        this.urlTemp = urlTemp;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrlTemp() {
        return urlTemp;
    }

    public static DatasourceTypeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DatasourceTypeEnum element : DatasourceTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DatasourceTypeEnum element : DatasourceTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DatasourceTypeEnum element : DatasourceTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getDriverClassName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DatasourceTypeEnum element : DatasourceTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDriverClassName();
            }
        }
        return null;
    }
}
