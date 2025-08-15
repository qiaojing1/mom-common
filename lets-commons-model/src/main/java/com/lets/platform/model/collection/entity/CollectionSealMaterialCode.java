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
 * 密封面材质代号
 * </p>
 *
 * @author csy
 * @since 2024-04-08
 */
@Getter
@Setter
@TableName("collection_seal_material_code")
@ApiModel(value = "CollectionSealMaterialCode对象", description = "密封面材质代号")
public class CollectionSealMaterialCode extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("代号")
    @TableField("code")
    @ExcelProperty("代号")
    private String code;

    @ApiModelProperty("密封面或衬里材料")
    @TableField("material")
    @ExcelProperty("密封面或衬里材料")
    private String material;

    @ApiModelProperty("密封方式")
    @TableField("seal_method")
    @ExcelIgnore
    private String sealMethod;
    @TableField(exist = false)
    @ExcelProperty("密封方式")
    private String sealMethodName;

    @ApiModelProperty("默认泄漏等级")
    @TableField("default_leakage_level")
    @ExcelProperty("默认泄漏等级")
    private String defaultLeakageLevel;


    @ApiModelProperty("候选泄漏等级")
    @TableField("leakage_level")
    @ExcelProperty("候选泄漏等级")
    private String leakageLevel;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;
}
