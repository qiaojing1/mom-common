package com.lets.common.mybatis;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.SqlSource;

/**
 * @description: OrgSqlSource
 * @author: DING WEI
 * @date: 8/24/21 10:56 AM
 */
public class OrgSqlSource implements SqlSource {
    private BoundSql boundSql;

    public OrgSqlSource(BoundSql boundSql) {
        this.boundSql = boundSql;
    }

    @Override
    public BoundSql getBoundSql(Object parameterObject) {
        return boundSql;
    }

}
