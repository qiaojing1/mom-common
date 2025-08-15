package com.lets.platform.model.mes.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 生产工单报工单(胜捷)
 * @author DING WEI
 * @date 2025/2/17 11:00
 * @version 1.0
 */
@Getter
@Setter
@ApiModel(value = "SjProduceReportOrderVo", description = "生产工单报工单(胜捷)")
public class SjProduceReportOrderVo {

    private String id;

    @ApiModelProperty("生产工单主键")
    private String sourceOrderId;
    @ApiModelProperty("生产工单编码")
    private String sourceOrderCode;
    @ApiModelProperty("生产工单明细主键")
    private String sourceDetailId;
    private String remark;

    @ApiModelProperty("物料主键")
    private String materialId;
    @ApiModelProperty("物料编码")
    private String materialCode;
    @ApiModelProperty("物料名称")
    private String materialName;

    @ApiModelProperty("报工产线主键")
    private String productionLineId;
    @ApiModelProperty("报工产线编码")
    private String productionLineCode;
    @ApiModelProperty("报工产线名称")
    private String productionLineName;

    @ApiModelProperty("开时时间")
    private LocalDateTime startTime;
    @ApiModelProperty("报工时间")
    private LocalDateTime reportTime;

    @ApiModelProperty("生产单位")
    private String produceUnitId;
    @ApiModelProperty("生产单位编码")
    private String produceUnitCode;
    @ApiModelProperty("生产单位名称")
    private String produceUnitName;
    @ApiModelProperty("生产单位精度")
    private Integer produceUnitAccuracy;
    @ApiModelProperty("生产单位舍入方式")
    private Integer produceUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(总成|单电机)计划数量=工单数量")
    private BigDecimal planNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(总成|单电机)合格数量")
    private BigDecimal qualifiedNumber;
    @ApiModelProperty("报工数量")
    private BigDecimal reportNumber;

    @ApiModelProperty("冲芯加工数")
    private BigDecimal corePunchingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(单电机)冲芯差异数量=工单计划数-冲芯加工数")
    private BigDecimal corePunchingDiffNumber;
    @ApiModelProperty("换向器加工数")
    private BigDecimal pressureCommutatorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(单电机)压换向器差异数数量=冲芯加工数-换向器加工数")
    private BigDecimal pressureCommutatorDiffNumber;
    @ApiModelProperty("减料加工数")
    private BigDecimal balancingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(单电机)减料平衡机差异数=换向器加工数-减料加工数")
    private BigDecimal balancingDiffNumber;
    @ApiModelProperty("电枢综合加工数")
    private BigDecimal commutatorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(单电机)电枢综合测试差异数=减料加工数-电枢综合加工数")
    private BigDecimal commutatorDiffNumber;
    @ApiModelProperty("压前轴承加工数")
    private BigDecimal beforePressBearingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(单电机)压前轴承差异数=电枢综合加工数-压前轴承加工数")
    private BigDecimal beforePressBearingDiffNumber;
    @ApiModelProperty("压后轴承加工数")
    private BigDecimal afterPressBearingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(单电机)压后轴承差异数=压前轴承加工数-压后轴承加工数")
    private BigDecimal afterPressBearingDiffNumber;
    @ApiModelProperty("电机封口加工数")
    private BigDecimal motorSealingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(单电机)电机封口差异数=压后轴承加工数-电机封口加工数")
    private BigDecimal motorSealingDiffNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(单电机)单电机打码差异数=电机封口加工数-单电机打码加工数")
    private BigDecimal singleMotorCodingDiffNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(总成)装箱差异数=扫码上料数-装箱数")
    private BigDecimal packingDiffNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(总成)全折返修数量")
    private BigDecimal fullDiscountRepairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(总成)非全折返修数量=装箱差异数-全拆返修数")
    private BigDecimal unFullDiscountRepairNumber;

    public static boolean notZero(BigDecimal number) {
        return Objects.nonNull(number) && number.compareTo(BigDecimal.ZERO) != 0;
    }
}
