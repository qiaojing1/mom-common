package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.math.RoundingMode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 设备综合效率表
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-05-27
 */
@Getter
@Setter
@TableName("coll_device_comprehensive_efficiency")
@ApiModel(value = "CollDeviceComprehensiveEfficiency对象", description = "设备综合效率表")
public class CollDeviceComprehensiveEfficiency extends BaseEntity {

    @ApiModelProperty("日期")
    @TableField("current_date_int")
    private Integer currentDateInt;
    @ApiModelProperty("日期")
    @TableField(exist = false)
    private String currentDateStr;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("设备类型id")
    @TableField("device_type_id")
    private String deviceTypeId;

    @ApiModelProperty("设备类型名称")
    @TableField("device_type_name")
    private String deviceTypeName;

    @ApiModelProperty("设备型号id")
    @TableField("device_model_id")
    private String deviceModelId;

    @ApiModelProperty("设备型号名称")
    @TableField("device_model_name")
    private String deviceModelName;

    @ApiModelProperty("生产单元id")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("生产单元编码")
    @TableField("factory_mode_code")
    private String factoryModeCode;

    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("班次id")
    @TableField("shift_id")
    private String shiftId;

    @ApiModelProperty("班次名称")
    @TableField("shift_name")
    private String shiftName;

    @ApiModelProperty("班次总时长（h）")
    @TableField("shift_total_hour")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal shiftTotalHour;

    @ApiModelProperty("产量")
    @TableField("yield")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal yield;

    @ApiModelProperty("空闲时长(h)")
    @TableField("idle_duration")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal idleDuration;
    @ApiModelProperty("空闲时长(h)(按天)")
    @TableField("idle_duration_day")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal idleDurationDay;

    @ApiModelProperty("负荷时长(h)")
    @TableField("load_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal loadTime;

    @ApiModelProperty("运行时长(h)")
    @TableField("running_duration")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal runningDuration;
    @ApiModelProperty("运行时长(h)(按天)")
    @TableField("running_duration_day")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal runningDurationDay;

    @ApiModelProperty("故障时长(h)")
    @TableField("fault_duration")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal faultDuration;

    @ApiModelProperty("故障时长(h)(按天)")
    @TableField("fault_duration_day")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal faultDurationDay;

    @ApiModelProperty("关机时长(h)")
    @TableField("shutdown_duration")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal shutdownDuration;

    @ApiModelProperty("关机时长(h)(按天)")
    @TableField("shutdown_duration_day")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal shutdownDurationDay;

    @ApiModelProperty("报警次数")
    @TableField("warn_record_count")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer warnRecordCount;

    @ApiModelProperty("稼动率")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal cropRate;

    @ApiModelProperty("开机率")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal runningRate;

    @ApiModelProperty("利用率")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal usingRate;

    @ApiModelProperty("故障率")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal faultRate;

    @ApiModelProperty("可动率")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal canRunRate;

    @ApiModelProperty("合格率")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal qualifiedRate = GlobalConstant.ONE_HUNDRED_AS_BIG.setScale(2, RoundingMode.HALF_UP);

    @ApiModelProperty("综合效率")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal integratedRate;
}
