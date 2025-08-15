package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 生产工单-工艺路线-明细-工序信息-物料-副本
 * @author DING WEI
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("mes_produce_order_route_process_material")
@ApiModel(value = "MesProduceOrderRouteProcessMaterial对象", description = "生产工单-工艺路线-明细-工序信息-物料-副本")
public class MesProduceOrderRouteProcessMaterial extends BaseEntity {

    @ApiModelProperty("生产工单主键")
    @TableField("order_id")
    private String orderId;
    @ApiModelProperty("生产工单明细主键")
    @TableField("detail_id")
    private String detailId;
    @ApiModelProperty("工艺路线主键")
    @TableField("route_id")
    private String routeId;
    @ApiModelProperty("工艺路线明细主键")
    @TableField("route_detail_id")
    private String routeDetailId;

    @ApiModelProperty("工艺路线-工序关联主键")
    @TableField("route_process_id")
    private String routeProcessId;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

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

    @ApiModelProperty("物料分组")
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;

    @ApiModelProperty("分子用量")
    @TableField("numerator_dosage")
    private BigDecimal numeratorDosage;

    @ApiModelProperty("分母用量")
    @TableField("denominator_dosage")
    private BigDecimal denominatorDosage;

    @ApiModelProperty("单位主键(物料的子件单位,没有配置就取基本单位)")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位没名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入方式")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;
}
