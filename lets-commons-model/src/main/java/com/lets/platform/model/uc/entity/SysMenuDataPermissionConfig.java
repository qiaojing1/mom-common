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
 * 角色-菜单数据权限配置
 * </p>
 *
 * @author FZY
 * @since 2023-05-11
 */
@Getter
@Setter
@TableName("sys_menu_data_permission_config")
@ApiModel(value = "SysMenuDataPermissionConfig对象", description = "角色-菜单数据权限配置")
public class SysMenuDataPermissionConfig extends BaseEntity {

    @ApiModelProperty("角色主键")
    @TableField("role_id")
    private String roleId;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("tab页序号")
    @TableField("tab_index")
    private Integer tabIndex;

    @ApiModelProperty("表别名")
    @TableField("table_alias")
    private String tableAlias;

    @ApiModelProperty("字段KEY")
    @TableField("field_key")
    private String fieldKey;

    @ApiModelProperty("字段名")
    @TableField(exist = false)
    private String displayName;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("查询字段KEY")
    @TableField(exist = false)
    private String conditionKey;

    @ApiModelProperty("条件(like、eq、ne等)")
    @TableField("condition_expression")
    private String conditionExpression;

    @ApiModelProperty("值")
    @TableField("condition_value")
    private String conditionValue;

    @ApiModelProperty("分组标识,每组之间or")
    @TableField("group_index")
    private Integer groupIndex;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String conditionHandler;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String relationField;

    public void fill(SysMenuFieldPermission field) {
        this.conditionKey = field.getFieldConditionKey();
        this.conditionHandler = field.getConditionHandler();
        this.relationField = field.getRelationField();
        this.displayName = field.getDisplayName();
    }
}
