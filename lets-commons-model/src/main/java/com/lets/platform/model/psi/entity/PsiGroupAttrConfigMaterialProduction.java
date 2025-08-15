package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 物料分组属性配置-生产信息
 * @author DING WEI
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("psi_group_attr_config_material_production")
@ApiModel(value = "PsiGroupAttrConfigMaterialProduction对象", description = "物料分组属性配置-生产信息")
public class PsiGroupAttrConfigMaterialProduction extends BaseEntity {

    @ApiModelProperty("生产单位ID")
    @TableField("production_unit_id")
    private String productionUnitId;

    @ApiModelProperty("生产单位名称")
    @TableField("production_unit_name")
    private String productionUnitName;

    @ApiModelProperty("生产车间ID")
    @TableField("production_workshop_id")
    private String productionWorkshopId;

    @ApiModelProperty("生产车间名称")
    @TableField("production_workshop_name")
    private String productionWorkshopName;

    @ApiModelProperty("生产产线ID")
    @TableField("production_line_id")
    private String productionLineId;

    @ApiModelProperty("生产产线名称")
    @TableField("production_line_name")
    private String productionLineName;

    @ApiModelProperty("默认工艺路线ID")
    @TableField("production_process_route_id")
    private String productionProcessRouteId;

    @ApiModelProperty("默认工艺路线名称")
    @TableField("production_process_route_name")
    private String productionProcessRouteName;

    @ApiModelProperty("发料单位ID")
    @TableField("production_issue_unit_id")
    private String productionIssueUnitId;

    @ApiModelProperty("发料单位名称")
    @TableField("production_issue_unit_name")
    private String productionIssueUnitName;

    @ApiModelProperty("发料批量")
    @TableField("production_issue_lot_quantity")
    private BigDecimal productionIssueLotQuantity;

    @ApiModelProperty("最小发料量")
    @TableField("production_min_issue_quantity")
    private BigDecimal productionMinIssueQuantity;

    @ApiModelProperty("发料批量控制方式")
    @TableField("production_issue_lot_control_type")
    private String productionIssueLotControlType;

    @ApiModelProperty("默认发料仓库ID")
    @TableField("production_issue_store_id")
    private String productionIssueStoreId;

    @ApiModelProperty("默认发料仓库名称")
    @TableField("production_issue_store_name")
    private String productionIssueStoreName;

    @ApiModelProperty("默认发料库区ID")
    @TableField("production_issue_area_id")
    private String productionIssueAreaId;
    @ApiModelProperty("默认发料库区名称")
    @TableField("production_issue_area_name")
    private String productionIssueAreaName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyAreaId;

    @ApiModelProperty("默认发料库位ID")
    @TableField("production_issue_position_id")
    private String productionIssuePositionId;
    @ApiModelProperty("默认发料库位名称")
    @TableField("production_issue_position_name")
    private String productionIssuePositionName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyPositionId;

    @ApiModelProperty("子件单位ID")
    @TableField("production_sub_unit_id")
    private String productionSubUnitId;

    @ApiModelProperty("子件单位名称")
    @TableField("production_sub_unit_name")
    private String productionSubUnitName;

    @ApiModelProperty("变动耗损率(%)")
    @TableField("production_variable_loss_rate")
    private BigDecimal productionVariableLossRate;

    @ApiModelProperty("固定耗损量")
    @TableField("production_constant_loss_quantity")
    private BigDecimal productionConstantLossQuantity;

    @ApiModelProperty("标准工时")
    @TableField("production_standard_time")
    private BigDecimal productionStandardTime;

    @ApiModelProperty("标准工时单位")
    @TableField("production_standard_time_unit")
    private String productionStandardTimeUnit;

    @ApiModelProperty("日产量")
    @TableField("production_daily_output")
    private BigDecimal productionDailyOutput;

    @ApiModelProperty("是否关键件[0否1是]")
    @TableField("production_key_components")
    private Integer productionKeyComponents;

    @ApiModelProperty("入库超收上限(%)")
    @TableField("production_stock_in_upper_limit")
    private BigDecimal productionStockInUpperLimit;

    @ApiModelProperty("入库超收下限(%)")
    @TableField("production_stock_in_lower_limit")
    private BigDecimal productionStockInLowerLimit;

    /**
     * @see com.lets.platform.model.psi.enums.ProductionOverTypeEnum
     */
    @ApiModelProperty("超发控制方式[1允许超发、2禁止超发、3按最小发料批量超发]")
    @TableField("production_over_type")
    private Integer productionOverType;

    @ApiModelProperty("标准产能")
    @TableField("standard_capacity")
    private BigDecimal standardCapacity;

    @ApiModelProperty("倒冲领料")
    @TableField("production_issue_reversible")
    private Byte productionIssueReversible;
    /**
     * 如果选择了直接倒冲领料则需要同步将productionIssueReversible更新为Byte.parseByte(IsOrNotEnum.IS.getValue())
     * @see com.lets.platform.model.mes.enums.produceOrder.PickingWayEnum
     */
    @ApiModelProperty("领料方式[1:正常领料,2:直接倒冲领料,3:不领料,4:调拨倒冲领料]")
    @TableField("picking_way")
    private String pickingWay;
    @TableField(exist = false)
    private String pickingWayName;

    @ApiModelProperty("发料考虑损耗[01]")
    @TableField("issue_consider_loss")
    private Integer issueConsiderLoss;
}
