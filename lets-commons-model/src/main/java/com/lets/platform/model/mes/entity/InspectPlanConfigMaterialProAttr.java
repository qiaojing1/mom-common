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
 * 检验方案配置特征属性表
 * </p>
 *
 * @author FZY
 * @since 2024-01-06
 */
@Getter
@Setter
@TableName("inspect_plan_config_material_pro_attr")
@ApiModel(value = "InspectPlanConfigMaterialProAttr对象", description = "检验方案配置特征属性表")
public class InspectPlanConfigMaterialProAttr extends BaseEntity {

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("特征属性ID")
    @TableField("user_dict_id")
    private String userDictId;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;
}
