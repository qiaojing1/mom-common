package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 计划运算定时任务明细
 * </p>
 *
 * @author FZY
 * @since 2023-12-20
 */
@Getter
@Setter
@TableName("psi_plan_scheduled_task_detail")
public class PsiPlanScheduledTaskDetail extends BaseEntity {

    @ApiModelProperty("是否选中")
    @TableField(exist = false)
    private Integer selected;

    @ApiModelProperty("定时任务ID")
    @TableField("scheduled_task_id")
    private String scheduledTaskId;

    @ApiModelProperty("单据性质名称")
    @TableField(exist = false)
    private String orderTypeName;

    @ApiModelProperty("单据类别ID")
    @TableField("category_id")
    private String categoryId;

    @ApiModelProperty("单据类别名称")
    @TableField(exist = false)
    private String categoryName;

    @ApiModelProperty("只考虑未计算的单据[0:否;1:是]")
    @TableField("only_not_calculated_order")
    private Integer onlyNotCalculatedOrder;
}
