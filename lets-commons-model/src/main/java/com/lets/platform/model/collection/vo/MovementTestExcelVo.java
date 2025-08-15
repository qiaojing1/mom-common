package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


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
@ApiModel(value = "MovementTestExcelVo", description = "动作实验标准")
public class MovementTestExcelVo extends BaseEntity {

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
    private BigDecimal caliberDnStart;
    @TableField(exist = false)
    @ExcelProperty("口径（DN）最小值")
    private String caliberDNStartStr;

    @ExcelIgnore
    @ApiModelProperty("口径dn范围结束")
    @TableField("caliber_dn_end")
    private BigDecimal caliberDnEnd;
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

    @ExcelProperty("动力源")
    private String powerSourceName;
    @ExcelIgnore
    private String powerSource;

    @ExcelProperty("驱动力")
    private String powerValue;

    @ExcelProperty("试验方式")
    private String testMethodName;
    @ExcelIgnore
    private String testMethod;

    @ExcelProperty("试验循环次数")
    private String loopTimesStr;
    @ExcelIgnore
    private Integer loopTimes;

    @ExcelProperty("测试内容")
    private String testContentName;
    @ExcelIgnore
    private String testContent;

    @ExcelProperty("扭矩计算参数")
    private String torqueTypeName;
    @ExcelIgnore
    private String torqueType;

    @ExcelProperty("扭矩计算系数")
    private String maxTorqueMultiFactor;

    @ExcelProperty("扭矩计算加数")
    private String maxTorquePlusFactor;
    @ExcelIgnore
    private String maxTorque;

    @ExcelProperty("时间最小值（s）")
    private String timeLowerLimitStr;
    @ExcelIgnore
    private Integer timeLowerLimit;
    @ExcelProperty("时间最大值（s）")
    private String timeUpperLimitStr;
    @ExcelIgnore
    private Integer timeUpperLimit;

    @ExcelProperty("备注")
    private String remark;

}
