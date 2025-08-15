package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 资产处置单明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-02-12
 */
@Getter
@Setter
@TableName("tpm_asset_disposal_detail")
@ApiModel(value = "TpmAssetDisposalDetail对象", description = "资产处置单明细")
public class TpmAssetDisposalDetail extends BaseEntity {

    @ApiModelProperty("资产处置单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("资产编码")
    @TableField("asset_code")
    private String assetCode;

    @ApiModelProperty("设备类型id")
    @TableField("device_type_id")
    private String deviceTypeId;

    @ApiModelProperty("设备类型名称")
    @TableField("device_type_name")
    private String deviceTypeName;

    @ApiModelProperty("设备型号id")
    @TableField("device_model_id")
    private String deviceModelId;

    @ApiModelProperty("设备型号名称")
    @TableField("device_model_name")
    private String deviceModelName;

    @ApiModelProperty("生产单元id")
    @TableField("product_unit_id")
    private String productUnitId;

    @ApiModelProperty("生产单元名称")
    @TableField("product_unit_name")
    private String productUnitName;

    @ApiModelProperty("资产净值")
    @TableField("net_asset_value")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal netAssetValue;

    @ApiModelProperty("累计折旧额")
    @TableField("accumulated_depreciation")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal accumulatedDepreciation;

    @ApiModelProperty("残值额")
    @TableField("residual_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal residualAmount;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("资产处置单id")
    @TableField(exist = false)
    private Long lineNumber;

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
