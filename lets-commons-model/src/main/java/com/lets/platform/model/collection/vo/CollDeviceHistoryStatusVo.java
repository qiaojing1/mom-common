package com.lets.platform.model.collection.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceHistoryStatusVo
 * @Description 设备历史状态返回实体
 * @Date 2023/12/8 15:51
 **/
@Data
@ApiModel("设备历史状态返回实体")
public class CollDeviceHistoryStatusVo {
    @ApiModelProperty("设备主键")
    private String deviceId;
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    private String deviceName;
    @ApiModelProperty("查询日期")
    private String queryDate;
    @ApiModelProperty("历史状态汇总")
    private List<CollDeviceHistoryStatusSummaryVo> summaryVoList;
    @ApiModelProperty("历史状态明细")
    private List<CollDeviceHistoryStatusDetailVo> detailVoList;

    public CollDeviceHistoryStatusVo(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    public CollDeviceHistoryStatusVo() {
    }
}
