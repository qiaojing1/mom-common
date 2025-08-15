package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 分步调拨入库单表头
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-09-10
 */
@Getter
@Setter
@TableName("psi_step_transfer_in_order")
@ApiModel(value = "PsiStepTransferInOrder对象", description = "分步调拨入库单表头")
public class PsiStepTransferInOrder extends BaseEntity {

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
    private LocalDateTime orderTime;

    @ApiModelProperty("仓库部门ID")
    @TableField("store_org_id")
    private String storeOrgId;

    @ApiModelProperty("仓库部门名称")
    @TableField("store_org_name")
    private String storeOrgName;

    @ApiModelProperty("库管员ID")
    @TableField("store_user_id")
    private String storeUserId;

    @ApiModelProperty("库管员名称")
    @TableField("store_user_name")
    private String storeUserName;

    @ApiModelProperty("调拨方向 1: 发出 2: 退回")
    @TableField("transfer_direction")
    private String transferDirection;
    @ApiModelProperty("调拨方向 1: 发出 2: 退回")
    @TableField(exist = false)
    private String transferDirectionName;

    @ApiModelProperty("过账日期")
    @TableField("posting_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime postingTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("文件id")
    @TableField("enclosureIds")
    private String enclosureIds;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @ApiModelProperty("单据状态")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("开启关闭状态")
    @TableField("enable")
    private Integer enable;
    @ApiModelProperty("开启关闭状态")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("过账时间")
    @TableField("real_posting_time")
    private LocalDateTime realPostingTime;

    @ApiModelProperty("过账人")
    @TableField("real_posting_user")
    private String realPostingUser;

    @ApiModelProperty("过账人名称")
    @TableField("real_posting_user_name")
    private String realPostingUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("作废状态")
    @TableField("cancel_status")
    private String cancelStatus;
    @ApiModelProperty("作废状态")
    @TableField(exist = false)
    private String cancelStatusName;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderType;
    @ApiModelProperty("源单类型名称")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @TableField(exist = false)
    private List<PsiStepTransferInOrderMaterial> details;

    @TableField(exist = false)
    private Collection<CommonFile> enclosureFileList;
}
