package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * 齐套分析清单明细子项
 * @author DING WEI
 * @since 2025-03-04
 */
@Getter
@Setter
@TableName("psi_kitting_analysis_result_detail_sub")
@ApiModel(value = "PsiKittingAnalysisResultDetailSub对象", description = "齐套分析清单明细子项")
public class PsiKittingAnalysisResultDetailSub extends BaseEntity {

    @ApiModelProperty("齐套分析结果ID")
    @TableField("result_id")
    private String resultId;

    @ApiModelProperty("齐套分析结果明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
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

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("需求数量")
    @TableField("demand_number")
    private BigDecimal demandNumber;

    @ApiModelProperty("可领用数量")
    @TableField("can_use_number")
    private BigDecimal canUseNumber;

    @ApiModelProperty("已领用数量")
    @TableField("used_number")
    private BigDecimal usedNumber;

    @ApiModelProperty("在途供应数量")
    @TableField("in_transit_quantity")
    private BigDecimal inTransitQuantity;

    @ApiModelProperty("在制供应数量")
    @TableField("in_progress_quantity")
    private BigDecimal inProgressQuantity;

    @ApiModelProperty("库存供应数量")
    @TableField("inventory_quantity")
    private BigDecimal inventoryQuantity;

    @ApiModelProperty("分子用量")
    @TableField("numerator_dosage")
    private BigDecimal numeratorDosage;

    @ApiModelProperty("分母用量")
    @TableField("denominator_dosage")
    private BigDecimal denominatorDosage;

    @ApiModelProperty("固定损耗")
    @TableField("fixed_loss")
    private BigDecimal fixedLoss;

    @ApiModelProperty("变动损耗率(%)")
    @TableField("change_loss_rate")
    private BigDecimal changeLossRate;

    @ApiModelProperty("可用套数")
    @TableField("kitting_quantity")
    private BigDecimal kittingQuantity;

    @ApiModelProperty("是否固定")
    @TableField("is_fixed")
    private Byte isFixed;

    @ApiModelProperty("已领套数")
    @TableField("received_kitting_quantity")
    private BigDecimal receivedKittingQuantity;

    @ApiModelProperty("在途供应套数")
    @TableField("in_transit_kitting_quantity")
    private BigDecimal inTransitKittingQuantity;

    @ApiModelProperty("在制供应套数")
    @TableField("in_progress_kitting_quantity")
    private BigDecimal inProgressKittingQuantity;

    @ApiModelProperty("库存供应套数")
    @TableField("inventory_kitting_quantity")
    private BigDecimal inventoryKittingQuantity;

    @ApiModelProperty("总供应套数")
    @TableField("total_kitting_quantity")
    private BigDecimal totalKittingQuantity;

    @ApiModelProperty("需求成本数量")
    @TableField("cost_demand_number")
    private BigDecimal costDemandNumber;

    @ApiModelProperty("成本单价")
    @TableField("cost_price")
    private BigDecimal costPrice;

    @ApiModelProperty("需求金额")
    @TableField("demand_amount")
    private BigDecimal demandAmount;

    @ApiModelProperty("成本单位")
    @TableField("cost_unit_id")
    private String costUnitId;

    @ApiModelProperty("成本单位编码")
    @TableField("cost_unit_code")
    private String costUnitCode;

    @ApiModelProperty("成本单位名称")
    @TableField("cost_unit_name")
    private String costUnitName;

    @ApiModelProperty("成本单位精度")
    @TableField("cost_unit_accuracy")
    private Integer costUnitAccuracy;

    @ApiModelProperty("成本单位舍入类型")
    @TableField("cost_unit_round_off_type")
    private Integer costUnitRoundOffType;

    @ApiModelProperty("物料分组")
    @TableField("material_group_id")
    private String materialGroupId;
    @TableField("material_group_name")
    private String materialGroupName;

    @ApiModelProperty("收发仓库")
    @TableField("store_id")
    private String storeId;
    @TableField("store_name")
    private String storeName;

    //缺料数量 缺料数量=需求数量-已领用数量-库存供应数量-在途供应数量-在制供应数量
    @TableField(exist = false)
    private BigDecimal shortageQuantity;

    @TableField(exist = false)
    private List<PsiKittingAnalysisResultDetailSubRecord> recordList;

    public BigDecimal getDemandNumberNN() {
        return demandNumber == null ? BigDecimal.ZERO : demandNumber;
    }

    public BigDecimal getUsedNumberNN() {
        return usedNumber == null ? BigDecimal.ZERO : usedNumber;
    }

    public BigDecimal getInventoryQuantityNN() {
        return inventoryQuantity == null ? BigDecimal.ZERO : inventoryQuantity;
    }

    public BigDecimal getInTransitQuantityNN() {
        return inTransitQuantity == null ? BigDecimal.ZERO : inTransitQuantity;
    }

    public BigDecimal getInProgressQuantityNN() {
        return inProgressQuantity == null ? BigDecimal.ZERO : inProgressQuantity;
    }
}
