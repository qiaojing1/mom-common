package com.lets.platform.model.mes.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 解锁时间 数据传输对象
 * @author: DING WEI
 * @date: 2024/2/26 9:00
 */
@Data
public class UnlockWaiteOpDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String unlockId;

    private String deviceId;

    private String type;

    private LocalDateTime time;
    private Long timeAsMillis;

    private String itemValue;
    private String lockStatus;
    private String tenancyId;
}
