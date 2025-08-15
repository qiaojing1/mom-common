package com.lets.platform.model.tpm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author zhangweiyan
 * @ClassName InspectionOrder2DeviceVo
 * @Description 设备实时报表中维保信息下的点检信息实体
 * @Date 2025/4/10 16:01
 **/
@Getter
@Setter
@ApiModel("设备实时报表中维保信息下的点检信息实体")
public class InspectionOrder2DeviceVo {
    private String id;

    @ApiModelProperty("设备id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("工单编码")
    private String orderCode;

    @ApiModelProperty("工单id")
    private String orderId;

    @ApiModelProperty("完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime finishTime;

    @ApiModelProperty("结果")
    private String result;

    /**
     * @see com.lets.platform.model.tpm.enums.ConfigCycle
     */
    @ApiModelProperty("点检周期 (1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年)")
    private String inspectionCycle;
    private String inspectionCycleName;

    @ApiModelProperty("时长(min)")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal finishDuration;

    @ApiModelProperty("下次日检")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime nextDayInspectionTime;

    @ApiModelProperty("下次周检")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime nextWeekInspectionTime;

    @ApiModelProperty("下次月检")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime nextMonthInspectionTime;

    @ApiModelProperty("下次季度检")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime nextQuarterlyInspectionTime;

    @ApiModelProperty("下次半年检")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime nextHalfYearInspectionTime;

    @ApiModelProperty("下次年检")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime nextYearInspectionTime;

}
