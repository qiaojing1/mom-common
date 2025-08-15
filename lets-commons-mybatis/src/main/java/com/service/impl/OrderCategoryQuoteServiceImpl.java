package com.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.toolkit.SqlRunner;
import com.lets.platform.model.psi.dto.OrderCategoryQuoteDto;
import com.service.OrderCategoryQuoteService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * 单据类别引用次数
 * @author: DING WEI
 * @date: 2024/4/19 16:38
 */
@Service
public class OrderCategoryQuoteServiceImpl implements OrderCategoryQuoteService {

    @Override
    public JSONObject findOrderCategoryQuote(OrderCategoryQuoteDto quoteDto) {
        JSONObject quoteTimesMap = new JSONObject();
        if (Objects.nonNull(quoteDto)) {
            Set<String> orderCategoryIds = quoteDto.getOrderCategoryIds();
            if (CollUtil.isNotEmpty(orderCategoryIds)) {
                /**
                 * select ${field} as orderCategoryId, count(*) as quoteTimes
                 * from ${tableName}
                 * where ${field} in ('','','','')
                 * group by ${field}
                 */
                String field = quoteDto.getField();
                StringBuilder sql = new StringBuilder();
                sql.append("select ");
                sql.append(field).append(" as orderCategoryId, count(*) as quoteTimes");
                sql.append(" from ").append(quoteDto.getTableName());
                sql.append(" where ").append(field).append(" in ('").append(StringUtils.join(orderCategoryIds, "','")).append("')");
                sql.append(" group by ").append(field);
                SqlRunner db = SqlRunner.db();
                List<Map<String, Object>> mapList = db.selectList(sql.toString());
                if (CollUtil.isNotEmpty(mapList)) {
                    for (Map<String, Object> map : mapList) {
                        Object orderCategoryId = map.get("orderCategoryId");
                        Object quoteTimes = map.get("quoteTimes");
                        if (Objects.nonNull(orderCategoryId) && Objects.nonNull(quoteTimes)) {
                            quoteTimesMap.put(orderCategoryId.toString(), Integer.parseInt(quoteTimes.toString()));
                        }
                    }
                }
            }
        }
        return quoteTimesMap;
    }
}
