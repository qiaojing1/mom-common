package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 字段值参数
 *
 * @version 1.0
 * @ClassName FieldValueDto
 * @author: Qiao
 * @create: 2021/08/19 17:13
 **/
@Data
@ApiModel("生成单号入参参数")
public class FieldValueDto {
    @ApiModelProperty("字段名称")
    private String tableFieldName;
    @ApiModelProperty("属性名")
    private String tableFieldAliasName;
    @ApiModelProperty("字段值")
    private String tableFieldValue;

}
