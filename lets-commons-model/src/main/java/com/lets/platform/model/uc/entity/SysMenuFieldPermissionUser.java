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
 * 菜单查询条件字段权限
 * </p>
 *
 * @author FZY
 * @since 2023-05-05
 */
@Getter
@Setter
@TableName("sys_menu_field_permission_user")
@ApiModel(value = "SysMenuFieldPermissionUser对象", description = "菜单查询条件字段权限")
public class SysMenuFieldPermissionUser extends BaseEntity {

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("is_show")
    @TableField("is_show")
    private Integer isShow;

    @ApiModelProperty("表别名")
    @TableField("table_alias")
    private String tableAlias;

    @ApiModelProperty("字段key")
    @TableField("field_key")
    private String fieldKey;

    @ApiModelProperty("字段名")
    @TableField("field_name")
    private String fieldName;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("tab页序号")
    @TableField("tab_index")
    private Integer tabIndex;

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
