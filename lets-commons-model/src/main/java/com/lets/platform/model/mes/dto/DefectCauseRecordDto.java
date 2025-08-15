package com.lets.platform.model.mes.dto;

import lombok.Data;

import java.util.Collection;

/**
 * 查询却笑记录
 * @author: DING WEI
 * @date: 2024/11/13 11:11
 */
@Data
public class DefectCauseRecordDto {

    private Collection<String> sourceDetailIds;

    private String processUnitId;
    private Integer processAccuracy;
    private Integer processRoundOffType;

}
