package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 菜单按钮权限(角色)
 * </p>
 *
 * @author FZY
 * @since 2023-05-05
 */
@Getter
@Setter
@TableName("sys_menu_button_permission_role")
@ApiModel(value = "SysMenuButtonPermissionRole对象", description = "菜单按钮权限(角色)")
public class SysMenuButtonPermissionRole extends BaseEntity {

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @TableField("role_id")
    private String roleId;

    @ApiModelProperty("按钮CODE")
    @TableField("code")
    private String code;
}
