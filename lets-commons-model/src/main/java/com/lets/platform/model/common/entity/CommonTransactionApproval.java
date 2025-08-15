package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import java.util.List;

import com.lets.platform.model.tpm.enums.CallRepairPriorityEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

/**
 * <p>
 * 事务审批单
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-03-24
 */
@Getter
@Setter
@TableName("common_transaction_approval")
@ApiModel(value = "CommonTransactionApproval对象", description = "事务审批单")
public class CommonTransactionApproval extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField(exist = false)
    private String businessName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;

    @ApiModelProperty("发起部门主键")
    @TableField("apply_org_id")
    private String applyOrgId;

    @ApiModelProperty("发起部门名称")
    @TableField("apply_org_name")
    private String applyOrgName;

    @ApiModelProperty("发起人主键")
    @TableField("apply_user_id")
    private String applyUserId;

    @ApiModelProperty("发起人名称")
    @TableField("apply_user_name")
    private String applyUserName;

    @ApiModelProperty("事务类型用户数据字典id")
    @TableField("transaction_dict_id")
    private String transactionDictId;

    @ApiModelProperty("事务类型用户数据字典code")
    @TableField("transaction_dict_code")
    private String transactionDictCode;

    @ApiModelProperty("事务类型用户数据字典name")
    @TableField("transaction_dict_name")
    private String transactionDictName;

    /**
     * @see CallRepairPriorityEnum
     */
    @ApiModelProperty("事务优先级 3:普通 2：较高 1：最高")
    @TableField("transaction_priority")
    private Integer transactionPriority;

    @ApiModelProperty("事务优先级 3:普通 2：较高 1：最高")
    @TableField(exist = false)
    private String transactionPriorityName;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("事务内容")
    @TableField("transaction_content")
    private String transactionContent;

    @ApiModelProperty("是否关闭[0关闭1开启]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("是否关闭[0关闭1开启]")
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

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;
}
