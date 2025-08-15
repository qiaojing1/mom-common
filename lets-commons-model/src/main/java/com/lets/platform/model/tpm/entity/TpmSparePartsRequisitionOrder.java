package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.tpm.enums.ChangeReasonEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 备件领用单
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-21
 */
@Getter
@Setter
@TableName("tpm_spare_parts_requisition_order")
@ApiModel(value = "TpmSparePartsRequisitionOrder对象", description = "备件领用单")
public class TpmSparePartsRequisitionOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型ID")
    @TableField("business_id")
    private String businessId;

    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;

    @ApiModelProperty("源单id（维修工单or保养工单）")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("设备类型")
    @TableField(exist = false)
    private String deviceTypeId;

    @ApiModelProperty("设备类型")
    @TableField(exist = false)
    private String deviceTypeName;

    @ApiModelProperty("设备型号")
    @TableField(exist = false)
    private String deviceModelId;

    @ApiModelProperty("设备型号")
    @TableField(exist = false)
    private String deviceModelName;

    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("领用部门id")
    @TableField("requisition_org_id")
    private String requisitionOrgId;

    @ApiModelProperty("领用部门")
    @TableField("requisition_org_name")
    private String requisitionOrgName;

    @ApiModelProperty("领用人id")
    @TableField("requisition_user_id")
    private String requisitionUserId;

    @ApiModelProperty("领用部门")
    @TableField("requisition_user_name")
    private String requisitionUserName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @ApiModelProperty("单据状态")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("过账时间")
    @TableField("real_posting_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime realPostingTime;

    @ApiModelProperty("过账日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime realPostingDate;

    @ApiModelProperty("过账人")
    @TableField("real_posting_user")
    private String realPostingUser;

    @ApiModelProperty("过账人名称")
    @TableField("real_posting_user_name")
    private String realPostingUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    /**
     * 物料明细字段
     */
    @ApiModelProperty("备件领用单ID")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("备件领用单ID")
    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("物料ID")
    @TableField(exist = false)
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;

    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;

    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;

    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField(exist = false)
    private String materialCharacteristicNames;

    @ApiModelProperty("单位ID")
    @TableField(exist = false)
    private String unitId;

    @ApiModelProperty("单位精度")
    @TableField(exist = false)
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField(exist = false)
    private Integer unitRoundOffType;

    @ApiModelProperty("单位名称")
    @TableField(exist = false)
    private String unitName;

    @ApiModelProperty("领用数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal quantity;

    /**
     * @see ChangeReasonEnum
     */
    @ApiModelProperty("更换原因")
    @TableField(exist = false)
    private String changeReason;
    @ApiModelProperty("更换原因")
    @TableField(exist = false)
    private String changeReasonName;

    @ApiModelProperty("仓库ID")
    @TableField(exist = false)
    private String storeId;

    @ApiModelProperty("仓库名称")
    @TableField(exist = false)
    private String storeName;

    @ApiModelProperty("库区ID")
    @TableField(exist = false)
    private String areaId;

    @ApiModelProperty("库区名称")
    @TableField(exist = false)
    private String areaName;

    @ApiModelProperty("库位ID")
    @TableField(exist = false)
    private String positionId;

    @ApiModelProperty("库位名称")
    @TableField(exist = false)
    private String positionName;

    @ApiModelProperty("批号ID")
    @TableField(exist = false)
    private String batchNumberId;

    @ApiModelProperty("批号名称")
    @TableField(exist = false)
    private String batchNumberName;

    @ApiModelProperty("生产日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime productionDate;

    @ApiModelProperty("批号入库日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime batchStockInDate;

    @ApiModelProperty("保质期到期日")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expirationDate;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;

    @TableField(exist = false)
    private List<TpmSparePartsRequisitionOrderDetail> details;

    @TableField(exist = false)
    private BigDecimal thisAmount;
    @TableField(exist = false)
    private String isManual;
    @TableField(exist = false)
    private BigDecimal amountIncludingTax;

    @TableField("pricing_mode")
    private String pricingMode;

    @TableField(exist = false)
    private String pricingModeName;
}
