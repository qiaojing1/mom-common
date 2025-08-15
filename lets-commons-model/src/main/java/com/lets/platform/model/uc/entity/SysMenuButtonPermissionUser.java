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
 * 菜单用户按钮权限
 * </p>
 *
 * @author FZY
 * @since 2023-05-06
 */
@Getter
@Setter
@TableName("sys_menu_button_permission_user")
@ApiModel(value = "SysMenuButtonPermissionUser对象", description = "菜单用户按钮权限")
public class SysMenuButtonPermissionUser extends BaseEntity {

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("按钮CODE")
    @TableField("code")
    private String code;

    @ApiModelProperty("is_show")
    @TableField("is_show")
    private Integer isShow;
}
