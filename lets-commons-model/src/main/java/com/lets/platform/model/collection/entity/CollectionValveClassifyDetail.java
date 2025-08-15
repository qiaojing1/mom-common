package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
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
 * 阀门分类明细
 * </p>
 *
 * @author csy
 * @since 2024-01-08
 */
@Getter
@Setter
@TableName("collection_valve_classify_detail")
@ApiModel(value = "CollectionValveClassifyDetail对象", description = "阀门分类明细")
public class CollectionValveClassifyDetail extends BaseEntity {

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("阀门分类id")
    @TableField("valve_classify_id")
    private String valveClassifyId;

    @ApiModelProperty("阀门类型id")
    @TableField("valve_type_id")
    private String valveTypeId;

    @ApiModelProperty("阀门分类 + 标准 + 应用范围")
    @ExcelIgnore
    @TableField(exist = false)
    private String valveClassifyName;

    @ApiModelProperty("阀门类型名称")
    @ExcelIgnore
    @TableField(exist = false)
    private String typeName;

    @ExcelIgnore
    @TableField(exist = false)
    private String scopeName;
}
