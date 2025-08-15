package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 采购询价单
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-03-18
 */
@Getter
@Setter
@TableName("psi_purchase_rfq")
@ApiModel(value = "PsiPurchaseRfq对象", description = "采购询价单")
public class PsiPurchaseRfq extends BaseEntity {

    @ApiModelProperty("采购询价单编号")
    @TableField("CODE")
    private String code;

    @ApiModelProperty("单据类别id")
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

    @ApiModelProperty("业务类型ID")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("采购部门id")
    @TableField("purchase_org_Id")
    private String purchaseOrgId;

    @ApiModelProperty("采购部门名称")
    @TableField("purchase_org_name")
    private String purchaseOrgName;

    @ApiModelProperty("采购人id")
    @TableField("purchase_user_id")
    private String purchaseUserId;

    @ApiModelProperty("采购人名称")
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate orderTime;

    @ApiModelProperty("报价截止日期")
    @TableField("quote_deadline")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate quoteDeadline;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("STATUS")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("启用状态")
    @TableField("ENABLE")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

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

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭用户")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭用户名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @TableField(exist = false)
    @ApiModelProperty("物料明细")
    private List<PsiPurchaseRfqDetails> details;

    @TableField(exist = false)
    @ApiModelProperty("供应商明细")
    private List<PsiPurchaseRfqSuppliers> suppliers;
}
