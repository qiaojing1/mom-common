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
 * 个人列表菜单视图(type = 1: 列表 type=2: 卡片)
 * </p>
 *
 * @author qiao jing
 * @since 2024-06-17
 */
@Getter
@Setter
@TableName("sys_menu_user_view")
@ApiModel(value = "SysMenuUserView对象", description = "个人列表菜单视图")
public class SysMenuUserView extends BaseEntity {

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("人员id")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("视图类型[type = 1: 列表 type=2: 卡片]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("菜单名称")
    @TableField(exist = false)
    private String menuName;

}
