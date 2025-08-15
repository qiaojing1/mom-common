package com.lets.platform.model.mes.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 计算可回退数量
 * @author: DING WEI
 * @date: 2024/5/10 14:53
 */
@Data
public class CanBackwashNumberVo {

    @ApiModelProperty("可回退数量(工序单位)")
    private BigDecimal canBackwashNumber;

    @ApiModelProperty("可回退数量(计价单位)")
    private BigDecimal canBackwashPricingNumber;

}
