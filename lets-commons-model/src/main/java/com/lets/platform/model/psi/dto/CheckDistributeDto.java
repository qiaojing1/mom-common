package com.lets.platform.model.psi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 订单下发 传输对象
 * @author: DING WEI
 * @date: 2024/3/14 11:16
 */
@Data
@ApiModel("订单下发 传输对象")
public class CheckDistributeDto {

    private String orderId;

    private List<String> detailIds;

    @ApiModelProperty(hidden = true)
    private String type;

    private Boolean allowOverNoticeAndStockOut;
    private Boolean saleStockOutInProportion;

}
