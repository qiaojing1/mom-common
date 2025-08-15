package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 工作流审批意见配置表
 * </p>
 *
 * @author FZY
 * @since 2024-02-20
 */
@Getter
@Setter
@TableName("sys_workflow_comment_config")
@ApiModel(value = "SysWorkflowCommentConfig对象", description = "工作流审批意见配置表")
public class SysWorkflowCommentConfig extends BaseEntity {

    @ApiModelProperty("业务功能编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("业务功能名称")
    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("审批类型")
    @TableField("type")
    private String type;

    @ApiModelProperty("审批类型名称")
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("审批意见")
    @TableField("message")
    private String message;

    @ApiModelProperty("状态[0:停用;1:启用]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("状态[0:停用;1:启用]")
    @TableField(exist = false)
    private String enableName;
}
