package com.lets.platform.model.collection.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName DetectBatchReport
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/1/18
 */
@Data
public class HaDianDetectBatchReportDetailHeader {
    private String lrpNo;
    private String product;
    private String model;
    private List<String> pressureMeterNoAndRange;
    private String standard;
    private Integer number;
    private String listNo;
    private String drawNo;
}
