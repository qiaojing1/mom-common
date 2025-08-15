package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 班制管理表头
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-12-19
 */
@Getter
@Setter
@TableName("mes_shift_system")
@ApiModel(value = "MesShiftSystem对象", description = "班制管理表头")
public class MesShiftSystem extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelProperty("班制编码")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelProperty("班制名称")
    private String name;

    @ApiModelProperty("总时长（小时）")
    @TableField("total_hour")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    private BigDecimal totalHour;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelIgnore
    private String remark;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    @ExcelIgnore
    private Short enable;
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("班次信息")
    private List<MesShiftSystemDetail> details;

    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private int excelIndex;
}
