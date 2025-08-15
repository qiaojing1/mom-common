package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
 * <p>
 * 合同台账
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-04-29
 */
@Getter
@Setter
@TableName("psi_contract_order")
@ApiModel(value = "PsiContractOrder对象", description = "合同台账")
public class PsiContractOrder extends BaseEntity {

    @ApiModelProperty("合同编号")
    @TableField("code")
    @ExcelProperty(value = "合同编号", index = 1)
    private String code;

    @ApiModelProperty("合同名称")
    @TableField("name")
    @ExcelProperty(value = "合同名称", index = 3)
    private String name;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    @ExcelIgnore
    private String orderCategoryId;

    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    @ExcelIgnore
    private String orderCategoryCode;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    @ExcelProperty(value = "合同类型", index = 4)
    private String orderCategoryName;

    @ApiModelProperty("签订日期")
    @TableField("signing_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ExcelIgnore
    private LocalDateTime signingTime;
    @ApiModelProperty("签订日期str")
    @TableField(exist = false)
    @ExcelProperty(value = "签订日期", index = 2)
    private String signingTimeStr;

    @ApiModelProperty("终止日期")
    @TableField("termination_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ExcelIgnore
    private LocalDateTime terminationTime;
    @ApiModelProperty("终止日期str")
    @TableField(exist = false)
    private String terminationTimeStr;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    @ExcelIgnore
    private String pricingMode;
    @TableField(exist = false)
    @ExcelProperty(value = "作价模式", index = 9)
    private String pricingModeName;

    @ApiModelProperty("上级合同id")
    @TableField("superior_contract_id")
    @ExcelIgnore
    private String superiorContractId;
    @ApiModelProperty("上级合同名称")
    @TableField(exist = false)
    @ExcelProperty(value = "上级合同", index = 5)
    private String superiorContractName;

    @ApiModelProperty("订货客户ID")
    @TableField("order_customer_id")
    @ExcelIgnore
    private String orderCustomerId;

    @ApiModelProperty("订货客户分组ID")
    @TableField(exist = false)
    @ExcelIgnore
    private String orderCustomerGroupId;

    @ApiModelProperty("订货客户名称")
    @TableField("order_customer_name")
    @ExcelProperty(value = "订货客户", index = 7)
    private String orderCustomerName;

    @ApiModelProperty("合同版本(合同版本+合同名称唯一)")
    @TableField("contract_version")
    @ExcelProperty(value = "合同版本", index = 6)
    private String contractVersion;

    @ApiModelProperty("订货客户税种ID")
    @TableField("order_customer_default_tax_id")
    @ExcelIgnore
    private String orderCustomerDefaultTaxId;

    @ApiModelProperty("订货客户税种分类")
    @TableField("order_customer_default_tax_type")
    @ExcelIgnore
    private String orderCustomerDefaultTaxType;

    @ApiModelProperty("订货客户税种名称")
    @TableField("order_customer_default_tax_name")
    @ExcelIgnore
    private String orderCustomerDefaultTaxName;

    @ApiModelProperty("订货客户税种税率")
    @TableField("order_customer_default_tax_rate")
    @ExcelIgnore
    private String orderCustomerDefaultTaxRate;

    @ApiModelProperty("订货客户税种精度")
    @TableField("order_customer_default_tax_accuracy")
    @ExcelIgnore
    private Integer orderCustomerDefaultTaxAccuracy;

    @ApiModelProperty("结算币种ID")
    @TableField("currency_id")
    @ExcelIgnore
    private String currencyId;

    @ApiModelProperty("结算币种名称")
    @TableField("currency_name")
    @ExcelIgnore
    private String currencyName;

    @ApiModelProperty("结算币种金额精度")
    @TableField("currency_amount_accuracy")
    @ExcelIgnore
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("结算币种名称")
    @TableField("currency_price_accuracy")
    @ExcelIgnore
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("结算货币舍入类型")
    @TableField("currency_round_off_type")
    @ExcelIgnore
    private Integer currencyRoundOffType;

    @ApiModelProperty("销售部门ID")
    @TableField("sale_org_id")
    @ExcelIgnore
    private String saleOrgId;

    @ApiModelProperty("销售部门名称")
    @TableField("sale_org_name")
    @ExcelIgnore
    private String saleOrgName;

    @ApiModelProperty("销售员ID")
    @TableField("sale_user_id")
    @ExcelIgnore
    private String saleUserId;

    @ApiModelProperty("销售员名称")
    @TableField("sale_user_name")
    @ExcelIgnore
    private String saleUserName;

    @ApiModelProperty("销售分组ID")
    @TableField("sale_group_id")
    @ExcelIgnore
    private String saleGroupId;

    @ApiModelProperty("销售分组名称")
    @TableField("sale_group_name")
    @ExcelIgnore
    private String saleGroupName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("本位币ID")
    @TableField("base_currency_id")
    private String baseCurrencyId;

    @ApiModelProperty("本位币名称")
    @TableField("base_currency_name")
    private String baseCurrencyName;

    @ApiModelProperty("本位币金额精度")
    @TableField("base_currency_amount_accuracy")
    private Integer baseCurrencyAmountAccuracy;

    @ApiModelProperty("本位币单价精度")
    @TableField("base_currency_price_accuracy")
    private Integer baseCurrencyPriceAccuracy;

    @ApiModelProperty("本位币舍入类型")
    @TableField("base_currency_round_off_type")
    private Integer baseCurrencyRoundOffType;

    @ApiModelProperty("汇率表ID")
    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @ApiModelProperty("汇率表名称")
    @TableField("exchange_rate_name")
    private String exchangeRateName;

    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ApiModelProperty("汇率精度")
    @TableField(exist = false)
    private Integer exchangeRateAcc;

    @ApiModelProperty("收款条件ID")
    @TableField("payment_condition_id")
    private String paymentConditionId;

    @ApiModelProperty("收款条件名称")
    @TableField("payment_condition_name")
    private String paymentConditionName;

    @ApiModelProperty("结算方式ID")
    @TableField("settlement_method_id")
    private String settlementMethodId;

    @ApiModelProperty("结算方式名称")
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("合同金额")
    @TableField("total_amount")
    @ExcelProperty(value = "合同金额", index = 8)
    private BigDecimal totalAmount;

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;

    @ApiModelProperty("价税合计")
    @TableField("total_amount_including_tax")
    private BigDecimal totalAmountIncludingTax;

    @ApiModelProperty("联系人ID")
    @TableField("order_customer_contact_user_id")
    private String orderCustomerContactUserId;

    @ApiModelProperty("联系人")
    @TableField("order_customer_contact_user")
    private String orderCustomerContactUser;

    @ApiModelProperty("联系电话")
    @TableField("order_customer_contact_phone_number")
    private String orderCustomerContactPhoneNumber;

    @ApiModelProperty("联系地址")
    @TableField("order_customer_contact_address")
    private String orderCustomerContactAddress;

    @ApiModelProperty("收货客户ID")
    @TableField("receive_customer_id")
    private String receiveCustomerId;

    @ApiModelProperty("收货客户名称")
    @TableField("receive_customer_name")
    private String receiveCustomerName;

    @ApiModelProperty("收货联系人ID")
    @TableField("receive_customer_contact_user_id")
    private String receiveCustomerContactUserId;

    @ApiModelProperty("收货联系人")
    @TableField("receive_customer_contact_user")
    private String receiveCustomerContactUser;

    @ApiModelProperty("收货联系电话")
    @TableField("receive_customer_contact_phone_number")
    private String receiveCustomerContactPhoneNumber;

    @ApiModelProperty("收货联系地址")
    @TableField("receive_customer_contact_address")
    private String receiveCustomerContactAddress;

    @ApiModelProperty("结算客户ID")
    @TableField("settlement_customer_id")
    private String settlementCustomerId;

    @ApiModelProperty("结算客户名称")
    @TableField("settlement_customer_name")
    private String settlementCustomerName;

    @ApiModelProperty("付款客户ID")
    @TableField("payment_customer_id")
    private String paymentCustomerId;

    @ApiModelProperty("付款客户名称")
    @TableField("payment_customer_name")
    private String paymentCustomerName;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    @ExcelProperty(value = "状态", index = 10)
    private String statusName;

    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField(exist = false)
    private List<PsiContractOrderMaterial> contractOrderMaterialList;

    @TableField(exist = false)
    private List<PsiContractOrderMaterialCharacteristic> materialCharacteristicList = new ArrayList<>();

    @ApiModelProperty("附件id")
    @TableField("enclosure_file_ids")
    private String enclosureFileIds;

    @ApiModelProperty("文件ID列表")
    @TableField(exist = false)
    private List<String> fileIds;

    @ApiModelProperty("文件列表")
    @TableField(exist = false)
    private List<CommonFile> enclosureFiles;

    @ApiModelProperty("交货期(天)")
    @TableField("delivery_day")
    @ExcelIgnore
    private Integer deliveryDay;

    @ApiModelProperty("客户联系人")
    @TableField(exist = false)
    @ExcelIgnore
    private String contactPerson;

    @ApiModelProperty("客户联系电话")
    @TableField(exist = false)
    @ExcelIgnore
    private String contactPhone;

    @ApiModelProperty("客户地址")
    @TableField(exist = false)
    @ExcelIgnore
    private String address;

    @ApiModelProperty("法人代表")
    @TableField(exist = false)
    @ExcelIgnore
    private String legalPerson;

    @ApiModelProperty("开户银行")
    @TableField(exist = false)
    @ExcelIgnore
    private String bankOfDeposit;

    @ApiModelProperty("账号")
    @ExcelIgnore
    @TableField(exist = false)
    private String bankAccount;

    @ApiModelProperty("纳税人识别号")
    @TableField(exist = false)
    @ExcelIgnore
    private String identifierNumber;

    /**
     * 表体字段
     **/
    @ApiModelProperty("合同ID")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("表体ID")
    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("合同ID")
    @TableField(exist = false)
    private String detailCode;


    @TableField(exist = false)
    private String customerMaterialId;
    @TableField(exist = false)
    private String customerMaterialCode;
    @TableField(exist = false)
    private String customerMaterialName;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    @ExcelProperty(value = "行号", index = 11)
    private Long lineNumber;

    @ApiModelProperty("物料ID")
    @TableField(exist = false)
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    @ExcelProperty(value = "物料编码", index = 12)
    private String materialCode;

    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;

    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    @ExcelProperty(value = "物料名称", index = 13)
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    @ExcelProperty(value = "物料规格型号", index = 14)
    private String materialSpecs;

    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    @ExcelIgnore
    private String materialCharacteristicNames;

    @ApiModelProperty("销售单位ID")
    @TableField(exist = false)
    private String saleUnitId;

    @ApiModelProperty("销售单位精度")
    @TableField(exist = false)
    private Integer saleUnitAccuracy;

    @ApiModelProperty("销售单位舍入类型")
    @TableField(exist = false)
    private String saleUnitRoundOffType;

    @ApiModelProperty("销售单位名称")
    @TableField(exist = false)
    private String saleUnitName;

    @ApiModelProperty("数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelProperty(value = "数量", index = 15)
    private BigDecimal quantity;

    @ApiModelProperty("总数量")
    @TableField(exist = false)
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalQuantity;

    @ApiModelProperty("单价")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelProperty(value = "单价", index = 16)
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

    @ApiModelProperty("含税单价")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelProperty(value = "含税单价", index = 17)
    private BigDecimal priceIncludingTax;

    @ApiModelProperty("金额")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelProperty(value = "金额", index = 18)
    private BigDecimal amount;

    @ApiModelProperty("金额(本位币)")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("金额")
    @TableField(exist = false)
    @ExcelIgnore
    private String amountCN;

    @ApiModelProperty("金额(本位币)")
    @TableField(exist = false)
    @ExcelIgnore
    private String baseCurrencyAmountCN;

    @ApiModelProperty("税额")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelProperty(value = "税额", index = 19)
    private BigDecimal rowTaxAmount;

    @ApiModelProperty("税额(本位币)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("价税合计")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("价税合计(本位币)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("价税合计(转换为人民币写法)")
    @TableField(exist = false)
    @ExcelIgnore
    private String amountIncludingTaxCN;

    @ApiModelProperty("价税合计(本位币)(转换为人民币写法)")
    @TableField(exist = false)
    @ExcelIgnore
    private String baseCurrencyAmountIncludingTaxCN;

    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    @ExcelIgnore
    private String projectCode;
    @ApiModelProperty("明细上的交货期(天)")
    @TableField(exist = false)
    @ExcelIgnore
    private String detailDeliveryDay;



    @ApiModelProperty("需要转售数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal neededTurnToSaleQuantity;

    @ApiModelProperty("已经转售数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal alreadyTurnToSaleQuantity;

    @ApiModelProperty("占用转售数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal lockedTurnToSaleQuantity;

    @ApiModelProperty("要货日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime needDate;

    @ApiModelProperty("要货日期str")
    @TableField(exist = false)
    private String needDateStr;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String rowRemark;

    @ApiModelProperty("单据类别物料分组")
    @TableField(exist = false)
    private String materialGroupId;
    @TableField(exist = false)
    private String materialGroupName;
    @TableField(exist = false)
    private String parametric;

    @TableField(exist = false)
    private String lifeCycleIsNew;
    @ApiModelProperty("销售价目表")
    @TableField(exist = false)
    private String priceListId;
    @ApiModelProperty("销售价目表")
    @TableField(exist = false)
    private String priceListCode;
    @ApiModelProperty("销售价目表")
    @TableField(exist = false)
    private String priceListName;
    @ApiModelProperty("销售价目表")
    @TableField(exist = false)
    private String priceListLineNumber;
    @ApiModelProperty("物料申请id")
    @TableField(exist = false)
    private String materialApplyId;
}
