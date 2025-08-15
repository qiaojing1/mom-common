package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 物料分组属性配置-质量信息
 * @author DING WEI
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("psi_group_attr_config_material_quality")
@ApiModel(value = "PsiGroupAttrConfigMaterialQuality对象", description = "物料分组属性配置-质量信息")
public class PsiGroupAttrConfigMaterialQuality extends BaseEntity {

    @ApiModelProperty("检验人员ID")
    @TableField("quality_inspector_id")
    private String qualityInspectorId;

    @ApiModelProperty("检验人员名称")
    @TableField("quality_inspector_name")
    private String qualityInspectorName;

    @ApiModelProperty("来料检验")
    @TableField("quality_incoming_inspection")
    private Integer qualityIncomingInspection;

    @ApiModelProperty("完工检验")
    @TableField("quality_finish_inspection")
    private Integer qualityFinishInspection;

    @ApiModelProperty("启用发货检验")
    @TableField("quality_delivery_inspection")
    private Integer qualityDeliveryInspection;

    @ApiModelProperty("启用退货检验")
    @TableField("quality_return_inspection")
    private Integer qualityReturnInspection;

    @ApiModelProperty("启用生产退料检验")
    @TableField("quality_product_return_inspection")
    private Integer qualityProductReturnInspection;

    @ApiModelProperty("启用委外退料检验")
    @TableField("quality_outsourcing_return_inspection")
    private Integer qualityOutsourcingReturnInspection;

    @ApiModelProperty("启用其他检验")
    @TableField("quality_other_inspection")
    private Integer qualityOtherInspection;

    @ApiModelProperty("启用产品首检")
    @TableField("quality_first_inspection")
    private Integer qualityFirstInspection;

    @ApiModelProperty("启用试压检验")
    @TableField("quality_detect_inspection")
    private Integer qualityDetectInspection;

    @ApiModelProperty("启用外派检验")
    @TableField("is_osqc")
    private String isOsqc;

    @ApiModelProperty("检验标准ID")
    @TableField("quality_inspection_standard_id")
    private String qualityInspectionStandardId;

    @ApiModelProperty("检验标准名称")
    @TableField("quality_inspection_standard_name")
    private String qualityInspectionStandardName;

    @ApiModelProperty("抽样方案ID")
    @TableField("quality_sampling_plan_id")
    private String qualitySamplingPlanId;

    @ApiModelProperty("抽样方案名称")
    @TableField("quality_sampling_plan_name")
    private String qualitySamplingPlanName;

    @ApiModelProperty("检验标准工时")
    @TableField("quality_standard_time")
    private BigDecimal qualityStandardTime;

    @ApiModelProperty("检验标准工时单位")
    @TableField("quality_standard_time_unit")
    private String qualityStandardTimeUnit;

    @ApiModelProperty("首验数量")
    @TableField("first_inspection_quantity")
    private BigDecimal firstInspectionQuantity;
}
