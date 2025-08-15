package com.lets.platform.model.mes.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.collection.entity.CollDeviceStatusHistory;
import com.lets.platform.model.common.entity.CommonShiftTimes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * 工序生产统计报表 展示对象
 * @author: DING WEI
 * @date: 2024/11/11 11:57
 */
@Data
@ApiModel("工序生产统计报表 展示对象")
public class ProcessProduceStatisticsVo {

    @ApiModelProperty("生产日期")
    private LocalDate orderTime;

    @ApiModelProperty("生产单元")
    private String factoryModeId;
    private String factoryModeName;

    @ApiModelProperty("工单编号")
    private String produceOrderCode;

    @ApiModelProperty("工序主键")
    private String processId;
    @ApiModelProperty("工序编码")
    private String processCode;
    @ApiModelProperty("工序名称")
    private String processName;

    @ApiModelProperty("班次主键")
    private String shiftId;
    @ApiModelProperty("班次名称")
    private String shiftName;
    @ApiModelProperty("班次时间段")
    private List<CommonShiftTimes> timesList;

    @ApiModelProperty("设备主键")
    private String deviceId;
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("物料主键")
    private String materialId;
    @ApiModelProperty("物料编码")
    private String materialCode;
    @ApiModelProperty("物料名称")
    private String materialName;
    @ApiModelProperty("物料规格")
    private String materialSpecs;

    @ApiModelProperty("操作员")
    private String operatorId;
    @ApiModelProperty("操作员名称")
    private String operatorName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("投入工时(H)")
    private BigDecimal investmentWorkHours;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产工时(H)")
    private BigDecimal produceWorkHours;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("标准产能(单位/H)")
    private BigDecimal standardCapacity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("异常工时(H)")
    private BigDecimal errorWorkHours;
    @ApiModelProperty("异常工时-历史状态")
    private List<CollDeviceStatusHistory> errorWorkHoursList;

    @ApiModelProperty("单位")
    private String processUnitId;
    @ApiModelProperty("单位名称")
    private String processUnitName;
    @ApiModelProperty("单位精度")
    private Integer processUnitAccuracy;
    @ApiModelProperty("单位舍入方式")
    private Integer processUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("预计产量")
    private BigDecimal expectOutput;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("实际合格品")
    private BigDecimal richNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    private BigDecimal poorNumber;
    @ApiModelProperty("不良数量源单明细主键")
    private List<String> poorNumberIds;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("实际产量")
    private BigDecimal actualOutput;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格率(%)")
    private BigDecimal richRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("稼动率(%)")
    private BigDecimal utilizationRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("达成率(%)")
    private BigDecimal reachRate;
}
