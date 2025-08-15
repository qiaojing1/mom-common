package com.lets.platform.model.collection.entity;

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
 * 产线计划编制表
 * </p>
 *
 * @author FZY
 * @since 2025-06-12
 */
@Getter
@Setter
@TableName("collection_production_line_scheduling")
@ApiModel(value = "CollectionProductionLineScheduling对象", description = "产线计划编制表")
public class CollectionProductionLineScheduling extends BaseEntity {

    @ApiModelProperty("工单编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("生产单元ID")
    @TableField("production_unit_id")
    private String productionUnitId;

    @ApiModelProperty("生产单元名称")
    @TableField("production_unit_name")
    private String productionUnitName;

    @ApiModelProperty("设备ID")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @TableField(exist = false)
    private int size;

    @TableField(exist = false)
    private int current;

    @TableField(exist = false)
    private String date;

    @TableField(exist = false)
    private String materialId;

    @TableField(exist = false)
    private String materialName;

    @TableField(exist = false)
    private List<CollectionProductionLineSchedulingDetail> detailList;

    @TableField(exist = false)

    private String queryType;
}
