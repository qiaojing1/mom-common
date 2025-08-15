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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("查询排序 实体类")
public class OrderEntity {
    private String tableAlias;
    private String orderKey;
    private String orderExpression;
}
