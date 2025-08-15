package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 检验单物料明细不良品处理
 * </p>
 *
 * @author FZY
 * @since 2025-06-26
 */
@Getter
@Setter
@TableName("mes_inspection_unqualified_task_detail")
@ApiModel(value = "MesInspectionUnqualifiedTaskDetail对象", description = "检验单物料明细不良品处理")
public class MesInspectionUnqualifiedTaskDetail extends BaseEntity {

    @ApiModelProperty("检验单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("检验单明细ID")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("不良品处理任务ID")
    @TableField("task_id")
    private String taskId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("处理结果[1:报废;2:让步接收;3:重工;4:返修]")
    @TableField("handle")
    private String handle;

    @ApiModelProperty("入库标识")
    @TableField("stock_in")
    private String stockIn;

    @ApiModelProperty("后续处理")
    @TableField("action")
    private String action;

    @ApiModelProperty("是否自动处理 Y是N否")
    @TableField("auto_solve")
    private String autoSolve;

    @ApiModelProperty("返修工序明细")
    @TableField(exist = false)
    private List<MesInspectionOrderDetailRepairProcess> repairProcessList;
}
