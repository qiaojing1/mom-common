/*
 * csy
 */

package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 * 资产校准
 * </p>
 *
 * @author csy
 * @since 2025-02-21
 */
@Getter
@Setter
@TableName("tpm_asset_calibrate_order")
@ApiModel(value = "TpmAssetCalibrateOrder对象", description = "资产校准")
public class TpmAssetCalibrateOrder extends BaseEntity {

    @ApiModelProperty("工单编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField("business_code")
    private String businessCode;
    @TableField(exist = false)
    private String businessName;

    @ApiModelProperty("借用部门")
    @TableField("calibrate_org_id")
    private String calibrateOrgId;

    @ApiModelProperty("借用部门")
    @TableField("calibrate_org_name")
    private String calibrateOrgName;

    @ApiModelProperty("借用人")
    @TableField("calibrate_user_id")
    private String calibrateUserId;

    @ApiModelProperty("借用人")
    @TableField("calibrate_user_name")
    private String calibrateUserName;

    @ApiModelProperty("资产类别")
    @TableField("asset_type")
    private String assetType;
    @TableField(exist = false)
    private String assetTypeName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;

    @ApiModelProperty("审核状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("审核人")
    @TableField("approve_user")
    private String approveUser;

    @ApiModelProperty("审核人")
    @TableField("approve_user_name")
    private String approveUserName;

    @ApiModelProperty("审核时间")
    @TableField("approve_time")
    private LocalDateTime approveTime;

    @TableField(exist = false)
    private List<TpmAssetCalibrateOrderDetail> details;


    @TableField(exist = false)
    private String detialId;

    @ApiModelProperty("工单编号")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("设备")
    @TableField(exist = false)
    private String deviceId;

    @ApiModelProperty("设备")
    @TableField(exist = false)
    private String deviceName;

    @ApiModelProperty("设备")
    @TableField(exist = false)
    private String deviceCode;

    @ApiModelProperty("设备")
    @TableField(exist = false)
    private String deviceAssetCode;

    @ApiModelProperty("资产型号")
    @TableField(exist = false)
    private String deviceModelId;

    @ApiModelProperty("资产型号")
    @TableField(exist = false)
    private String deviceModelName;

    @ApiModelProperty("校准机构")
    @TableField(exist = false)
    private String calibrateInstitution;

    @ApiModelProperty("校准日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime calibrateDate;

    @ApiModelProperty("校准有效期")
    @TableField(exist = false)
    private Integer calibratePeriod;

    @ApiModelProperty("证书编号")
    @TableField(exist = false)
    private String certCode;

    @ApiModelProperty("证书到期日")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime certExpiration;

    @TableField(exist = false)
    private String fileIds;

    @TableField(exist = false)
    private List<CommonFile> fileList;

    @TableField(exist = false)
    private String fileName;
}
