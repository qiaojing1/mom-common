package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 生成单号入参参数
 *
 * @version 1.0
 * @ClassName CreateOrderNumQuery
 * @author: Qiao
 * @create: 2021/08/19 17:13
 **/
@Data
@ApiModel("生成单号入参参数")
public class CreateOrderNumDto {

    @ApiModelProperty("菜单编码")
    private String menuCode;
    @ApiModelProperty("表名")
    private String tableName;
    @ApiModelProperty("字段名")
    private String fieldName;
    @ApiModelProperty(hidden = true)
    private String tenancyId;
    @ApiModelProperty(hidden = true)
    private String ruleStatus;
    @ApiModelProperty(hidden = true)
    private String ruleName;
    @ApiModelProperty(hidden = true)
    private String ruleCode;
    private int number;
    private String serial;
    
    private List<FieldValueDto> fieldValues;
    private List<List<FieldValueDto>> fieldValueList;

}
