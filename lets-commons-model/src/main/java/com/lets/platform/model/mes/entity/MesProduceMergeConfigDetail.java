package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 生产工单合并方案-明细
 * @author DING WEI
 * @since 2025-08-13
 */
@Getter
@Setter
@TableName("mes_produce_merge_config_detail")
@ApiModel(value = "MesProduceMergeConfigDetail对象", description = "生产工单合并方案-明细")
public class MesProduceMergeConfigDetail extends BaseEntity {

    @ApiModelProperty("方案主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("明细类型[1:物料,2:物料分组]")
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
}
