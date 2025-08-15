package com.lets.platform.dao;

import com.lets.platform.model.psi.entity.QuoteCount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 查询引用次数
 * @author DING WEI
 * @date 2023/9/6 10:54
 * @version 1.0
 */
public interface QuoteMapper {

    Integer findFieldCount(@Param("tableSchema") String tableSchema, @Param("tableName") String tableName, @Param("field") String field);

    List<QuoteCount> findQuoteTimes(@Param("tableName") String tableName, @Param("field") String field);

    Integer findTableCount(@Param("tableSchema") String tableSchema, @Param("tableName") String tableName);
}
