package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 单件试验报告
 * </p>
 *
 * @author csy
 * @since 2024-01-27
 */
@Getter
@Setter
@ApiModel(value = "CollectionDetectReport对象", description = "单件试验报告")
public class CollectionDetectExtReport extends BaseEntity {

    @ApiModelProperty("报告编号")
    private String code;
    @JsonIgnore
    @ApiModelProperty("试验次数")
    private Integer productNumber;

    @ApiModelProperty("开始时间")
    private LocalDateTime bgnTime;
    @JsonIgnore
    private Long bgnTimeLong;

    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;
    @JsonIgnore
    private Long endTimeLong;

    @ApiModelProperty("产品编号")
    private String productCode;

    @ApiModelProperty("试验类型")
    private String testType;
    private String testTypeName;

    @ApiModelProperty("标准")
    private String standardName;

    @ApiModelProperty("生产令号")
    private String lrpNo;

    @ApiModelProperty("试验员id")
    @JsonIgnore
    private String operatorId;

    @ApiModelProperty("试验员名称")
    private String operatorName;

    @ApiModelProperty("检验员")
    @JsonIgnore
    private String inspectorId;

    @ApiModelProperty("检验员")
    @JsonIgnore
    private String inspectorName;

    @JsonIgnore
    @ApiModelProperty("审核员")
    private String auditorId;

    @JsonIgnore
    @ApiModelProperty("审核员")
    private String auditorName;

    @ApiModelProperty("产品名称")
    private String productName;

    @ApiModelProperty("型号")
    private String model;

    @ApiModelProperty("生产订单号")
    private String produceOrderCode;

    @ApiModelProperty("工位机编号")
    private String stationId;

    @ApiModelProperty("动作试验 -1:未知 0:未开始 1:进行中 2:合格 3:不合格")
    private String movementTestResult;
    private String movementTestResultName;


    @ApiModelProperty("试验结果 -1:未知 0:未开始 1:进行中 2:合格 3:不合格")
    private String testResult;
    private String testResultName;

    @ApiModelProperty("项目耗时（s）")
    private BigDecimal timeConsuming;

    @JsonIgnore
    @ApiModelProperty("特殊要求")
    private String specialDemand;

    @JsonIgnore
    @ApiModelProperty("介质温度")
    private String mediaTemp;

    @JsonIgnore
    @ApiModelProperty("公称通径")
    private String caliber;

    @JsonIgnore
    @ApiModelProperty("公称通径")
    private String pressure;

    @JsonIgnore
    @ApiModelProperty("备注")
    private String remark;

    @JsonIgnore
    @ApiModelProperty("阀门类型")
    private String valveType;

    @JsonIgnore
    @ApiModelProperty("泄露等级")
    private String leakageLevel;


    @ApiModelProperty("不合格原因")
    private String defectCause;

    @JsonIgnore
    @ApiModelProperty("抽压试压")
    private String detectType;

    @JsonIgnore
    @ApiModelProperty("在线查询入参 时间区间")
    private List<String> timeRange;

    @JsonIgnore
    private String detectOrderCode;
    @JsonIgnore
    private String detectOrderId;

    @JsonIgnore
    @ApiModelProperty("压力表")
    private String pressureMeterCode;

    @JsonIgnore
    @ApiModelProperty("图标仪")
    private String iconCode;

    @JsonIgnore
    @ApiModelProperty("传感器")
    private String sensorCode;

    @JsonIgnore
    @ApiModelProperty("测温仪")
    private String thermometerCode;

    @JsonIgnore
    @ApiModelProperty("报告状态：0:未开始，1:进行中，2:已完成")
    private String status;

    @JsonIgnore
    @ApiModelProperty("主阀体炉号")
    private String mainHeatNumber;

    @JsonIgnore
    @ApiModelProperty("副阀体炉号")
    private String auxiliaryHeatNumber;

    @JsonIgnore
    @ApiModelProperty("阀盖炉号")
    private String bonnetHeatNumber;

    @JsonIgnore
    @ApiModelProperty("板/蝶/球炉号")
    private String otherHeatNumber;

}
