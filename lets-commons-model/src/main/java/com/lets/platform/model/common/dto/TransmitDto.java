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
@ApiModel("传输对象")
public class TransmitDto implements Serializable {

    private static final long serialVersionUID = 7701510338037518478L;

    @ApiModelProperty("数据")
    private List<TransmitTableDto> transmitList;

    public TransmitDto() {
    }

    public TransmitDto(List<TransmitTableDto> transmitList) {
        this.transmitList = transmitList;
    }
}
