package com.lets.platform.model.common.vo;

import com.lets.platform.model.psi.vo.ExternalBarcodeVo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 自动获取点位值
 * @author: DING WEI
 * @date: 2024/10/23 15:52
 */
@Data
public class AutoGetNumberVo {

    private BigDecimal number;
    private BigDecimal output;

    private String deviceId;

    private String deviceCode;

    private String deviceName;

    private String tenancyId;

    private List<ExternalBarcodeVo> itemValueList;

}
