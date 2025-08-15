package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 生产工单-执行进度
 * @author DING WEI
 * @since 2025-04-14
 */
@Getter
@Setter
@TableName("psi_produce_order_pursuance_schedule")
@ApiModel(value = "PsiProduceOrderPursuanceSchedule对象", description = "生产工单-执行进度")
public class PsiProduceOrderPursuanceSchedule extends BaseEntity {

    @ApiModelProperty("生产工单-单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("生产工单-单据编码")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("生产工单-物料主键")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("生产工单-物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("生产工单-物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("工位机主键")
    @TableField("hmi_id")
    private String hmiId;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("计划数量(生产工单数量)")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("合格数量")
    @TableField("rich_number")
    private BigDecimal richNumber;

    @ApiModelProperty("生产进度(合格数量/生产工单数量)")
    @TableField("produce_schedule")
    private BigDecimal produceSchedule;

    @ApiModelProperty("客户项目号")
    @TableField("customer_project_number")
    private String customerProjectNumber;

    @ApiModelProperty("完工状态[完工，未完工]")
    @TableField("complete_status")
    private String completeStatus;
}
