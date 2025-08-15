/*
 * csy
 */

/*
 * csy
 */

/*
 * csy
 */

/*
 * csy
 */

/*
 * csy
 */

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
 * 菜单查询方案-删除
 * </p>
 *
 * @author csy
 * @since 2025-03-10
 */
@Getter
@Setter
@TableName("sys_menu_condition_scheme_delete")
@ApiModel(value = "SysMenuConditionSchemeDelete对象", description = "菜单查询方案-删除")
public class SysMenuConditionSchemeDelete extends BaseEntity {

    @ApiModelProperty("菜单编码")
    @TableField("scheme_id")
    private String schemeId;
}
