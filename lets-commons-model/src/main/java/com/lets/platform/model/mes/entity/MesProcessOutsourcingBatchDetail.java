package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 工序委外单(集中)-明细
 *
 * @author DING WEI
 * @since 2025-02-10
 */
@Getter
@Setter
@TableName("mes_process_outsourcing_batch_detail")
@ApiModel(value = "MesProcessOutsourcingBatchDetail对象", description = "工序委外单(集中)-明细")
public class MesProcessOutsourcingBatchDetail extends BaseEntity {

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("生产工单-主键")
    @TableField("produce_order_id")
    private String produceOrderId;
    @ApiModelProperty("生产工单-单号")
    @TableField("produce_order_code")
    private String produceOrderCode;
    @ApiModelProperty("生产工单-行号")
    @TableField("produce_line_number")
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-明细主键")
    @TableField("produce_order_detail_id")
    private String produceOrderDetailId;
    @ApiModelProperty("生产工单-生产单元主键")
    @TableField("produce_factory_mode_id")
    private String produceFactoryModeId;
    @ApiModelProperty("生产工单-生产单元名称")
    @TableField("produce_factory_mode_name")
    private String produceFactoryModeName;

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
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("源单类型[1：工序计划单]")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("转出-源单主键(工序计划单主键)")
    @TableField("out_source_order_id")
    private String outSourceOrderId;
    @ApiModelProperty("转出-源单编码(工序计划单编码)")
    @TableField("out_source_order_code")
    private String outSourceOrderCode;
    @ApiModelProperty("转出-源单明细主键(工序计划单明细主键)")
    @TableField("out_source_order_detail_id")
    private String outSourceOrderDetailId;
    @ApiModelProperty("转出-源单行号(工序计划工序号)")
    @TableField("out_source_line_number")
    private String outSourceLineNumber;
    @ApiModelProperty("转出-工序号")
    @TableField("out_process_no")
    private String outProcessNo;
    @ApiModelProperty("转出-工序主键")
    @TableField("out_process_id")
    private String outProcessId;
    @ApiModelProperty("转出-工序编码")
    @TableField("out_process_code")
    private String outProcessCode;
    @ApiModelProperty("转出-工序名称")
    @TableField("out_process_name")
    private String outProcessName;
    @ApiModelProperty("转出-工序类型")
    @TableField("out_process_type")
    private String outProcessType;
    @TableField(exist = false)
    private String outProcessTypeName;
    @ApiModelProperty("转出-工序组主键")
    @TableField("out_process_group_id")
    private String outProcessGroupId;
    @ApiModelProperty("转入-工序组名称")
    @TableField("out_process_group_name")
    private String outProcessGroupName;

    @ApiModelProperty("周转箱主键")
    @TableField("turnover_box_id")
    private String turnoverBoxId;
    @ApiModelProperty("周转箱编码")
    @TableField("turnover_box_code")
    private String turnoverBoxCode;
    @ApiModelProperty("周转箱数量")
    @TableField("turnover_box_number")
    private Integer turnoverBoxNumber;
    @ApiModelProperty("标准装箱量")
    @TableField(exist = false)
    private BigDecimal boxQuantity;
    @ApiModelProperty("周转箱仓库主键")
    @TableField("turnover_box_store_id")
    private String turnoverBoxStoreId;
    @ApiModelProperty("周转箱仓库名称")
    @TableField("turnover_box_store_name")
    private String turnoverBoxStoreName;

    @ApiModelProperty("转入源单-源单主键(工序计划单主键)")
    @TableField("in_source_order_id")
    private String inSourceOrderId;
    @ApiModelProperty("转入源单-源单编码(工序计划单编码)")
    @TableField("in_source_order_code")
    private String inSourceOrderCode;
    @ApiModelProperty("转入源单-源单明细主键(工序计划单明细主键)")
    @TableField("in_source_order_detail_id")
    private String inSourceOrderDetailId;
    @ApiModelProperty("转入源单-源单行号(工序计划工序号)")
    @TableField("in_source_line_number")
    private String inSourceLineNumber;
    @ApiModelProperty("转入源单-工序号")
    @TableField("in_process_no")
    private String inProcessNo;
    @ApiModelProperty("转入源单-工序主键")
    @TableField("in_process_id")
    private String inProcessId;
    @ApiModelProperty("转入源单-工序编码")
    @TableField("in_process_code")
    private String inProcessCode;
    @ApiModelProperty("转入源单-工序名称")
    @TableField("in_process_name")
    private String inProcessName;
    @ApiModelProperty("转入源单-工序类型")
    @TableField("in_process_type")
    private String inProcessType;
    @TableField(exist = false)
    private String inProcessTypeName;
    @ApiModelProperty("转入源单-工序组主键")
    @TableField("in_process_group_id")
    private String inProcessGroupId;
    @ApiModelProperty("转入源单-工序组名称")
    @TableField("in_process_group_name")
    private String inProcessGroupName;

    @ApiModelProperty("工序检验[0否1是]")
    @TableField("process_inspect")
    private Integer processInspect;

    @ApiModelProperty("工序单位主键")
    @TableField("process_unit_id")
    private String processUnitId;
    @ApiModelProperty("工序单位")
    @TableField("process_unit_code")
    private String processUnitCode;
    @ApiModelProperty("工序单位名称")
    @TableField("process_unit_name")
    private String processUnitName;
    @ApiModelProperty("工序单位精度")
    @TableField("process_unit_accuracy")
    private Integer processUnitAccuracy;
    @ApiModelProperty("工序单位舍入方式")
    @TableField("process_unit_round_off_type")
    private Integer processUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转移数量")
    @TableField("transfer_number")
    private BigDecimal transferNumber;

    @ApiModelProperty("采购计价单位主键")
    @TableField("purchase_pricing_unit_id")
    private String purchasePricingUnitId;
    @ApiModelProperty("采购计价单位编码")
    @TableField("purchase_pricing_unit_code")
    private String purchasePricingUnitCode;
    @ApiModelProperty("采购计价单位名称")
    @TableField("purchase_pricing_unit_name")
    private String purchasePricingUnitName;
    @ApiModelProperty("采购计价单位精度")
    @TableField("purchase_pricing_unit_accuracy")
    private Integer purchasePricingUnitAccuracy;
    @ApiModelProperty("采购计价单位舍入方式")
    @TableField("purchase_pricing_unit_round_off_type")
    private Integer purchasePricingUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转移计价数量")
    @TableField("transfer_pricing_number")
    private BigDecimal transferPricingNumber;
    @ApiModelProperty("计价单位和工序单位是够存在转换关系")
    @TableField("has_unit_convert")
    private String hasUnitConvert;

    @ApiModelProperty("是否连续委外[0：否，1：是]")
    @TableField("series")
    private Integer series;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;
    @ApiModelProperty("源销售订单单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("分组标识")
    @TableField("group_sign")
    private String groupSign;

    @TableField(exist = false)
    private Integer step;

    @ApiModelProperty("是否需要变红[YN]")
    @TableField("first_red_process")
    private String firstRedProcess;

    @ApiModelProperty("转入工序是否为首道工序[YN]")
    @TableField("is_first_process")
    private String isFirstProcess;

    @ApiModelProperty("转出工序是否为末道工序[YN]")
    @TableField("is_last_process")
    private String isLastProcess;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("委外单价")
    @TableField("outsource_price")
    private BigDecimal outsourcePrice;

    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;
    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;
    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;
    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @ApiModelProperty("价税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("结算币种")
    @TableField("currency_id")
    private String currencyId;
    @TableField("currency_name")
    private String currencyName;
    @TableField("currency_amount_accuracy")
    private Integer currencyAmountAccuracy;
    @TableField("currency_price_accuracy")
    private Integer currencyPriceAccuracy;
    @TableField("currency_round_off_type")
    private Integer currencyRoundOffType;
    @TableField("currency_symbol")
    private String currencySymbol;

    @ApiModelProperty("税种")
    @TableField("tax_id")
    private String taxId;
    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private BigDecimal taxRate;
    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;
    @ApiModelProperty("税种分类")
    @TableField("tax_type")
    private String taxType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField("rich_number")
    private BigDecimal richNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格计价数量")
    @TableField("rich_pricing_number")
    private BigDecimal richPricingNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工废数量")
    @TableField("process_scrap_number")
    private BigDecimal processScrapNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("料废数量")
    @TableField("material_scrap_number")
    private BigDecimal materialScrapNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("让步接收数量")
    @TableField("give_in_number")
    private BigDecimal giveInNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField("repair_number")
    private BigDecimal repairNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField("poor_number")
    private BigDecimal poorNumber;

    @ApiModelProperty("委外检验类型[1是0否]")
    @TableField("outsourcing_inspect_type")
    private Integer outsourcingInspectType;

    @ApiModelProperty("委外发出单主键")
    @TableField("outsourcing_out_id")
    private String outsourcingOutId;
    @ApiModelProperty("委外发出单编码")
    @TableField("outsourcing_out_code")
    private String outsourcingOutCode;
    @ApiModelProperty("委外发出单编码")
    @TableField("outsourcing_out_source_detail_id")
    private String outsourcingOutSourceDetailId;
    @ApiModelProperty("委外发出单源单类型")
    @TableField(exist = false)
    private String outsourcingOutTypeName;
    @ApiModelProperty("委外发出单源单行号")
    @TableField(exist = false)
    private String outsourcingOutLineNumber;

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

    @ApiModelProperty("合同编号")
    @TableField(exist = false)
    private String contractCode;

}
