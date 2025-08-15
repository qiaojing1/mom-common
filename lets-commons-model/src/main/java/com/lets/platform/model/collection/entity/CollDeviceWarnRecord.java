package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 设备报警记录
 * @author DING WEI
 * @since 2023-11-28
 */
@Getter
@Setter
@TableName("coll_device_warn_record")
@ApiModel(value = "CollDeviceWarnRecord对象", description = "设备报警记录")
public class CollDeviceWarnRecord extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @TableField(exist = false)
    @ApiModelProperty("生产单元名称")
    private String factoryModeName;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @TableField(exist = false)
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @TableField(exist = false)
    @ApiModelProperty("设备名称")
    private String deviceName;
    @TableField(exist = false)
    private String deviceTypeId;
    @TableField(exist = false)
    private String deviceModelId;
    @TableField(exist = false)
    private String deviceControllerId;

    @ApiModelProperty("报警号")
    @TableField("warning_number")
    private String warningNumber;

    @ApiModelProperty("报警内容")
    @TableField("warning_content")
    private String warningContent;

    @ApiModelProperty("报警原因")
    @TableField("warning_reason")
    private String warningReason;

    @ApiModelProperty("报警时间")
    @TableField("warning_time")
    private LocalDateTime warningTime;

    @ApiModelProperty("采集时间（adapter服务当前时间）")
    @TableField("collection_time")
    private LocalDateTime collectionTime;

    @ApiModelProperty("接收时间(采集点位数据上来的时间）")
    @TableField("receiver_time")
    private LocalDateTime receiverTime;

    @ApiModelProperty("报警结束时间")
    @TableField("warning_end_time")
    private LocalDateTime warningEndTime;

    @ApiModelProperty("报警持续时间(默认5000即5秒钟)")
    @TableField("warning_continued_time")
    private Long warningContinuedTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    @ApiModelProperty("报警持续时间(分钟) 保留两位小数")
    private BigDecimal warningContinuedTimeMin;

    @ApiModelProperty("状态[0未处理,1已处理], 设备实时记录菜单默认必传参0，历史记录菜单默认必传1")
    @TableField("status")
    private String status;

    @ApiModelProperty("处理时间(消息发送成功的时间)")
    @TableField("deal_time")
    private LocalDateTime dealTime;

    @ApiModelProperty("报警次数")
    @TableField(exist = false)
    private Integer warnCount;
    @ApiModelProperty("查询类型 1:按日 2:按周 3:按月")
    @TableField(exist = false)
    private String type;
    @ApiModelProperty("统计方式 1:按设备 2:按报警码")
    @TableField(exist = false)
    private String statisticsType;
    @ApiModelProperty("开始时间")
    @TableField(exist = false)
    private String startTime;
    @ApiModelProperty("结束时间")
    @TableField(exist = false)
    private String endTime;

    @ApiModelProperty("报警次数")
    @TableField(exist = false)
    private Integer count;
    @TableField(exist = false)
    private int size = 10;

    @TableField(exist = false)
    private int current = 1;

    @TableField(exist = false)
    private String shiftId;
}
