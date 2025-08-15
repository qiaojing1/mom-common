package com.lets.platform.model.mes.dto;

import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.model.mes.entity.MesDispatchDetailWaste;
import com.lets.platform.model.mes.entity.MesProduceOrder;
import com.lets.platform.model.mes.entity.MesProductionParam;
import com.lets.platform.model.psi.entity.PsiContainerMaterialRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 报工
 * @author: DING WEI
 * @date: 2024/1/11 19:46
 */
@Data
@ApiModel("报工")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReportDto {

    @NotBlank(message = "DISPATCH_ID_NOT_BLANK")
    @ApiModelProperty("工序任务主键")
    private String dispatchId;

    @NotBlank(message = "PrepareQuery.hmiId")
    @ApiModelProperty("HMI主键")
    private String hmiId;

    @ValidBigDecimal(message = "ReportDto.reportNumber")
    @ApiModelProperty("报工数量")
    private BigDecimal reportNumber;
    @ApiModelProperty("合格数量")
    private BigDecimal richNumber;
    @ApiModelProperty("报废数量")
    private BigDecimal scrapNumber;
    @ApiModelProperty("返修数量")
    private BigDecimal repairNumber;
    @ApiModelProperty("不良数量")
    private BigDecimal poorNumber;

    @ApiModelProperty("开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty("报工时间")
    private LocalDateTime reportTime;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
    @ApiModelProperty(hidden = true)
    private String userId;
    @ApiModelProperty(hidden = true)
    private String name;
    @ApiModelProperty(hidden = true)
    private LocalDateTime now;
    @ApiModelProperty(hidden = true)
    private LocalDateTime createTime;

    @ApiModelProperty("半成品")
    private List<MesDispatchDetailWaste> halfList;
    @ApiModelProperty("尾料")
    private List<MesDispatchDetailWaste> surplusList;
    @ApiModelProperty("报工扫码载具记录")
    private List<PsiContainerMaterialRecord> materialRecordList;

    @ApiModelProperty("报工设备主键")
    private String deviceId;
    @ApiModelProperty("报工设备编码")
    private String deviceCode;
    @ApiModelProperty("报工设备名称")
    private String deviceName;

    @ApiModelProperty("报工产线主键")
    private String productionLineId;
    @ApiModelProperty("报工产线编码")
    private String productionLineCode;
    @ApiModelProperty("报工产线名称")
    private String productionLineName;

    @ApiModelProperty("生产工单")
    private MesProduceOrder produceOrder;
    @ApiModelProperty("工时")
    private Long workTime;
    @ApiModelProperty(hidden = true)
    private Boolean notAutoBarcode;
    @ApiModelProperty(hidden = true)
    private Boolean autoReport;

    private boolean fromPDA;

    @ApiModelProperty("批号")
    private String batchNumber;

    @ApiModelProperty("是否确认报工(true、false)")
    private Boolean confirm;

    List<MesProductionParam> productionParamList;

    public BigDecimal reportNumberNotNull() {
        if (Objects.isNull(reportNumber)) {
            return BigDecimal.ZERO;
        } else {
            return reportNumber;
        }
    }

    public BigDecimal richNumberNotNull() {
        if (Objects.isNull(richNumber)) {
            return BigDecimal.ZERO;
        } else {
            return richNumber;
        }
    }
    public BigDecimal scrapNumberNotNull() {
        if (Objects.isNull(scrapNumber)) {
            return BigDecimal.ZERO;
        } else {
            return scrapNumber;
        }
    }
    public BigDecimal repairNumberNotNull() {
        if (Objects.isNull(repairNumber)) {
            return BigDecimal.ZERO;
        } else {
            return repairNumber;
        }
    }
    public BigDecimal poorNumberNotNull() {
        if (Objects.isNull(poorNumber)) {
            return BigDecimal.ZERO;
        } else {
            return poorNumber;
        }
    }
}
