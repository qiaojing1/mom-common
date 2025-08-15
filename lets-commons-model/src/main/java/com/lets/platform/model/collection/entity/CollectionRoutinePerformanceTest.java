package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.ws.BindingType;

/**
 * <p>
 * 常规性能试验
 * </p>
 *
 * @author csy
 * @since 2024-01-22
 */
@Getter
@Setter
@TableName("collection_routine_performance_test")
@ApiModel(value = "CollectionRoutinePerformanceTest对象", description = "常规性能试验")
public class CollectionRoutinePerformanceTest extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ExcelIgnore
    @TableField(exist = false)
    private String name;

    @ExcelIgnore
    @ApiModelProperty("标准id")
    @TableField("standard_id")
    private String standardId;
    @TableField(exist = false)
    @ExcelProperty("标准")
    private String standardName;

    @ExcelIgnore
    @ApiModelProperty("口径dn范围起始")
    @TableField("caliber_dn_start")
    private String caliberDnStart;
    @TableField(exist = false)
    @ExcelProperty("口径（DN）最小值")
    private String caliberDNStartStr;

    @ExcelIgnore
    @ApiModelProperty("口径dn范围结束")
    @TableField("caliber_dn_end")
    private String caliberDnEnd;
    @TableField(exist = false)
    @ExcelProperty("口径（DN）最大值")
    private String caliberDnEndStr;

    @ExcelIgnore
    @TableField(exist = false)
    private String dnRange;

    @ExcelIgnore
    @ApiModelProperty("口径nps范围起始")
    @TableField("caliber_nps_start")
    private BigDecimal caliberNpsStart;
    @TableField(exist = false)
    @ExcelProperty("口径（NPS）最小值")
    private String caliberNpsStartStr;

    @ExcelIgnore
    @ApiModelProperty("口径nps范围结束")
    @TableField("caliber_nps_end")
    private BigDecimal caliberNpsEnd;
    @TableField(exist = false)
    @ExcelProperty("口径（NPS）最大值")
    private String caliberNpsEndStr;

    @ExcelIgnore
    @TableField(exist = false)
    private String npsRange;

    @ExcelIgnore
    @ApiModelProperty("压力class范围起始")
    @TableField("pressure_class_start")
    private BigDecimal pressureClassStart;
    @ExcelProperty("压力（CLASS）最小值")
    @TableField(exist = false)
    private String pressureClassStartStr;

    @ExcelIgnore
    @ApiModelProperty("压力class范围起始")
    @TableField("pressure_class_end")
    private BigDecimal pressureClassEnd;
    @TableField(exist = false)
    @ExcelProperty("压力（CLASS）最大值")
    private String pressureClassEndStr;

    @ExcelIgnore
    @TableField(exist = false)
    private String clzRange;

    @ExcelIgnore
    @ApiModelProperty("压力pn范围起始")
    @TableField("pressure_pn_start")
    private BigDecimal pressurePnStart;
    @TableField(exist = false)
    @ExcelProperty("压力（PN）最小值")
    private String pressurePnStartStr;

    @ExcelIgnore
    @ApiModelProperty("压力pn范围起始")
    @TableField("pressure_pn_end")
    private BigDecimal pressurePnEnd;
    @TableField(exist = false)
    @ExcelProperty("压力（PN）最大值")
    private String pressurePnEndStr;

    @ExcelIgnore
    @TableField(exist = false)
    private String pnRange;

    @ExcelIgnore
    @ApiModelProperty("阀门分类id")
    @TableField("valve_classify_id")
    private String valveClassifyId;
    @TableField(exist = false)
    @ExcelProperty("阀门分类")
    private String valveClassifyName;

    @ExcelIgnore
    @ApiModelProperty("项目id")
    @TableField("project_id")
    private String projectId;
    @TableField(exist = false)
    @ExcelProperty("试验项目")
    private String projectName;

    @ExcelIgnore
    @ApiModelProperty("介质分类")
    @TableField("media_type")
    private String mediaType;
    @TableField(exist = false)
    @ExcelProperty("介质分类")
    private String mediaTypeName;

    @TableField("type")
    @ApiModelProperty("菜单类型")
    @ExcelIgnore
    private String type;

    @ExcelIgnore
    @ApiModelProperty("试验类型")
    @TableField("test_type")
    private String testType;
    @TableField(exist = false)
    @ExcelProperty("试验类型")
    private String testTypeName;

    @ExcelIgnore
    @ApiModelProperty("最大扭矩")
    @TableField(value="max_torque",updateStrategy = FieldStrategy.IGNORED)
    private String maxTorque;

    @ExcelIgnore
    @TableField(value="max_torque_multi_factor",updateStrategy = FieldStrategy.IGNORED)
    private String maxTorqueMultiFactor;

    @ExcelIgnore
    @TableField(value="max_torque_plus_factor",updateStrategy = FieldStrategy.IGNORED)
    private String maxTorquePlusFactor;


    @ExcelIgnore
    @TableField("test_temp")
    private String testTemp;
    @ExcelIgnore
    @TableField("insulation_duration")
    private String insulationDuration;
    @ExcelIgnore
    @TableField("pressure_increment")
    private String pressureIncrement;
    @ExcelIgnore
    @TableField("keep_time")
    private String keepTime;

    @ExcelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @ApiModelProperty("动力源")
    @TableField("power_source")
    private String powerSource;
    @ExcelIgnore
    @TableField(exist = false)
    private String powerSourceName;

    @ExcelIgnore
    @ApiModelProperty("驱动力")
    @TableField("power_value")
    private String powerValue;

    @ExcelIgnore
    @ApiModelProperty("试验方式")
    @TableField("test_method")
    private String testMethod;
    @ExcelIgnore
    @TableField(exist = false)
    private String testMethodName;

    @ExcelIgnore
    @ApiModelProperty("试验循环次数")
    @TableField("loop_times")
    private Integer loopTimes;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer openTimes;

    @ExcelIgnore
    @ApiModelProperty("试验内容")
    @TableField("test_content")
    private String testContent;
    @ExcelIgnore
    @TableField(exist = false)
    private String testContentName;

    @ExcelIgnore
    @ApiModelProperty("时间下限")
    @TableField(value = "time_lower_limit",updateStrategy = FieldStrategy.IGNORED)
    private Integer timeLowerLimit;
    @ExcelIgnore
    @ApiModelProperty("时间上限")
    @TableField(value="time_upper_limit",updateStrategy = FieldStrategy.IGNORED)
    private Integer timeUpperLimit;
    @ExcelIgnore
    @TableField(exist = false)
    private String time;

    @ExcelIgnore
    @ApiModelProperty("扭矩类型")
    @TableField("torque_type")
    private String torqueType;
    @ExcelIgnore
    @TableField(exist = false)
    private String torqueTypeName;


    @ExcelIgnore
    @TableField(exist = false)
    private String detectDirection;

    @ExcelIgnore
    @TableField(exist = false)
    private String measurementMethod;

    // 试验项目顺序
    @ExcelIgnore
    @TableField(exist = false)
    private Integer step;

    @ExcelIgnore
    @ApiModelProperty("是否考察泄漏率")
    @TableField(exist = false)
    private String isCheckLeakage;

    @ExcelIgnore
    @TableField(exist = false)
    private BigDecimal multi;
    @ExcelIgnore
    @TableField(exist = false)
    private BigDecimal plus;

    @ExcelIgnore
    @TableField(exist = false)
    private Long holdTime;
}
