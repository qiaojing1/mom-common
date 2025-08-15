package com.lets.platform.model.collection.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @ClassName DetectBatchReport
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/1/18
 */
@Data
public class HaDianDetectBatchReportDetailFooter {
    private String operator;
    private String inspector;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime createTime;
}
