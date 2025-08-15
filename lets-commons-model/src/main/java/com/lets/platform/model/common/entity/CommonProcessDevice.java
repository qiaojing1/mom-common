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

/**
 * 工序维护-加工设备
 * @author csy
 * @since 2023-11-06
 */
@Getter
@Setter
@TableName("common_process_device")
@ApiModel(value = "CommonProcessDevice对象", description = "工序维护-加工设备")
public class CommonProcessDevice extends BaseEntity {

    @ApiModelProperty("工序id")
    @TableField("process_id")
    @ExcelIgnore
    private String processId;
    @TableField(exist = false)
    @ExcelIgnore
    private String reportWay;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    @ExcelIgnore
    private String deviceId;

    @ExcelProperty("工序编码")
    @TableField(exist = false)
    private String processCode;

    @ExcelProperty("设备编码")
    @TableField(exist = false)
    private String deviceCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String deviceName;

    @ExcelIgnore
    @TableField(exist = false)
    private String processName;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty(value = "设备绑定的第一个采集器", hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private String collectorId;
}
