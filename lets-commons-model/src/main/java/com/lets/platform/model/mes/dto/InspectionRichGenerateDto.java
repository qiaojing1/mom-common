package com.lets.platform.model.mes.dto;

import com.lets.platform.model.mes.entity.MesDispatchDetail;
import com.lets.platform.model.mes.entity.MesProcessReportDetail;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 检验单 合格 生成 下游单据 工单报工单|流转下一工序可接收数量 参数
 * @author: DING WEI
 * @date: 2024/5/23 15:44
 */
@Data
public class InspectionRichGenerateDto {

    private String detailId;
    // 1 生成工单报工单 2 流转到下个工序
    private String type;

    // 需要生成工单报工单的参数
    private ReportDto reportDto;
    private MesDispatchDetail dispatchDetail;
    private String processPlanId;
    private String processPlanDetailId;
    private String repairedPlanDetailId;
    private String produceDetailId;

    // 流转到下个工序可接收数量的参数
    private String dispatchId;
    private MesProcessReportDetail reportDetail;
    private BigDecimal qualifiedQuantity;
}
