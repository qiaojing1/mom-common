package com.lets.platform.model.common.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 币种管理反参
 *
 * @version 1.0
 * @ClassName CurrencyVo
 * @author: Qiao
 * @create: 2021/08/24 11:10
 **/
@Data
@ApiModel("币种管理反参")
public class CurrencyVo extends BaseDo {

    @ApiModelProperty(value = "币种编码")
    private String code;
    @ApiModelProperty(value = "币种名称")
    private String currencyName;

    @ApiModelProperty(value = "单价小数位")
    private Integer priceDecimalNum;

    @ApiModelProperty(value = "金额小数位")
    private Integer amountDecimalNum;

    @ApiModelProperty(value = "汇率小数位")
    private Integer exchangeRateDecimalNum;

    @ApiModelProperty(value = "成本单价小数位")
    private Integer costPriceDecimalNum;

    @ApiModelProperty(value = "成本金额小数位")
    private Integer costAmountDecimalNum;

    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(value = "状态名称")
    private String statusName;

    @ApiModelProperty(value = "币种单位")
    private String currencyUnit;
    @ApiModelProperty(value = "本位币 Y or N")
    private String defaultSelected;
}
