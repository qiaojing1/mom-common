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
 * 生产工单-工艺路线-明细-生产单元-副本
 * @author DING WEI
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("mes_produce_order_route_production_unit")
@ApiModel(value = "MesProduceOrderRouteProductionUnit对象", description = "生产工单-工艺路线-明细-生产单元-副本")
public class MesProduceOrderRouteProductionUnit extends BaseEntity {

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

    @ApiModelProperty("生产单元主键")
    @TableField("production_unit_id")
    private String productionUnitId;

    @ApiModelProperty("生产单元编码")
    @TableField("production_unit_code")
    private String productionUnitCode;

    @ApiModelProperty("生产单元名称")
    @TableField("production_unit_name")
    private String productionUnitName;

    @ApiModelProperty("生产单元类型")
    @TableField("production_unit_type")
    private String productionUnitType;

    @ApiModelProperty("上级生产单元")
    @TableField("production_unit_parent_id")
    private String productionUnitParentId;

    @ApiModelProperty("上级生产单元编码")
    @TableField("production_unit_parent_code")
    private String productionUnitParentCode;

    @ApiModelProperty("上级生产单元名称")
    @TableField("production_unit_parent_name")
    private String productionUnitParentName;
}
