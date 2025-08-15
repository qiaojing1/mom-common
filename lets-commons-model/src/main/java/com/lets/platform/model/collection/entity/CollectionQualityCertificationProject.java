/*
 * csy
 */

package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 试验项目
 * </p>
 *
 * @author csy
 * @since 2024-11-26
 */
@Getter
@Setter
@TableName("collection_quality_certification_project")
@ApiModel(value = "CollectionQualityCertificationProject对象", description = "试验项目")
public class CollectionQualityCertificationProject extends BaseEntity {

    @ApiModelProperty("工单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("试验类型")
    @TableField("test_type")
    private String testType;

    @ApiModelProperty("试验标准")
    @TableField("standard_id")
    private String standardId;

    @ApiModelProperty("试验标准name")
    @TableField("standard_name")
    private String standardName;

    @ApiModelProperty("试验项目")
    @TableField("project_id")
    private String projectId;

    @ApiModelProperty("试验项目")
    @TableField("project_name")
    private String projectName;

    @ApiModelProperty("介质")
    @TableField("media_id")
    private String mediaId;

    @ApiModelProperty("介质")
    @TableField("media_name")
    private String mediaName;

    @ApiModelProperty("试验压力")
    @TableField("test_pressure")
    private String testPressure;

    @ApiModelProperty("保压时长")
    @TableField("hold_time")
    private String holdTime;

    @ApiModelProperty("泄漏率")
    @TableField("leakage_rate")
    private String leakageRate;

    @ApiModelProperty("泄漏率单位")
    @TableField("leakage_unit")
    private String leakageUnit;

    @ApiModelProperty("最大扭矩")
    @TableField("max_torque")
    private String maxTorque;

    @ApiModelProperty("泄漏率单位id")
    @TableField("leakage_unit_id")
    private String leakageUnitId;

    @ApiModelProperty("介质分类")
    @TableField("media_type")
    private String mediaType;

    @ApiModelProperty("阀门分类")
    @TableField("valve_classify_id")
    private String valveClassifyId;

    @ApiModelProperty("项目试验顺序")
    @TableField("step")
    private Integer step;

    @ApiModelProperty("动力源 1手动2电动3气动")
    @TableField("power_source")
    private String powerSource;
    @TableField(exist = false)
    private String powerSourceName;

    @ApiModelProperty("驱动力")
    @TableField("power_value")
    private String powerValue;

    @ApiModelProperty("试验方式 1单向2开关双向")
    @TableField("test_method")
    private String testMethod;

    @ApiModelProperty("试验循环次数")
    @TableField("loop_times")
    private Integer loopTimes;

    @ApiModelProperty("测试内容 1扭矩2时间3扭矩和时间")
    @TableField("test_content")
    private String testContent;

    @ApiModelProperty("时间下限")
    @TableField("time_lower_limit")
    private Integer timeLowerLimit;

    @ApiModelProperty("时间上限")
    @TableField("time_upper_limit")
    private Integer timeUpperLimit;

    @ApiModelProperty("扭矩类型 1设计扭矩2有载扭矩3空载扭矩")
    @TableField("torque_type")
    private String torqueType;

    @ApiModelProperty("开关次数")
    @TableField("open_times")
    private Integer openTimes;

    @ApiModelProperty("试验温度")
    @TableField("test_temp")
    private String testTemp;

    @ApiModelProperty("保温时长")
    @TableField("insulation_duration")
    private String insulationDuration;

    @ApiModelProperty("压力增量")
    @TableField("pressure_increment")
    private String pressureIncrement;

    @ApiModelProperty("保留时间")
    @TableField("keep_time")
    private String keepTime;
}
