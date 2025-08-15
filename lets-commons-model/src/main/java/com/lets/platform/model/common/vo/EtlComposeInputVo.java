package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Etl输入组件 展示对象
 * @author: DING WEI
 * @date: 2022/6/25 11:21
 */
@Data
@ApiModel("Etl输入组件 展示对象")
public class EtlComposeInputVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("etl设计主键")
    private String designId;

    @ApiModelProperty("xml节点主键")
    private String xmlId;

    @ApiModelProperty("类型[1sql]")
    private String type;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    private String describe;

    @ApiModelProperty("数据源")
    private String datasourceId;

    @ApiModelProperty("sql语句")
    private String sql;

    @ApiModelProperty("是否增量[NY]")
    private String isIncrement;
    @ApiModelProperty("增量类型[1时间戳增量]")
    private String incrementType;
    @ApiModelProperty("时间戳字段")
    private String timestampField;

    @ApiModelProperty("字段列表")
    private List<EtlComposeFieldVo> fieldList;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
