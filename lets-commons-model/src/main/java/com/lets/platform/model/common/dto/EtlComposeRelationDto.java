package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Etl组件关联关系 数据传输对象
 * @author: DING WEI
 * @date: 2022/7/4 17:29
 */
@Data
@ApiModel("ETL组件关联关系 数据传输对象")
public class EtlComposeRelationDto {

    @NotBlank(message = "etlComposeRelation.designId")
    @ApiModelProperty("设计资源主键")
    private String designId;

    @ApiModelProperty("前一节点")
    private String preComposeId;
    private String preXmlId;

    @ApiModelProperty("后一节点")
    private String nextComposeId;
    private String nextXmlId;

}
