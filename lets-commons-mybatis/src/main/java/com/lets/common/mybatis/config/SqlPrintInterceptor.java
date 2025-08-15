//package com.lets.common.mybatis.config;
//
//import cn.hutool.core.convert.Convert;
//import com.lets.common.mybatis.utils.SqlLogUtil;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.ibatis.cache.CacheKey;
//import org.apache.ibatis.executor.Executor;
//import org.apache.ibatis.mapping.BoundSql;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.plugin.Intercepts;
//import org.apache.ibatis.plugin.Invocation;
//import org.apache.ibatis.plugin.Signature;
//import org.apache.ibatis.session.ResultHandler;
//import org.apache.ibatis.session.RowBounds;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//
///**
// * SQL打印拦截
// * @author: DING WEI
// * @date: 2024/7/12 11:56
// */
//@Intercepts(
//        {
//        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
//        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}),
//        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})
//        }
//)
//@Slf4j
//@Component
//@RequiredArgsConstructor
//public class SqlPrintInterceptor implements Interceptor {
//
//    @Override
//    public Object intercept(Invocation invocation) {
//        Object result = null;
//        long startTime = System.currentTimeMillis();
//        try {
//            result = invocation.proceed();
//            long sqlCostTime = System.currentTimeMillis() - startTime;
//            long size = result instanceof Collection<?> ? ((Collection<?>) result).size() : Convert.toLong(result);
//            SqlLogUtil.excAsync(invocation, size, sqlCostTime);
//        } catch (Exception e) {
//            log.error("SQL插件执行失败", e);
//        }
//        return result;
//    }
//
//}
