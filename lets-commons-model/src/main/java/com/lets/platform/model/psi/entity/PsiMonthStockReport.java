package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 库存月度报表
 * </p>
 *
 * @author zhangweoyan
 * @since 2024-09-11
 */
@Getter
@Setter
@TableName("psi_month_stock_report")
@ApiModel(value = "PsiMonthStockReport对象", description = "库存月度报表")
public class PsiMonthStockReport extends BaseEntity {

    @ApiModelProperty("仓库")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库编码")
    @TableField("store_code")
    private String storeCode;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("库区")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty("库区编码")
    @TableField("area_code")
    private String areaCode;

    @ApiModelProperty("库区名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("库位")
    @TableField("position_id")
    private String positionId;

    @ApiModelProperty("库位编码")
    @TableField("position_code")
    private String positionCode;

    @ApiModelProperty("库位名称")
    @TableField("position_name")
    private String positionName;

    @ApiModelProperty("物料库存单位")
    @TableField("store_unit_id")
    private String storeUnitId;

    @ApiModelProperty("物料库存单位编码")
    @TableField("store_unit_code")
    private String storeUnitCode;

    @ApiModelProperty("物料库存单位名称")
    @TableField("store_unit_name")
    private String storeUnitName;

    @ApiModelProperty("物料库存单位精度")
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;

    @ApiModelProperty("物料库存单位舍入类型")
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("物料")
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

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("期初结存数量")
    @TableField("initial_balance_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal initialBalanceQuantity;

    @ApiModelProperty("完工入库数量")
    @TableField("finished_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal finishedQuantity;

    @ApiModelProperty("生产领料数量")
    @TableField("produce_used_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal produceUsedQuantity;

    @ApiModelProperty("销售出库数量")
    @TableField("sale_stock_out_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal saleStockOutQuantity;

    @ApiModelProperty("采购入库数量")
    @TableField("purchase_stock_in_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal purchaseStockInQuantity;

    @ApiModelProperty("计划外入库数量")
    @TableField("unplanned_stock_in_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal unplannedStockInQuantity;

    @ApiModelProperty("计划外出库数量")
    @TableField("unplanned_stock_out_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal unplannedStockOutQuantity;

    @ApiModelProperty("调拨入库数量（标准调拨单调入数量+分步调入单）")
    @TableField("transfer_in_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal transferInQuantity;

    @ApiModelProperty("调拨出库数量（标准调拨单调出数量+分步调出单）")
    @TableField("transfer_out_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal transferOutQuantity;

    @ApiModelProperty("盘亏出库数量")
    @TableField("inventory_loss_issue")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal inventoryLossIssue;

    @ApiModelProperty("盘盈入库数量")
    @TableField("inventory_gain_receipt")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal inventoryGainReceipt;

    @ApiModelProperty("本期入库数量")
    @TableField("current_period_stock_in_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal currentPeriodStockInQuantity;

    @ApiModelProperty("本期出库数量")
    @TableField("current_period_stock_out_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal currentPeriodStockOutQuantity;

    @ApiModelProperty("期末结存数量")
    @TableField("end_of_term_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal endOfTermQuantity;

    @ApiModelProperty("平均库存数量（期初结存+期末结存）/ 2")
    @TableField("average_term_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal averageTermQuantity;

    @ApiModelProperty("统计的月份，格式20240911")
    @TableField("month")
    private Integer month;
}
