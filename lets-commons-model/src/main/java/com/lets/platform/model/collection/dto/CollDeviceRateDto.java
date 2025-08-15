/*
 * csy
 */

package com.lets.platform.model.collection.dto;

import com.lets.platform.model.collection.entity.CollDeviceStatusHistory;
import com.lets.platform.model.common.entity.CommonCalendar;
import com.lets.platform.model.uc.entity.SysParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CollDeviceRateDto
 * @Description 设备稼动率保存行事历日排班时长、固定时长、系统参数设备负荷定义相关
 * @Author zhangweiyan
 * @Date 2025/01/09
 */
@Data
public class CollDeviceRateDto {

    @ApiModelProperty("行事历日排班时长")
    private List<CommonCalendar> faultRepairDurations;
    @ApiModelProperty("已联网设备负荷时长定义")
    private SysParam netWorkedLoadDurationDefinition;
    @ApiModelProperty("未联网设备负荷时长定义")
    private SysParam notNetWorkedLoadDurationDefinition;
    @ApiModelProperty("当前设备的运行记录")
    private List<CollDeviceStatusHistory> histories;
    @ApiModelProperty("当前设备负荷时长")
    private BigDecimal divider;

    @ApiModelProperty("小时转换成毫秒需要乘的数")
    public static final BigDecimal MULTIPLIER = new BigDecimal("3600000");

    // 设备每日/每周/每月负荷时间
    @ApiModelProperty(hidden = true)
    private List<Map<String, Object>> eachTimeRangeLoadTimes;
    // 设备每日/每周/每月运行时长
    @ApiModelProperty(hidden = true)
    private List<Map<String, Object>> eachTimeRangeDeviceTimes;
    @ApiModelProperty(hidden = true)
    private List<CommonCalendar> allCalendars;

}
