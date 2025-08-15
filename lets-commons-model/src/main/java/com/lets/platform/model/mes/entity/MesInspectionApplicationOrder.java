package com.lets.platform.model.mes.entity;

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

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 检验申请单表
 * </p>
 *
 * @author FZY
 * @since 2024-01-18
 */
@Getter
@Setter
@TableName("mes_inspection_application_order")
@ApiModel(value = "MesInspectionApplicationOrder对象", description = "检验申请单表")
public class MesInspectionApplicationOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    @NotBlank(message = "[单据编号]不能为空")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[单据编号]长度 1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("单据类别名称")
    @TableField(exist = false)
    private String businessCode;

    @ApiModelProperty("申请日期")
    @TableField("apply_time")
    private LocalDateTime applyTime;

    @ApiModelProperty("申请部门id")
    @TableField("apply_org_id")
    private String applyOrgId;

    @ApiModelProperty("申请部门名称")
    @TableField("apply_org_name")
    private String applyOrgName;

    @ApiModelProperty("申请人id")
    @TableField("apply_user_id")
    private String applyUserId;

    @ApiModelProperty("申请人名称")
    @TableField("apply_user_name")
    private String applyUserName;

    @ApiModelProperty("TS编码")
    @TableField("ts_code")
    private String tsCode;

    @ApiModelProperty("优先级")
    @TableField("inspect_priority")
    private String inspectPriority;
    @TableField(exist = false)
    private String inspectPriorityName;

    @ApiModelProperty("检验地址")
    @TableField("inspect_address")
    private String inspectAddress;

    @ApiModelProperty("检验日期")
    @TableField("inspect_date")
    private LocalDateTime inspectDate;

    @ApiModelProperty("数据状态[0:创建,1:暂存,2:审核中,3:已审核]")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人员")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人员名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("文件ID")
    @TableField(exist = false)
    private List<String> fileIds;

    @TableField(exist = false)
    private List<MesInspectionApplicationOrderDetail> detailList;
    @ApiModelProperty("扩展字段1")
    @TableField(exist = false)
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField(exist = false)
    private String extField2;

    @ApiModelProperty("扩展字段3")
    @TableField(exist = false)
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField(exist = false)
    private String extField4;

    @ApiModelProperty("扩展字段5")
    @TableField(exist = false)
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField(exist = false)
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField(exist = false)
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField(exist = false)
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField(exist = false)
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField(exist = false)
    private String extField10;

}
