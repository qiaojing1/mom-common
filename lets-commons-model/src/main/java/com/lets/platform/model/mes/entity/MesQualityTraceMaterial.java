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
 * 质量追溯方案适用物料范围
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-05-30
 */
@Getter
@Setter
@TableName("mes_quality_trace_material")
@ApiModel(value = "MesQualityTraceMaterial对象", description = "质量追溯方案适用物料范围")
public class MesQualityTraceMaterial extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料idor物料分组组id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("物料编码or物料分组组编码")
    @TableField("target_code")
    private String targetCode;

    @ApiModelProperty("物料名称or物料分组组名称")
    @TableField("target_name")
    private String targetName;

    @ApiModelProperty("物料规格型号")
    @TableField("specs")
    private String specs;

    @ApiModelProperty("当前类型，0表示当前是物料，1表示当前是物料分组组")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private Integer lineNumber;
}
