package com.lets.platform.model.psi.dto;

import lombok.Data;

/**
 * 用于自动生成物料条码
 * @author FZY
 * @since 2024-10-28
 */
@Data
public class LimitStoreDTO {

    private String orgId;
    private String orderCategoryId;

    private String qualifiedStoreId;
    private String qualifiedStoreName;

    private String qualifiedAreaId;
    private String qualifiedAreaName;

    private String qualifiedPositionId;
    private String qualifiedPositionName;

    private String defectStoreId;
    private String defectStoreName;

    private String defectAreaId;
    private String defectAreaName;

    private String defectPositionId;
    private String defectPositionName;

    private String scrapStoreId;
    private String scrapStoreName;

    private String scrapAreaId;
    private String scrapAreaName;

    private String scrapPositionId;
    private String scrapPositionName;

    private String reworkStoreId;
    private String reworkStoreName;

    private String reworkAreaId;
    private String reworkAreaName;

    private String reworkPositionId;
    private String reworkPositionName;
}
