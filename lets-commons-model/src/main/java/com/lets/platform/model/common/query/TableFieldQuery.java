package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * 查询表字段信息 数据传输对象
 * @author: DING WEI
 * @date: 2022/5/12 15:20
 */
@Data
@ApiModel("查询表字段信息 数据传输对象")
public class TableFieldQuery extends PageQuery {

    @NotBlank(message = "db.tableFiled.dataSource")
    @ApiModelProperty("数据源")
    private String datasource;

    @NotBlank(message = "db.tableField.tableName")
    @ApiModelProperty("表名称")
    private String tableName;

    private String reportId;
    private List<String> buttonValues;

}
