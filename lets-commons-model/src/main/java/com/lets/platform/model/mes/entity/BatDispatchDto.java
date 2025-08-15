package com.lets.platform.model.mes.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName BatDispatchDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/1/2
 */
@Data
public class BatDispatchDto {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ApiModelProperty(value = "班次ID")
    private String shiftId;
    private String shiftName;
    @ApiModelProperty(value = "班组ID")
    private String teamId;
    private String teamName;
    private String isSurplus;
    private BigDecimal dispatchNumber;
    private String deviceId;
    private String deviceCode;
    private String deviceName;
    private String operatorId;
    private String operatorName;
    private List<String> ids;
    private List<String> detailsIds;

    private String detailId;
    private String processNo;

    @ApiModelProperty("是否由工单派工创建")
    private String createFromOrderDispatch;

}
