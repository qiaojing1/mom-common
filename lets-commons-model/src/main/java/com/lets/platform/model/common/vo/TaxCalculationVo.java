package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 返回含税金额,未税金额,税额
 *
 * @version 1.0
 * @ClassName TaxCalculationVo
 * @author: Qiao
 * @create: 2021/08/24 19:20
 **/
@Data
@ApiModel("税率计算相关")
public class TaxCalculationVo {
    @ApiModelProperty(value = "单价")
    private String price;
    @ApiModelProperty(value = "数量")
    private String num;
    @ApiModelProperty(value = "税种")
    private String taxId;
    @ApiModelProperty(value = "未税金额")
    private String amountNotTaxed ;
    @ApiModelProperty(value = "含税金额")
    private String amountIncludeTaxed;
    @ApiModelProperty(value = "税额")
    private String taxAmount;
    @ApiModelProperty(value = "汇率")
    private String exchangeRate;
    @ApiModelProperty(value = "本币未税金额")
    private String standardAmountNotTaxed;
    @ApiModelProperty(value = "本币税额")
    private String standardTaxAmount;
    @ApiModelProperty(value = "本币价税合计")
    private String standardAmountIncludeTaxed;
    @ApiModelProperty(value = "物料编码")
    private String materialCode;
    @ApiModelProperty(value = "物料编码批次编号拼接")
    private String materialStockBatchStr;
}
