package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 产线计划编制表明细
 * </p>
 *
 * @author FZY
 * @since 2025-06-12
 */
@Getter
@Setter
@TableName("collection_production_line_scheduling_detail")
@ApiModel(value = "CollectionProductionLineSchedulingDetail对象", description = "产线计划编制表明细")
public class CollectionProductionLineSchedulingDetail extends BaseEntity {

    @ApiModelProperty("产线计划编制表ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private long lineNumber;

    @ApiModelProperty("工单编码")
    @TableField(exist = false)
    private String code;

    @ApiModelProperty("生产单元ID")
    @TableField(exist = false)
    private String productionUnitId;

    @ApiModelProperty("生产单元名称")
    @TableField(exist = false)
    private String productionUnitName;

    @ApiModelProperty("设备ID")
    @TableField(exist = false)
    private String deviceId;

    @ApiModelProperty("设备名称")
    @TableField(exist = false)
    private String deviceName;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;

    @ApiModelProperty("单位名称")
    @TableField(exist = false)
    private String unitName;

    @ApiModelProperty("生产数量")
    @TableField("quantity")
    private Integer quantity;

    @ApiModelProperty("完成数量")
    @TableField(exist = false)
    private Integer yield;

    @ApiModelProperty("计划开始日期")
    @TableField("plan_start_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime planStartDate;

    @ApiModelProperty("计划结束日期")
    @TableField("plan_end_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime planEndDate;

    @TableField(exist = false)
    private Map<String, Map<String, BigDecimal>> valueMap;

    @TableField(exist = false)
    private List<CollectionProductionLineSchedulingDetailYield> yieldList;

    @ApiModelProperty("每天的实际产量")
    @TableField(exist = false)
    private Map<LocalDate, BigDecimal> actualDailyYieldMap;

    @ApiModelProperty("理论节拍")
    @TableField(exist = false)
    private String standardBeat;

}
