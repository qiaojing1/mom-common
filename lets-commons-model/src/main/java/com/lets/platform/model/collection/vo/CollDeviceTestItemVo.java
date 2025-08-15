package com.lets.platform.model.collection.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceChannelsVo
 * @Description 设备在线监控试验项目vo
 * @Date 2024/1/31 16:03
 **/
@Data
public class CollDeviceTestItemVo {
    @ApiModelProperty("试验类型")
    private String testType;

    @ApiModelProperty("试验项目标识")
    private String itemId;

    @ApiModelProperty("试验项目名称")
    private String itemName;

    @ApiModelProperty("试验项目介质")
    private String itemFluId;

    @ApiModelProperty("试验状态0:待试验，1:试验中，2:已暂停，3:已终止，4:已完成")
    private String itemState;

    @ApiModelProperty("人工结论，0-合格|1-不合格|null-不确定")
    private String manResult;

    @ApiModelProperty("系统结论，0-合格|1-不合格|null-不确定")
    private String sysResult;

    @ApiModelProperty("综合结论")
    private String result;

    @ApiModelProperty("试验压力标准值")
    private String stdPressure;

    @ApiModelProperty("试验压力过程最低压力")
    private String minPressure;

    @ApiModelProperty("试验压力过程最高压力")
    private String maxPressure;

    @ApiModelProperty("试验压力实测值")
    private String avgPressure;

    @ApiModelProperty("保压时长标准值")
    private String stdDuration;

    @ApiModelProperty("保压时长实际值")
    private String actDuration;

    @ApiModelProperty("泄漏率标准值")
    private String maxLeakage;

    @ApiModelProperty("泄漏率实测值")
    private String actLeakage;

    @ApiModelProperty("泄漏率单位")
    private String leakageUnits;

    @ApiModelProperty("环境温度")
    private String envTemp;
    @ApiModelProperty("冷媒温度")
    private String refTemp;
    @ApiModelProperty("阀内温度")
    private String valveInnTemp;
    @ApiModelProperty("阀体温度")
    private String valveBodyTemp;
    @ApiModelProperty("阀盖温度")
    private String valveCoverTemp;
    @ApiModelProperty("阀杆温度")
    private String valveStemTemp;
    @ApiModelProperty("填料温度")
    private String packTemp;
    @ApiModelProperty("A侧压差")
    private String pressA;
    @ApiModelProperty("中腔压差温度")
    private String pressMid;
    @ApiModelProperty("B侧压差")
    private String pressB;
    @ApiModelProperty("泄漏率A")
    private String leakageA;
    @ApiModelProperty("泄漏率B")
    private String leakageB;

    @ApiModelProperty("试验入口段温度")
    private String testInletTemp;
    @ApiModelProperty("试验出口段温度")
    private String testOutletTemp;
    @ApiModelProperty("试验阀入口压力")
    private String valveInletPress;
    @ApiModelProperty("试验阀出口压力")
    private String valveOutletPress;
    @ApiModelProperty("试验阀压差")
    private String valvePressureDiff;

    @ApiModelProperty("开度")
    private String resOpen;
    @ApiModelProperty("流量")
    private String resFlow;
    @ApiModelProperty("水流速")
    private String resFlowRate;
    @ApiModelProperty("上游压力")
    private String resUpperPressure;
    @ApiModelProperty("测试端压差")
    private String resTestPressure;
    @ApiModelProperty("直管段压差")
    private String resStrPress;
    @ApiModelProperty("静压差")
    private String resNetPress;
    @ApiModelProperty("流阻系数")
    private String resCoeff;
    @ApiModelProperty("流量系数cv")
    private String resCv;
    @ApiModelProperty("流量系数kv")
    private String resKv;
    @ApiModelProperty("水温")
    private String resTemp;
    @ApiModelProperty("雷诺数")
    private String resIndex;


    @ApiModelProperty("当前试验项目进度")
    private String currentProjectProgress;

    @ApiModelProperty("试验总进度")
    private String projectProgress;

    @ApiModelProperty("试验总耗时")
    private Long projectDuration;

    @ApiModelProperty("当前试验耗时")
    private Long currentProjectDuration;


}
