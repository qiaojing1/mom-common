package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonShiftTimes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 班制管理表体
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-12-19
 */
@Getter
@Setter
@TableName("mes_shift_system_detail")
@ApiModel(value = "MesShiftSystemDetail对象", description = "班制管理表体")
public class MesShiftSystemDetail extends BaseEntity {

    @ApiModelProperty("班次id")
    @TableField("shift_id")
    @ExcelIgnore
    private String shiftId;

    @ApiModelProperty("班制id")
    @TableField("shift_system_id")
    @ExcelIgnore
    private String shiftSystemId;

    @TableField(exist = false)
    @ExcelProperty("班制编码")
    private String systemCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String systemName;

    @ApiModelProperty("班次编码")
    @TableField("code")
    @ExcelProperty("班次编码")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelIgnore
    private String name;

    @ApiModelProperty("总时长（小时）")
    @TableField("total_hour")
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalHour;

    @ApiModelProperty("上班时间（时:分）")
    @TableField("start_work_time")
    @ExcelIgnore
    private String startWorkTime;

    @ApiModelProperty("下班时间（时:分）")
    @TableField("end_work_time")
    @ExcelIgnore
    private String endWorkTime;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelIgnore
    private String remark;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    @ExcelIgnore
    private Short enable;

    /**
     * 前端使用 列表里的下标
     */
    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    private int index;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    private List<CommonShiftTimes> times;
}
