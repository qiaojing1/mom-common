package com.lets.platform.model.collection.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.collection.entity.CollDeviceWarnRecord;
import com.lets.platform.model.common.entity.CommonDevice;
import com.lets.platform.model.common.entity.CommonDeviceCollectorDataItem;
import com.lets.platform.model.common.entity.CommonShiftTimes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 产线-设备实时状态 展示对象
 * @author: DING WEI
 * @date: 2025/4/8 18:47
 */
@Data
@ApiModel("产线-设备实时状态 展示对象")
public class DeviceStatusRealtimeVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("产线主键")
    private String produceLineId;
    @ApiModelProperty("产线编码")
    private String produceLineCode;
    @ApiModelProperty("产线名称")
    private String produceLineName;

    @ApiModelProperty("产线状态-小类")
    private String produceLineStatus;
    @ApiModelProperty("产线状态-小类颜色")
    private String produceLineStatusColour;

    @ApiModelProperty("开线时间")
    private LocalDateTime startLineTime;
    @ApiModelProperty("开工时间")
    private LocalDateTime startWorkTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("开线时长")
    private BigDecimal startLineDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("开工时长")
    private BigDecimal startWorkDuration;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划外运行时长(H)")
    private BigDecimal planOutRunDuration;
    @ApiModelProperty("当前班次")
    private String shiftName;
    @ApiModelProperty(value = "当前班次明细", hidden = true)
    private List<CommonShiftTimes> shiftTimes;

    @ApiModelProperty("产线生产信息")
    private List<CommonDeviceCollectorDataItem> dataItemList;
    @ApiModelProperty("非产线设备")
    private List<DeviceStatusRealtimeDeviceVo> deviceVoList;
    @ApiModelProperty("设备报警记录")
    private List<CollDeviceWarnRecord> deviceWarnRecordList;

    @ApiModelProperty(hidden = true)
    private Map<String, CommonDevice> allDeviceMap;
    @ApiModelProperty(hidden = true)
    private Set<String> allFieldList;

}
