package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Etl转换组件 查询对象
 * @author: DING WEI
 * @date: 2022/6/25 17:22
 */
@Data
@ApiModel("Etl转换组件 查询对象")
public class EtlComposeConvertQuery extends PageQuery {

    @ApiModelProperty("主键")
    private String id;
    @ApiModelProperty(hidden = true)
    private String unId;

    @ApiModelProperty("etl设计主键")
    private String designId;

    @ApiModelProperty("xml节点主键")
    private String xmlId;

    @ApiModelProperty("类型[1guid，2集合]")
    private String type;

    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("名称(模糊查询)")
    private String nameLike;

    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("标题(模糊查询)")
    private String titleLike;

    @ApiModelProperty("数据源")
    private String datasourceId;

    @ApiModelProperty("集合类型[1并集去重，2并集不去重，3交集，4差集]")
    private String collectionType;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
