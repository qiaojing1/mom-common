package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
 * 设备-采集器关联表
 * </p>
 *
 * @author FZY
 * @since 2023-10-31
 */
@Getter
@Setter
@TableName("common_device_collector")
@ApiModel(value = "CommonDeviceCollector对象", description = "设备-采集器关联表")
public class CommonDeviceCollector extends BaseEntity {

    @ApiModelProperty("设备ID")
    @TableField("device_id")
    @ExcelIgnore
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField(exist = false)
    @ExcelProperty("设备编码")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String deviceName;

    @ApiModelProperty("采集器ID")
    @TableField("collector_id")
    @ExcelIgnore
    private String collectorId;

    @ApiModelProperty("采集器编码")
    @TableField(exist = false)
    @ExcelProperty("采集器编码")
    private String collectorCode;

    @ApiModelProperty("采集器名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String collectorName;

    @ApiModelProperty("采集器类型")
    @TableField(exist = false)
    @ExcelIgnore
    private String collectorType;

    @ApiModelProperty("采集器类型名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String collectorTypeName;

    @ApiModelProperty("采集器网关ID")
    @TableField(exist = false)
    @ExcelIgnore
    private String collectorGateWayId;

    @ApiModelProperty("采集器网关名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String collectorGateWayIdName;

    @ApiModelProperty("采集器网关名称")
    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonDataItem> dataItemList;
}
