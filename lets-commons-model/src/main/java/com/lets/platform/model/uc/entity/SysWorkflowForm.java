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
 * 工作流表单设计表
 * </p>
 *
 * @author FZY
 * @since 2023-11-08
 */
@Getter
@Setter
@TableName("sys_workflow_form")
@ApiModel(value = "SysWorkflowForm对象", description = "工作流表单设计表")
public class SysWorkflowForm extends BaseEntity {

    private static final long serialVersionUID = 1492010379745424661L;

    @ApiModelProperty("sys_workflow.id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("菜单编码")
    @TableField("workflow_menu_code")
    private String workflowMenuCode;

    @ApiModelProperty("tab页序号")
    @TableField("tab_index")
    private Integer tabIndex;

    @ApiModelProperty("序号")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("表别名")
    @TableField("table_alias")
    private String tableAlias;

    @ApiModelProperty("字段key")
    @TableField("field_key")
    private String fieldKey;

    @ApiModelProperty("字段名")
    @TableField("field_name")
    private String fieldName;

    @ApiModelProperty("查询条件字段key")
    @TableField("field_condition_key")
    private String fieldConditionKey;

    @ApiModelProperty("是否主表数据[0:否;1:是]")
    @TableField("is_main_table")
    private Integer isMainTable;

    @TableField("display_name")
    private String displayName;
}
