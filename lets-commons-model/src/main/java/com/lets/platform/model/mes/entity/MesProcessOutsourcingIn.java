package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.common.enums.CommonProcessTypeEnum;
import com.lets.platform.model.mes.enums.processTransfer.ProcessOutsourcingBusinessStatusEnum;
import com.lets.platform.model.mes.enums.processTransfer.TransferDirectionEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 工序委外接收单
 * @author DING WEI
 * @since 2024-05-06
 */
@Getter
@Setter
@TableName("mes_process_outsourcing_in")
@ApiModel(value = "MesProcessOutsourcingIn对象", description = "工序委外接收单")
public class MesProcessOutsourcingIn extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("流水号")
    @TableField("serial_number")
    private Integer serialNumber;

    @NotBlank(message = "PLEASE_CHOOSE_CATEGORY", groups = {Save.class, Update.class})
    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型编码")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Order.orderTime", groups = {Save.class, Update.class})
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeFormat;

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

//    @ApiModelProperty("默认税种ID")
//    @TableField(exist = false)
//    private String taxId;
//    @ApiModelProperty("税种分类")
//    @TableField(exist = false)
//    private String taxType;
//    @ApiModelProperty("税种名称")
//    @TableField(exist = false)
//    private String taxName;
//    @ApiModelProperty("税种税率")
//    @TableField(exist = false)
//    private String taxRate;
//    @ApiModelProperty("税种精度")
//    @TableField(exist = false)
//    private Integer taxAccuracy;

    @ValidatedEnum(enumClass = TransferDirectionEnum.class, message = "ProcessSourcing.transferDirection.error", required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("转移方向[1：转入 2：转出]")
    @TableField("transfer_direction")
    private Integer transferDirection;
    @TableField(exist = false)
    private String transferDirectionName;

    @ApiModelProperty("采购部门主键")
    @TableField("purchase_org_id")
    private String purchaseOrgId;
    @ApiModelProperty("采购部门名称")
    @TableField("purchase_org_name")
    private String purchaseOrgName;
    @ApiModelProperty("采购人员主键")
    @TableField("purchase_user_id")
    private String purchaseUserId;
    @ApiModelProperty("采购人员名称")
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ValidatedEnum(enumClass = ProcessOutsourcingBusinessStatusEnum.class, required = true, message = "ProcessSourcing.businessStatus.error", groups = {Save.class, Update.class})
    @ApiModelProperty("业务状态[1:正常转移、2:回冲]")
    @TableField("business_status")
    private Integer businessStatus;
    @TableField(exist = false)
    private String businessStatusName;

    /**
     * @see com.lets.platform.model.mes.enums.processTransfer.TransferSourceOrderTypeEnum
     */
    @ApiModelProperty("源单类型[1：工序计划单]")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单主键(工序计划单主键)")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单编码(工序计划单编码)")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ApiModelProperty("源单明细主键(工序计划单明细主键)")
    @TableField("source_order_detail_id")
    private String sourceOrderDetailId;
    @ApiModelProperty("源单行号(工序计划工序号)")
    @TableField("source_line_number")
    private String sourceLineNumber;

    @ApiModelProperty("源单委外发出单主键")
    @TableField("outsourcing_out_id")
    private String outsourcingOutId;
    @ApiModelProperty("源单委外发出单单号")
    @TableField("outsourcing_out_code")
    private String outsourcingOutCode;

    @ApiModelProperty("回冲源单主键")
    @TableField("backwash_source_order_id")
    private String backwashSourceOrderId;
    @ApiModelProperty("回冲源单编码")
    @TableField("backwash_source_order_code")
    private String backwashSourceOrderCode;
    @ApiModelProperty("已回冲数量")
    @TableField("already_backwash_number")
    private BigDecimal alreadyBackwashNumber;
    @ApiModelProperty("回冲占用数量")
    @TableField("occupy_backwash_number")
    private BigDecimal occupyBackwashNumber;
    @TableField(exist = false)
    private BigDecimal canBackwashNumber;

    @NotBlank(message = "ProcessSourcing.processUnitId", groups = {Save.class, Update.class})
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
    @ValidatedEnum(enumClass = CommonProcessTypeEnum.class, message = "ProcessSourcing.outProcessType", groups = {Save.class, Update.class})
    @ApiModelProperty("转出-工序类型")
    @TableField("out_process_type")
    private String outProcessType;
    @TableField(exist = false)
    private String outProcessTypeName;
    @ApiModelProperty("转出-工序组主键")
    @TableField("out_process_group_id")
    private String outProcessGroupId;
    @ApiModelProperty("转出-工序组名称")
    @TableField("out_process_group_name")
    private String outProcessGroupName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转出数量")
    @TableField("out_transfer_number")
    private BigDecimal outTransferNumber;
    @ApiModelProperty("委外供应商主键")
    @TableField("outsourcing_supplier_id")
    private String outsourcingSupplierId;
    @ApiModelProperty("委外供应商名称")
    @TableField("outsourcing_supplier_name")
    private String outsourcingSupplierName;
    @ApiModelProperty("委外仓库主键")
    @TableField("outsourcing_store_id")
    private String outsourcingStoreId;
    @ApiModelProperty("委外仓库名称")
    @TableField("outsourcing_store_name")
    private String outsourcingStoreName;

    @ApiModelProperty("转入-工序号")
    @TableField("in_process_no")
    private String inProcessNo;
    @ApiModelProperty("转入-工序主键")
    @TableField("in_process_id")
    private String inProcessId;
    @ApiModelProperty("转入-工序编码")
    @TableField("in_process_code")
    private String inProcessCode;
    @ApiModelProperty("转入-工序名称")
    @TableField("in_process_name")
    private String inProcessName;
    @ValidatedEnum(enumClass = CommonProcessTypeEnum.class, message = "ProcessSourcing.inProcessType", groups = {Save.class, Update.class})
    @ApiModelProperty("转入-工序类型")
    @TableField("in_process_type")
    private String inProcessType;
    @TableField(exist = false)
    private String inProcessTypeName;
    @ApiModelProperty("转入-工序组主键")
    @TableField("in_process_group_id")
    private String inProcessGroupId;
    @ApiModelProperty("转入-工序组名称")
    @TableField("in_process_group_name")
    private String inProcessGroupName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转入数量")
    @TableField("in_transfer_number")
    private BigDecimal inTransferNumber;

    @TableField("in_process_plan_detail_id")
    private String inProcessPlanDetailId;
    @TableField("in_process_plan_id")
    private String inProcessPlanId;
    @TableField("in_process_plan_code")
    private String inProcessPlanCode;

    @ApiModelProperty("周转箱主键")
    @TableField("turnover_box_id")
    private String turnoverBoxId;
    @ApiModelProperty("周转箱编码")
    @TableField("turnover_box_code")
    private String turnoverBoxCode;
    @ApiModelProperty("周转箱数量")
    @TableField("turnover_box_number")
    private Integer turnoverBoxNumber;
    @ApiModelProperty("周转箱仓库主键")
    @TableField("turnover_box_store_id")
    private String turnoverBoxStoreId;
    @ApiModelProperty("周转箱仓库名称")
    @TableField("turnover_box_store_name")
    private String turnoverBoxStoreName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转移计价数量")
    @TableField("transfer_pricing_number")
    private BigDecimal transferPricingNumber;
    @ApiModelProperty("已回冲计价数量")
    @TableField("already_backwash_pricing_number")
    private BigDecimal alreadyBackwashPricingNumber;
    @ApiModelProperty("回冲占用计价数量")
    @TableField("occupy_backwash_pricing_number")
    private BigDecimal occupyBackwashPricingNumber;

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

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("业务状态")
    @TableField("close_status")
    private Integer closeStatus;
    @TableField(exist = false)
    private String closeStatusName;

    @ApiModelProperty("已结算数量")
    @TableField("already_settlement_number")
    private BigDecimal alreadySettlementNumber;
    @ApiModelProperty(value = "已结算数量", hidden = true)
    @TableField(exist = false)
    private BigDecimal oldAlreadySettlementNumber;
    @ApiModelProperty("结算占用数量")
    @TableField("occupy_settlement_number")
    private BigDecimal occupySettlementNumber;
    @ApiModelProperty(value = "结算占用数量", hidden = true)
    @TableField(exist = false)
    private BigDecimal oldOccupySettlementNumber;
    @ApiModelProperty(value = "可结算数量")
    @TableField(exist = false)
    private BigDecimal canSettlementNumber;

    @ApiModelProperty("生成的工单报工单主键")
    @TableField("order_report_id")
    private String orderReportId;

    @ApiModelProperty("是否生成汇报入库单(首件-工位机报工-委外接收审核)(YN)")
    @TableField("generate_wip")
    private String generateWip;

    @ApiModelProperty("是否生成直接调拨单(过程-委外发出审核)(YN)")
    @TableField("generate_wip_transfer")
    private String generateWipTransfer;

    @ApiModelProperty("工序检验[0否1是]")
    @TableField("process_inspect")
    private Integer processInspect;

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

    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("生产工单-主键")
    @TableField(exist = false)
    private String produceOrderId;
    @ApiModelProperty("生产工单-编码")
    @TableField(exist = false)
    private String produceOrderCode;
    @ApiModelProperty("生产工单明细-主键")
    @TableField(exist = false)
    private String produceDetailId;
    @ApiModelProperty("生产工单-行号")
    @TableField(exist = false)
    private Long produceLineNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产工单-数量")
    @TableField(exist = false)
    private BigDecimal produceNumber;
    @ApiModelProperty("生产工单-单位主键")
    @TableField(exist = false)
    private String produceUnitId;
    @ApiModelProperty("物料生产单位编码")
    @TableField(exist = false)
    private String produceUnitCode;
    @ApiModelProperty("物料生产单位名称")
    @TableField(exist = false)
    private String produceUnitName;
    @ApiModelProperty("物料生产单位精度")
    @TableField(exist = false)
    private Integer produceUnitAccuracy;
    @ApiModelProperty("物料生产单位舍入类型")
    @TableField(exist = false)
    private Integer produceUnitRoundOffType;
    @ApiModelProperty("生产工单-批号")
    @TableField(exist = false)
    private String produceBatchNumber;
    @ApiModelProperty("生产工单-BOM版本")
    @TableField(exist = false)
    private String produceBomId;
    @ApiModelProperty("生产工单-BOM版本")
    @TableField(exist = false)
    private String produceBomVersion;
    @ApiModelProperty("生产工单-BOM版本描述")
    @TableField(exist = false)
    private String produceBomVersionDescribe;
    @ApiModelProperty("生产工单-工艺路线")
    @TableField(exist = false)
    private String produceRouteId;
    @ApiModelProperty("生产工单-工艺路线名称")
    @TableField(exist = false)
    private String produceRouteName;
    @ApiModelProperty("生产工单-生产部门")
    @TableField(exist = false)
    private String produceOrgId;
    @ApiModelProperty("生产工单-生产部门名称")
    @TableField(exist = false)
    private String produceOrgName;
    @ApiModelProperty("生产单元")
    @TableField(exist = false)
    private String produceFactoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField(exist = false)
    private String produceFactoryModeName;
    @ApiModelProperty("是否存在单位转换")
    @TableField("has_unit_convert")
    private String hasUnitConvert;
    @TableField(exist = false)
    private String isMateialDemand;

    @ApiModelProperty("委外发出集中单据主键")
    @TableField("outsourcing_batch_order_id")
    private String outsourcingBatchOrderId;
    @ApiModelProperty("委外发出集中单据明细主键")
    @TableField("outsourcing_batch_order_detail_id")
    private String outsourcingBatchOrderDetailId;

    @ApiModelProperty("可委外接收数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingInNumber;
    @ApiModelProperty("可委外接收计价数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingInPricingNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField("rich_number")
    private BigDecimal richNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField("scrap_number")
    private BigDecimal scrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工废数量")
    @TableField("process_scrap_number")
    private BigDecimal processScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("料废数量")
    @TableField("material_scrap_number")
    private BigDecimal materialScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField("repair_number")
    private BigDecimal repairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("让步接收数量")
    @TableField("give_in_number")
    private BigDecimal giveInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField("poor_number")
    private BigDecimal poorNumber;

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

    @ApiModelProperty("生成的委外工序调拨倒冲领料单主键")
    @TableField("outsourcing_allocation_reverse_picking_id")
    private String outsourcingAllocationReversePickingId;

    public BigDecimal transferNumber() {
        if (Objects.isNull(outTransferNumber)) {
            return inTransferNumber;
        } else {
            return outTransferNumber;
        }
    }

    public BigDecimal alreadyBackwashNumberNotNull() {
        if (Objects.isNull(alreadyBackwashNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyBackwashNumber;
        }
    }
    public BigDecimal transferPricingNumberNotNull() {
        if (Objects.isNull(transferPricingNumber)) {
            return BigDecimal.ZERO;
        } else {
            return transferPricingNumber;
        }
    }
    public BigDecimal alreadyBackwashPricingNumberNotNull() {
        if (Objects.isNull(alreadyBackwashPricingNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyBackwashPricingNumber;
        }
    }

    public BigDecimal occupyBackwashNumberNotNull() {
        if (Objects.isNull(occupyBackwashNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyBackwashNumber;
        }
    }

    public BigDecimal alreadySettlementNumberNotNull() {
        if (Objects.isNull(alreadySettlementNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadySettlementNumber;
        }
    }
    public BigDecimal occupySettlementNumberNotNull() {
        if (Objects.isNull(occupySettlementNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupySettlementNumber;
        }
    }

    public BigDecimal occupyBackwashPricingNumberNotNull() {
        if (Objects.isNull(occupyBackwashPricingNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyBackwashPricingNumber;
        }
    }

}
