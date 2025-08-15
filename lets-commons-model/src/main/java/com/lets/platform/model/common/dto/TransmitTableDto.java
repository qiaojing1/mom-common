package com.lets.platform.model.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Etl传输对象-表
 * @author: DING WEI
 * @date: 2022/6/28 16:42
 */
@Data
public class TransmitTableDto implements Serializable {

    private static final long serialVersionUID = -3269548377575648392L;

    private String xmlId;

    private List<TransmitRowDto> rows;

    public TransmitTableDto() {
    }

    public TransmitTableDto(String xmlId, List<TransmitRowDto> rows) {
        this.xmlId = xmlId;
        this.rows = rows;
    }
}
