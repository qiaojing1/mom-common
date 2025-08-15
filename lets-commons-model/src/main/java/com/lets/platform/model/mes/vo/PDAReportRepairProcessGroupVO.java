package com.lets.platform.model.mes.vo;

import lombok.Data;

import java.util.List;

@Data
public class PDAReportRepairProcessGroupVO {

    private String processGroupId;

    private String processGroupName;

    private Integer step;

    private List<PDAReportRepairProcessVO> processList;
}
