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
 * 油漆方案
 * </p>
 *
 * @author csy
 * @since 2025-08-11
 */
@Getter
@Setter
@TableName("mes_painting_plan")
@ApiModel(value = "MesPaintingPlan对象", description = "油漆方案")
public class MesPaintingPlan extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("方案代号")
    @TableField("code")
    @ExcelProperty("方案代号")
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    @ExcelProperty("方案名称")
    private String name;

    @ApiModelProperty("防腐等级")
    @TableField("grade")
    @ExcelIgnore
    private String grade;

    @TableField(exist = false)
    @ExcelProperty("防腐等级")
    private String gradeName;

    @ApiModelProperty("适用温度最小值")
    @TableField("temperature_min")
    @ExcelIgnore
    private BigDecimal temperatureMin;
    @TableField(exist = false)
    @ExcelProperty("适用温度最小值（℃）")
    private String temperatureMinStr;

    @ApiModelProperty("适用温度最大值")
    @TableField("temperature_max")
    @ExcelIgnore
    private BigDecimal temperatureMax;
    @TableField(exist = false)
    @ExcelProperty("适用温度最大值（℃）")
    private String temperatureMaxStr;

    @TableField(exist = false)
    @ExcelIgnore
    private String temperature;

    @ApiModelProperty("总厚度")
    @TableField("thick")
    @ExcelIgnore
    private BigDecimal thick;
    @TableField(exist = false)
    @ExcelProperty("总厚度（μm）")
    private String thickStr;

    @ApiModelProperty("适用范围")
    @TableField("remark")
    @ExcelProperty("适用范围")
    private String remark;

    @ApiModelProperty("底漆-涂料种类")
    @TableField("bottom_coating_type")
    @ExcelProperty("底漆涂料种类")
    private String bottomCoatingType;

    @ApiModelProperty("底漆道数")
    @TableField("bottom_layers")
    @ExcelIgnore
    private Integer bottomLayers;
    @TableField(exist = false)
    @ExcelProperty("底漆道数")
    private String bottomLayersStr;

    @ApiModelProperty("底漆厚度")
    @TableField("bottom_thick")
    @ExcelIgnore
    private BigDecimal bottomThick;
    @TableField(exist = false)
    @ExcelProperty("底漆厚度")
    private String bottomThickStr;

    @ApiModelProperty("中间漆-涂料种类")
    @TableField("middle_coating_type")
    @ExcelProperty("中间漆涂料种类")
    private String middleCoatingType;

    @ApiModelProperty("中间漆道数")
    @TableField("middle_layers")
    @ExcelIgnore
    private Integer middleLayers;
    @TableField(exist = false)
    @ExcelProperty("中间漆道数")
    private String middleLayersStr;

    @ApiModelProperty("中间漆厚度")
    @TableField("middle_thick")
    @ExcelIgnore
    private BigDecimal middleThick;
    @TableField(exist = false)
    @ExcelProperty("中间漆厚度")
    private String middleThickStr;


    @ApiModelProperty("面漆-涂料种类")
    @TableField("surface_coating_type")
    @ExcelProperty("面漆涂料种类")
    private String surfaceCoatingType;

    @ApiModelProperty("面漆道数")
    @TableField("surface_layers")
    @ExcelIgnore
    private Integer surfaceLayers;
    @TableField(exist = false)
    @ExcelProperty("面漆道数")
    private String surfaceLayersStr;

    @ApiModelProperty("面漆厚度")
    @TableField("surface_thick")
    @ExcelIgnore
    private BigDecimal surfaceThick;
    @TableField(exist = false)
    @ExcelProperty("面漆厚度")
    private String surfaceThickStr;
}
