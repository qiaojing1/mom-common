package com.lets.platform.model.collection.entity;

import lombok.Data;


/**
 * @ClassName DetectBatchReport
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/1/18
 */
@Data
public class HaDianDetectBatchReportDetailBody {
    private String pressure;
    private String holdTime;
    private String leakage;
    private String fillMaterial;
    private String sealingSurface;
    private String movement;
    private String result;
    private String productCode;
    private String heatNumberBody;
    private String heatNumberBonnet;
}
