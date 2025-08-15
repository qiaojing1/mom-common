package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.time.LocalDateTime;
import java.util.List;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 资产校准明细
 * </p>
 *
 * @author csy
 * @since 2025-02-21
 */
@Getter
@Setter
@TableName("tpm_asset_calibrate_order_detail")
@ApiModel(value = "TpmAssetCalibrateOrderDetail对象", description = "资产校准明细")
public class TpmAssetCalibrateOrderDetail extends BaseEntity {

    @ApiModelProperty("工单编号")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("设备")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("设备")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备")
    @TableField("device_asset_code")
    private String deviceAssetCode;

    @ApiModelProperty("资产型号")
    @TableField("device_model_id")
    private String deviceModelId;

    @ApiModelProperty("资产型号")
    @TableField("device_model_name")
    private String deviceModelName;

    @ApiModelProperty("校准机构")
    @TableField("calibrate_institution")
    private String calibrateInstitution;

    @ApiModelProperty("校准日期")
    @TableField("calibrate_date")
    private LocalDateTime calibrateDate;

    @ApiModelProperty("校准有效期")
    @TableField("calibrate_period")
    private Integer calibratePeriod;

    @ApiModelProperty("证书编号")
    @TableField("cert_code")
    private String certCode;

    @ApiModelProperty("证书到期日")
    @TableField("cert_expiration")
    private LocalDateTime certExpiration;

    @TableField(exist = false)
    private List<CommonFile> fileList;

    @TableField(exist = false)
    private String fileName;

    @TableField("file_ids")
    private String fileIds;
}
