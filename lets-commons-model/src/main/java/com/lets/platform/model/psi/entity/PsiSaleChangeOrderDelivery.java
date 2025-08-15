package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.ChangeTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 销售订单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-11-23
 */
@Getter
@Setter
@TableName("psi_sale_change_order_delivery")
@ApiModel(value = "PsiSaleChangeOrderDelivery对象", description = "销售订单物料明细")
public class PsiSaleChangeOrderDelivery extends BaseEntity {

    @ApiModelProperty("原单据发货明细ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("变更方式[0:不可变更;1:修改;2:新增]")
    @TableField("change_type")
    private Integer changeType;

    @ApiModelProperty("变更方式名称")
    @TableField(exist = false)
    private String changeTypeName;

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

    @ApiModelProperty("物料编码编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料编码名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("特征属性名称")
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
    @TableField("before_plan_deliver_quantity")
    private BigDecimal beforePlanDeliverQuantity;

    @ApiModelProperty("计划发货数量")
    @TableField("plan_deliver_quantity")
    private BigDecimal planDeliverQuantity;

    @ApiModelProperty("已出货通知数量 ")
    @TableField("delivery_quantity")
    private BigDecimal deliveryQuantity;

    @ApiModelProperty("出货通知占用数量 ")
    @TableField("delivery_occupied_quantity")
    private BigDecimal deliveryOccupiedQuantity;

    public PsiSaleChangeOrderDelivery() {
    }

    public PsiSaleChangeOrderDelivery(PsiSaleOrderDelivery saleOrderDelivery) {
        if (saleOrderDelivery == null) {
            return;
        }
        this.sourceId = saleOrderDelivery.getId();
        this.changeType = ChangeTypeEnum.EDIT.getValue();
        this.changeTypeName = ChangeTypeEnum.EDIT.getName();
        this.lineNumber = saleOrderDelivery.getLineNumber();
        this.materialLineNumber = saleOrderDelivery.getMaterialLineNumber();
        this.materialId = saleOrderDelivery.getMaterialId();
        this.materialCode = saleOrderDelivery.getMaterialCode();
        this.materialName = saleOrderDelivery.getMaterialName();
        this.materialSpecs = saleOrderDelivery.getMaterialSpecs();
        this.materialCharacteristicNames = saleOrderDelivery.getMaterialCharacteristicNames();
        this.receiveContactUserId = saleOrderDelivery.getReceiveContactUserId();
        this.receiveContactUser = saleOrderDelivery.getReceiveContactUser();
        this.receiveContactPhoneNumber = saleOrderDelivery.getReceiveContactPhoneNumber();
        this.receiveCustomerContactAddress = saleOrderDelivery.getReceiveCustomerContactAddress();
        this.needDate = saleOrderDelivery.getNeedDate();
        this.advanceDay = saleOrderDelivery.getAdvanceDay();
        this.plannedDeliveryDate = saleOrderDelivery.getPlannedDeliveryDate();
        this.saleUnitId = saleOrderDelivery.getSaleUnitId();
        this.saleUnitName = saleOrderDelivery.getSaleUnitName();
        this.saleUnitAccuracy = saleOrderDelivery.getSaleUnitAccuracy();
        this.saleUnitRoundOffType = saleOrderDelivery.getSaleUnitRoundOffType();
        this.saleQuantity = saleOrderDelivery.getSaleQuantity();
        this.beforePlanDeliverQuantity = saleOrderDelivery.getPlanDeliverQuantity();
        this.planDeliverQuantity = saleOrderDelivery.getPlanDeliverQuantity();
        this.deliveryQuantity = saleOrderDelivery.getDeliveryQuantity();
        this.deliveryOccupiedQuantity = saleOrderDelivery.getDeliveryOccupiedQuantity();
    }
}
