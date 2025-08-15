package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Etl组件字段 展示对象
 * @author: DING WEI
 * @date: 2022/6/25 16:46
 */
@Data
@ApiModel("Etl组件字段 展示对象")
public class EtlComposeFieldVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("表输出主键")
    private String composeId;
    private String xmlId;
    @ApiModelProperty("设计资源主键")
    private String designId;

    @ApiModelProperty("字段名称")
    private String fieldName;

    @ApiModelProperty("原始名称")
    private String originalName;

    @ApiModelProperty("字段备注")
    private String fieldComment;

    @ApiModelProperty("字段类型")
    private String fieldType;

    @ApiModelProperty("字段长度")
    private Integer fieldLength;

    @ApiModelProperty("字段精度")
    private Integer fieldDigits;

    @ApiModelProperty("是否关键字[N否Y是]")
    private String isKeyword;

    @ApiModelProperty("字段来源")
    private String fieldSource;
    @ApiModelProperty("源字段备注(描述、详细名称)")
    private String fieldSourceComment;

    private String inputId;
    private String inputXmlId;
    private String inputName;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
