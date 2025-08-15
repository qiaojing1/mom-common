package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * 工序委外结算单-明细
 * @author DING WEI
 * @since 2024-05-06
 */
@Getter
@Setter
@TableName("mes_process_outsourcing_settlement_detail")
@ApiModel(value = "MesProcessOutsourcingSettlementDetail对象", description = "工序委外结算单-明细")
public class MesProcessOutsourcingSettlementDetail extends BaseEntity {

    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料主键")
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
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;

    @ApiModelProperty("计价单位")
    @TableField("pricing_unit_id")
    private String pricingUnitId;
    @ApiModelProperty("计价单位编码")
    @TableField("pricing_unit_code")
    private String pricingUnitCode;
    @ApiModelProperty("计价单位名称")
    @TableField("pricing_unit_name")
    private String pricingUnitName;
    @ApiModelProperty("计价单位精度")
    @TableField("pricing_unit_accuracy")
    private Integer pricingUnitAccuracy;
    @ApiModelProperty("计价单位舍入类型")
    @TableField("pricing_unit_round_off_type")
    private Integer pricingUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计价数量")
    @TableField("pricing_number")
    private BigDecimal pricingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty("税种ID")
    @TableField("tax_id")
    private String taxId;
    @ApiModelProperty("税种分类")
    @TableField("tax_type")
    private String taxType;
    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;
    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private String taxRate;
    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("已转应付数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("already_ap_number")
    private BigDecimal alreadyApNumber;
    @ApiModelProperty("应付占用数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("occupy_ap_number")
    private BigDecimal occupyApNumber;
    @ApiModelProperty("已转应付数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private BigDecimal oldAlreadyApNumber;
    @ApiModelProperty("应付占用数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private BigDecimal oldOccupyApNumber;

    @ApiModelProperty("工序计划单主键")
    @TableField("process_plan_order_id")
    private String processPlanOrderId;
    @ApiModelProperty("工序计划单编号")
    @TableField("process_plan_order_code")
    private String processPlanOrderCode;
    @ApiModelProperty("工序号")
    @TableField("process_no")
    private String processNo;
    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;
    @ApiModelProperty("工序编码")
    @TableField("process_code")
    private String processCode;
    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ApiModelProperty("源单明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;
    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String detailRemark;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
    @TableField(exist = false)
    private String isMateialDemand;

    @ApiModelProperty("扩展字段1")
    @TableField(exist = false)
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField(exist = false)
    private String extField2;

    @ApiModelProperty("扩展字段3")
    @TableField(exist = false)
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField(exist = false)
    private String extField4;

    @ApiModelProperty("扩展字段5")
    @TableField(exist = false)
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField(exist = false)
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField(exist = false)
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField(exist = false)
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField(exist = false)
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField(exist = false)
    private String extField10;

    public BigDecimal alreadyApNumberNN() {
        return Optional.ofNullable(alreadyApNumber).orElse(BigDecimal.ZERO);
    }

    public BigDecimal occupyApNumberNN() {
        return Optional.ofNullable(occupyApNumber).orElse(BigDecimal.ZERO);
    }
}
