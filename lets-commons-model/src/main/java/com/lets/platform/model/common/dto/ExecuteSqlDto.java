package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * 执行sql 数据传输对象
 * @author: DING WEI
 * @date: 2022/5/12 15:20
 */
@Data
@ApiModel("执行sql 数据传输对象")
public class ExecuteSqlDto {

    @NotBlank(message = "executeSql.datasource")
    @ApiModelProperty("数据源")
    private String datasource;

    @NotBlank(message = "executeSql.sql")
    @ApiModelProperty("查询sql语句")
    private String sqlContent;

    @ApiModelProperty("是否当前租户[ture、false]")
    private Boolean isCurrentTenancy;

    @ApiModelProperty("租户")
    private String tenancyId;
    @ApiModelProperty("参数")
    private Map<String,Object> params;

}
