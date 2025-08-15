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

/**
 * 检验单物料明细缺陷记录
 * @author FZY
 * @since 2024-01-19
 */
@Getter
@Setter
@TableName("mes_inspection_order_detail_record")
@ApiModel(value = "MesInspectionOrderDetailRecord对象", description = "检验单物料明细缺陷记录")
public class MesInspectionOrderDetailRecord extends BaseEntity {

    @ApiModelProperty("检验单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("检验单明细ID")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("检验单明细ID")
    @TableField("task_id")
    private String taskId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("缺陷原因ID")
    @TableField("defect_cause_id")
    private String defectCauseId;

    @ApiModelProperty("缺陷原因名称")
    @TableField("defect_cause_name")
    private String defectCauseName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("缺陷数量")
    @TableField("defect_quantity")
    private BigDecimal defectQuantity;

    @ApiModelProperty("缺陷等级")
    @TableField("adverse_level")
    private String adverseLevel;

    @ApiModelProperty("缺陷原因备注")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private String sourceDetailId;
    @TableField(exist = false)
    private String unitId;
    @TableField(exist = false)
    private String materialId;
}
