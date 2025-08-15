package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 派工单-操作记录
 * @author DING WEI
 * @since 2024-01-22
 */
@Getter
@Setter
@TableName("mes_dispatch_operate_record")
@ApiModel(value = "MesDispatchOperateRecord对象", description = "派工单-操作记录")
public class MesDispatchOperateRecord extends BaseEntity {

    @ApiModelProperty("生产工单-主键")
    @TableField("produce_order_id")
    private String produceOrderId;

    @ApiModelProperty("生产工单-单号")
    @TableField("produce_order_code")
    private String produceOrderCode;

    @ApiModelProperty("生产工单-明细主键")
    @TableField("produce_detail_id")
    private String produceDetailId;

    @ApiModelProperty("工序计划主键")
    @TableField("process_plan_id")
    private String processPlanId;

    @ApiModelProperty("工序计划明细主键")
    @TableField("process_plan_detail_id")
    private String processPlanDetailId;

    @ApiModelProperty("工序任务-派工单主键")
    @TableField("dispatch_id")
    private String dispatchId;

    @ApiModelProperty("工序任务-派工单单号")
    @TableField("dispatch_code")
    private String dispatchCode;

    @ApiModelProperty("生成下游单据-主键(转移单|汇报单)")
    @TableField("generate_order_id")
    private String generateOrderId;
    @ApiModelProperty("生成下游单据-单号(转移单|汇报单)")
    @TableField("generate_order_code")
    private String generateOrderCode;

    @ApiModelProperty("生成下游单据-工单报工单主键")
    @TableField("generate_order_report_id")
    private String generateOrderReportId;

    @ApiModelProperty("生成的载具条码绑定的物料记录主键")
    @TableField("generate_container_material_record_ids")
    private String generateContainerMaterialRecordIds;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.DispatchOperateTypeEnum
     */
    @ApiModelProperty("操作类型[1:接收,2:报工]")
    @TableField("type")
    private String type;

    /**
     * @see com.lets.platform.model.psi.enums.IsOrNotEnum
     */
    @ApiModelProperty("是否撤销[0:否,1:是]")
    @TableField("is_revoke")
    private Integer isRevoke;

    @ApiModelProperty("接收之前的物料准备状态[YN]")
    @TableField("before_material_prepare")
    private String beforeMaterialPrepare;
    @ApiModelProperty("报工之前的任务准备状态[YN]")
    @TableField("before_task_prepare")
    private String beforeTaskPrepare;
    @ApiModelProperty("报工之前的完工确认(YN)")
    @TableField("before_finish_confirm")
    private String beforeFinishConfirm;

    @ApiModelProperty("尾料-计划外入库单")
    @TableField("surplus_stock_in_id")
    private String surplusStockInId;

    @ApiModelProperty("载具物料绑定数量处理结果")
    @TableField("container_number_result")
    private String containerNumberResult;
}
