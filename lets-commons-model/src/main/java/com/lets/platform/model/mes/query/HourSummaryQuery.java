package com.lets.platform.model.mes.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName HourSummaryQuery
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/7/19
 */
@Data
public class HourSummaryQuery {
    @ApiModelProperty("人员id")
    private String reporter;
    @ApiModelProperty("部门id")
    private String orgId;
    @ApiModelProperty("年")
    private String year;
    @ApiModelProperty("类型 1项目工时，3非项目工时")
    private String type;
}
