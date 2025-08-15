package com.lets.common.mybatis.utils;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandlerRegistry;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * SQL打印工具
 * @author: DING WEI
 * @date: 2024/7/12 13:40
 */
@Slf4j
public class SqlLogUtil {

    private static final String SQL_LOG = "执行耗时: {}ms||{}行数: {}||执行方法: {}||执行语句: {}";

    public static void excAsync(Invocation invocation, Object result, long sqlCostTime) {
        ThreadUtil.execAsync(() -> {
            paramBuild(invocation, result, sqlCostTime);
        }, true);
    }

    public static void paramBuild(Invocation invocation, Object result, long sqlCostTime) {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        Object parameter = null;
        if (invocation.getArgs().length > 1) {
            parameter = invocation.getArgs()[1];
        }
        String sqlId = mappedStatement.getId();
        BoundSql boundSql = mappedStatement.getBoundSql(parameter);
        Configuration configuration = mappedStatement.getConfiguration();

        String sql = getSql(configuration, boundSql);
        formatSqlLog(mappedStatement.getSqlCommandType(), sqlId, sql, sqlCostTime, result);
    }

    private static String getSql(Configuration configuration, BoundSql boundSql) {
        // 输入sql字符串空判断
        String sql = boundSql.getSql();
        if (StrUtil.isBlank(sql)) {
            return "";
        }

        //去掉换行符
        sql = sql.replaceAll("[\\s\n ]+", " ");

        //填充占位符, 目前基本不用mybatis存储过程调用,故此处不做考虑
        Object parameterObject = boundSql.getParameterObject();
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        if (!parameterMappings.isEmpty() && parameterObject != null) {
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
            if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
                sql = replacePlaceholder(sql, parameterObject);
            } else {
                MetaObject metaObject = configuration.newMetaObject(parameterObject);
                for (ParameterMapping parameterMapping : parameterMappings) {
                    String propertyName = parameterMapping.getProperty();
                    if (metaObject.hasGetter(propertyName)) {
                        Object obj = metaObject.getValue(propertyName);
                        sql = replacePlaceholder(sql, obj);
                    } else if (boundSql.hasAdditionalParameter(propertyName)) {
                        Object obj = boundSql.getAdditionalParameter(propertyName);
                        sql = replacePlaceholder(sql, obj);
                    }
                }
            }
        }
        return sql;
    }

    private static String replacePlaceholder(String sql, Object parameterObject) {
        String result;
        if (parameterObject == null) {
            result = "NULL";
        } else if (parameterObject instanceof String) {
            result = String.format("'%s'", parameterObject.toString());
        } else if (parameterObject instanceof Date) {
            result = String.format("'%s'", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(parameterObject));
        } else {
            result = parameterObject.toString();
        }
        return sql.replaceFirst("\\?", result);
    }

    private static void formatSqlLog(SqlCommandType sqlCommandType, String sqlId, String sql, long costTime, Object obj) {
        String str = "";
        if (sqlCommandType == SqlCommandType.UPDATE ||
                sqlCommandType == SqlCommandType.INSERT ||
                sqlCommandType == SqlCommandType.DELETE) {
            str = "影响";
        }
        if (sqlCommandType == SqlCommandType.SELECT) {
            str = "结果";
        }
        log.info(SQL_LOG, costTime, str, obj, sqlId, sql);

    }
}
