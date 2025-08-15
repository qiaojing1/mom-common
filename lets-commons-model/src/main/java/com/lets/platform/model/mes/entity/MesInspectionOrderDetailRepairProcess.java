package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 检验单明细返修工序表
 * </p>
 *
 * @author FZY
 * @since 2024-05-21
 */
@Getter
@Setter
@TableName("mes_inspection_order_detail_repair_process")
@ApiModel(value = "MesInspectionOrderDetailRepairProcess对象", description = "检验单明细返修工序表")
public class MesInspectionOrderDetailRepairProcess extends BaseEntity {

    @ApiModelProperty("检验单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("检验单明细ID")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("检验单物料明细不良品处理明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("工序计划-工序明细-工序ID")
    @TableField("process_plan_process_id")
    private String processPlanProcessId;

    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("步骤")
    @TableField(exist = false)
    private Integer processStep;

    @ApiModelProperty("步骤内部排序")
    @TableField(exist = false)
    private Integer processSort;

    @ApiModelProperty("是否计件")
    @TableField(value = "is_single_wage")
    private String isSingleWage;
}
