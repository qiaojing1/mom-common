package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.psi.enums.PricingModeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 工序委外结算单
 * @author DING WEI
 * @since 2024-05-06
 */
@Getter
@Setter
@TableName("mes_process_outsourcing_settlement")
@ApiModel(value = "MesProcessOutsourcingSettlement对象", description = "工序委外结算单")
public class MesProcessOutsourcingSettlement extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

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
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeFormat;

    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    private String supplierId;
    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty("结算币种")
    @TableField("settlement_currency_id")
    private String settlementCurrencyId;
    @ApiModelProperty("结算币种名称")
    @TableField("settlement_currency_name")
    private String settlementCurrencyName;
    @ApiModelProperty("结算币种单价精度")
    @TableField("settlement_currency_price_accuracy")
    private Integer settlementCurrencyPriceAccuracy;
    @ApiModelProperty("结算币种金额精度")
    @TableField("settlement_currency_amount_accuracy")
    private Integer settlementCurrencyAmountAccuracy;
    @ApiModelProperty("结算币种舍入类型")
    @TableField("settlement_currency_round_off_type")
    private Integer settlementCurrencyRoundOffType;

    @ApiModelProperty("本位币")
    @TableField("basic_currency_id")
    private String basicCurrencyId;
    @ApiModelProperty("本位币名称")
    @TableField("basic_currency_name")
    private String basicCurrencyName;
    @ApiModelProperty("本位币单价精度")
    @TableField("basic_currency_price_accuracy")
    private Integer basicCurrencyPriceAccuracy;
    @ApiModelProperty("本位币金额精度")
    @TableField("basic_currency_amount_accuracy")
    private Integer basicCurrencyAmountAccuracy;
    @ApiModelProperty("本位币舍入类型")
    @TableField("basic_currency_round_off_type")
    private Integer basicCurrencyRoundOffType;

    @ApiModelProperty("汇率表主键")
    @TableField("exchange_rate_id")
    private String exchangeRateId;
    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ValidatedEnum(enumClass = PricingModeEnum.class, message = "pricingMode", groups = {Save.class, Update.class})
    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;
    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("付款条件")
    @TableField("payment_condition_id")
    private String paymentConditionId;
    @ApiModelProperty("付款条件名称")
    @TableField("payment_condition_name")
    private String paymentConditionName;

    @ApiModelProperty("结算方式")
    @TableField("settlement_method_id")
    private String settlementMethodId;
    @ApiModelProperty("结算方式名称")
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @NotNull(message = "[税额]不能为空", groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField("total_tax_amount")
    private BigDecimal totalTaxAmount;
    @NotNull(message = "[金额]不能为空", groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;
    @NotNull(message = "[含税合计]不能为空", groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField("total_amount_including_tax")
    private BigDecimal totalAmountIncludingTax;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @Length(max = 200, message = "Order.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @NotEmpty(message = "OrderDetail.NotEmpty", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<MesProcessOutsourcingSettlementDetail> details;

    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("单据主键")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField(exist = false)
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;

    @ApiModelProperty("计价单位")
    @TableField(exist = false)
    private String pricingUnitId;
    @ApiModelProperty("计价单位编码")
    @TableField(exist = false)
    private String pricingUnitCode;
    @ApiModelProperty("计价单位名称")
    @TableField(exist = false)
    private String pricingUnitName;
    @ApiModelProperty("计价单位精度")
    @TableField(exist = false)
    private Integer pricingUnitAccuracy;
    @ApiModelProperty("计价单位舍入类型")
    @TableField(exist = false)
    private Integer pricingUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计价数量")
    @TableField(exist = false)
    private BigDecimal pricingNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField(exist = false)
    private BigDecimal price;

    @ApiModelProperty("税种ID")
    @TableField(exist = false)
    private String taxId;
    @ApiModelProperty("税种分类")
    @TableField(exist = false)
    private String taxType;
    @ApiModelProperty("税种名称")
    @TableField(exist = false)
    private String taxName;
    @ApiModelProperty("税率")
    @TableField(exist = false)
    private String taxRate;
    @ApiModelProperty("税种精度")
    @TableField(exist = false)
    private Integer taxAccuracy;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField(exist = false)
    private BigDecimal priceIncludingTax;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField(exist = false)
    private BigDecimal amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField(exist = false)
    private BigDecimal taxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField(exist = false)
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("工序计划单主键")
    @TableField(exist = false)
    private String processPlanOrderId;
    @ApiModelProperty("工序计划单编号")
    @TableField(exist = false)
    private String processPlanOrderCode;
    @ApiModelProperty("工序号")
    @TableField(exist = false)
    private String processNo;
    @ApiModelProperty("工序主键")
    @TableField(exist = false)
    private String processId;
    @ApiModelProperty("工序编码")
    @TableField(exist = false)
    private String processCode;
    @ApiModelProperty("工序名称")
    @TableField(exist = false)
    private String processName;

    @ApiModelProperty("源单主键")
    @TableField(exist = false)
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField(exist = false)
    private String sourceOrderCode;
    @ApiModelProperty("源单明细主键")
    @TableField(exist = false)
    private String sourceDetailId;
    /**
     * @see com.lets.platform.model.psi.enums.StockSourceEnum
     */
    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
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
}
