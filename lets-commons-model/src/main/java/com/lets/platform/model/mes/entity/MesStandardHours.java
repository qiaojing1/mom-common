package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * <p>
 * 车间额定负荷表
 * </p>
 *
 * @author FZY
 * @since 2024-07-15
 */
@Getter
@Setter
@TableName("mes_standard_hours")
@ApiModel(value = "MesStandardHours对象", description = "车间额定负荷表")
public class MesStandardHours extends BaseEntity {

    @ApiModelProperty("机械装配人数")
    @TableField("mechanical_assembly_number")
    private int mechanicalAssemblyNumber;

    @ApiModelProperty("电气装配人数")
    @TableField("electrical_assembly_number")
    private int electricalAssemblyNumber;

    @ApiModelProperty("辅助人数")
    @TableField("assistants_number")
    private int assistantsNumber;

    @ApiModelProperty("正常班工时")
    @TableField("hours")
    private int hours;

    @ApiModelProperty("加班工时")
    @TableField("overtime_hours")
    private int overtimeHours;

    @ApiModelProperty("总工时")
    @TableField("total_hours")
    private int totalHours;
}
