package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 检验单检验项目列
 * </p>
 *
 * @author FZY
 * @since 2025-06-18
 */
@Getter
@Setter
@TableName("mes_inspection_task_order_column")
@ApiModel(value = "MesInspectionTaskOrderColumn对象", description = "检验单检验项目列")
public class MesInspectionTaskOrderColumn extends BaseEntity {

    @ApiModelProperty("检验单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("检验单明细ID")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("检验任务ID")
    @TableField("task_id")
    private String taskId;

    @ApiModelProperty("列固定")
    @TableField("fixed")
    private String fixed;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Long sort;

    @ApiModelProperty("分析类型[1定性 2定量]")
    @TableField("analysis_type")
    private String analysisType;

    @ExcelIgnore
    @ApiModelProperty("是否手动录入")
    @TableField("is_manual")
    private Integer isManual;

    @ApiModelProperty("分组ID")
    @TableField("group_id")
    private String groupId;

    @ApiModelProperty("分组名称")
    @TableField("group_name")
    private String groupName;

    @ApiModelProperty("检验项目ID")
    @TableField("inspection_item_id")
    private String inspectionItemId;

    @ApiModelProperty("检验项目名称")
    @TableField("inspection_item_name")
    private String inspectionItemName;

    @ApiModelProperty("比较符")
    @TableField("comparator")
    private String comparator;

    @ApiModelProperty("检验标准ID")
    @TableField("inspection_standard_id")
    private String inspectionStandardId;

    @ApiModelProperty("检验标准名称")
    @TableField("inspection_standard_name")
    private String inspectionStandardName;

    @ApiModelProperty("检验标准值")
    @TableField("inspection_standard_value")
    private BigDecimal inspectionStandardValue;

    @ApiModelProperty("上公差")
    @TableField("upper_deviation")
    private BigDecimal upperDeviation;

    @ApiModelProperty("下公差")
    @TableField("lower_deviation")
    private BigDecimal lowerDeviation;

    @ApiModelProperty("规范上限值")
    @TableField("over_limit")
    private BigDecimal overLimit;

    @ApiModelProperty("规范下限值")
    @TableField("under_limit")
    private BigDecimal underLimit;

    @ApiModelProperty("精度")
    @TableField("value_precision")
    private Integer valuePrecision;

    @ApiModelProperty("是否必检")
    @TableField("required")
    private Integer required;

    public MesInspectionTaskOrderColumn() {
    }

    public MesInspectionTaskOrderColumn(MesInspectionTaskOrder task) {
        this.orderId = task.getOrderId();
        this.detailId = task.getDetailId();
        this.taskId = task.getId();
    }
}
