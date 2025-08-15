package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 计划方案
 * </p>
 *
 * @author FZY
 * @since 2025-02-07
 */
@Getter
@Setter
@TableName("psi_plan_program")
@ApiModel(value = "PsiPlanProgram对象", description = "计划方案")
public class PsiPlanProgram extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("展望期限(天)")
    @TableField("planning_horizon")
    private Integer planningHorizon;

    @ApiModelProperty("考虑现有库存")
    @TableField("apply_current_inventory")
    private Integer applyCurrentInventory;

    @ApiModelProperty("考虑安全库存")
    @TableField("apply_safe_inventory")
    private Integer applySafeInventory;

    @ApiModelProperty("考虑预计入库")
    @TableField("apply_expected_inventory")
    private Integer applyExpectedInventory;

    @ApiModelProperty("考虑在制库存")
    @TableField("apply_wip_inventory")
    private Integer applyWipInventory;

    @ApiModelProperty("考虑成品率")
    @TableField("apply_finished_product_yield")
    private Integer applyFinishedProductYield;

    @ApiModelProperty("考虑批量调整")
    @TableField("apply_batch_adjustment")
    private Integer applyBatchAdjustment;

    @ApiModelProperty("考虑历史未结单据")
    @TableField("apply_other_order")
    private Integer applyOtherOrder;

    @ApiModelProperty("提前期")
    @TableField("advance_value")
    private Integer advanceValue;

    @ApiModelProperty("提前期单位[0:天;1:月]")
    @TableField("advance_unit")
    private Integer advanceUnit;

    @ApiModelProperty("供给优先级[0:按单据优先;1:按日期顺序;2:按日期逆序]")
    @TableField("supply_priority")
    private Integer supplyPriority;

    @ApiModelProperty("需求优先级[0:按单据优先;1:按日期顺序;2:按日期逆序]")
    @TableField("demand_priority")
    private Integer demandPriority;

    @ApiModelProperty("预留释放模式[0:不释放;1:全部释放]")
    @TableField("release_mode")
    private Integer releaseMode;

    @ApiModelProperty("计划订单自动投放")
    @TableField("apply_auto_release")
    private Integer applyAutoRelease;

    @ApiModelProperty("最大行数")
    @TableField("max_line")
    private Integer maxLine;

    @ApiModelProperty("生产计划单据类别策略[0:系统默认单据类别;1:按限定物料分组匹配;2:按限定生产单元匹配;3:按限定物料分组+生产单元匹配]")
    @TableField("product_category_strategy")
    private Integer productCategoryStrategy;

    @ApiModelProperty("采购计划单据类别策略[0:系统默认单据类别;1:按限定物料分组匹配;]")
    @TableField("purchase_category_strategy")
    private Integer purchaseCategoryStrategy;

    @ApiModelProperty("委外计划单据类别策略[0:系统默认单据类别;1:按限定物料分组匹配;]")
    @TableField("outsource_category_strategy")
    private Integer outsourceCategoryStrategy;

    @ApiModelProperty("库存计划单据类别策略[0:不生成;1:系统默认单据类别;]")
    @TableField("inventory_category_strategy")
    private Integer inventoryCategoryStrategy;

    @ApiModelProperty("独立选单运算")
    @TableField("independent_mode")
    private Integer independentMode;

    @ApiModelProperty("仅选择未运算的需求单据")
    @TableField("without_calculated_order")
    private Integer withoutCalculatedOrder;

    @ApiModelProperty("仅运算MPS")
    @TableField("mps_only")
    private Integer mpsOnly;

    @ApiModelProperty("仅运算MRP")
    @TableField("mrp_only")
    private Integer mrpOnly;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("单据状态")
    @TableField("enable")
    private Integer enable;

    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField(exist = false)
    private LocalDate startDate;

    @TableField(exist = false)
    private LocalDate endDate;

    @TableField(exist = false)
    private List<PsiPlanProgramDetail> detailList;
}
