package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 设备-采集器-点位关联表
 * @author DING WEI
 * @since 2025-04-08
 */
@Getter
@Setter
@TableName("common_device_collector_data_item")
@ApiModel(value = "CommonDeviceCollectorDataItem对象", description = "设备-采集器-点位关联表")
public class CommonDeviceCollectorDataItem extends BaseEntity {

    @ApiModelProperty("设备ID")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("采集器ID")
    @TableField("collector_id")
    private String collectorId;

    @ApiModelProperty("数据项主键")
    @TableField("data_item_id")
    private String dataItemId;

    @ApiModelProperty("数据项原始标识")
    @TableField(exist = false)
    private String dataItemSourceField;
    @ApiModelProperty("数据项标识")
    @TableField(exist = false)
    private String dataItemField;
    @ApiModelProperty("数据项名称")
    @TableField(exist = false)
    private String dataItemFieldName;
    @ApiModelProperty("数据项单位")
    @TableField(exist = false)
    private String dataItemFieldUnit;
    /**
     * @see com.lets.platform.model.common.enums.NewDataItemTypeEnum
     */
    @ApiModelProperty("数据项类型")
    @TableField(exist = false)
    private String dataItemType;

    @ApiModelProperty("是否展示[0:否,1:是]")
    @TableField("displayed")
    private Integer displayed;

    @ApiModelProperty("展示顺序")
    @TableField("displayed_sort")
    private Integer displayedSort;

    @ApiModelProperty("启用阈值检测[0:否,1:是]")
    @TableField("threshold_detection")
    private Integer thresholdDetection;

    /**
     * @see com.lets.platform.model.common.enums.ThresholdDetectionMethodEnum
     */
    @ApiModelProperty("阈值检测方式[1:标准值、2：区间值]")
    @TableField("threshold_detection_method")
    private String thresholdDetectionMethod;
    @TableField(exist = false)
    private String thresholdDetectionMethodName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("标准值")
    @TableField("standard_value")
    private BigDecimal standardValue;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上限值")
    @TableField("upper_limit_value")
    private BigDecimal upperLimitValue;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("下限值")
    @TableField("lower_limit_value")
    private BigDecimal lowerLimitValue;

    @ApiModelProperty("实际值")
    @TableField(exist = false)
    private String realValue;
}
