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
 * @since 2024-01-19
 */
@Getter
@Setter
@TableName("mes_inspection_order_detail_unqualified_handle")
@ApiModel(value = "MesInspectionOrderDetailUnqualifiedHandle对象", description = "检验单物料明细不良品处理")
public class MesInspectionOrderDetailUnqualifiedHandle extends BaseEntity {

    @ApiModelProperty("检验单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("检验单明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    /**
     * 库存检验 :   1:报废;2:不良;3:返工;                  signCode:handleResult
     * 完工检验 :   1:报废;2:不良;3:返工;4:返修;           signCode:finishHandleResult
     */
    @ApiModelProperty("处理结果")
    @TableField("handle")
    private String handle;

    /**
     * 库存检验报废后续处理 :   1:置留;2:调拨;3:直接报废;          signCode:scrapAction
     * 库存检验不良后续处理 :   1:置留;2:调拨;;                   signCode:defectAction
     * 库存检验返工后续处理 :   1:置留;2:调拨;3:重工工单;           signCode:reworkAction
     */
    @ApiModelProperty("后续处理")
    @TableField("action")
    private String action;

    @ApiModelProperty("(仅库存检验)是否自动处理 Y是N否")
    @TableField("auto_solve")
    private String autoSolve;

    @ApiModelProperty("入库")
    @TableField("stock_in")
    private String stockIn;

    @ApiModelProperty("返修工序明细")
    @TableField(exist = false)
    private List<MesInspectionOrderDetailRepairProcess> repairProcessList;
}
