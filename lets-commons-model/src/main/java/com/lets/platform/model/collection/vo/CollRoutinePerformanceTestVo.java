package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author zhangweiyan
 * @ClassName CollRoutinePerformanceTestVo
 * @Description 常规性能试验返回vo
 * @Date 2024/1/27 13:41
 **/
@Data
@ApiModel("常规性能试验返回vo")
public class CollRoutinePerformanceTestVo {
    @ApiModelProperty("试验类型")
    private String testType;

    @ApiModelProperty("试验项目")
    private String testItem;
    private String projectId;

    @ApiModelProperty("介质")
    private String medium;
    private String mediumId;
    @ApiModelProperty("介质分类")
    private String mediumType;
    @ApiModelProperty("阀门分类id")
    private String valveTypeClassifyId;

    @ApiModelProperty("试验压力")
    private String testPressure;

    @ApiModelProperty("试验最大压力")
    private String maxTestPressure;

    @ApiModelProperty("保压时长，单位（秒）")
    private String holdingTime;

    @ApiModelProperty("泄漏率")
    private String sealRate;

    @ApiModelProperty("试验标准")
    private String standard;
    private String standardId;

    @ApiModelProperty("泄漏单位")
    private String leakageUnit;
    @ApiModelProperty("泄漏单位")
    private String leakageUnitId;

    @ApiModelProperty("项目是否必做")
    private boolean required;

    @ApiModelProperty("试验方向（取试验项目里）")
    private String testDirection;

    @ApiModelProperty("计量方法（取试验项目里）")
    private String meteringMethod;

    @ApiModelProperty("是否超过最大压力判定为不合格")
    private String exceedMaxPressureUnqualified;

    @ApiModelProperty("是否限制最大压力")
    private String maximumPressureLimited;

    @ApiModelProperty("是否考察泄漏率")
    private String isCheckLeakage;

    @ApiModelProperty("最大扭矩")
    private BigDecimal maxTorque;

    @ApiModelProperty("试验项目顺序")
    private Integer step;

    @ApiModelProperty("动力源")
    private String powerSource;
    private String powerSourceName;

    @ApiModelProperty("驱动力")
    private BigDecimal powerValue;

    @ApiModelProperty("试验方式")
    private String testMethod;

    @ApiModelProperty("试验循环次数")
    private Integer loopTimes;

    @ApiModelProperty("试验内容")
    private String testContent;

    @ApiModelProperty("时间最小值（s）")
    private Integer timeLowerLimit;

    @ApiModelProperty("时间最大值（s）")
    private Integer timeUpperLimit;

    @ApiModelProperty("扭矩类型")
    private String torqueType;


    private String testTemp;
    private String insulationDuration;
    private String pressureIncrement;
    private String keepTime;
}
