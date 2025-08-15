package com.lets.platform.model.mes.dto;

import com.lets.platform.model.mes.entity.MesProcessPlan;
import lombok.Data;

import java.util.List;

/**
 * 工序计划下发
 * @author: DING WEI
 * @date: 2024/11/13 14:58
 */
@Data
public class ProcessPlanIssuedDto {

    private List<MesProcessPlan> processPlanList;

    private String targetCategoryId;

    private Boolean autoCode= Boolean.TRUE;

}
