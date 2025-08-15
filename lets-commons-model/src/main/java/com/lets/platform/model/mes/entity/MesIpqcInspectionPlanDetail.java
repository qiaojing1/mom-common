package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 制程检验计划-明细
 * @author DING WEI
 * @since 2025-08-05
 */
@Getter
@Setter
@TableName("mes_ipqc_inspection_plan_detail")
@ApiModel(value = "MesIpqcInspectionPlanDetail对象", description = "制程检验计划-明细")
public class MesIpqcInspectionPlanDetail extends BaseEntity {

    @ApiModelProperty("计划主键")
    @TableField("order_id")
    private String orderId;

    /**
     * @see com.lets.platform.model.mes.enums.InspectDetailTypeEnum
     */
    @ApiModelProperty("明细类型[1:物料,2:物料分组,3:工序,4:工序分组]")
    @TableField("detail_type")
    private String detailType;

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

    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("工序类型")
    @TableField("process_type")
    private String processType;
    @TableField(exist = false)
    private String processTypeName;

    @ApiModelProperty("工序分组主键")
    @TableField("process_group_id")
    private String processGroupId;

    @ApiModelProperty("工序分组名称")
    @TableField("process_group_name")
    private String processGroupName;
}
