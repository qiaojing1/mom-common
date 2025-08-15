package com.lets.platform.model.mes.entity;

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
 * 检验方案配置物料分组范围表
 * </p>
 *
 * @author FZY
 * @since 2024-01-06
 */
@Getter
@Setter
@TableName("inspect_plan_config_material_group")
@ApiModel(value = "InspectPlanConfigMaterialGroup对象", description = "检验方案配置物料分组范围表")
public class InspectPlanConfigMaterialGroup extends BaseEntity {

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty("物料分组编码")
    @TableField("material_group_code")
    private String materialGroupCode;

    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;
}
