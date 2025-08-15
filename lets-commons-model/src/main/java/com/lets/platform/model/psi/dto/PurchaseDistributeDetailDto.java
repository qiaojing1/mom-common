package com.lets.platform.model.psi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 采购下发明细 参数
 * @author: DING WEI
 * @date: 2024/3/12 10:22
 */
@Data
@ApiModel("采购下发明细 参数")
public class PurchaseDistributeDetailDto {

    @ApiModelProperty("采购申请明细主键")
    private String id;

    @ApiModelProperty("推荐供应商")
    private String recommendSupplierId;
    @ApiModelProperty("推荐供应商")
    private String recommendSupplierName;

    @ApiModelProperty("下发数量")
    private BigDecimal distributeNumber;

    @ApiModelProperty("采购询价单明细行id")
    private String inquirySupplierId;

    // 单价
    @ApiModelProperty(hidden = true)
    private BigDecimal price;

    // "含税单价"
    @ApiModelProperty(hidden = true)
    private BigDecimal includingTaxPrice;

    // "税种"
    @ApiModelProperty(hidden = true)
    private String taxId;

    // "税种名称"
    @ApiModelProperty(hidden = true)
    private String taxName;

    // "税率"
    @ApiModelProperty(hidden = true)
    private BigDecimal taxRate;

    // "税种类型"
    @ApiModelProperty(hidden = true)
    private String taxType;

    // "税种精度"
    @ApiModelProperty(hidden = true)
    private Integer taxAccuracy;

    // "金额"
    @ApiModelProperty(hidden = true)
    private BigDecimal amount;

    // "价税合计"
    @ApiModelProperty(hidden = true)
    private BigDecimal amountIncludingTax;

    public BigDecimal distributeNumberNotNull() {
        if (Objects.isNull(distributeNumber)) {
            return BigDecimal.ZERO;
        } else {
            return distributeNumber;
        }
    }

}
