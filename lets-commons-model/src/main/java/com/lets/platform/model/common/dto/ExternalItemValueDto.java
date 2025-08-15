package com.lets.platform.model.common.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 查询外部码
 * @author: DING WEI
 * @date: 2024/10/25 14:02
 */
@Data
public class ExternalItemValueDto {

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private String hmiId;

}
