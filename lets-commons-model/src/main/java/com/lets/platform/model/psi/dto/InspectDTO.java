package com.lets.platform.model.psi.dto;

import lombok.Data;

/**
 * 用于自动生成物料条码
 * @author FZY
 * @since 2024-10-28
 */
@Data
public class InspectDTO {
    private String sampleType;

    private String paintingPlanId;

    private String inspectItemIds;
}
