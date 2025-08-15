package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 检验方案配置明细表
 * </p>
 *
 * @author FZY
 * @since 2024-01-06
 */
@Getter
@Setter
@TableName("inspect_plan_config_detail")
@ApiModel(value = "InspectPlanConfigDetail对象", description = "检验方案配置明细表")
public class InspectPlanConfigDetail extends BaseEntity {

    @ApiModelProperty("行号")
    @TableField("line_number")
    @ExcelIgnore
    private Integer lineNumber;

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @ApiModelProperty("检验项目ID")
    @TableField("inspection_item_id")
    @ExcelIgnore
    private String inspectionItemId;

    @ApiModelProperty("检验项目ID")
    @TableField(exist = false)
    @ExcelProperty(value = "检验项目", index = 0)
    private String inspectionItemCode;

    @ApiModelProperty("检验项目名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectionItemName;

    @ApiModelProperty("检验位置")
    @TableField("inspection_location")
    @ExcelProperty(value = "检验位置", index = 1)
    private String inspectionLocation;

    @ApiModelProperty("分析类型")
    @TableField("analysis_type")
    @ExcelIgnore
    private String analysisType;

    @ApiModelProperty("是否手动录入")
    @TableField("is_manual")
    @ExcelIgnore
    private Integer isManual;

    @ApiModelProperty("分析类型名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String analysisTypeName;

    @ApiModelProperty("缺陷等级")
    @TableField("adverse_level")
    @ExcelIgnore
    private String adverseLevel;

    @ApiModelProperty("缺陷等级名称")
    @TableField(exist = false)
    @ExcelProperty(value = "缺陷等级", index = 2)
    private String adverseLevelName;

    @ApiModelProperty("抽样方案ID")
    @TableField("sampling_plan_id")
    @ExcelIgnore
    private String samplingPlanId;

    @ApiModelProperty("抽样方案名称")
    @TableField(exist = false)
    @ExcelProperty(value = "抽样方案", index = 3)
    private String samplingPlanCode;

    @ApiModelProperty("抽样方案名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String samplingPlanName;

    @ApiModelProperty("检验水平名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectionLevelName;

    @ApiModelProperty("严格程度名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String samplingRigorLevelName;

    @ApiModelProperty("AQL")
    @TableField(exist = false)
    @ExcelIgnore
    private String aql;

    @ApiModelProperty("重点检验[Y:是;N:否]")
    @TableField("important")
    @ExcelProperty(value = "重点检验", index = 4)
    private String important;

    @ApiModelProperty("必检[1:是;0:否]")
    @TableField("required")
    @ExcelIgnore
    private Integer required;

    @ApiModelProperty("检验要求")
    @TableField("requirement")
    @ExcelProperty(value = "检验要求", index = 5)
    private String requirement;

    @ApiModelProperty("破坏性检验[Y:是;N:否]")
    @TableField("destruction")
    @ExcelProperty(value = "破坏性检验", index = 6)
    private String destruction;

    @ApiModelProperty("勾稽数量[Y/N]")
    @TableField("cross_check")
    @ExcelProperty(value = "勾稽数量", index = 7)
    private String crossCheck;

    @TableField(exist = false)
    @ExcelIgnore
    private String crossCheckName;

    @ApiModelProperty("检验仪器ID")
    @TableField("device_id")
    @ExcelIgnore
    private String deviceId;

    @ApiModelProperty("检验仪器编码")
    @TableField(exist = false)
    @ExcelProperty(value = "检验仪器", index = 16)
    private String deviceCode;

    @ApiModelProperty("检验仪器名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String deviceName;

    @ApiModelProperty("比较符")
    @TableField("comparator")
    @ExcelIgnore
    private String comparator;

    @ApiModelProperty("比较符名称")
    @TableField(exist = false)
    @ExcelProperty(value = "比较符", index = 8)
    private String comparatorName;

    @ApiModelProperty("检验标准ID")
    @TableField("inspection_standard_id")
    @ExcelIgnore
    private String inspectionStandardId;

    @ApiModelProperty("检验标准编码")
    @TableField(exist = false)
    @ExcelProperty(value = "检验标准值(定性)", index = 9)
    private String inspectionStandardCode;

    @ApiModelProperty("检验标准名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectionStandardName;

    @ApiModelProperty("检验标准值")
    @TableField("inspection_standard_value")
    @ExcelIgnore
    private BigDecimal inspectionStandardValue;

    @ApiModelProperty("公差上限")
    @TableField("upper_tolerance_limit")
    @ExcelIgnore
    private BigDecimal upperToleranceLimit;

    @TableField(exist = false)
    @ExcelProperty(value = "公差上限", index = 11)
    private String upperToleranceLimitString;

    @ApiModelProperty("公差下限")
    @TableField("lower_tolerance_limit")
    @ExcelIgnore
    private BigDecimal lowerToleranceLimit;

    @TableField(exist = false)
    @ExcelProperty(value = "公差下限", index = 12)
    private String lowerToleranceLimitString;

    @ApiModelProperty("规范上限值")
    @TableField("over_limit")
    @ExcelIgnore
    private BigDecimal overLimit;

    @ApiModelProperty("规范下限值")
    @TableField("under_limit")
    @ExcelIgnore
    private BigDecimal underLimit;

    @TableField(exist = false)
    @ExcelProperty(value = "检验标准值(定量)", index = 10)
    private String inspectionStandardValueString;

    @TableField(exist = false)
    @ExcelProperty(value = "规范上限值", index = 13)
    private String overLimitString;

    @TableField(exist = false)
    @ExcelProperty(value = "规范下限值", index = 14)
    private String underLimitString;

    @ApiModelProperty("计量单位ID")
    @TableField("unit_id")
    @ExcelIgnore
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    @ExcelIgnore
    private String unitCode;

    @ApiModelProperty("计量单位")
    @TableField("unit_name")
    @ExcelProperty(value = "计量单位", index = 15)
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    @ExcelIgnore
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    @ExcelIgnore
    private String unitRoundOffType;
}
