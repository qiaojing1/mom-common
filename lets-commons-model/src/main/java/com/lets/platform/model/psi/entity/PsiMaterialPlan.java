package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

/**
 * <p>
 * 物料计划信息
 * </p>
 *
 * @author FZY
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_material_plan")
@ApiModel(value = "PsiMaterialPlan对象", description = "物料计划信息")
public class PsiMaterialPlan extends MaterialBaseEntity {

    @ApiModelProperty("补给策略")
    @TableField("supply_strategy")
    @NotBlank(message = "[补给策略]不能为空")
    private String supplyStrategy;

    @ApiModelProperty("补给策略名称")
    @TableField(exist = false)
    private String supplyStrategyName;

    @ApiModelProperty("计算方式")
    @TableField("calculate_type")
    private String calculateType;

    @ApiModelProperty("计算方式名称")
    @TableField(exist = false)
    private String calculateTypeName;

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

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String groupId;

    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String materialType;
}
