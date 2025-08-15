package com.lets.platform.model.common.query;

import cn.hutool.core.date.DateTime;
import com.lets.platform.model.common.entity.CommonShiftTimes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName YieldAnalysisQuery
 * @Description TODO
 * @Date 2024/7/3 09:57
 **/
@Data
@ApiModel("设备产量分析查询")
public class YieldAnalysisQuery {
    @ApiModelProperty(value = "设备id列表", required = true)
    private String deviceId;

    @ApiModelProperty(value = "生产单元id", required = false)
    private String productUnitId;

    @ApiModelProperty(value = "班次id", required = false)
    private String shiftId;

    @ApiModelProperty(value = "开始时间, 如果时间查询类型是日：2024-07-03 00:00:00, 如果时间查询类型是周：2024-07-01 00:00:00, 如果时间查询类型是月：2024-06-01 00:00:00", required = true)
    private DateTime startTime;

    @ApiModelProperty(value = "结束时间 如果时间查询类型是日：2024-07-06 00:00:00, 如果时间查询类型是周：2024-07-31 00:00:00, 如果时间查询类型是月：2024-09-01 00:00:00", required = true)
    private DateTime endTime;

    @ApiModelProperty(value = "时间查询类型：1:日 2：周 3: 月", required = true)
    private String timeType;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    private String groupBy;
    private String date;

    @ApiModelProperty("页面大小")
    private int size;

    @ApiModelProperty("当前页码")
    private int current;

    @ApiModelProperty(hidden = true)
    private int startTimeInt;

    @ApiModelProperty(hidden = true)
    private int endTimeInt;

    @ApiModelProperty(hidden = true)
    private int extraStartTimeInt;

    @ApiModelProperty(hidden = true)
    private int extraEndTimeInt;

    @ApiModelProperty(hidden = true)
    private Integer unPlanned;

    // 真实数据库内查询的时间范围
//    @ApiModelProperty(hidden = true)
//    private List<String> realTimeList;

//    @ApiModelProperty(hidden = true)
//    private List<String> realHourList;

    @ApiModelProperty(hidden = true)
    private List<String> deviceIdList;

    @ApiModelProperty(hidden = true)
    private List<String> productCodeList;

    // 班次列表
    @ApiModelProperty(hidden = true)
    private List<CommonShiftTimes> shiftTimes;

    // 天定义开始时间
    @ApiModelProperty(hidden = true)
    private String dayStartHour;

    @ApiModelProperty(hidden = true)
    private Integer year;

    @ApiModelProperty(hidden = true)
    private Integer month;
}
