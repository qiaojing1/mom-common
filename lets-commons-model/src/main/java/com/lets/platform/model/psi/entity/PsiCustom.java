package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.CheckWayEnum;
import com.lets.platform.model.psi.enums.SettlementCycleEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 客户管理
 * @author DINGWEI
 * @since 2023-07-25
 */
@Getter
@Setter
@TableName("psi_custom")
@ApiModel(value = "PsiCustom对象", description = "客户管理")
public class PsiCustom extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;
    @ExcelIgnore
    @TableField(exist = false)
    private String sheetName;

    @ColumnWidth(20)
    @ExcelProperty(value = "客户编码", index = 0)
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ColumnWidth(50)
    @ExcelProperty(value = "客户名称", index = 1)
    @Length(min = 1, max = 100, message = "PsiCustom.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ColumnWidth(20)
    @ExcelProperty(value = "客户简称", index = 2)
    @Length(max = 20, message = "PsiCustom.simpleName", groups = {Save.class, Update.class})
    @ApiModelProperty("简称")
    @TableField("simple_name")
    private String simpleName;

    @ColumnWidth(20)
    @ExcelProperty(value = "助记码", index = 3)
    @Length(max = 20, message = "PsiCustom.mnemonicCode", groups = {Save.class, Update.class})
    @ApiModelProperty("助记码")
    @TableField("mnemonic_code")
    private String mnemonicCode;

    @ExcelIgnore
    @ApiModelProperty("分管部门")
    @TableField("manage_org_id")
    private String manageOrgId;
    @ColumnWidth(20)
    @ExcelProperty(value = "分管部门", index = 4)
    @TableField(exist = false)
    private String manageOrgName;

    @ExcelIgnore
    @ApiModelProperty("分管人员")
    @TableField("manage_user_id")
    private String manageUserId;
    @ColumnWidth(20)
    @ExcelProperty(value = "分管人员", index = 5)
    @TableField(exist = false)
    private String manageUserName;

    @ExcelIgnore
    @ApiModelProperty("客户分组(为null的是分组)")
    @TableField("group_id")
    private String groupId;
    @ColumnWidth(20)
    @ExcelProperty(value = "客户分组", index = 6)
    @TableField(exist = false)
    private String groupName;

    @ExcelIgnore
    @ApiModelProperty("客户类型")
    @TableField("customer_type")
    private String customerType;
    @ColumnWidth(20)
    @ExcelProperty(value = "客户类型", index = 7)
    @TableField(exist = false)
    private String customerTypeName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiCustom.isSettlement", groups = {Save.class, Update.class})
    @ApiModelProperty("是否结算客户[N否Y是]")
    @TableField("is_settlement")
    private String isSettlement;
    @ColumnWidth(25)
    @ExcelProperty(value = "是否结算客户", index = 8)
    @TableField(exist = false)
    private String isSettlementName;

    @ExcelIgnore
    @ApiModelProperty("结算客户")
    @TableField("settlement_custom_id")
    private String settlementCustomId;
    @ColumnWidth(20)
    @ExcelProperty(value = "结算客户", index = 9)
    @TableField(exist = false)
    private String settlementCustomName;

    @ExcelIgnore
    @ApiModelProperty("默认交易币种")
    @TableField("default_currency_id")
    private String defaultCurrencyId;
    @ColumnWidth(40)
    @ExcelProperty(value = "默认交易币种", index = 10)
    @TableField(exist = false)
    private String defaultCurrencyName;

    @ExcelIgnore
    @ApiModelProperty("默认收款条件")
    @TableField("default_payment_condition")
    private String defaultPaymentCondition;
    @ColumnWidth(40)
    @ExcelProperty(value = "默认收款条件", index = 11)
    @TableField("default_payment_condition_name")
    private String defaultPaymentConditionName;

    @ExcelIgnore
    @ApiModelProperty("默认结算方式")
    @TableField("default_settlement_way")
    private String defaultSettlementWay;
    @ColumnWidth(40)
    @ExcelProperty(value = "默认结算方式", index = 12)
    @TableField(exist = false)
    private String defaultSettlementWayName;

    @ExcelIgnore
    @ApiModelProperty("默认税种")
    @TableField("default_tax_id")
    private String defaultTaxId;
    @ColumnWidth(20)
    @ExcelProperty(value = "默认税种", index = 13)
    @TableField(exist = false)
    private String defaultTaxName;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("税率")
    private String taxRate;

    @ExcelIgnore
    @ApiModelProperty("单价含税[N否Y是]")
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiCustom.isPriceContainTax", groups = {Save.class, Update.class})
    @TableField("is_price_contain_tax")
    private String isPriceContainTax;
    @ColumnWidth(20)
    @ExcelProperty(value = "单价含税", index = 14)
    @TableField(exist = false)
    private String isPriceContainTaxName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiCustom.isCreditControl", groups = {Save.class, Update.class})
    @ApiModelProperty("信用控制[N否Y是]")
    @TableField("is_credit_control")
    private String isCreditControl;
    @ColumnWidth(20)
    @ExcelProperty(value = "信用控制", index = 15)
    @TableField(exist = false)
    private String isCreditControlName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = SettlementCycleEnum.class, message = "PsiCustom.defaultSettlementCycle", groups = {Save.class, Update.class})
    @ApiModelProperty("默认结算周期[1周、2月、3季度、4半年、5年]")
    @TableField("default_settlement_cycle")
    private String defaultSettlementCycle;
    @ColumnWidth(40)
    @ExcelProperty(value = "默认结算周期", index = 16)
    @TableField(exist = false)
    private String defaultSettlementCycleName;

    /**
     * @see com.lets.platform.model.base.enums.OrderStatusEnum
     */
    @ExcelIgnore
    @ApiModelProperty("单据状态[0创建,1暂存,2审核中,3已审核]")
    @TableField("status")
    private Integer status;
    @ExcelIgnore
    @TableField(exist = false)
    private String statusName;

    @ColumnWidth(20)
    @ExcelProperty(value = "法人代表", index = 17)
    @Pattern(regexp = GlobalConstant.CHINESE_LETTER_NUMBER_UNDERLINE_0_20, message = "PsiCustom.legalPerson", groups = {Save.class, Update.class})
    @ApiModelProperty("法人代表")
    @TableField("legal_person")
    private String legalPerson;

    @ColumnWidth(50)
    @Length(max = 50, message = "PsiCustom.bankOfDeposit", groups = {Save.class, Update.class})
    @ExcelProperty(value = "开户银行", index = 18)
    @ApiModelProperty("开户银行")
    @TableField("bank_of_deposit")
    private String bankOfDeposit;

    @ColumnWidth(50)
    @ExcelProperty(value = "账号", index = 19)
    @Length(max = 50, message = "PsiCustom.bankAccount", groups = {Save.class, Update.class})
    @ApiModelProperty("账号")
    @TableField("bank_account")
    private String bankAccount;

    @ExcelIgnore
    @ApiModelProperty("成立日期")
    @TableField("born_time")
    private LocalDateTime bornTime;
    @ColumnWidth(20)
    @ExcelProperty(value = "成立日期", index = 20)
    @TableField(exist = false)
    private String bornTimeFormat;

    @ExcelIgnore
    @ApiModelProperty("营业期限")
    @TableField("term_time")
    private LocalDateTime termTime;
    @ColumnWidth(20)
    @ExcelProperty(value = "营业期限", index = 21)
    @TableField(exist = false)
    private String termTimeFormat;

    @ColumnWidth(50)
    @ExcelProperty(value = "统一社会信用代码", index = 22)
    @Length(max = 20, message = "PsiCustom.creditCode", groups = {Save.class, Update.class})
    @ApiModelProperty("统一社会信用代码")
    @TableField("credit_code")
    private String creditCode;

    @ColumnWidth(20)
    @ExcelProperty(value = "联系人", index = 23)
    @Length(max = 20, message = "PsiCustom.contactPerson", groups = {Save.class, Update.class})
    @ApiModelProperty("联系人")
    @TableField("contact_person")
    private String contactPerson;

    @ColumnWidth(50)
    @ExcelProperty(value = "联系电话", index = 24)
    @Length(max = 50, message = "PsiCustom.contactPhone", groups = {Save.class, Update.class})
    @ApiModelProperty("联系电话")
    @TableField("contact_phone")
    private String contactPhone;

    @ColumnWidth(20)
    @ExcelProperty(value = "客户地址", index = 25)
    @Length(max = 50, message = "PsiCustom.address", groups = {Save.class, Update.class})
    @ApiModelProperty("客户地址")
    @TableField("address")
    private String address;

    @ColumnWidth(40)
    @ExcelProperty(value = "纳税人识别号", index = 26)
    @Length(max = 50, message = "PsiCustom.identifierNumber", groups = {Save.class, Update.class})
    @ApiModelProperty("纳税人识别号")
    @TableField("identifier_number")
    private String identifierNumber;

    @ColumnWidth(20)
    @ExcelProperty(value = "行业", index = 27)
    @Length(max = 20, message = "PsiCustom.industry", groups = {Save.class, Update.class})
    @ApiModelProperty("行业")
    @TableField("industry")
    private String industry;

    @ColumnWidth(50)
    @ExcelProperty(value = "公司网址", index = 28)
    @Length(max = 50, message = "PsiCustom.companyWebsite", groups = {Save.class, Update.class})
    @ApiModelProperty("公司网址")
    @TableField("company_website")
    private String companyWebsite;

    @ColumnWidth(20)
    @ExcelProperty(value = "电子邮箱", index = 29)
    @ApiModelProperty("电子邮箱")
    @TableField("email")
    private String email;

    @ColumnWidth(20)
    @ExcelProperty(value = "传真", index = 30)
    @Length(max = 20, message = "PsiCustom.fax", groups = {Save.class, Update.class})
    @ApiModelProperty("传真")
    @TableField("fax")
    private String fax;

    @ColumnWidth(10)
    @ExcelProperty(value = "邮编", index = 31)
    @Length(max = 20, message = "PsiCustom.zipCode", groups = {Save.class, Update.class})
    @ApiModelProperty("邮编")
    @TableField("zip_code")
    private String zipCode;

    @ExcelIgnore
    @ValidatedEnum(enumClass = CheckWayEnum.class, message = "PsiCustom.checkWay", groups = {Save.class, Update.class})
    @ApiModelProperty("检查方式[1检查,2仅记录]")
    @TableField("check_way")
    private String checkWay;
    @ColumnWidth(20)
    @ExcelProperty(value = "检查方式", index = 32)
    @TableField(exist = false)
    private String checkWayName;

    @ExcelIgnore
    @Min(value = 0, message = "PsiCustom.overRate", groups = {Save.class, Update.class})
    @Max(value = 100, message = "PsiCustom.overRate", groups = {Save.class, Update.class})
    @ApiModelProperty("可超出率")
    @TableField("over_rate")
    private Integer overRate;
    @ColumnWidth(20)
    @ExcelProperty(value = "可超出率", index = 33)
    @TableField(exist = false)
    private String overRateFormat;

    @ExcelIgnore
    @ApiModelProperty("有效时段")
    @TableField("effective_time")
    private LocalDateTime effectiveTime;
    @ColumnWidth(20)
    @ExcelProperty(value = "有效时段", index = 34)
    @TableField(exist = false)
    private String effectiveTimeFormat;

    @ExcelIgnore
    @ApiModelProperty("计算币种")
    @TableField("compute_currency")
    private String computeCurrency;
    @ColumnWidth(20)
    @ExcelProperty(value = "计算币种", index = 35)
    @TableField(exist = false)
    private String computeCurrencyName;

    @ExcelIgnore
    @ApiModelProperty("信用额度")
    @TableField("credit_limit")
    private BigDecimal creditLimit;
    @ColumnWidth(20)
    @ExcelProperty(value = "信用额度", index = 36)
    @TableField(exist = false)
    private String creditLimitFormat;

    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @Valid
    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiCustomContact> contactList;

    @ExcelIgnore
    @ApiModelProperty("审核时间")
    @TableField(value = "audit_time")
    private LocalDateTime auditTime;
    @ExcelIgnore
    @ApiModelProperty("审核人")
    @TableField(value = "audit_user")
    private String auditUser;
    @ExcelIgnore
    @ApiModelProperty("审核姓名")
    @TableField(value = "audit_user_name")
    private String auditUserName;
    @ExcelIgnore
    @ApiModelProperty("描述")
    @TableField(value = "description")
    private String description;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiCustom> children;

    @ExcelIgnore
    @TableField(exist = false)
    private List<String> idList;

    @ExcelIgnore
    @TableField(exist = false)
    private String defaultConcatUser;
    @ExcelIgnore
    @TableField(exist = false)
    private String defaultConcatPhoneNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private String defaultConcatAddress;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiCustomerFollowUp> psiCustomerFollowUpList;
    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiBusinessOpportunity> businessOpportunityList;
}
