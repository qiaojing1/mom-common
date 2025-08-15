package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.MaterialTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * 协同送货单-明细
 * @author DING WEI
 * @since 2025-04-02
 */
@Getter
@Setter
@TableName("psi_cooperate_deliver_order_detail")
@ApiModel(value = "PsiCooperateDeliverOrderDetail对象", description = "协同送货单-明细")
public class PsiCooperateDeliverOrderDetail extends BaseEntity {

    @ApiModelProperty("协同送货订单")
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

    @ApiModelProperty("物料特征属性名称")
    @TableField("material_specific")
    private String materialSpecific;

    /**
     * @see MaterialTypeEnum
     */
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;

    @ApiModelProperty("采购单位")
    @TableField("purchase_unit_id")
    private String purchaseUnitId;
    @ApiModelProperty("采购单位编码")
    @TableField("purchase_unit_code")
    private String purchaseUnitCode;
    @ApiModelProperty("采购单位名称")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;
    @ApiModelProperty("采购单位精度")
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;
    @ApiModelProperty("采购单位舍入类型")
    @TableField("purchase_unit_round_off_type")
    private Integer purchaseUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("采购数量")
    @TableField("purchase_number")
    private BigDecimal purchaseNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("送货数量")
    @TableField("deliver_number")
    private BigDecimal deliverNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("送货日期")
    @TableField("demand_date")
    private LocalDate demandDate;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String detailRemark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;

    @ApiModelProperty("源单id")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("源单明细id")
    @TableField("source_detail_id")
    private String sourceDetailId;
    @ApiModelProperty("源单行号")
    @TableField("source_detail_line_number")
    private Long sourceDetailLineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已送货数量")
    @TableField(exist = false)
    private BigDecimal alreadyDeliverNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可送货数量")
    @TableField(exist = false)
    private BigDecimal canDeliverNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已收货数量")
    @TableField(exist = false)
    private BigDecimal alreadyDeliveryNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可收货数量")
    @TableField(exist = false)
    private BigDecimal canDeliveryNumber;

    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    private List<PsiCooperateDeliverOrderDetailSpecific> detailSpecifics;
}
