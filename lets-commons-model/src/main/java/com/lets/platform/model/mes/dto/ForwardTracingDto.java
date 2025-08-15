package com.lets.platform.model.mes.dto;

import com.lets.platform.common.pojo.base.AutoConditionEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生产正向追溯-明细
 * @author: DING WEI
 * @date: 2024/7/22 14:26
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ForwardTracingDto {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("查询条件")
    private AutoConditionEntity autoConditionEntity;

}
