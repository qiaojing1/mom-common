package com.lets.platform.model.psi.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 单位数量转换
 * @author: DING WEI
 * @date: 2023/9/15 9:29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseQuantityTemp {

    private String key;
    private String sameOrderKey;
    BigDecimal quantity;
}
