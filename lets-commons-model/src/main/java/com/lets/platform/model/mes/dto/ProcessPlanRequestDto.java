package com.lets.platform.model.mes.dto;

import lombok.Data;

import java.util.Collection;

/**
 * @author: DING WEI
 * @date: 2025/5/27 10:30
 */
@Data
public class ProcessPlanRequestDto {

    private Collection<String> processPlanIds;
    private Collection<Integer> statusList;

}
