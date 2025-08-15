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
import java.util.Set;

/**
 * 故障维修时长(天表)
 * @author DING WEI
 * @since 2024-12-17
 */
@Getter
@Setter
@TableName("tpm_repair_duration_fault_day")
@ApiModel(value = "TpmRepairDurationFaultDay对象", description = "故障维修时长(天表)")
public class TpmRepairDurationFaultDay extends BaseEntity {

    @ApiModelProperty("涉及的设备主键")
    @TableField("device_ids")
    private String deviceIds;
    @TableField(exist = false)
    private Set<String> deviceIdSet;

    @ApiModelProperty("故障主键")
    @TableField("fault_id")
    private String faultId;

    @ApiModelProperty("故障名称")
    @TableField("fault_name")
    private String faultName;

    @ApiModelProperty("设备故障次数")
    @TableField("fault_times")
    private Integer faultTimes;
    @ApiModelProperty(hidden = true, value = "上周期报修次数")
    @TableField(exist = false)
    private Integer preFaultTimes;

    @ApiModelProperty("报修时间")
    @TableField("call_time")
    private LocalDateTime callTime;

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

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("响应时长")
    @TableField("response_duration")
    private BigDecimal responseDuration;
}
