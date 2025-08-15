package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * <p>
 * MRP定时任务
 * </p>
 *
 * @author FZY
 * @since 2025-03-25
 */
@Getter
@Setter
@TableName("psi_plan_scheduled_task_serial_number")
@ApiModel(value = "PsiPlanScheduledTaskSerialNumber对象", description = "MRP定时任务")
public class PsiPlanScheduledTaskSerialNumber extends BaseEntity {

    @ApiModelProperty("MPS/MRP")
    @TableField("type")
    private String type;

    @ApiModelProperty("当前流水号")
    @TableField("value")
    private Integer value;

    @ApiModelProperty("日期")
    @TableField("date")
    private LocalDate date;
}
