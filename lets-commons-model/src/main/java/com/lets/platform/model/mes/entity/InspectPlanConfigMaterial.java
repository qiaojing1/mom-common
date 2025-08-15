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

import java.util.Objects;

/**
 * <p>
 * 检验方案配置物料范围表
 * </p>
 *
 * @author FZY
 * @since 2024-01-06
 */
@Getter
@Setter
@TableName("inspect_plan_config_material")
@ApiModel(value = "InspectPlanConfigMaterial对象", description = "检验方案配置物料范围表")
public class InspectPlanConfigMaterial extends BaseEntity {

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InspectPlanConfigMaterial that = (InspectPlanConfigMaterial) o;
        return Objects.equals(parentId, that.parentId) && Objects.equals(materialId, that.materialId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parentId, materialId);
    }
}
