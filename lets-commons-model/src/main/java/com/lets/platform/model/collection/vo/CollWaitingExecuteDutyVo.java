package com.lets.platform.model.collection.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zhangweiyan
 * @ClassName CollWaitingExecuteDutyVo
 * @Description 设备实时数据待执行任务
 * @Date 2025/02/07 15:59
 **/
@Data
@ApiModel("设备实时数据待执行任务")
public class CollWaitingExecuteDutyVo {
    @ApiModelProperty("设备id")
    private String deviceId;

    @ApiModelProperty("表头id")
    private String orderId;

    @ApiModelProperty("任务类型 1:点检工单 2:保养工单 3:保修单 4:维修工单 5:委外维修工单 6:复检工单")
    private String dutyType;
    @ApiModelProperty("任务类型 1:点检工单 2:保养工单 3:保修单 4:维修工单 5:委外维修工单 6:复检工单")
    private String dutyTypeName;

    @ApiModelProperty("任务单号")
    private String dutyCode;

    @ApiModelProperty("执行人员id")
    private String executiveUserId;

    @ApiModelProperty("执行人员名称")
    private String executiveUserName;

    @ApiModelProperty("执行时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime executiveTime;

    @ApiModelProperty("执行状态")
    private String executiveStatus;

    @ApiModelProperty("执行状态")
    private String executiveStatusName;

    @ApiModelProperty("菜单编码")
    private String menuCode;

    @ApiModelProperty("工单状态颜色")
    private String color;

}
