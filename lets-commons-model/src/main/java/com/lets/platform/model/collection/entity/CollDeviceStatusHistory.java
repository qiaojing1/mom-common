package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.enums.MethodTypeEnum;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 设备历史状态表
 * @author DING WEI
 * @since 2023-11-27
 */
@Data
@TableName("coll_device_status_history")
@ApiModel(value = "CollDeviceStatusHistory对象", description = "设备历史状态表")
public class CollDeviceStatusHistory extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("设备编号")
    @TableField("device_id")
    @ExcelIgnore
    private String deviceId;

    /**
     * @see com.lets.platform.model.common.enums.CommonDeviceStatusEnum
     */
    @ApiModelProperty("大类状态编码")
    @TableField("big_status_code")
    @ExcelIgnore
    private String bigStatusCode;

    @ApiModelProperty("大类状态名称")
    @TableField("big_status_name")
    @ExcelIgnore
    private String bigStatusName;

    @ApiModelProperty("小类状态编码")
    @TableField("small_status_code")
    @ExcelIgnore
    private String smallStatusCode;

    @ApiModelProperty("小类状态名称")
    @TableField("small_status_name")
    @ExcelProperty("状态名称")
    private String smallStatusName;

    @ApiModelProperty("上次大类状态编码")
    @TableField("old_big_status_code")
    @ExcelIgnore
    private String oldBigStatusCode;

    @ApiModelProperty("上次大类状态名称")
    @TableField("old_big_status_name")
    @ExcelIgnore
    private String oldBigStatusName;

    @ApiModelProperty("上次小类状态编码")
    @TableField("old_small_status_code")
    @ExcelIgnore
    private String oldSmallStatusCode;

    @ApiModelProperty("上次小类状态名称")
    @TableField("old_small_status_name")
    @ExcelIgnore
    private String oldSmallStatusName;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    @ExcelProperty("开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    @ExcelProperty("结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty("持续时长(毫秒数)")
    @TableField("date_time")
    @ExcelIgnore
    private Long dateTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("持续时长(min)")
    @TableField(exist = false)
    @ExcelIgnore
    private BigDecimal dateTimeMin;

    @ApiModelProperty("年月日格式化[如2022-05-25存储为20220525]")
    @TableField("time_format")
    @ExcelIgnore
    private Integer timeFormat;

    /**
     * @see com.lets.platform.model.adapter.enums.HistoryStatusDataSourceEnum
     */
    @ExcelIgnore
    @ApiModelProperty("数据来源[1点位采集2系统内部掉线自动发送]")
    @TableField("data_source")
    private String dataSource;

    @ApiModelProperty("定时数据补偿用到的字段,后一次的开始时间")
    @TableField(exist = false)
    private LocalDateTime nextStartTime;
    @ApiModelProperty("定时数据补偿用到的字段,后一次的结束时间")
    @TableField(exist = false)
    private LocalDateTime nextEndTime;

    @ApiModelProperty("状态原因主键")
    @TableField("status_reason_id")
    private String statusReasonId;
    @ApiModelProperty("状态原因编码")
    @TableField("status_reason_code")
    private String statusReasonCode;
    @ApiModelProperty("状态原因名称")
    @TableField("status_reason_name")
    private String statusReasonName;

    @ApiModelProperty("更新|保存")
    @TableField(exist = false)
    private MethodTypeEnum typeEnum;

    @Override
    public String toString() {
        return "CollDeviceStatusHistory{" +
                "deviceId='" + deviceId + '\'' +
                ", bigStatusCode='" + bigStatusCode + '\'' +
                ", bigStatusName='" + bigStatusName + '\'' +
                ", smallStatusCode='" + smallStatusCode + '\'' +
                ", smallStatusName='" + smallStatusName + '\'' +
                ", oldBigStatusCode='" + oldBigStatusCode + '\'' +
                ", oldBigStatusName='" + oldBigStatusName + '\'' +
                ", oldSmallStatusCode='" + oldSmallStatusCode + '\'' +
                ", oldSmallStatusName='" + oldSmallStatusName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", dateTime=" + dateTime +
                ", timeFormat=" + timeFormat +
                '}';
    }
}
