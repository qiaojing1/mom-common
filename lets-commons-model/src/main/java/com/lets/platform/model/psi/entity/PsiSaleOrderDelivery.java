package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * <p>
 * 销售订单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-08-09
 */
@Getter
@Setter
@TableName("psi_sale_order_delivery")
@ApiModel(value = "PsiSaleOrderDelivery对象", description = "销售订单物料明细")
public class PsiSaleOrderDelivery extends BaseEntity {

    @ApiModelProperty("销售订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料明细行号")
    @TableField("material_line_number")
    private Long materialLineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料编码名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("特征属性")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("收货联系人ID")
    @TableField("receive_contact_user_id")
    private String receiveContactUserId;

    @ApiModelProperty("收货联系人")
    @TableField("receive_contact_user")
    private String receiveContactUser;

    @ApiModelProperty("收货联系电话")
    @TableField("receive_contact_phone_number")
    private String receiveContactPhoneNumber;

    @ApiModelProperty("收货地址")
    @TableField("receive_customer_contact_address")
    private String receiveCustomerContactAddress;

    @ApiModelProperty("要货日期")
    @TableField("need_date")
    private LocalDateTime needDate;

    @ApiModelProperty("发货前置期")
    @TableField("advance_day")
    private Long advanceDay;

    @ApiModelProperty("计划发货日期")
    @TableField("planned_delivery_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime plannedDeliveryDate;

    @ApiModelProperty("销售单位ID")
    @TableField("sale_unit_id")
    private String saleUnitId;

    @ApiModelProperty("销售单位名称")
    @TableField("sale_unit_name")
    private String saleUnitName;

    @ApiModelProperty("销售单位精度")
    @TableField("sale_unit_accuracy")
    private Integer saleUnitAccuracy;

    @ApiModelProperty("销售单位舍入类型")
    @TableField("sale_unit_round_off_type")
    private String saleUnitRoundOffType;

    @ApiModelProperty("销售数量")
    @TableField("sale_quantity")
    private BigDecimal saleQuantity;

    @ApiModelProperty("计划发货数量")
    @TableField("plan_deliver_quantity")
    private BigDecimal planDeliverQuantity;

    @ApiModelProperty("已出库数量")
    @TableField("stock_out_quantity")
    private BigDecimal stockOutQuantity;

    @ApiModelProperty("出库占用数量")
    @TableField("stock_out_occupied_quantity")
    private BigDecimal stockOutOccupiedQuantity;

    @ApiModelProperty("剩余未出数量")
    @TableField("remain_stock_out_quantity")
    private BigDecimal remainStockOutQuantity;

    @ApiModelProperty("发票登记审核后出库数量")
    @TableField("after_invoice_stock_out_quantity")
    private BigDecimal afterInvoiceStockOutQuantity;

    @ApiModelProperty("发票登记审核后未出库数量")
    @TableField("after_invoice_remain_stock_out_quantity")
    private BigDecimal afterInvoiceRemainStockOutQuantity;

    @ApiModelProperty("已出货通知数量")
    @TableField("delivery_quantity")
    private BigDecimal deliveryQuantity;

    @ApiModelProperty("出货通知占用数量")
    @TableField("delivery_occupied_quantity")
    private BigDecimal deliveryOccupiedQuantity;

    @ApiModelProperty("剩余未通知数量")
    @TableField("remain_delivery_quantity")
    private BigDecimal remainDeliveryQuantity;

    @ApiModelProperty("退货数量")
    @TableField("return_quantity")
    private BigDecimal returnQuantity;

    @ApiModelProperty("真实使用出货通知流程通知的数量，仅在出货通知单审核完毕时更新该字段")
    @TableField("real_delivery_quantity")
    private BigDecimal realDeliveryQuantity;

    @ApiModelProperty("超发数量上限")
    @TableField(exist = false)
    private BigDecimal saleOverQuantity;

    @ApiModelProperty("超发数量上限百分比")
    @TableField(exist = false)
    private BigDecimal saleOverLimit;

    @ApiModelProperty("源单物料明细行id")
    @TableField(exist = false)
    private String sourceOrderDetailId;

    @TableField(exist = false)
    private BigDecimal afterReturnQuantity;

    @ApiModelProperty("是否由退货创建的明细[YN]")
    @TableField("is_return_send")
    private String isReturnSend;

    @TableField(exist = false)
    private Integer enable;

    @TableField(exist = false)
    private String reservationStoreId;
    @TableField(exist = false)
    private String reservationStoreName;
    @TableField(exist = false)
    private String reservationAreaId;
    @TableField(exist = false)
    private String reservationAreaName;
    @TableField(exist = false)
    private String reservationPositionId;
    @TableField(exist = false)
    private String reservationPositionName;
    @TableField(exist = false)
    private String reservationBatchNumber;
    @TableField(exist = false)
    private String reservationSpecific;

    public BigDecimal getAfterInvoiceStockOutQuantity() {
        return Optional.ofNullable(afterInvoiceStockOutQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getAfterInvoiceRemainStockOutQuantity() {
        return Optional.ofNullable(afterInvoiceRemainStockOutQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getSaleQuantity() {
        return Optional.ofNullable(saleQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getPlanDeliverQuantity() {
        return Optional.ofNullable(planDeliverQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getStockOutQuantity() {
        return Optional.ofNullable(stockOutQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getStockOutOccupiedQuantity() {
        return Optional.ofNullable(stockOutOccupiedQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getRemainStockOutQuantity() {
        return Optional.ofNullable(remainStockOutQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getDeliveryQuantity() {
        return Optional.ofNullable(deliveryQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getDeliveryOccupiedQuantity() {
        return Optional.ofNullable(deliveryOccupiedQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getRemainDeliveryQuantity() {
        return Optional.ofNullable(remainDeliveryQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getReturnQuantity() {
        return Optional.ofNullable(returnQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getSaleOverQuantity() {
        return Optional.ofNullable(saleOverQuantity).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getSaleOverLimit() {
        return Optional.ofNullable(saleOverLimit).orElse(BigDecimal.ZERO);
    }

    public BigDecimal getAfterReturnQuantity() {
        return Optional.ofNullable(afterReturnQuantity).orElse(BigDecimal.ZERO);
    }


}

