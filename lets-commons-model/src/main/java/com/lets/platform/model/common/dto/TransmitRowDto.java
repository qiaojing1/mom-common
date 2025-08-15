package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Etl传输对象
 * @author: DING WEI
 * @date: 2022/6/28 16:42
 */
@Data
@ApiModel("传输对象-行")
public class TransmitRowDto implements Serializable {

    private static final long serialVersionUID = 6702204761747808454L;
    @ApiModelProperty("行")
    private List<TransmitColDto> transmitCols;

    public TransmitRowDto() {
    }

    public TransmitRowDto(List<TransmitColDto> transmitCols) {
        this.transmitCols = transmitCols;
    }
}
