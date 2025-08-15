package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 销售发票登记
 * </p>
 *
 * @author FZY
 * @since 2023-12-06
 */
@Getter
@Setter
@TableName("psi_sale_invoice_register")
@ApiModel(value = "PsiSaleInvoiceRegister对象", description = "销售发票登记")
public class PsiSaleInvoiceRegister extends BaseEntity {

    @ApiModelProperty("登记编号")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[登记编号]长度 1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("发票类型")
    @TableField("type")
    private String type;

    @ApiModelProperty("发票类型")
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("登记日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("开票客户ID")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("开票客户名称")
    @TableField("order_customer_name")
    private String orderCustomerName;

    @ApiModelProperty("发票号码")
    @TableField("invoice_number")
    @NotBlank(message = "[发票号码]不能为空")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_30, message = "[发票号码]长度 1~30，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String invoiceNumber;

    @ApiModelProperty("发票代码")
    @TableField("invoice_code")
    private String invoiceCode;

    @ApiModelProperty("开票日期")
    @TableField("invoice_time")
    private LocalDateTime invoiceTime;

    @ApiModelProperty("结算币种ID")
    @TableField("currency_id")
    private String currencyId;

    @ApiModelProperty("结算币种名称")
    @TableField("currency_name")
    private String currencyName;

    @ApiModelProperty("结算币种符号")
    @TableField(exist = false)
    private String currencySymbol;

    @ApiModelProperty("结算币种金额精度")
    @TableField("currency_amount_accuracy")
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("结算币种单价精度")
    @TableField("currency_price_accuracy")
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("结算币种舍入类型")
    @TableField("currency_round_off_type")
    private Integer currencyRoundOffType;

    @ApiModelProperty("本位币ID")
    @TableField("base_currency_id")
    private String baseCurrencyId;

    @ApiModelProperty("本位币名称")
    @TableField("base_currency_name")
    private String baseCurrencyName;

    @ApiModelProperty("本位币符号")
    @TableField(exist = false)
    private String baseCurrencySymbol;

    @ApiModelProperty("本位币金额精度")
    @TableField("base_currency_amount_accuracy")
    private Integer baseCurrencyAmountAccuracy;

    @ApiModelProperty("本位币单价精度")
    @TableField("base_currency_price_accuracy")
    private Integer baseCurrencyPriceAccuracy;

    @ApiModelProperty("本位币舍入类型")
    @TableField("base_currency_round_off_type")
    private Integer baseCurrencyRoundOffType;

    @ApiModelProperty("价税合计(本位币)")
    @TableField("total_base_currency_amount_including_tax")
    private BigDecimal totalBaseCurrencyAmountIncludingTax;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("文件ID")
    @TableField(exist = false)
    private List<String> fileIds;

    @ApiModelProperty("物料明细")
    @TableField(exist = false)
    private List<PsiSaleInvoiceRegisterMaterial> saleInvoiceRegisterMaterialList;

}
