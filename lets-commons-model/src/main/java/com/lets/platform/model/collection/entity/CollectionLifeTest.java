package com.lets.platform.model.collection.entity;

import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * <p>
 * 寿命试验/流阻
 * </p>
 *
 * @author csy
 * @since 2024-10-14
 */
@Data
@TableName("collection_life_test")
@ApiModel(value = "CollectionLifeTest对象", description = "寿命试验")
public class CollectionLifeTest extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ExcelIgnore
    @ApiModelProperty("标准id")
    @TableField("standard_id")
    private String standardId;

    @ExcelProperty("标准")
    @ApiModelProperty("标准")
    @TableField("standard_name")
    private String standardName;

    @ExcelProperty("口径单位")
    @ApiModelProperty("口径单位")
    @TableField("caliber_unit")
    private String caliberUnit;

    @ExcelProperty("口径最小值")
    @ApiModelProperty("口径dn范围起始")
    @TableField("caliber_start")
    private String caliberStart;

    @ExcelProperty("口径最大值")
    @ApiModelProperty("口径dn范围结束")
    @TableField("caliber_end")
    private String caliberEnd;
    @ExcelIgnore
    @TableField(exist = false)
    private String caliber;

    @ExcelProperty("压力单位")
    @ApiModelProperty("压力单位")
    @TableField("pressure_unit")
    private String pressureUnit;

    @ExcelIgnore
    @ApiModelProperty("压力单位")
    @TableField("pressure_unit_id")
    private String pressureUnitId;

    @ExcelProperty("压力最小值")
    @TableField(exist = false)
    private String pressureStartStr;
    @ExcelIgnore
    @ApiModelProperty("压力最小值")
    @TableField("pressure_start")
    private BigDecimal pressureStart;

    @ExcelProperty("压力最大值")
    @TableField(exist = false)
    private String pressureEndStr;
    @ExcelIgnore
    @ApiModelProperty("压力最大值")
    @TableField("pressure_end")
    private BigDecimal pressureEnd;
    @ExcelIgnore
    @TableField(exist = false)
    private String pressure;

    @ExcelIgnore
    @ApiModelProperty("阀门分类id")
    @TableField("valve_classify_id")
    private String valveClassifyId;

    @ExcelProperty("阀门分类")
    @ApiModelProperty("阀门分类")
    @TableField("valve_classify_name")
    private String valveClassifyName;

    @ExcelIgnore
    @ApiModelProperty("项目id")
    @TableField("project_id")
    private String projectId;

    @ExcelProperty("项目")
    @ApiModelProperty("项目")
    @TableField("project_name")
    private String projectName;

    @ExcelIgnore
    @ApiModelProperty("介质分类")
    @TableField("media_type")
    private String mediaType;
    @ExcelProperty("介质分类")
    @TableField(exist = false)
    private String mediaTypeName;


    @ExcelProperty("试验压力系数")
    @ApiModelProperty("试验压力系数")
    @TableField("test_pressure_multi")
    private String testPressureMulti;

    @ExcelProperty("试验压力加数")
    @ApiModelProperty("试验压力加数")
    @TableField("test_pressure_plus")
    private String testPressurePlus;
    @ExcelIgnore
    @TableField(exist = false)
    private String testPressure;

    @ExcelProperty("保压时长")
    @TableField(exist = false)
    private String holdTimeStr;
    @ExcelIgnore
    @TableField("hold_time")
    private Long holdTime;

    @ExcelProperty("开关次数")
    @TableField(exist = false)
    private String openTimesStr;
    @ExcelIgnore
    @ApiModelProperty("开关次数")
    @TableField("open_times")
    private Integer openTimes;


    @ExcelProperty("循环次数")
    @TableField(exist = false)
    private String loopTimesStr;
    @ExcelIgnore
    @ApiModelProperty("试验循环次数")
    @TableField("loop_times")
    private Integer loopTimes;

    @ExcelIgnore
    @ApiModelProperty("最大允许泄漏率")
    @TableField("max_leakage_rate")
    private String maxLeakageRate;

    @ExcelIgnore
    @ApiModelProperty("泄漏率单位")
    @TableField("leakage_unit_id")
    private String leakageUnitId;

    @ExcelIgnore
    @ApiModelProperty("泄漏率单位")
    @TableField("leakage_unit_name")
    private String leakageUnitName;

    @ExcelProperty("试验类型")
    @ApiModelProperty("是否必做 Y是")
    @TableField("required")
    private String required;
    @ExcelIgnore
    @TableField(exist = false)
    private String requiredName;

    @ExcelProperty("备注")
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @TableField("type")
    private String type;

    @ExcelIgnore
    @TableField(exist = false)
    private String name;
    @ExcelIgnore
    @TableField(exist = false)
    private String caliberRepeat;

    public boolean hasSpecialCaliber() {
        return !StrUtil.isNumeric(caliberStart.replace(".", "")) || !StrUtil.isNumeric(caliberEnd.replace(".", ""));
    }
}
