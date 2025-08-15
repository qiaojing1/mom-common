package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * 容器管理
 * @author csy
 * @since 2024-03-18
 */
@Getter
@Setter
@TableName("psi_container")
@ApiModel(value = "PsiContainer对象", description = "容器管理")
public class PsiContainer extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ExcelProperty("容器编码")
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ExcelProperty("容器名称")
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    /**
     * @see com.lets.platform.model.psi.enums.ContainerTypeEnum
     */
    @ExcelIgnore
    @ApiModelProperty("容器类型 1托盘 2包装箱 3转运容器")
    @TableField("container_type")
    private Integer containerType;
    @ExcelProperty("容器类型")
    @TableField(exist = false)
    private String containerTypeName;

    @ExcelIgnore
    @ApiModelProperty("容器限重（KG）")
    @TableField("weight_limit")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal weightLimit;
    @ExcelProperty("容器限重（KG）")
    @TableField(exist = false)
    private String weightLimitStr;

    @ExcelIgnore
    @ApiModelProperty("长（m）")
    @TableField("length")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal length;
    @ExcelProperty("长（m）")
    @TableField(exist = false)
    private String lengthStr;

    @ExcelIgnore
    @ApiModelProperty("宽（m）")
    @TableField("width")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal width;
    @ExcelProperty("宽（m）")
    @TableField(exist = false)
    private String widthStr;

    @ExcelIgnore
    @ApiModelProperty("高（m）")
    @TableField("height")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal height;

    @ExcelProperty("高（m）")
    @TableField(exist = false)
    private String heightStr;

    @ExcelIgnore
    @ApiModelProperty("容量")
    @TableField("capacity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer capacity;
    @ExcelProperty("容量")
    @TableField(exist = false)
    private String capacityStr;

    @ExcelIgnore
    @ApiModelProperty("最大装箱数")
    @TableField("max_packing")
    private Integer maxPacking;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiContainerMaterial> psiContainerMaterialList;
}
