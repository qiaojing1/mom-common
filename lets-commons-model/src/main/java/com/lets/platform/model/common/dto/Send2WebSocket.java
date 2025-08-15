package com.lets.platform.model.common.dto;

import lombok.Data;

/**
 * 使用WebSocket推送消息到HMI
 * @author: DING WEI
 * @date: 2024/1/27 14:16
 */
@Data
public class Send2WebSocket {

    private String hmiId;

    private String msg;

}
