package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 故障维修工单-明细
 * @author DING WEI
 * @since 2024-11-19
 */
@Getter
@Setter
@TableName("tpm_repair_order_detail")
@ApiModel(value = "TpmRepairOrderDetail对象", description = "故障维修工单-明细")
@Deprecated
public class TpmRepairOrderDetail extends BaseEntity {

    @ApiModelProperty("工单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("报修工单主键")
    @TableField("call_repair_id")
    private String callRepairId;

    @ApiModelProperty("备件主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("备件编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("备件名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("备件类型")
    @TableField("material_type")
    private String materialType;
    @ApiModelProperty("备件规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("单位")
    @TableField("unit_id")
    private String unitId;
    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    private String unitCode;
    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;
    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;
    @ApiModelProperty("单位舍入方式")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("更换原因")
    @TableField("reason")
    private String reason;
}
