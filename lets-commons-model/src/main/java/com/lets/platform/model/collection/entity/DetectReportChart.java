package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName DetectReportChart
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/1/29
 */
@Data
public class DetectReportChart {

    @ApiModelProperty("开始时间")
    private Long holdBgnTime;
    @ApiModelProperty("结束时间")
    private Long holdEndTime;
    //报告编号
    private String reportCode;
    //点位时间
    private String itemTime;
    //点位值
    private String itemValue;
    //标准压力
    private String stdPress;
    //项目名称
    private String projectName;
    //项目类型
    private String projectType;
    //标准泄露量
    private String stdLeakage;
    //开启关闭
    private String openOrClose;
    //开启关闭
    private String current;
    //标准保压时长
    private String stdHoldingTime;
    //y轴数据
    private List<String> yAxisData;
}
