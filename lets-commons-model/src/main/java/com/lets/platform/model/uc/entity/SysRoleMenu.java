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
 * 角色菜单
 * </p>
 *
 * @author FZY
 * @since 2023-04-13
 */
@Getter
@Setter
@TableName("sys_role_menu")
@ApiModel(value = "SysRoleMenu对象", description = "角色菜单")
public class SysRoleMenu extends BaseEntity {

    @ApiModelProperty("角色ID")
    @TableField("role_id")
    private String roleId;

    @ApiModelProperty("菜单CODE")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单类型[0:web;1小程序;2:工位机;3:APP]")
    @TableField("menu_type")
    private Integer menuType;
}
