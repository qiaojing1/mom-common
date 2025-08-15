package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 生产作业单-明细
 *
 * @author DING WEI
 * @since 2024-02-21
 */
@Getter
@Setter
@TableName("mes_produce_job_order_detail")
@ApiModel(value = "MesProduceJobOrderDetail对象", description = "生产作业单-明细")
public class MesProduceJobOrderDetail extends BaseEntity {

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    private String orderCode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField(exist = false)
    private LocalDateTime orderTime;
    /**
     * @see com.lets.platform.model.base.enums.ProduceJobStatusEnum
     */
    @TableField(exist = false)
    private Integer orderStatus;
    @TableField(exist = false)
    private String drawingNo;
    @TableField(exist = false)
    private String drawingVersion;
    @TableField(exist = false)
    private String factoryModeId;
    @TableField(exist = false)
    private String factoryModeName;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("条码数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;
    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyEndTime;

    /**
     * @see com.lets.platform.model.base.enums.ProduceJobDetailStatusEnum
     */
    @ApiModelProperty("生产状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("任务清单主键")
    @TableField(exist = false)
    private String singletonProcessId;
    @ApiModelProperty("工序主键")
    @TableField(exist = false)
    private String processId;
    @ApiModelProperty("工序编码")
    @TableField(exist = false)
    private String processCode;
    @ApiModelProperty("工序名称")
    @TableField(exist = false)
    private String processName;
    @ApiModelProperty("报工人员")
    @TableField(exist = false)
    private String reportUserName;
}
