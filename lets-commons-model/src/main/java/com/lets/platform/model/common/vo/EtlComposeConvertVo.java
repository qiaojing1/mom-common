package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Etl转换组件 展示对象
 * @author: DING WEI
 * @date: 2022/6/25 17:22
 */
@Data
@ApiModel("Etl转换组件 展示对象")
public class EtlComposeConvertVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("etl设计主键")
    private String designId;

    @ApiModelProperty("xml节点主键")
    private String xmlId;

    @ApiModelProperty("类型[1guid，2集合]")
    private String type;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    private String describe;

    @ApiModelProperty("guid列名称")
    private String columnName;

    @ApiModelProperty("guid列标题")
    private String columnTitle;

    @ApiModelProperty("数据源")
    private String datasourceId;

    @ApiModelProperty("集合类型[1并集去重，2并集不去重，3交集，4差集]")
    private String collectionType;

    @ApiModelProperty("连接组件的主表")
    private String mainComposeId;
    @ApiModelProperty("连接组件的主表xml主键")
    private String mainXmlId;

    @ApiModelProperty("字段列表")
    private List<EtlComposeFieldVo> fieldList;
    @ApiModelProperty("集合设置-字段列表")
    private List<List<EtlComposeFieldVo>> collSettingFieldList;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
