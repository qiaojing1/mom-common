package com.lets.platform.model.common.vo;

import com.lets.platform.model.mes.entity.MesReportRecord;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author FZY
 **/
@Data
public class ReportVO {

    private LocalDate date;

    private String userName;

    private BigDecimal hour;

    private String projectCode;

    private String processName;

    private String projectDetailLineNumber;

    private String jobContent;

    public ReportVO(MesReportRecord record) {
        this.date = record.getStartTime().toLocalDate();
        this.userName = record.getReportUserName();
        this.hour = record.getDuration();
        this.projectCode = record.getProjectCode();
        this.processName = record.getProcessName();
        this.projectDetailLineNumber = record.getProjectDetailLineNumber();
        this.jobContent = record.getJobContent();
    }
}
