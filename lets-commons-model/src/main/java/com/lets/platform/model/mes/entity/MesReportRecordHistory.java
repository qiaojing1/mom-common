package com.lets.platform.model.mes.entity;

import lombok.Data;
import net.sf.cglib.core.Local;

import java.time.LocalDate;

/**
 * @ClassName MesReportRecordHistory
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/7/13
 */
@Data
public class MesReportRecordHistory {

    private LocalDate date;
    private Integer realHour;
    private Integer planHour;
    private String status;

}
