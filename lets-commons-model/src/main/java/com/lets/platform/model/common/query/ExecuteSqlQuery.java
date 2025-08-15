package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @description: 查询数据库信息 数据传输对象
 * @author: DING WEI
 * @date: 2022/5/12 15:20
 */
@Data
@ApiModel("查询数据库信息 数据传输对象")
public class ExecuteSqlQuery extends PageQuery {

    @NotBlank(message = "executeSql.datasource")
    @ApiModelProperty("数据源")
    private String datasource;

    @NotBlank(message = "executeSql.sql")
    @ApiModelProperty("查询sql语句")
    private String sql;

}
