package com.lets.platform.model.collection.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceHistoryStatusSummaryVo
 * @Description 历史状态汇总统计
 * @Date 2023/12/8 15:51
 **/
@Data
@ApiModel("历史状态汇总统计")
public class CollDeviceHistoryStatusSummaryVo {
    @ApiModelProperty("状态编码")
    private String typeCode;
    @ApiModelProperty("状态名称")
    private String typeName;
    @ApiModelProperty("状态颜色")
    private String typeColor;
    @ApiModelProperty("持续时间")
    private Long duration;
    private Long durationMin;
    @ApiModelProperty("状态原因")
    private String statusReasonName;
    private String shitId;
    private String shiftName;
    private String bigStatusCode;
}
