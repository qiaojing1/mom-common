package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 单据类别业务类型配置表
 * </p>
 *
 * @author FZY
 * @since 2024-06-20
 */
@Getter
@Setter
@TableName("psi_business_config")
@ApiModel(value = "PsiBusinessConfig对象", description = "单据类别业务类型配置表")
public class PsiBusinessConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("源菜单编码")
    @TableField("source_menu_code")
    private String sourceMenuCode;

    @ApiModelProperty("源业务类型编码")
    @TableField("source_business_code")
    private String sourceBusinessCode;

    @ApiModelProperty("目标菜单编码")
    @TableField("target_menu_code")
    private String targetMenuCode;

    @ApiModelProperty("目标业务类型编码")
    @TableField("target_business_code")
    private String targetBusinessCode;

    @ApiModelProperty("排序")
    @TableField("`sort`")
    private Integer sort;
}
