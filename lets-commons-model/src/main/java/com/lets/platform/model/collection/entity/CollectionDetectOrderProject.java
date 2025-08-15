package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 试验项目
 * </p>
 *
 * @author csy
 * @since 2024-02-20
 */
@Getter
@Setter
@TableName("collection_detect_order_project")
@ApiModel(value = "CollectionDetectOrderProject对象", description = "试验项目")
public class CollectionDetectOrderProject extends BaseEntity {

    @TableField(exist = false)
    private String orderCode;

    @ApiModelProperty("工单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("试验类型")
    @TableField("test_type")
    private String testType;
    @TableField(exist = false)
    private String testTypeName;

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

    @ApiModelProperty("最大压力")
    @TableField("max_pressure")
    private String maxPressure;

    @ApiModelProperty("保压时长")
    @TableField("hold_time")
    private String holdTime;

    @ApiModelProperty("泄漏率")
    @TableField("leakage_rate")
    private String leakageRate;


    @TableField("leakage_unit_id")
    private String leakageUnitId;
    @ApiModelProperty("泄漏率单位")
    @TableField("leakage_unit")
    private String leakageUnit;

    @ApiModelProperty("最大扭矩")
    @TableField("max_torque")
    private String maxTorque;

    @ApiModelProperty("是否限制最大压力")
    @TableField("is_max_pressure")
    private String isMaxPressure;

    @ApiModelProperty("是否考察哦泄漏率")
    @TableField("is_check_leakage")
    private String isCheckLeakage;

    @ApiModelProperty("超过最大压力判定不合格")
    @TableField("exceed_max_pressure_unqualified")
    private String exceedMaxPressureUnqualified;

    @TableField("required")
    @ApiModelProperty("是否必做")
    private Boolean required;
    @TableField("test_direction")
    @ApiModelProperty("试验方向")
    private String testDirection;

    @TableField("metering_method")
    @ApiModelProperty("计量方法")
    private String meteringMethod;

    @TableField("media_type")
    @ApiModelProperty("介质分类")
    private String mediaType;

    @TableField("valve_classify_id")
    @ApiModelProperty("阀门分类id")
    private String valveClassifyId;

    @ApiModelProperty("顺序")
    @TableField("step")
    private Integer step;

    @ApiModelProperty("动力源")
    @TableField("power_source")
    private String powerSource;
    @TableField(exist = false)
    private String powerSourceName;

    @ApiModelProperty("驱动力")
    @TableField("power_value")
    private String powerValue;

    @ApiModelProperty("试验方式")
    @TableField("test_method")
    private String testMethod;

    @ApiModelProperty("试验循环次数")
    @TableField("loop_times")
    private Integer loopTimes;

    @ApiModelProperty("试验内容")
    @TableField("test_content")
    private String testContent;

    @ApiModelProperty("时间下限")
    @TableField("time_lower_limit")
    private Integer timeLowerLimit;
    @ApiModelProperty("时间上限")
    @TableField("time_upper_limit")
    private Integer timeUpperLimit;

    @ApiModelProperty("开关次数")
    @TableField("open_times")
    private Integer openTimes;

    @TableField("test_temp")
    private String testTemp;
    @TableField("insulation_duration")
    private String insulationDuration;
    @TableField("pressure_increment")
    private String pressureIncrement;
    @TableField("keep_time")
    private String keepTime;

    @TableField(exist = false)
    private BigDecimal multi;
    @TableField(exist = false)
    private BigDecimal plus;
}
