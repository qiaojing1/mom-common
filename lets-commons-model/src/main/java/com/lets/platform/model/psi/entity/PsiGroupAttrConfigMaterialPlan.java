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
 * 物料分组属性配置-计划信息
 * @author DING WEI
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("psi_group_attr_config_material_plan")
@ApiModel(value = "PsiGroupAttrConfigMaterialPlan对象", description = "物料分组属性配置-计划信息")
public class PsiGroupAttrConfigMaterialPlan extends BaseEntity {

    @ApiModelProperty("补给策略")
    @TableField("supply_strategy")
    private String supplyStrategy;

    @ApiModelProperty("计算方式")
    @TableField("calculate_type")
    private String calculateType;

    @ApiModelProperty("采购前置期(天)")
    @TableField("purchase_lead_day")
    private Long purchaseLeadDay;

    @ApiModelProperty("启用采购动态前置期")
    @TableField("purchase_dynamic_lead")
    private Integer purchaseDynamicLead;

    @ApiModelProperty("采购变动前置期(天)")
    @TableField("purchase_change_lead_day")
    private Long purchaseChangeLeadDay;

    @ApiModelProperty("采购变动批量")
    @TableField("purchase_variable_lot_quantity")
    private BigDecimal purchaseVariableLotQuantity;

    @ApiModelProperty("生产前置期(天)")
    @TableField("production_lead_day")
    private Long productionLeadDay;

    @ApiModelProperty("启用生产动态前置期")
    @TableField("production_dynamic_lead")
    private Integer productionDynamicLead;

    @ApiModelProperty("生产变动前置期(天)")
    @TableField("production_change_lead_day")
    private Long productionChangeLeadDay;

    @ApiModelProperty("生产变动批量")
    @TableField("production_variable_lot_quantity")
    private BigDecimal productionVariableLotQuantity;

    @ApiModelProperty("检验前置期(天)")
    @TableField("inspection_lead_day")
    private Long inspectionLeadDay;

    @ApiModelProperty("启用检验动态前置期")
    @TableField("inspection_dynamic_lead")
    private Integer inspectionDynamicLead;

    @ApiModelProperty("检验变动前置期(天)")
    @TableField("inspection_change_lead_day")
    private Long inspectionChangeLeadDay;

    @ApiModelProperty("检验变动批量")
    @TableField("inspection_variable_lot_quantity")
    private BigDecimal inspectionVariableLotQuantity;

    @ApiModelProperty("允许手工预留")
    @TableField("allow_reserve_manual")
    private String allowReserveManual;

    @ApiModelProperty("预留方式")
    @TableField("reservation_type")
    private String reservationType;
    @TableField(exist = false)
    private String reservationTypeName;
}
