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
import java.util.List;

/**
 * <p>
 * 齐套分析方案仓库范围
 * </p>
 *
 * @author FZY
 * @since 2024-06-05
 */
@Getter
@Setter
@TableName("mes_kitting_analysis_result_detail")
@ApiModel(value = "MesKittingAnalysisResultDetail对象", description = "齐套分析方案仓库范围")
public class MesKittingAnalysisResultDetail extends BaseEntity {

    @ApiModelProperty("齐套分析结果ID")
    @TableField("result_id")
    private String resultId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("生产工单ID")
    @TableField("produce_id")
    private String produceId;

    @ApiModelProperty("生产工单编号")
    @TableField("produce_code")
    private String produceCode;

    @ApiModelProperty("生产工单日期")
    @TableField("produce_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime produceDate;

    @ApiModelProperty("生产工单行号")
    @TableField("produce_detail_id")
    private String produceDetailId;

    @ApiModelProperty("生产工单行号")
    @TableField("produce_line_number")
    private Long produceLineNumber;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格")
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
    @ApiModelProperty("BOM版本描述")
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
    private List<MesKittingAnalysisResultDetailSub> subList;

    public void setMaxKittingQuantity(BigDecimal maxKittingQuantity) {
        if (maxKittingQuantity.compareTo(BigDecimal.ZERO) < 0) {
            this.maxKittingQuantity = BigDecimal.ZERO;
        } else {
            this.maxKittingQuantity = maxKittingQuantity;
        }
    }

    public void setInventoryKittingQuantity(BigDecimal inventoryKittingQuantity) {
        if (inventoryKittingQuantity.compareTo(BigDecimal.ZERO) < 0) {
            this.inventoryKittingQuantity = BigDecimal.ZERO;
        } else {
            this.inventoryKittingQuantity = inventoryKittingQuantity;
        }
    }

    public void setInProgressKittingQuantity(BigDecimal inProgressKittingQuantity) {
        if (inProgressKittingQuantity.compareTo(BigDecimal.ZERO) < 0) {
            this.inProgressKittingQuantity = BigDecimal.ZERO;
        } else {
            this.inProgressKittingQuantity = inProgressKittingQuantity;
        }
    }

    public void setInTransitKittingQuantity(BigDecimal inTransitKittingQuantity) {
        if (inTransitKittingQuantity.compareTo(BigDecimal.ZERO) < 0) {
            this.inTransitKittingQuantity = BigDecimal.ZERO;
        } else {
            this.inTransitKittingQuantity = inTransitKittingQuantity;
        }
    }

    public void setKittingAnalysisQuantity(BigDecimal kittingAnalysisQuantity) {
        if (kittingAnalysisQuantity.compareTo(BigDecimal.ZERO) < 0) {
            this.kittingAnalysisQuantity = BigDecimal.ZERO;
        } else {
            this.kittingAnalysisQuantity = kittingAnalysisQuantity;
        }
    }

    public void setReceivedKittingQuantity(BigDecimal receivedKittingQuantity) {
        if (receivedKittingQuantity.compareTo(BigDecimal.ZERO) < 0) {
            this.receivedKittingQuantity = BigDecimal.ZERO;
        } else {
            this.receivedKittingQuantity = receivedKittingQuantity;
        }
    }
}
