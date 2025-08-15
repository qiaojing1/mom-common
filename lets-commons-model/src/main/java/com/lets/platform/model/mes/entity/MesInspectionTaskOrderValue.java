package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 检验任务-检验项目值
 * </p>
 *
 * @author FZY
 * @since 2025-06-18
 */
@Getter
@Setter
@TableName("mes_inspection_task_order_value")
@ApiModel(value = "MesInspectionTaskOrderValue对象", description = "检验任务-检验项目值")
public class MesInspectionTaskOrderValue extends BaseEntity {

    @ApiModelProperty("检验单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("检验单明细ID")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("检验任务ID")
    @TableField("task_id")
    private String taskId;

    @ApiModelProperty("行号")
    @TableField("row_index")
    private Integer rowIndex;

    @ApiModelProperty("列关键字")
    @TableField("column_key")
    private String columnKey;

    @ApiModelProperty("最小值")
    @TableField("min_value")
    private String minValue;

    @ApiModelProperty("最大值")
    @TableField("max_value")
    private String maxValue;

    @ApiModelProperty("检验值")
    @TableField(value = "value", updateStrategy = FieldStrategy.ALWAYS)
    private String value;

    @ApiModelProperty("显示值")
    @TableField(value = "display", updateStrategy = FieldStrategy.ALWAYS)
    private String display;

    public MesInspectionTaskOrderValue() {
    }

    public MesInspectionTaskOrderValue(MesInspectionTaskOrder task) {
        this.orderId = task.getOrderId();
        this.detailId = task.getDetailId();
        this.taskId = task.getId();
    }
}
