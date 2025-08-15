package com.lets.platform.model.tpm.query;

import com.lets.platform.model.device.enums.TypeClassifyEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * 时间稼动率、性能稼动率、设备故障率 查询对象
 * @author DING WEI
 * @date 2025/6/16 13:52
 * @version 1.0
 */
@Data
@ApiModel("时间稼动率、性能稼动率、设备故障率 查询对象")
public class DeviceReportQuery {

    /**
     * @see com.lets.platform.model.common.enums.ResetPeriodEnum
     */
    @ApiModelProperty("1按日、2按周、3按月")
    private String selectType;

    @ApiModelProperty("生产单元")
    private List<String> factoryModeIds;
    @ApiModelProperty("设备")
    private List<String> deviceIds;

    @ApiModelProperty("开始时间")
    private LocalDate startDate;
    @ApiModelProperty("结束时间")
    private LocalDate endDate;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;
    @ApiModelProperty(hidden = true)
    List<LocalDate> startDateList;
    @ApiModelProperty(hidden = true)
    List<LocalDate> endDateList;

    /**
     * @see TypeClassifyEnum
     */
    @ApiModelProperty(hidden = true)
    private String classify;
    @ApiModelProperty(hidden = true)
    private Boolean findWorkshop = Boolean.FALSE;
    @ApiModelProperty(hidden = true)
    private List<String> titles;
}
