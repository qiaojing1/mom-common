package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 个人常用菜单
 * </p>
 *
 * @author qiao jing
 * @since 2024-01-19
 */
@Getter
@Setter
@TableName("sys_menu_user")
@ApiModel(value = "SysMenuUser对象", description = "个人常用菜单")
public class SysMenuUser extends BaseEntity {

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("人员id")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("菜单类型[0:web;1:小程序;2:工位机;3:app]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("菜单编码")
    @TableField(exist = false)
    private String code;

    @ApiModelProperty("菜单名称")
    @TableField(exist = false)
    private String name;

    @ApiModelProperty("菜单名称")
    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("菜单路径")
    @TableField(exist = false)
    private String pageName;

    @ApiModelProperty("菜单图标")
    @TableField(exist = false)
    private CommonFile iconPathFile;
}
