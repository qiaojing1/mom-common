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
 * 零件检验尺寸库-物料明细
 * </p>
 *
 * @author csy
 * @since 2025-07-08
 */
@Getter
@Setter
@TableName("mes_parts_inspection_size_material")
@ApiModel(value = "MesPartsInspectionSizeMaterial对象", description = "零件检验尺寸库-物料明细")
public class MesPartsInspectionSizeMaterial extends BaseEntity {

    @ApiModelProperty("主表ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料图号")
    @TableField("material_draw_no")
    private String materialDrawNo;
}
