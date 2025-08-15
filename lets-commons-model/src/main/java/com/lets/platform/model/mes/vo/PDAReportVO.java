package com.lets.platform.model.mes.vo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PDAReportVO {

    private String code;

    private LocalDateTime planStartTime;

    private LocalDateTime planEndTime;

    private boolean reportCheckControl;

    private List<PDAReportDetailVO> detailList;
}
