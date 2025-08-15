package com.lets.platform.common.pojo.base;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分页查询参数
 *
 * @author fzy
 * @since 2023-04-04
 */
@Data
@ApiModel("查询条件")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConditionEntity {
    private String conditionTableAlias;
    private String conditionKey;
    private String conditionExpression;
    private Object conditionValue;
    private String conditionHandler;
    private String relationField;
}
