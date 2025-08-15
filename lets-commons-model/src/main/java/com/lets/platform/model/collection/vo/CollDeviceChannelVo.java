package com.lets.platform.model.collection.vo;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceChannelsVo
 * @Description 设备在线监控通道详情vo
 * @Date 2024/1/31 16:03
 **/
@Data
public class CollDeviceChannelVo {
    @ApiModelProperty("设备编号")
    private String deviceId;

    @ApiModelProperty("设备编号")
    private String deviceCode;

    @ApiModelProperty("实验员id")
    private String testerId;

    @ApiModelProperty("实验员名称")
    private String testerName;

    @ApiModelProperty("通道索引")
    private String channelIdx;

    @ApiModelProperty("通道标识")
    private String channelId;

    @ApiModelProperty("通道名称")
    private String channelNm;

    @ApiModelProperty("压力值精度位数")
    private String pressurePrecision;

    @ApiModelProperty("当前通道压力值")
    private String pressureValue;

    @ApiModelProperty("当前标准压力值")
    private String stdPressureValue;
    @ApiModelProperty("当前标准最大压力值")
    private String stdMaxPressureValue;

    @ApiModelProperty("当前压力状态")
    private String pressureState;

    @ApiModelProperty("通讯状态 0:正常｜1:异常")
    private String commonState;

    @ApiModelProperty("生产令号")
    private String productOrder;

    @ApiModelProperty("产品编号")
    private String productCode;

    @ApiModelProperty("阀门型号")
    private String productModel;

    @ApiModelProperty("阀门类型")
    private String productType;

    @ApiModelProperty("阀门压力")
    private String productPn;

    @ApiModelProperty("通道状态, 0:空闲 1:试验中 2:通讯异常 3:关机")
    private String status;

    @ApiModelProperty("工况")
    private String condition;

    @ApiModelProperty("压力标准")
    private String pressureStandard;

    @ApiModelProperty("主体材质")
    private String materialQuality;

    @ApiModelProperty("密封方式")
    private String sealType;

    @ApiModelProperty("阀门口径")
    private String productDn;
    @ApiModelProperty("试验标准")
    private String testStandard;
    @ApiModelProperty("试验类型 试压｜抽压")
    private String testType;
    @ApiModelProperty("试验结论")
    private String testResult;
    @ApiModelProperty("不合格原因")
    private String unqReason;
    @ApiModelProperty("量程上限")
    private String upperLimit;
    @ApiModelProperty("量程下限")
    private String lowestLimit;
    @ApiModelProperty("量程精度")
    private Integer precision;
    @ApiModelProperty("前端量程配置参数")
    private String props;
    @ApiModelProperty("是否低压 N否 Y是")
    private String isLowPressure;
    @ApiModelProperty("大量程数量")
    private String largeScaleNum;
    @ApiModelProperty("小量程数量")
    private String smallScaleNum;


    @ApiModelProperty("试验项目")
    private List<CollDeviceTestItemVo> testItems;
    @ApiModelProperty("压力点位变化")
    private List<JSONObject> pressures;
    @ApiModelProperty("保压开始结束时间节点")
    private List<JSONObject> holdingTime;
    @ApiModelProperty("试验开始结束时间节点")
    private List<JSONObject> testTime;
    private JSONObject map;
}
