package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
@TableName("sys_menu_condition_scheme")
@ApiModel(value = "SysMenuConditionScheme对象", description = "菜单查询方案")
public class SysMenuConditionScheme extends BaseEntity {

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("是否默认方案")
    @TableField("is_default")
    private String isDefault;

    @ApiModelProperty("是否共享方案")
    @TableField("share")
    private String share;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("tab页序号")
    @TableField("tab_index")
    private Integer tabIndex;

    @TableField("create_from_share")
    public String createFromShare;

    @TableField(exist = false)
    private List<SysMenuConditionSchemeDetails> details;
}
