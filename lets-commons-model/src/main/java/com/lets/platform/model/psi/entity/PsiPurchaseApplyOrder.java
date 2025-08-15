package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 采购申请单
 * @author csy
 * @since 2023-11-23
 */
@Getter
@Setter
@TableName("psi_purchase_apply_order")
@ApiModel(value = "PsiPurchaseApplyOrder对象", description = "采购申请单")
public class PsiPurchaseApplyOrder extends BaseEntity {

    @ApiModelProperty("采购申请单编号")
    @TableField("CODE")
    @ExcelProperty("单据编号")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "[单据编号]长度 1~20，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("单据类别id")
    @TableField("order_category_id")
    @ExcelIgnore
    private String orderCategoryId;
    @ExcelIgnore
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    @ExcelProperty("单据类别")
    private String orderCategoryName;

    @ApiModelProperty("业务类型ID")
    @TableField("business_id")
    @ExcelIgnore
    private String businessId;
    @ExcelProperty("业务类型名称")
    @TableField(exist = false)
    private String businessName;

    @ApiModelProperty("申请日期")
    @TableField("apply_time")
    @ExcelIgnore
    private LocalDate applyTime;
    @ExcelProperty("申请日期")
    @TableField(exist = false)
    private String applyTimeStr;

    @ApiModelProperty("申请部门id")
    @TableField("apply_org_Id")
    @ExcelIgnore
    private String applyOrgId;
    @ApiModelProperty("申请部门名称")
    @TableField("apply_org_name")
    @ExcelProperty("申请部门")
    private String applyOrgName;

    @ApiModelProperty("申请人id")
    @TableField("apply_user_id")
    @ExcelIgnore
    private String applyUserId;
    @ApiModelProperty("申请人名称")
    @TableField("apply_user_name")
    @ExcelProperty("申请人")
    private String applyUserName;

    @ApiModelProperty("备注")
    @ExcelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("STATUS")
    @ExcelIgnore
    private Integer status;
    @TableField(exist = false)
    @ExcelIgnore
    private String statusName;

    @ApiModelProperty("启用状态")
    @TableField("ENABLE")
    @ExcelIgnore
    private Integer enable;
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    /**
     * @see com.lets.platform.model.base.enums.CloseStatusEnum
     */
    @ApiModelProperty("明细关闭状态[01]")
    @TableField(exist = false)
    @ExcelIgnore
    private Integer detailEnable;
    @ExcelIgnore
    @TableField(exist = false)
    private String detailEnableName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    @ExcelIgnore
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    @ExcelIgnore
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    @ExcelIgnore
    private String auditUserName;

    @TableField(exist = false)
    @ExcelIgnore
    @Valid
    private List<PsiPurchaseApplyOrderDetails> details;

    @TableField(exist = false)
    @ExcelIgnore
    private List<String> fileIds;

    /**
     * @see PurchaseApplyOrderSourceEnum
     */
    @ExcelIgnore
    @ApiModelProperty(value = "用来区分是前端还是服务内部投放的数据", hidden = true)
    @TableField(exist = false)
    private String orderSource;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    @ExcelIgnore
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    @ExcelIgnore
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    @ExcelIgnore
    private String disableUserName;

    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
}
