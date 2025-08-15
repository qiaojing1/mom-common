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
 * 菜单查询方案
 * </p>
 *
 * @author FZY
 * @since 2023-05-04
 */
@Getter
@Setter
@TableName("sys_menu_condition_scheme_details")
@ApiModel(value = "SysMenuConditionSchemeDetails对象", description = "菜单查询方案")
public class SysMenuConditionSchemeDetails extends BaseEntity {

    @ApiModelProperty("展示字段名")
    @TableField(exist = false)
    private String fieldName;

    @ApiModelProperty("条件字段")
    @TableField(exist = false)
    private String conditionKey;

    @ApiModelProperty("方案ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("表别名")
    @TableField("table_alias")
    private String tableAlias;

    @ApiModelProperty("字段key")
    @TableField("field_key")
    private String fieldKey;

    @ApiModelProperty("查询字段key")
    @TableField(exist = false)
    private SysMenuFieldPermission field;

    @ApiModelProperty("查询条件值")
    @TableField("condition_value")
    private String conditionValue;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("可否排序")
    @TableField("sort_able")
    private Integer sortAble;

    @ApiModelProperty("实例入参数")
    @TableField("props")
    private String props;

    @TableField(exist = false)
    private String menuCode;

    @TableField(exist = false)
    private Integer tabIndex;
}
