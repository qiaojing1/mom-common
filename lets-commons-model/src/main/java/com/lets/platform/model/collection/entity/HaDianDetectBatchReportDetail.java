package com.lets.platform.model.collection.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @ClassName DetectBatchReport
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/1/18
 */
@Data
public class HaDianDetectBatchReportDetail {
    private String code;
    private Integer totalPage;
    private String curPage;
    private HaDianDetectBatchReportDetailHeader header;
    private Map<String, HaDianDetectBatchReportDetailBody> bodyHeader;
    private Map<String,Map<String, HaDianDetectBatchReportDetailBody>> body;
    private HaDianDetectBatchReportDetailFooter footer;

    private List<String> keys;
}
