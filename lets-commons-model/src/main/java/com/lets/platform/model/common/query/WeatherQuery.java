package com.lets.platform.model.common.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 天气查询对象
 * @author: DING WEI
 * @date: 2022/3/21 8:10
 */
@Data
@ApiModel("天气查询对象")
public class WeatherQuery {

    @ApiModelProperty("省")
    private String province;

    @ApiModelProperty("市")
    private String city;

    @ApiModelProperty("区")
    private String area;

}
