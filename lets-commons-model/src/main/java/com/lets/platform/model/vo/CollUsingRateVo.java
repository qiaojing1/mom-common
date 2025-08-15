package com.lets.platform.model.collection.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName CollUsingRateVo
 * @Description  设备稼动率、开机率、利用率、故障率返回实体类
 * @Date 2023/12/13 11:45
 **/
@Data
@ApiModel("设备稼动率、开机率、利用率、故障率返回实体类")
public class CollUsingRateVo {
    @ApiModelProperty("设备id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("列名称列表")
    private List<String> titles;

    @ApiModelProperty("图表列表")
    private Map<String, Object> chartList;

    @ApiModelProperty("下方表格值")
    private List<Map<String, Object>> dataList;

    @ApiModelProperty("合计平均稼动率")
    private String totalAverageRate;

    private String factoryModeId;

    private String factoryModeName;
}
