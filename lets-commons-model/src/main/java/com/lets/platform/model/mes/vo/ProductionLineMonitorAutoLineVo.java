package com.lets.platform.model.mes.vo;

import com.lets.platform.model.mes.entity.AutoLineModelingDetail;
import com.lets.platform.model.mes.entity.AutoLineModelingFeedingBuffer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 产线监控设备 自动线 明细
 * @author: DING WEI
 * @date: 2024/8/6 13:55
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductionLineMonitorAutoLineVo {

    @ApiModelProperty("是否自动线明细")
    private Boolean isAutoLineDetail;

    private String autoLineId;

    @ApiModelProperty("设备主键")
    private String deviceId;
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    private String deviceName;

    // 缓存区
    private AutoLineModelingFeedingBuffer buffer;
    // 待加工区
    private List<AutoLineModelingFeedingBuffer> waitTransportList;
    // 转运区
    private AutoLineModelingFeedingBuffer transport;
    // 产线加工区
    private List<AutoLineModelingDetail> productionLineProcessingArea;
}
