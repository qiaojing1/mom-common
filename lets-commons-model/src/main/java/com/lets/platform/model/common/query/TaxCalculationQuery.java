package com.lets.platform.model.common.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 查询含税金额,未税金额,税额
 *
 * @version 1.0
 * @ClassName TaxCalculationQuery
 * @author: Qiao
 * @create: 2021/08/24 19:20
 **/
@Data
@ApiModel("税率计算相关")
public class  TaxCalculationQuery {
    @ApiModelProperty(value = "单价",required = true)
    private String price;
    @ApiModelProperty(value = "数量",required = true)
    private String num;
    @ApiModelProperty(value = "税种",required = true)
    private String taxId;
    @ApiModelProperty(value = "币种",required = true)
    private String currencyId;
    @ApiModelProperty(value = "汇率",required = false)
    private String exchangeRate;
    @ApiModelProperty(value = "物料",required = false)
    private String materialCode;
    @ApiModelProperty(value = "关联批次",required = false)
    private String relationBatch;
    @ApiModelProperty(value = "原币税额",required = false)
    private String taxAmount;
    @ApiModelProperty(value = "原币含税金额")
    private String amountIncludeTaxed;
    @ApiModelProperty(value = "原币未税金额")
    private String amountNotTaxed;

}
