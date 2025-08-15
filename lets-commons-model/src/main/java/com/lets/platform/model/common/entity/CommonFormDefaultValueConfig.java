package com.lets.platform.model.common.entity;

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
 * 表单默认值配置
 * </p>
 *
 * @author FZY
 * @since 2023-08-04
 */
@Getter
@Setter
@TableName("common_form_default_value_config")
@ApiModel(value = "CommonFormDefaultValueConfig对象", description = "表单默认值配置")
public class CommonFormDefaultValueConfig extends BaseEntity {

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<CommonFormDefaultValueConfigDetail> details;
}
