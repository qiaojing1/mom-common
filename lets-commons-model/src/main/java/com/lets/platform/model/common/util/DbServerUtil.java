package com.lets.platform.model.common.util;

import com.alibaba.fastjson.JSON;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.common.entity.CommonDatasource;
import com.lets.platform.model.common.enums.DatasourceTypeEnum;
import com.lets.platform.model.common.enums.OracleConnectType;
import org.apache.commons.lang.StringUtils;

/**
 * 数据库工具
 * @author DING WEI
 * @date 2022/5/12 10:25
 * @version 1.0
 */
public class DbServerUtil {

    public static final String PRE_MYSQL = "jdbc:mysql://";

    public static final String SUF_MYSQL = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC&useOldAliasMetadataBehavior=true&characterEncoding=UTF-8";

    public static final String PRE_ORACLE = "jdbc:oracle:thin:@";

    public static final String PRE_DB2 = "jdbc:domain1://";

    public static final String SUF_DB2 = "";

    public static final String PRE_SQLSERVER = "jdbc:sqlserver://";

    public static final String SUF_SQLSERVER = ";DatabaseName=";

    public static final String PRE_POSTGRESQL = "jdbc:postgresql://";

    public static final String SUF_POSTGRESQL = "";

    public static final String PRE_GREENPLUM = "jdbc:pivotal:greenplum://";

    public static final String SUF_GREENPLUM = ";DatabaseName=";

    public static final String COLON = ":";

    public static final String SEPARATOR = "/";

    public static final String ORCL = "orcl";

    /**
     * 拼接数据库地址
     * @param commonDatasource
     * @return
     * @author DING WEI
     * @date 2022/5/12 11:01
     * @version 1.0
     */
    public static String getServerUrl(CommonDatasource commonDatasource) {
        String ip = commonDatasource.getServerIp();
        Integer port = commonDatasource.getServerPort();
        String dbName = commonDatasource.getDbName();
        String type = commonDatasource.getType();
        DatasourceTypeEnum anEnum = DatasourceTypeEnum.getEnum(type);
        String connectType = commonDatasource.getConnectType();
        String serviceName = commonDatasource.getServiceName();
        if (DatasourceTypeEnum.ORACLE.getValue().equals(type)) {
            if (StringUtils.isBlank(connectType)) {
                connectType = OracleConnectType.SID.getType();
            }
            if (StringUtils.isBlank(serviceName)) {
                serviceName = ORCL;
            }
        }
        StringBuilder serverUrl = new StringBuilder();
        switch (anEnum) {
            case MYSQL:
                serverUrl.append(PRE_MYSQL).append(ip).append(COLON).append(port).append(SEPARATOR).append(dbName).append(SUF_MYSQL);
                break;
            case ORACLE:
                serverUrl.append(PRE_ORACLE);
                if (OracleConnectType.SID.getType().equals(connectType)) {
                    serverUrl.append(ip).append(COLON).append(port).append(COLON).append(serviceName);
                } else if(OracleConnectType.SERVICE.getType().equals(connectType)) {
                    serverUrl.append(SEPARATOR).append(SEPARATOR).append(ip).append(COLON).append(port).append(SEPARATOR).append(serviceName);
                } else if(OracleConnectType.TNS.getType().equals(connectType)) {
                    serverUrl.append(serviceName);
                }
                break;
            case SQLSERVER:
                serverUrl.append(PRE_SQLSERVER).append(ip).append(COLON).append(port).append(SUF_SQLSERVER).append(dbName);
                break;
            default:
                break;
        }
        return serverUrl.toString();
    }

    public static String[] getDbNameAndPort(String serverUrl, String type) {
        String[] dbNameAndPort = new String[3];
        DatasourceTypeEnum anEnum = DatasourceTypeEnum.getEnum(type);
        switch (anEnum) {
            case MYSQL:
                // jdbc:mysql://10.0.2.251:3306/lets-platform-psi?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC&useOldAliasMetadataBehavior=true&characterEncoding=UTF-8
                int index1 = serverUrl.indexOf(":", 14);
                int index2 = serverUrl.indexOf("/", index1);
                int index3 = serverUrl.indexOf("?");
                int index0 = serverUrl.indexOf("/");
                if(index1 == -1 ||  index2== -1 || index3 == -1 || index0 == -1) {
                    ServiceAssert.getThrow(GlobalConstant.ZERO,"数据源地址配置不正确");
                }
                String port = serverUrl.substring(index1 + 1, index2);
                String dbName = serverUrl.substring(index2 + 1, index3);
                String ip = serverUrl.substring(index0 + 2, index1);
                dbNameAndPort[0] = dbName;
                dbNameAndPort[1] = port;
                dbNameAndPort[2] = ip;
                break;
            case ORACLE:
                // jdbc:oracle:thin:@//10.0.2.96:1521/XE
                int index4 = serverUrl.indexOf(":", 21);
                int index5 = serverUrl.indexOf("/", index4);
                int index8 = serverUrl.indexOf("/");
                int index10 = serverUrl.lastIndexOf("/");
                if(index4 == -1 ||  index5== -1 || index8 == -1 || index10 == -1) {
                    ServiceAssert.getThrow(GlobalConstant.ZERO,"数据源地址配置不正确");
                }
                String oracleDbName = serverUrl.substring(index10 + 1);
                String portOracle = serverUrl.substring(index4 + 1, index5);
                String oracleIp = serverUrl.substring(index8 + 2, index4);
                dbNameAndPort[0] = oracleDbName;
                dbNameAndPort[1] = portOracle;
                dbNameAndPort[2] = oracleIp;
                break;
            case SQLSERVER:
                // jdbc:sqlserver://10.0.2.96:1433;DatabaseName=TEST
                int index6 = serverUrl.indexOf(":", 18);
                int index7 = serverUrl.indexOf(";", index6);
                int index9 = serverUrl.indexOf("/");
                if(index6 == -1 ||  index7== -1 || index9 == -1) {
                    ServiceAssert.getThrow(GlobalConstant.ZERO,"数据源地址配置不正确");
                }
                String dbNameSqlserver = serverUrl.substring(index7 + 14);
                String portSqlserver = serverUrl.substring(index6 + 1, index7);
                String sqlserverIp = serverUrl.substring(index9 + 2, index6);
                dbNameAndPort[0] = dbNameSqlserver;
                dbNameAndPort[1] = portSqlserver;
                dbNameAndPort[2] = sqlserverIp;
                break;
            default:
                break;
        }
        return dbNameAndPort;
    }

    public static void main(String[] args) {
        String[] dbNameAndPort1 = getDbNameAndPort("jdbc:mysql://10.0.2.251:3306/lets-platform-psi?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC&useOldAliasMetadataBehavior=true&characterEncoding=UTF-8", "1");
        System.out.println(JSON.toJSONString(dbNameAndPort1));
        String[] dbNameAndPort2 = getDbNameAndPort("jdbc:oracle:thin:@//10.0.2.96:1521/XE", "2");
        System.out.println(JSON.toJSONString(dbNameAndPort2));
        String[] dbNameAndPort3 = getDbNameAndPort("jdbc:sqlserver://10.0.2.96:1433;DatabaseName=TEST", "3");
        System.out.println(JSON.toJSONString(dbNameAndPort3));
    }

}
