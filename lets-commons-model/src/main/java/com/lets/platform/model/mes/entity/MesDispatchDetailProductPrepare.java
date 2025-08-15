package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lets.platform.common.pojo.tools.JsonColSerializer;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 派工-明细-生产准备
 * @author DING WEI
 * @since 2024-01-09
 */
@Getter
@Setter
@TableName("mes_dispatch_detail_product_prepare")
@ApiModel(value = "MesDispatchDetailProductPrepare对象", description = "派工-明细-生产准备")
public class MesDispatchDetailProductPrepare extends BaseEntity {

    @ApiModelProperty("HMI主键")
    @TableField(exist = false)
    private String hmiId;
    @ApiModelProperty("工序任务主键")
    @TableField("dispatch_id")
    private String dispatchId;

    @ApiModelProperty("生产工单主键")
    @TableField("produce_order_id")
    private String produceOrderId;

    @ApiModelProperty("生产工单明细主键")
    @TableField("produce_detail_id")
    private String produceDetailId;

    @ApiModelProperty("工序计划主键")
    @TableField("process_plan_id")
    private String processPlanId;

    @ApiModelProperty("工序计划明细主键")
    @TableField("process_plan_detail_id")
    private String processPlanDetailId;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.ProductPrepareRelationTypeEnum
     */
    @ApiModelProperty("类型[1:工艺文档,2:产品工艺变更通知,3:设备运行参数]")
    @TableField("relation_type")
    private String relationType;

    @ApiModelProperty("关联数据(工艺文档类型、变更通知主键、设备主键)")
    @TableField("relation_value")
    private String relationValue;
    @ApiModelProperty("关联数据编码")
    @TableField("relation_code")
    private String relationCode;
    @ApiModelProperty("关联数据名称")
    @TableField("relation_name")
    private String relationName;

    /**
     * @see com.lets.platform.common.pojo.enums.YesOrNo
     */
    @ApiModelProperty("是否准备")
    @TableField("is_prepare")
    private String isPrepare;

    @JsonSerialize(using = JsonColSerializer.class)
    @ApiModelProperty("JSON格式数据")
    @TableField("relation_json_value")
    private String relationJsonValue;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;
}
