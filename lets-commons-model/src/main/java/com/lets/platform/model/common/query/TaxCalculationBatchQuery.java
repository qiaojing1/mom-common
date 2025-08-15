package com.lets.platform.model.common.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 批量查询含税金额,未税金额,税额
 *
 * @version 1.0
 * @ClassName TaxCalculationBatchQuery
 * @author: Qiao
 * @create: 2021/08/24 19:20
 **/
@Data
@ApiModel("批量税率计算相关")
public class TaxCalculationBatchQuery {
    @ApiModelProperty(value = "税种",required = true)
    private String taxId;
    @ApiModelProperty(value = "币种",required = true)
    private String currencyId;
    @ApiModelProperty(value = "汇率",required = false)
    private String exchangeRate;

    private List<TaxCalculationQuery> taxCalculationQueryList;
}
