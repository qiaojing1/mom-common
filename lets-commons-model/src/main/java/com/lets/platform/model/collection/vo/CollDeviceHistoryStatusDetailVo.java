package com.lets.platform.model.collection.vo;

import cn.hutool.core.date.DateTime;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceHistoryStatusDetailVo
 * @Description 设备历史状态返回实体
 * @Date 2023/12/8 15:51
 **/
@Data
@ApiModel("历史状态明细")
public class CollDeviceHistoryStatusDetailVo {
    @ExcelIgnore
    private String id;
    @ApiModelProperty("设备主键")
    @ExcelIgnore
    private String deviceId;
    @ApiModelProperty("设备名称")
    @ExcelIgnore
    private String deviceName;
    @ApiModelProperty("生产单元名称")
    @ExcelIgnore
    private String factoryModeName;
    @ExcelIgnore
    private String factoryModeId;
    @ApiModelProperty("状态编码")
    @ExcelIgnore
    private String statusCode;
    @ApiModelProperty("状态名称")
    @ExcelProperty("状态名称")
    private String statusName;
    @ApiModelProperty("状态颜色")
    @ExcelIgnore
    private String statusColor;
    @ApiModelProperty("状态分类编码")
    @ExcelIgnore
    private String typeId;
    @ApiModelProperty("状态分类名称")
    @ExcelIgnore
    private String typeName;
    @ApiModelProperty("状态分类颜色")
    @ExcelIgnore
    private String typeColor;
    @ApiModelProperty("开始时间")
    @ExcelIgnore
    private Long startTime;
    @ApiModelProperty("结束时间")
    @ExcelIgnore
    private Long endTime;
    @ApiModelProperty("持续时间")
    @ExcelIgnore
    private Long duration;
    @ExcelProperty("持续时长(min)")
    private BigDecimal durationMin;
    @ApiModelProperty("状态原因")
    @ExcelIgnore
    private String statusReasonName;
    @ExcelIgnore
    private String tenancyId;
    @ExcelIgnore
    private Integer formatDate;
    @ExcelIgnore
    private String dateTime;
    @ExcelIgnore
    private Integer timeFormat;
    private String startTimeStr;
    private String endTimeStr;
}
