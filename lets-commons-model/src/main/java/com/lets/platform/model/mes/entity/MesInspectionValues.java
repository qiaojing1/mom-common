package com.lets.platform.model.mes.entity;

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
import org.hibernate.validator.constraints.Length;

/**
 * <p>
 * 检验值配置
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("mes_inspection_values")
@ApiModel(value = "MesInspectionValues对象", description = "检验值配置")
public class MesInspectionValues extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelProperty("值编码")
    @Length(min = 1, max = 20, message = "MesInspectionValues.code.length")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelProperty("值名称")
    @Length(min = 1, max = 40, message = "MesInspectionValues.name.length")
    private String name;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelProperty("描述")
    @Length(min = 1, max = 40, message = "MesInspectionValues.remark.length")
    private String remark;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @ExcelIgnore
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @ExcelIgnore
    @TableField(exist = false)
    private int index;
}
