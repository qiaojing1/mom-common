package com.lets.platform.model.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Etl传输对象-列
 * @author: DING WEI
 * @date: 2022/6/28 16:42
 */
@Data
public class TransmitColDto implements Serializable {

    private static final long serialVersionUID = -3125806917329821740L;

    private String key;

    private Object value;

    public TransmitColDto() {
    }

    public TransmitColDto(String key, Object value) {
        this.key = key;
        this.value = value;
    }
}
