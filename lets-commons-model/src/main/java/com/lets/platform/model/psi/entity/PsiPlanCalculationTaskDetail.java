package com.lets.platform.model.psi.entity;

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
 * <p>
 * 计划运算任务明细
 * </p>
 *
 * @author FZY
 * @since 2025-02-08
 */
@Getter
@Setter
@TableName("psi_plan_calculation_task_detail")
@ApiModel(value = "PsiPlanCalculationTaskDetail对象", description = "计划运算任务明细")
public class PsiPlanCalculationTaskDetail extends BaseEntity {

    @ApiModelProperty("任务ID")
    @TableField("task_id")
    private String taskId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("优先级")
    @TableField("Priority")
    private Integer priority;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单据ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("源单据编码")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("源单据类别ID")
    @TableField("source_category_id")
    private String sourceCategoryId;

    @TableField(exist = false)
    private String sourceCategoryName;

    @ApiModelProperty("源单据物料明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("单位ID")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位名称")
    @TableField(exist = false)
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField(exist = false)
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField(exist = false)
    private String unitRoundOffType;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("bomID")
    @TableField("bom_id")
    private String bomId;

    @ApiModelProperty("BOM版本名称")
    @TableField("bom_version")
    private String bomVersion;

    @ApiModelProperty("要货日期")
    @TableField("need_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime needDate;

    @TableField(exist = false)
    private Integer enable;

    @TableField(exist = false)
    private String rootId;

    @TableField(exist = false)
    private String rootCode;

    @TableField(exist = false)
    private String rootType;

    @TableField(exist = false)
    private String rootDetailId;

    @TableField(exist = false)
    private Long rootLineNumber;

    @TableField(exist = false)
    private String rootOrderCategoryId;

    @TableField(exist = false)
    private Integer status;

    @TableField(exist = false)
    private Integer calculated;
}
