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
 * 角色-菜单查询条件字段权限
 * </p>
 *
 * @author DING WEI
 * @since 2023-04-24
 */
@Getter
@Setter
@TableName("sys_menu_field_permission_role")
@ApiModel(value = "SysMenuFieldPermissionRole对象", description = "角色-菜单查询条件字段权限")
public class SysMenuFieldPermissionRole extends BaseEntity {

    @ApiModelProperty("角色主键")
    @TableField("role_id")
    private String roleId;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("类型[0:列表页字段,1:表单字段]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("tab页序号")
    @TableField("tab_index")
    private Integer tabIndex;

    @ApiModelProperty("表别名")
    @TableField("table_alias")
    private String tableAlias;

    @ApiModelProperty("字段key")
    @TableField("field_key")
    private String fieldKey;

    @TableField("field_name")
    private String fieldName;

    @ApiModelProperty("字段名")
    @TableField(exist = false)
    private String displayName;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("is_show")
    @TableField("is_show")
    private Integer isShow;

    @ApiModelProperty("是否固定列(0:否;1:是)")
    @TableField("fixed")
    private String fixed;

    @ApiModelProperty("对齐方式")
    @TableField("align")
    private String align;

    @ApiModelProperty("是否汇总(0:否;1:是)")
    @TableField("sum")
    private Integer sum;

    @ApiModelProperty("是否平均值(0:否;1:是)")
    @TableField("avg")
    private Integer avg;

    @ApiModelProperty("列表字段宽度")
    @TableField("table_width")
    private Integer tableWidth;
}
