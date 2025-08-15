package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.psi.enums.ProductionOverTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

/**
 * 物料生产信息
 * @author FZY
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_material_production")
@ApiModel(value = "PsiMaterialProduction对象", description = "物料生产信息")
public class PsiMaterialProduction extends MaterialBaseEntity {

    @ApiModelProperty("生产单位ID")
    @TableField("production_unit_id")
    @NotBlank(message = "[生产单位]不能为空")
    private String productionUnitId;

    @ApiModelProperty("生产单位名称")
    @TableField(exist = false)
    private String productionUnitName;

    @ApiModelProperty("生产单位精度")
    @TableField(exist = false)
    private Integer productionUnitAccuracy;

    @ApiModelProperty("生产单位舍入类型")
    @TableField(exist = false)
    private String productionUnitRoundOffType;

    @ApiModelProperty("生产车间ID")
    @TableField("production_workshop_id")
    private String productionWorkshopId;

    @ApiModelProperty("生产车间名称")
    @TableField(exist = false)
    private String productionWorkshopName;

    @ApiModelProperty("生产产线ID")
    @TableField("production_line_id")
    private String productionLineId;

    @ApiModelProperty("生产产线名称")
    @TableField(exist = false)
    private String productionLineName;

    @ApiModelProperty("默认工艺路线ID")
    @TableField("production_process_route_id")
    private String productionProcessRouteId;

    @ApiModelProperty("默认工艺路线名称")
    @TableField(exist = false)
    private String productionProcessRouteName;

    @ApiModelProperty("发料单位ID")
    @TableField("production_issue_unit_id")
    @NotBlank(message = "[发料单位]不能为空")
    private String productionIssueUnitId;

    @ApiModelProperty("发料单位名称")
    @TableField(exist = false)
    private String productionIssueUnitName;

    @ApiModelProperty("发料单位精度")
    @TableField(exist = false)
    private Integer productionIssueUnitAccuracy;

    @ApiModelProperty("发料单位舍入类型")
    @TableField(exist = false)
    private String productionIssueUnitRoundOffType;

    @ApiModelProperty("发料批量")
    @TableField("production_issue_lot_quantity")
    private BigDecimal productionIssueLotQuantity;

    @ApiModelProperty("最小发料量")
    @TableField("production_min_issue_quantity")
    private BigDecimal productionMinIssueQuantity;

    @ApiModelProperty("发料批量控制方式")
    @TableField("production_issue_lot_control_type")
    private String productionIssueLotControlType;

    @ApiModelProperty("发料批量控制方式名称")
    @TableField(exist = false)
    private String productionIssueLotControlTypeName;

    @ApiModelProperty("默认发料仓库ID")
    @TableField("production_issue_store_id")
    private String productionIssueStoreId;

    @ApiModelProperty("默认发料仓库名称")
    @TableField(exist = false)
    private String productionIssueStoreName;

    @ApiModelProperty("默认发料库区ID")
    @TableField("production_issue_area_id")
    private String productionIssueAreaId;

    @ApiModelProperty("默认发料库区名称")
    @TableField(exist = false)
    private String productionIssueAreaName;

    @ApiModelProperty("默认发料库位ID")
    @TableField("production_issue_position_id")
    private String productionIssuePositionId;

    @ApiModelProperty("默认发料库位名称")
    @TableField(exist = false)
    private String productionIssuePositionName;

    @ApiModelProperty("子件单位ID")
    @TableField("production_sub_unit_id")
    @NotBlank(message = "[子件单位]不能为空")
    private String productionSubUnitId;

    @ApiModelProperty("子件单位名称")
    @TableField(exist = false)
    private String productionSubUnitName;

    @ApiModelProperty("子件单位精度")
    @TableField(exist = false)
    private Integer productionSubUnitAccuracy;

    @ApiModelProperty("子件单位舍入类型")
    @TableField(exist = false)
    private String productionSubUnitRoundOffType;

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

    @ApiModelProperty("标准工时单位名称")
    @TableField(exist = false)
    private String productionStandardTimeUnitName;

    @ApiModelProperty("日产量")
    @TableField("production_daily_output")
    private BigDecimal productionDailyOutput;

    @ApiModelProperty("是否关键件[0否1是]")
    @TableField("production_key_components")
    private Integer productionKeyComponents;
    @TableField(exist = false)
    private String productionKeyComponentsName;

    @ApiModelProperty("入库超收上限(%)")
    @TableField("production_stock_in_upper_limit")
    private BigDecimal productionStockInUpperLimit;
    @ApiModelProperty("入库超收下限(%)")
    @TableField("production_stock_in_lower_limit")
    private BigDecimal productionStockInLowerLimit;

    /**
     * @see ProductionOverTypeEnum
     */
    @ApiModelProperty("超发控制方式[1允许超发、2禁止超发、3按最小发料批量超发]")
    @TableField("production_over_type")
    private Integer productionOverType;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String groupId;

    @ApiModelProperty("标准产能")
    @TableField("standard_capacity")
    private BigDecimal standardCapacity;

    @ApiModelProperty("倒冲领料")
    @TableField("production_issue_reversible")
    private Integer productionIssueReversible;
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
