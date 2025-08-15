/*
 * csy
 */

package com.lets.platform.model.collection.dto;

import com.lets.platform.model.collection.entity.CollectionDetectReport;
import com.lets.platform.model.collection.entity.CollectionDetectReportFlowDetail;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ReportUpdateDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/11/7
 */
@Data
public class ReportUpdateDto {
    private CollectionDetectReport mainData;
    private List<Map<String, Object>> pressureData;
    private List<Map<String, Object>> movementData;
    private List<CollectionDetectReportFlowDetail> flowDetails;
}
