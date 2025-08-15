package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 工作流管理表
 * </p>
 *
 * @author FZY
 * @since 2023-11-06
 */
@Getter
@Setter
@TableName("sys_workflow")
@ApiModel(value = "SysWorkflow对象", description = "工作流管理表")
public class SysWorkflow extends BaseEntity {

    private static final long serialVersionUID = -6140650399692136791L;

    @ApiModelProperty("流程类型[1:审批流程;2:业务流程]")
    @TableField("type")
    private String type;

    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("菜单名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("菜单编码")
    @TableField("workflow_menu_code")
    private String workflowMenuCode;

    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("业务编码")
    @TableField("business_key")
    private String businessKey;

    @TableField(exist = false)
    private String businessName;

    @ApiModelProperty("流程定义ID")
    @TableField("deployment_id")
    private String deploymentId;

    @ApiModelProperty("流程定义KEY")
    @TableField("deployment_key")
    private String deploymentKey;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("流程定义xml")
    @TableField(value = "xml", select = false)
    private String xml;

    @ApiModelProperty("是否可撤回[0:否;1:是]")
    @TableField("revocable")
    private Integer revocable;

    @TableField(exist = false)
    private String revocableName;

    @ApiModelProperty("是否可反审[0:否;1:是]")
    @TableField("reversible")
    private Integer reversible;

    @TableField(exist = false)
    private String reversibleName;

    @ApiModelProperty("是否可转交[0:否;1:是]")
    @TableField("transfer")
    private Integer transfer;

    @TableField(exist = false)
    private String transferName;

    @ApiModelProperty("状态[0:停用;1:启用]")
    @TableField("enable")
    private Integer enable;

    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("发布状态[0:未发布;1:已发布]")
    @TableField("deploy_status")
    private Integer deployStatus;

    @TableField(exist = false)
    private String deployStatusName;

    @ApiModelProperty("是否修改[0:否;1:是]")
    @TableField("edit_status")
    private Integer editStatus;

    @ApiModelProperty("结束节点是否不发消息[0:否;1:是]")
    @TableField("is_end_message")
    private Integer isEndMessage;

    @TableField(exist = false)
    private String editStatusName;

    @TableField(exist = false)
    private List<SysWorkflowForm> chosenFields;
}
