package com.lets.platform.model.mes.entity;

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
 * 程序清单表
 * </p>
 *
 * @author FZY
 * @since 2024-02-26
 */
@Getter
@Setter
@TableName("mes_dnc_program_list")
@ApiModel(value = "MesDncProgramList对象", description = "程序清单表")
public class MesDncProgramList extends BaseEntity {

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("工艺路线ID")
    @TableField("process_route_id")
    private String processRouteId;

    @ApiModelProperty("工艺路线编码")
    @TableField("process_route_code")
    private String processRouteCode;

    @ApiModelProperty("工艺路线名称")
    @TableField("process_route_name")
    private String processRouteName;

    @ApiModelProperty("是否选择加工程序")
    @TableField(exist = false)
    private Integer existProgramFile;

    @ApiModelProperty("是否选择加工程序")
    @TableField(exist = false)
    private String existProgramFileName;

    @ApiModelProperty("工序列表")
    @TableField(exist = false)
    private List<MesDncProgramListProcess> processList;
}
