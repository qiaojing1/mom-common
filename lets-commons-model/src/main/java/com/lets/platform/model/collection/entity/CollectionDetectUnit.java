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

/**
 * <p>
 * 口径压力单位匹配配置
 * </p>
 *
 * @author csy
 * @since 2024-04-10
 */
@Getter
@Setter
@TableName("collection_detect_unit")
@ApiModel(value = "CollectionDetectUnit对象", description = "口径压力单位匹配配置")
public class CollectionDetectUnit extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;


    @ApiModelProperty("代号")
    @TableField("code")
    @ExcelProperty("代号")
    private String code;

    @ApiModelProperty("单位")
    @TableField("unit")
    @ExcelProperty("单位")
    private String unit;

    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("值")
    @TableField("value")
    private String value;

    @ApiModelProperty("1:口径 2:压力 3:驱动方式 4:压力等级 5:材质")
    @TableField("type")
    @ExcelIgnore
    private String type;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;


}
