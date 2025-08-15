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

import java.util.List;

/**
 * <p>
 * 工装
 * </p>
 *
 * @author csy
 * @since 2024-11-08
 */
@Getter
@Setter
@TableName("collection_fixture")
@ApiModel(value = "CollectionFixture对象", description = "工装")
public class CollectionFixture extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("工装编号")
    @TableField("code")
    @ExcelProperty("工装编号")
    private String code;

    @ApiModelProperty("工装名称id")
    @TableField("fixture_name_id")
    @ExcelIgnore
    private String fixtureNameId;

    @ApiModelProperty("工装名称")
    @ExcelProperty("工装名称")
    @TableField("fixture_name")
    private String fixtureName;

    @ApiModelProperty("图号")
    @TableField("draw_no")
    @ExcelProperty("工装图号")
    private String drawNo;

    @ApiModelProperty("用途")
    @TableField("purpose")
    @ExcelProperty("用途")
    private String purpose;

    @ApiModelProperty("工装类型id")
    @TableField("type_id")
    @ExcelIgnore
    private String typeId;

    @ApiModelProperty("工装类型")
    @TableField("type_name")
    @ExcelProperty("工装类型")
    private String typeName;


    @ApiModelProperty("尺寸")
    @ExcelProperty("尺寸")
    @TableField("size")
    private String size;

    @ApiModelProperty("备注")
    @ExcelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("设计者")
    @TableField("designer")
    @ExcelIgnore
    private String designer;

    @ApiModelProperty("设计者")
    @TableField("designer_name")
    @ExcelProperty("设计者")
    private String designerName;

    @TableField(exist = false)
    @ExcelIgnore
    private List<CollectionFixtureListNo> listNos;
    @TableField(exist = false)
    @ExcelIgnore
    private List<CollectionFixtureDrawNo> drawNos;
}
