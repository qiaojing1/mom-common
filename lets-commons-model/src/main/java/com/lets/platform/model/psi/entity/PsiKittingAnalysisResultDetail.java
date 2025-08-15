package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 齐套分析清单明细
 * @author DING WEI
 * @since 2025-03-04
 */
@Getter
@Setter
@TableName("psi_kitting_analysis_result_detail")
@ApiModel(value = "PsiKittingAnalysisResultDetail对象", description = "齐套分析清单明细")
public class PsiKittingAnalysisResultDetail extends BaseEntity {

    @ApiModelProperty("齐套分析结果ID")
    @TableField("result_id")
    private String resultId;

    @ApiModelProperty("生产工单ID")
    @TableField("produce_id")
    private String produceId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("生产工单编号")
    @TableField("produce_code")
    private String produceCode;

    @ApiModelProperty("生产工单日期")
    @TableField("produce_date")
    private LocalDateTime produceDate;

    @ApiModelProperty("生产工单行号")
    @TableField("produce_detail_id")
    private String produceDetailId;

    @ApiModelProperty("生产工单行号")
    @TableField("produce_line_number")
    private Integer produceLineNumber;

    @ApiModelProperty("物料ID")
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

    @ApiModelProperty("物料特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("BOM版本ID")
    @TableField("bom_id")
    private String bomId;

    @ApiModelProperty("BOM版本")
    @TableField("bom_version")
    private String bomVersion;
    @ApiModelProperty("BOM版描述")
    @TableField(exist = false)
    private String bomVersionDescribe;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("单位")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    private String unitCode;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("计划开始时间")
    @TableField("plan_start_time")
    private LocalDateTime planStartTime;

    @ApiModelProperty("计划结束时间")
    @TableField("plan_end_time")
    private LocalDateTime planEndTime;

    @ApiModelProperty("已领料套数")
    @TableField("received_kitting_quantity")
    private BigDecimal receivedKittingQuantity;

    @ApiModelProperty("齐套分析数量")
    @TableField("kitting_analysis_quantity")
    private BigDecimal kittingAnalysisQuantity;

    @ApiModelProperty("在途满足套数")
    @TableField("in_transit_kitting_quantity")
    private BigDecimal inTransitKittingQuantity;

    @ApiModelProperty("在制满足套数")
    @TableField("in_progress_kitting_quantity")
    private BigDecimal inProgressKittingQuantity;

    @ApiModelProperty("库存满足套数")
    @TableField("inventory_kitting_quantity")
    private BigDecimal inventoryKittingQuantity;

    @ApiModelProperty("最大齐套数量")
    @TableField("max_kitting_quantity")
    private BigDecimal maxKittingQuantity;

    @TableField(exist = false)
    private List<PsiKittingAnalysisResultDetailSub> subList;
}
