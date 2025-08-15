package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 币种实体
 *
 * @version 1.0
 * @ClassName CurrencyDo
 * @author: Qiao
 * @create: 2021/08/24 10:50
 **/
@Data
@ApiModel("币种管理相关")
public class CurrencyDo extends BaseDo {

    private String currencyName;

    private Integer priceDecimalNum;

    private Integer amountDecimalNum;

    private Integer exchangeRateDecimalNum;

    private Integer costPriceDecimalNum;

    private Integer costAmountDecimalNum;

    private String status;

    private String tenancyId;

    private String currencyUnit;
    private String defaultSelected;
}
