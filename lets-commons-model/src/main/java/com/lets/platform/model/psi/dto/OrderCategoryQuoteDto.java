package com.lets.platform.model.psi.dto;

import lombok.Data;

import java.util.Set;

/**
 * 查询单据类别引用次数
 * @author: DING WEI
 * @date: 2024/4/19 16:35
 */
@Data
public class OrderCategoryQuoteDto {

    private Set<String> orderCategoryIds;

    private String tableName;

    private String field;

}
