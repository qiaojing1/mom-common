package com.lets.platform.model.mes.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * BOM有效性检查
 * @author: DING WEI
 * @date: 2023/11/10 10:40
 */
@Data
@ApiModel("BOM有效性检查")
public class BomEffectivenessCheck {

    @ApiModelProperty("BOM主键")
    private String id;
    @ApiModelProperty("BOM编码")
    private String code;
    @ApiModelProperty("BOM版本")
    private String bomVersion;
    @ApiModelProperty("BOM类型")
    private String type;
    private String typeName;
    @ApiModelProperty("BOM是否启用")
    private String enable;
    private String enableName;
    @ApiModelProperty("BOM数据状态")
    private String status;
    private String statusName;

    @ApiModelProperty("有效性")
    private String effectiveness;

    @ApiModelProperty("物料主键")
    private String materialId;
    @ApiModelProperty("物料编码")
    private String materialCode;
    @ApiModelProperty("物料名称")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    private String materialSpecs;
    @ApiModelProperty("产品是否启用")
    private String materialEnable;
    @ApiModelProperty("生命周期状态")
    private String materialLifeCycleStatus;
    @ApiModelProperty("物料类型")
    private String materialType;
    @ApiModelProperty("必须有BOM")
    private String mustHasBom;

}