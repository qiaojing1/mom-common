package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 逸散性泄漏试验
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-02-18
 */
@Getter
@Setter
@TableName("collection_evasive_leakage_test")
@ApiModel(value = "CollectionEvasiveLeakageTest对象", description = "逸散性泄漏试验")
public class CollectionEvasiveLeakageTest extends BaseEntity {

    @ApiModelProperty("标准id")
    @TableField("standard_id")
    @ExcelIgnore
    private String standardId;
    @TableField(exist = false)
    @ExcelProperty("标准")
    private String standardName;

    @ApiModelProperty("阀门分类id")
    @TableField("valve_classify_id")
    @ExcelIgnore
    private String valveClassifyId;
    @TableField(exist = false)
    @ExcelProperty("阀门分类")
    private String valveClassifyName;

    @ApiModelProperty("密封方式 0:阀杆密封 1:阀体密封")
    @TableField("seal_type")
    @ExcelIgnore
    private String sealType;
    @TableField(exist = false)
    @ExcelProperty("密封方式")
    private String sealTypeName;

    @ApiModelProperty("泄漏等级id")
    @TableField("leakage_level_id")
    @ExcelIgnore
    private String leakageLevelId;
    @TableField(exist = false)
    @ExcelProperty("泄漏等级")
    private String leakageLevelName;


    @ApiModelProperty("口径dn范围起始")
    @TableField("caliber_dn_start")
    @ExcelIgnore
    private BigDecimal caliberDnStart;
    @TableField(exist = false)
    @ExcelProperty("口径（DN）最小值")
    private String caliberDnStartStr;
    @ApiModelProperty("口径dn范围结束")
    @TableField("caliber_dn_end")
    @ExcelIgnore
    private BigDecimal caliberDnEnd;
    @TableField(exist = false)
    @ExcelProperty("口径（DN）最大值")
    private String caliberDnEndStr;
    @TableField(exist = false)
    @ExcelIgnore
    private String dnRange;

    @ApiModelProperty("口径nps范围起始")
    @TableField("caliber_nps_start")
    @ExcelIgnore
    private BigDecimal caliberNpsStart;
    @TableField(exist = false)
    @ExcelProperty("口径（NPS）最小值")
    private String caliberNpsStartStr;
    @ApiModelProperty("口径nps范围结束")
    @TableField("caliber_nps_end")
    @ExcelIgnore
    private BigDecimal caliberNpsEnd;
    @ExcelProperty("口径（NPS）最大值")
    @TableField(exist = false)
    private String caliberNpsEndStr;
    @TableField(exist = false)
    @ExcelIgnore
    private String npsRange;

    @ApiModelProperty("压力class范围起始")
    @TableField("pressure_class_start")
    @ExcelIgnore
    private BigDecimal pressureClassStart;
    @ExcelProperty("压力（Class）最小值")
    @TableField(exist = false)
    private String pressureClassStartStr;
    @ApiModelProperty("压力class范围起始")
    @TableField("pressure_class_end")
    @ExcelIgnore
    private BigDecimal pressureClassEnd;
    @ExcelProperty("压力（Class）最大值")
    @TableField(exist = false)
    private String pressureClassEndStr;
    @TableField(exist = false)
    @ExcelIgnore
    private String clzRange;

    @ApiModelProperty("压力pn范围起始")
    @TableField("pressure_pn_start")
    @ExcelIgnore
    private BigDecimal pressurePnStart;
    @ExcelProperty("压力（PN）最小值")
    @TableField(exist = false)
    private String pressurePnStartStr;
    @ApiModelProperty("压力pn范围起始")
    @TableField("pressure_pn_end")
    @ExcelIgnore
    private BigDecimal pressurePnEnd;
    @ExcelProperty("压力（PN）最大值")
    @TableField(exist = false)
    private String pressurePnEndStr;
    @TableField(exist = false)
    @ExcelIgnore
    private String pnRange;

    @ApiModelProperty("项目id")
    @TableField("project_id")
    @ExcelIgnore
    private String projectId;
    @TableField(exist = false)
    @ExcelProperty("试验项目")
    private String projectName;

    @ApiModelProperty("泄漏率系数1 0:阀杆直径 1:密封圈外径 2:额定容量")
    @TableField("leakage_type")
    @ExcelIgnore
    private String leakageType;
    @TableField(exist = false)
    @ExcelProperty("泄漏率计算参数")
    private String leakageTypeName;

    @TableField("formula")
    @ExcelProperty("泄漏率计算公式")
    private String formula;

    @ApiModelProperty("泄漏率系数2 浮点数")
    @ExcelIgnore
    @TableField(exist = false)
    private String leakageRateName;

    @ApiModelProperty("泄漏率单位id")
    @TableField("leakage_unit_id")
    @ExcelIgnore
    private String leakageUnitId;
    @TableField(exist = false)
    @ExcelProperty("泄漏率单位")
    private String leakageUnitName;

    @TableField(exist = false)
    @ExcelIgnore
    private String name;

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;


    @TableField("html")
    @ExcelIgnore
    private String html;


    @ExcelIgnore
    @TableField(exist = false)
    private String detectDirection;

    @ExcelIgnore
    @TableField(exist = false)
    private String measurementMethod;

    @ExcelIgnore
    @TableField(exist = false)
    private String isCheckLeakage;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer step;


}
