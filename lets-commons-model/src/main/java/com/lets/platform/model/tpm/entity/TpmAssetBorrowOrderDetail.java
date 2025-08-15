package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 资产借用明细
 * </p>
 *
 * @author csy
 * @since 2025-02-19
 */
@Getter
@Setter
@TableName("tpm_asset_borrow_order_detail")
@ApiModel(value = "TpmAssetBorrowOrderDetail对象", description = "资产借用明细")
public class TpmAssetBorrowOrderDetail extends BaseEntity {

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

    @ApiModelProperty("资产类型")
    @TableField("device_type_id")
    private String deviceTypeId;

    @ApiModelProperty("资产类型")
    @TableField("device_type_name")
    private String deviceTypeName;

    @ApiModelProperty("资产型号")
    @TableField("device_model_id")
    private String deviceModelId;

    @ApiModelProperty("资产型号")
    @TableField("device_model_name")
    private String deviceModelName;

    @ApiModelProperty("预计归还日期")
    @TableField("plan_loan_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime planLoanDate;

    @ApiModelProperty("归还状态")
    @TableField("loan_status")
    private String loanStatus;
    @TableField(exist = false)
    private String loanStatusName;

    @ApiModelProperty("归还日期")
    @TableField("loan_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime loanDate;
}
