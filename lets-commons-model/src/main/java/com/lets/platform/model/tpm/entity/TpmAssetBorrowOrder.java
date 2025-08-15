package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 资产借用
 * </p>
 *
 * @author csy
 * @since 2025-02-19
 */
@Getter
@Setter
@TableName("tpm_asset_borrow_order")
@ApiModel(value = "TpmAssetBorrowOrder对象", description = "资产借用")
public class TpmAssetBorrowOrder extends BaseEntity {

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
    @TableField("org_id")
    private String orgId;

    @ApiModelProperty("借用部门")
    @TableField("org_name")
    private String orgName;

    @ApiModelProperty("借用人")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("借用人")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("借用原因")
    @TableField("reason")
    private String reason;

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
    private List<TpmAssetBorrowOrderDetail> details;


    @TableField(exist = false)
    private String orderId;
    @TableField(exist = false)
    private String detailId;
    @TableField(exist = false)
    private String deviceId;
    @TableField(exist = false)
    private String deviceName;
    @TableField(exist = false)
    private String deviceCode;
    @TableField(exist = false)
    private String deviceAssetCode;
    @TableField(exist = false)
    private String deviceTypeId;
    @TableField(exist = false)
    private String deviceTypeName;
    @TableField(exist = false)
    private String deviceModelId;
    @TableField(exist = false)
    private String deviceModelName;
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime planLoanDate;
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime loanDate;
    @TableField(exist = false)
    private String loanStatus;
    @TableField(exist = false)
    private String loanStatusName;
}
