package com.lets.platform.model.mes.entity;

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
 * 阀门尺寸数据库
 * </p>
 *
 * @author csy
 * @since 2025-06-04
 */
@Getter
@Setter
@TableName("mes_valve_size_base")
@ApiModel(value = "MesValveSizeBase对象", description = "阀门尺寸数据库")
public class MesValveSizeBase extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private String name;

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("标准")
    @TableField("standard_id")
    @ExcelIgnore
    private String standardId;

    @ApiModelProperty("标准")
    @TableField("standard_name")
    @ExcelProperty("标准")
    private String standardName;

    @ExcelIgnore
    @ApiModelProperty("阀门分类")
    @TableField("valve_classify_id")
    private String valveClassifyId;

    @ExcelProperty("阀门分类")
    @ApiModelProperty("阀门分类")
    @TableField("valve_classify_name")
    private String valveClassifyName;

    @ExcelIgnore
    @ApiModelProperty("尺寸类型")
    @TableField("size_type")
    private String sizeType;
    @ExcelProperty("尺寸类型")
    @TableField(exist = false)
    private String sizeTypeName;

    @ExcelProperty("压力单位")
    @ApiModelProperty("压力单位")
    @TableField("pressure_unit")
    private String pressureUnit;

    @ExcelIgnore
    @ApiModelProperty("压力")
    @TableField("pressure_id")
    private String pressureId;

    @ExcelIgnore
    @ApiModelProperty("压力")
    @TableField("pressure_value")
    private BigDecimal pressureValue;
    @ExcelProperty("压力")
    @TableField(exist = false)
    private String pressureValueStr;
    @ExcelIgnore
    @TableField(exist = false)
    private String pressure;

    @ExcelProperty("口径单位")
    @ApiModelProperty("口径")
    @TableField("caliber_unit")
    private String caliberUnit;

    @ExcelIgnore
    @ApiModelProperty("口径")
    @TableField("caliber_id")
    private String caliberId;

    @ExcelIgnore
    @ApiModelProperty("口径")
    @TableField("caliber_value")
    private BigDecimal caliberValue;
    @ExcelIgnore
    @TableField(exist = false)
    private String caliberFractionValue;
    @ExcelProperty("口径")
    @TableField(exist = false)
    private String caliberValueStr;
    @ExcelIgnore
    @TableField(exist = false)
    private String caliber;

    @ExcelIgnore
    @ApiModelProperty("尺寸名称")
    @TableField("size_name_id")
    private String sizeNameId;

    @ExcelProperty("尺寸名称")
    @ApiModelProperty("尺寸名称")
    @TableField("size_name")
    private String sizeName;

    @ExcelIgnore
    @ApiModelProperty("尺寸代号")
    @TableField("size_name_mark")
    private String sizeNameMark;

    @ExcelIgnore
    @ApiModelProperty("公差等级")
    @TableField("tolerance_level")
    private String toleranceLevel;
    @ExcelProperty("公差等级")
    @TableField(exist = false)
    private String toleranceLevelName;

    @ExcelIgnore
    @ApiModelProperty("尺寸")
    @TableField("size")
    private BigDecimal size;
    @TableField(exist = false)
    @ExcelProperty("尺寸")
    private String sizeStr;

    @ExcelIgnore
    @ApiModelProperty("公差id")
    @TableField("tolerance_id")
    private String toleranceId;

    @ExcelIgnore
    @ApiModelProperty("上公差")
    @TableField("tolerance_max")
    private BigDecimal toleranceMax;
    @ExcelProperty("上公差")
    @TableField(exist = false)
    private String toleranceMaxStr;

    @ExcelIgnore
    @ApiModelProperty("下公差")
    @TableField("tolerance_min")
    private BigDecimal toleranceMin;
    @TableField(exist = false)
    @ExcelProperty("下公差")
    private String toleranceMinStr;

}
