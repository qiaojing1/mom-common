package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.lets.platform.model.tpm.enums.DisposalWayEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 资产处置单
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-02-12
 */
@Getter
@Setter
@TableName("tpm_asset_disposal")
@ApiModel(value = "TpmAssetDisposal对象", description = "资产处置单")
public class TpmAssetDisposal extends BaseEntity {

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

    /**
     * @see com.lets.platform.model.psi.enums.MaterialAssetTypeEnum
     */
    @ApiModelProperty("资产类别 1:机器设备 2:仪器 3:容器 4:运输工具 5:固定资产")
    @TableField("asset_type")
    private String assetType;
    @TableField(exist = false)
    @ApiModelProperty("资产类别 1:机器设备 2:仪器 3:容器 4:运输工具 5:固定资产")
    private String assetTypeName;

    /**
     * @see DisposalWayEnum
     */
    @ApiModelProperty("处置方式 1:报废 2:调拨 3:出售")
    @TableField("disposal_way")
    private String disposalWay;
    @ApiModelProperty("处置方式 1:报废 2:调拨 3:出售")
    @TableField(exist = false)
    private String disposalWayName;

    @ApiModelProperty("调出车间id")
    @TableField("transfer_out_unit_id")
    private String transferOutUnitId;

    @ApiModelProperty("调出车间名称")
    @TableField("transfer_out_unit_name")
    private String transferOutUnitName;

    @ApiModelProperty("调入车间id")
    @TableField("transfer_in_unit_id")
    private String transferInUnitId;

    @ApiModelProperty("调入车间名称")
    @TableField("transfer_in_unit_name")
    private String transferInUnitName;

    @ApiModelProperty("处置原因")
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    /**
     * 明细字段
     */
    @ApiModelProperty("资产处置单id")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("资产处置单明细id")
    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("设备id")
    @TableField(exist = false)
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField(exist = false)
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField(exist = false)
    private String deviceName;

    @ApiModelProperty("资产编码")
    @TableField(exist = false)
    private String assetCode;

    @ApiModelProperty("设备类型id")
    @TableField(exist = false)
    private String deviceTypeId;

    @ApiModelProperty("设备类型名称")
    @TableField(exist = false)
    private String deviceTypeName;

    @ApiModelProperty("设备型号id")
    @TableField(exist = false)
    private String deviceModelId;

    @ApiModelProperty("设备型号名称")
    @TableField(exist = false)
    private String deviceModelName;

    @ApiModelProperty("生产单元id")
    @TableField(exist = false)
    private String productUnitId;

    @ApiModelProperty("生产单元名称")
    @TableField(exist = false)
    private String productUnitName;

    @ApiModelProperty("资产净值")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal netAssetValue;

    @ApiModelProperty("累计折旧额")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal accumulatedDepreciation;

    @ApiModelProperty("残值额")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal residualAmount;

    @ApiModelProperty("明细备注")
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("明细列表")
    @TableField(exist = false)
    private List<TpmAssetDisposalDetail> details;

    public BigDecimal accumulatedDepreciationNN(Integer acc, Integer roundOffType) {
        if (Objects.nonNull(accumulatedDepreciation)) {
            return accumulatedDepreciation.setScale(acc, roundOffType);
        }
        return BigDecimal.ZERO;
    }
    public BigDecimal netAssetValueNN(Integer acc, Integer roundOffType) {
        if (Objects.nonNull(netAssetValue)) {
            return netAssetValue.setScale(acc, roundOffType);
        }
        return BigDecimal.ZERO;
    }
}
