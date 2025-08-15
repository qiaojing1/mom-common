package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.mrpModel.BomModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * mrp供需汇总表
 * </p>
 *
 * @author FZY
 * @since 2023-12-28
 */
@Getter
@Setter
@TableName("psi_mrp_supply_and_demand")
@ApiModel(value = "PsiMrpSupplyAndDemand对象", description = "mrp供需汇总表")
public class PsiMrpSupplyAndDemand extends BaseEntity {

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    @ExcelProperty(value = "物料编码", index = 0)
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelProperty(value = "物料名称", index = 1)
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    @ExcelProperty(value = "规格型号", index = 2)
    private String materialSpecs;

    @ApiModelProperty("特征属性")
    @TableField("material_specific_names")
    @ExcelProperty(value = "特征属性", index = 3)
    private String materialSpecificNames;

    @ApiModelProperty("bom版本")
    @TableField("bom_version")
    @ExcelProperty(value = "BOM版本", index = 4)
    private String bomVersion;

    @ApiModelProperty("安全库存数量(物料的安全库存,与补充安全库存数量无关)")
    @TableField("safe_quantity")
    @ExcelProperty(value = {"需求", "安全库存"}, index = 5)
    private BigDecimal safeQuantity;

    @ApiModelProperty("独立需求数量")
    @TableField("independent_quantity")
    @ExcelProperty(value = {"需求", "独立需求"}, index = 6)
    private BigDecimal independentQuantity;

    @ApiModelProperty("相关需求数量")
    @TableField("relation_quantity")
    @ExcelProperty(value = {"需求", "相关需求"}, index = 7)
    private BigDecimal relationQuantity;

    @ApiModelProperty("库存当时库存")
    @TableField("stock_quantity")
    @ExcelProperty(value = {"库存", "即时库存"}, index = 8)
    private BigDecimal stockQuantity;

    @ApiModelProperty("库存可用库存")
    @TableField("stock_available_quantity")
    @ExcelProperty(value = {"库存", "可用库存"}, index = 9)
    private BigDecimal stockAvailableQuantity;

    @ApiModelProperty("库存本次占用")
    @TableField("stock_occupy_quantity")
    @ExcelProperty(value = {"库存", "本次占用"}, index = 10)
    private BigDecimal stockOccupyQuantity;

    @ApiModelProperty("预计入库总入库数量")
    @TableField("incoming_quantity")
    @ExcelProperty(value = {"预计入库", "预计总数量"}, index = 11)
    private BigDecimal incomingQuantity;

    @ApiModelProperty("预计入库可用数量")
    @TableField("incoming_available_quantity")
    @ExcelProperty(value = {"预计入库", "可用数量"}, index = 12)
    private BigDecimal incomingAvailableQuantity;

    @ApiModelProperty("预计入库本次占用")
    @TableField("incoming_occupy_quantity")
    @ExcelProperty(value = {"预计入库", "本次占用"}, index = 13)
    private BigDecimal incomingOccupyQuantity;

    @ApiModelProperty("计划订单数量")
    @TableField("plan_quantity")
    @ExcelProperty(value = "计划订单数量", index = 14)
    private BigDecimal planQuantity;

    @ApiModelProperty("库存期末数量")
    @TableField("stock_ending_quantity")
    @ExcelProperty(value = "期末数量", index = 15)
    private BigDecimal stockEndingQuantity;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    @ExcelProperty(value = "库存单位", index = 16)
    private String unitName;

    @ApiModelProperty("日期")
    @TableField("date")
    @ExcelProperty(value = "需求日期", index = 17)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime date;

    @ApiModelProperty("MRP任务ID")
    @TableField("task_id")
    @ExcelIgnore
    private String taskId;

    @ApiModelProperty("排序")
    @TableField("sort")
    @ExcelIgnore
    private long sort;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;

    @ApiModelProperty("特征属性")
    @TableField("material_specific")
    @ExcelIgnore
    private String materialSpecific;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    @ExcelIgnore
    private String materialType;

    @ApiModelProperty("单位ID")
    @TableField("unit_id")
    @ExcelIgnore
    private String unitId;

    @ApiModelProperty("单位CODE")
    @TableField("unit_code")
    @ExcelIgnore
    private String unitCode;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    @ExcelIgnore
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    @ExcelIgnore
    private Integer unitRoundOffType;

    @ApiModelProperty("一级MRP计划订单数量")
    @TableField(exist = false)
    @ExcelIgnore
    private BigDecimal mrpPlanQuantity;

    @ApiModelProperty("一级MRP计划订单数量(基本单位)")
    @TableField(exist = false)
    @ExcelIgnore
    private BigDecimal mrpPlanBasicQuantity;

    @ApiModelProperty("历史预留数量")
    @TableField(exist = false)
    @ExcelIgnore
    private BigDecimal historyRelationshipQuantity;

    @ApiModelProperty("bomID")
    @TableField("bom_id")
    @ExcelIgnore
    private String bomId;

    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    @ExcelIgnore
    private String bomVersionDescribe;

    @TableField(exist = false)
    @ExcelIgnore
    private BomModel bomModel;
}
