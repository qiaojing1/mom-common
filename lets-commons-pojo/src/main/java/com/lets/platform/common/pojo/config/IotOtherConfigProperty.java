package com.lets.platform.common.pojo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * 其他-采集点位
 * @author DING WEI
 * @date 2024/10/22 8:41
 * @version 1.0
 */
@Data
@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "iot.other")
public class IotOtherConfigProperty {

    // 半成品装箱数量-采集点位
    private String partially;

    // 合格品数量-采集点位
    private String qualified;

    // 产量-采集点位
    private String output;

    // 外部码-采集点位
    private String external;

    // 自动退出登录时间(H)
    private String autoSignOutTime;

    // 工单明细主键-采集点位
    private String orderDetailId;

    // 扫码上料物料条码-采集点位
    private String feedBarcode;
    // 扫码执行物料条码-采集点位
    private String pursuanceBarcode;
    // 是否开启外部码去重
    private String enableRemoveRepeat;
    // 上料外部条码
    private String loadCode;
    // 扫码上料校验NG
    private String packingCheckNg;
}
