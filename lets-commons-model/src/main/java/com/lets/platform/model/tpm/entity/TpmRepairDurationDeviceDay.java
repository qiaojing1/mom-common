package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 设备维修时长(天表)
 * @author DING WEI
 * @since 2024-12-09
 */
@Getter
@Setter
@TableName("tpm_repair_duration_device_day")
@ApiModel(value = "TpmRepairDurationDeviceDay对象", description = "设备维修时长(天表)")
public class TpmRepairDurationDeviceDay extends BaseEntity {

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;
    @ApiModelProperty("设备等级")
    @TableField(exist = false)
    private String deviceLevel;
    @ApiModelProperty("资产编码")
    @TableField("assets_code")
    private String assetsCode;
    @ApiModelProperty("设备类型")
    @TableField("type_id")
    private String typeId;
    @TableField("type_name")
    private String typeName;
    @ApiModelProperty("设备型号")
    @TableField("model_id")
    private String modelId;
    @TableField("model_name")
    private String modelName;
    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("报修次数")
    @TableField("fault_times")
    private Integer faultTimes;
    @ApiModelProperty(hidden = true, value = "上周期报修次数")
    @TableField(exist = false)
    private Integer preFaultTimes;

    @ApiModelProperty("报修时间(yyyy-MM-dd)")
    @TableField("call_time_format")
    private String callTimeFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障维修时长(毫秒)")
    @TableField("fault_repair_duration")
    private BigDecimal faultRepairDuration;
    @ApiModelProperty("故障维修时长(H)")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private BigDecimal faultRepairDurationAsHour;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("MTTR")
    @TableField(exist = false)
    private BigDecimal mttr;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上周期故障维修时长(毫秒)")
    @TableField(exist = false)
    private BigDecimal preFaultRepairDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上周期故障维修时长(H)")
    @TableField(exist = false)
    private BigDecimal preFaultRepairDurationAsHour;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上周期MTTR")
    @TableField(exist = false)
    private BigDecimal preMttr;
    @ApiModelProperty("MTTR环比")
    @TableField(exist = false)
    private String mttrRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("设备运行时长(毫秒)")
    @TableField("device_run_duration")
    private BigDecimal deviceRunDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("设备运行时长(H)")
    @TableField(exist = false)
    private BigDecimal deviceRunDurationAsHour;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("MTBF")
    @TableField(exist = false)
    private BigDecimal mtbf;
    @ApiModelProperty("上周期设备运行时长(毫秒)")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private BigDecimal preDeviceRunDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上周期设备运行时长(H)")
    @TableField(exist = false)
    private BigDecimal preDeviceRunDurationAsHour;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上周期MTBF")
    @TableField(exist = false)
    private BigDecimal preMtbf;
    @ApiModelProperty("MTBF环比")
    @TableField(exist = false)
    private String mtbfRate;

    @ApiModelProperty("及时响应次数")
    @TableField("response_times_timely")
    private Integer responseTimesTimely;
    @ApiModelProperty("及时响应率")
    @TableField(exist = false)
    private String timelyResponseRate;
    @ApiModelProperty(value = "是否及时响应[YN]", hidden = true)
    @TableField(exist = false)
    private String isTimely;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("标准响应时长")
    @TableField("standard_response_duration")
    private BigDecimal standardResponseDuration;

    @ApiModelProperty("平均响应时长")
    @TableField(exist = false)
    private String agvResDuration;

    /** 定时计算的数据 */
    @ApiModelProperty("报修单主键")
    @TableField(exist = false)
    private String callRepairId;
    @ApiModelProperty("维修单主键")
    @TableField(exist = false)
    private String repairId;
    @ApiModelProperty("报修时间")
    @TableField("call_time")
    private LocalDateTime callTime;
    @ApiModelProperty("维修等待时长")
    @TableField(exist = false)
    private BigDecimal repairWaitDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("响应时长")
    @TableField("response_duration")
    private BigDecimal responseDuration;
    @ApiModelProperty("维修时长")
    @TableField(exist = false)
    private BigDecimal repairDuration;
    @ApiModelProperty("暂停时长")
    @TableField(exist = false)
    private BigDecimal pauseDuration;
    @ApiModelProperty("接单时长")
    @TableField(exist = false)
    private BigDecimal receptionDuration;
    @ApiModelProperty("班组主键")
    @TableField(exist = false)
    private String teamId;
    @ApiModelProperty("维修人员")
    @TableField(exist = false)
    private String repairUserId;
    @ApiModelProperty("负荷时长")
    @TableField(exist = false)
    private BigDecimal loadDuration;
    @ApiModelProperty("故障主键")
    @TableField(exist = false)
    private String faultTypeId;
    @ApiModelProperty("故障名称")
    @TableField(exist = false)
    private String faultTypeName;
    @TableField(exist = false)
    private LocalDateTime repairResponseTime;
    @TableField(exist = false)
    private LocalDateTime repairStartTime;
    /** 定时计算的数据 */

    @TableField(exist = false)
    private String groupFormat;
}
