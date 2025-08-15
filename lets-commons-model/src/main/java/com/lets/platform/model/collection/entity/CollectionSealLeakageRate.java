package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
 * 密封试验泄漏率
 * </p>
 *
 * @author csy
 * @since 2024-01-16
 */
@Getter
@Setter
@TableName("collection_seal_leakage_rate")
@ApiModel(value = "CollectionSealLeakageRate对象", description = "密封试验泄漏率")
public class CollectionSealLeakageRate extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ExcelIgnore
    @TableField(exist = false)
    private String Name;

    @ApiModelProperty("标准id")
    @ExcelIgnore
    @TableField("standard_id")
    private String standardId;
    @TableField(exist = false)
    @ExcelProperty("标准")
    private String standardName;

    @ApiModelProperty("口径id")
    @ExcelIgnore
    @TableField("caliber_id")
    private String caliberId;
    @TableField(exist = false)
    @ExcelProperty("口径（DN）")
    private String dnName;
    @TableField(exist = false)
    @ExcelProperty("口径（NPS）")
    private String npsName;


    @ExcelIgnore
    @ApiModelProperty("介质分类")
    @TableField("media_type")
    private String mediaType;
    @TableField(exist = false)
    @ExcelProperty("介质分类")
    private String mediaTypeName;

    @ApiModelProperty("阀门分类id")
    @ExcelIgnore
    @TableField("valve_classify_id")
    private String valveClassifyId;
    @TableField(exist = false)
    @ExcelProperty("阀门分类")
    private String valveClassifyName;

    @ApiModelProperty("泄漏率")
    @ExcelIgnore
    @TableField("leakage_rate")
    private String leakageRate;

    @ApiModelProperty("泄漏等级id")
    @TableField("leakage_level_id")
    @ExcelIgnore
    private String leakageLevelId;
    @TableField(exist = false)
    @ExcelProperty("泄漏等级")
    private String leakageLevelName;

    @ExcelProperty("泄漏率系数")
    @TableField(exist = false)
    private String multiFactor;
    @ExcelProperty("泄漏率加数")
    @TableField(exist = false)
    private String plusFactor;


    @ApiModelProperty("泄漏率单位")
    @TableField("leakage_rate_unit_id")
    @ExcelIgnore
    private String leakageRateUnitId;
    @TableField(exist = false)
    @ExcelProperty("泄漏率单位")
    private String leakageRateUnitName;


    @ExcelIgnore
    @ApiModelProperty("密封方式(1弹性密封 2金属密封)")
    @TableField("seal_type")
    private String sealType;
    @TableField(exist = false)
    @ExcelProperty("密封方式")
    private String sealTypeName;


    @ExcelProperty("备注")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("计算出的泄漏率结果")
    private String sealRate;

}
