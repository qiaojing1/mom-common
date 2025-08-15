/*
 * csy
 */

package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 收款单物料明细
 * </p>
 *
 * @author csy
 * @since 2025-05-19
 */
@Getter
@Setter
@TableName("psi_receipt_order_detail")
@ApiModel(value = "PsiReceiptOrderDetail对象", description = "收款单物料明细")
public class PsiReceiptOrderDetail extends BaseEntity {

    @ApiModelProperty("收款单id")
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

    @ApiModelProperty("结算方式")
    @TableField("payment_method_id")
    private String paymentMethodId;

    @ApiModelProperty("结算方式")
    @TableField("payment_method_name")
    private String paymentMethodName;

    @ApiModelProperty("结算方式业务类型")
    @TableField("payment_method_business_type")
    private String paymentMethodBusinessType;

    @ApiModelProperty("是否支付手续费")
    @TableField("payment_handling_fee")
    private String paymentHandlingFee;

    @ApiModelProperty("付款用途")
    @TableField("payment_usage")
    private String paymentUsage;

    @ApiModelProperty("应收总金额")
    @TableField("should_amount")
    private BigDecimal shouldAmount;

    @ApiModelProperty("应收总金额")
    @TableField("basic_should_amount")
    private BigDecimal basicShouldAmount;

    @ApiModelProperty("实收总金额")
    @TableField("real_amount")
    private BigDecimal realAmount;

    @ApiModelProperty("实收总金额")
    @TableField("basic_real_amount")
    private BigDecimal basicRealAmount;

    @ApiModelProperty("手续费")
    @TableField("fees")
    private BigDecimal fees;

    @ApiModelProperty("手续费")
    @TableField("basic_fees")
    private BigDecimal basicFees;

    @ApiModelProperty("资金帐户")
    @TableField("account_id")
    private String accountId;

    @ApiModelProperty("资金帐户")
    @TableField("account_name")
    private String accountName;

    @ApiModelProperty("源单主键")
    @TableField("sale_order_id")
    private String saleOrderId;

    @ApiModelProperty("源单单号")
    @TableField("sale_order_code")
    private String saleOrderCode;

    @ApiModelProperty("源单行号")
    @TableField("sale_line_number")
    private Long saleLineNumber;

    @ApiModelProperty("采购订单明细id")
    @TableField("sale_detail_id")
    private String saleDetailId;

    @ApiModelProperty("收款状态")
    @TableField("payment_status")
    private String paymentStatus;
    @TableField(exist = false)
    private String paymentStatusName;

    @ApiModelProperty("核销状态")
    @TableField("apply_status")
    private String applyStatus;
    @TableField(exist = false)
    private String applyStatusName;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;


    @TableField(exist = false)
    private List<PsiReceiptOrderDetailSource> sourceList;

    @ApiModelProperty("已核销")
    @TableField(exist = false)
    private BigDecimal appliedAmount;
    @TableField(exist = false)
    private BigDecimal basicAppliedAmount;

    @ApiModelProperty("未核销")
    @TableField(exist = false)
    private BigDecimal unapplyAmount;
    @TableField(exist = false)
    private BigDecimal basicUnapplyAmount;

    public BigDecimal getAppliedAmount() {
        if (appliedAmount == null) {
            appliedAmount = BigDecimal.ZERO;
        }
        return appliedAmount;
    }
}
