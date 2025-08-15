package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 检验方案配置扩展属性范围表
 * </p>
 *
 * @author FZY
 * @since 2025-06-03
 */
@Getter
@Setter
@TableName("inspect_plan_config_material_ext")
@ApiModel(value = "InspectPlanConfigMaterialExt对象", description = "检验方案配置扩展属性范围表")
public class InspectPlanConfigMaterialExt extends BaseEntity {

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("扩展属性ID")
    @TableField("ext_parent_id")
    private String extParentId;

    @ApiModelProperty("扩展属性编码")
    @TableField("ext_parent_code")
    private String extParentCode;

    @ApiModelProperty("值ID")
    @TableField("ext_id")
    private String extId;
}
