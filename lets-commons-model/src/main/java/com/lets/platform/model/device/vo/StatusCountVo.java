package com.lets.platform.model.device.vo;

import lombok.Builder;
import lombok.Data;

/**
 * 设备 状态数量
 *
 * @version 1.0
 * @ClassName StatusCountVo
 * @author: DING WEI
 * @create: 2021/05/14 15:47
 **/
@Data
@Builder
public class StatusCountVo {

    private String assetsStatus;
    private String assetsStatusName;

    private String internetStatus;
    private String internetStatusName;

    private Integer count;

}
