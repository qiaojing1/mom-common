package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 自动产线 产线分析
 * @author: DING WEI
 * @date: 2025/4/17 11:37
 */
@Data
@ApiModel("自动产线 产线分析")
public class AutoLineFactoryVo {

    @ApiModelProperty("连续七天")
    private List<String> dayList;
    @ApiModelProperty(value = "连续七天-查询时间", hidden = true)
    private List<String> queryDayList;

    @ApiModelProperty("物料编码")
    private List<String> materialCodeList;

    @ApiModelProperty("实际节拍")
    private List<String> actualBeatList;
    @ApiModelProperty("理论节拍")
    private List<String> theoreticalBeatList;
    @ApiModelProperty("节拍符合度")
    private List<String> beatFitRateList;

    @ApiModelProperty("计划内产量")
    private List<String> planInYieldList;
    @ApiModelProperty("计划外产量")
    private List<String> planOutYieldList;

}