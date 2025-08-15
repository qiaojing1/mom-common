package com.lets.platform.model.psi.entity;

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
 * 容器-物料
 * </p>
 *
 * @author csy
 * @since 2024-03-18
 */
@Getter
@Setter
@TableName("psi_container_material")
@ApiModel(value = "PsiContainerMaterial对象", description = "容器-物料")
public class PsiContainerMaterial extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ExcelIgnore
    @ApiModelProperty("容器主键")
    @TableField("container_id")
    private String containerId;

    @ExcelProperty("容器编码")
    @TableField(exist = false)
    private String containerCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String containerName;

    @ExcelIgnore
    @ExcelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @ExcelProperty("物料编码")
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ExcelIgnore
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ExcelIgnore
    @ApiModelProperty("规格型号")
    @TableField(exist = false)
    private String specs;

    @ExcelIgnore
    @ApiModelProperty("物料属性")
    @TableField(exist = false)
    private String typeName;
}
