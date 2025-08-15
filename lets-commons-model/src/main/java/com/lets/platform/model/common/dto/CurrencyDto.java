package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 币种入参
 *
 * @version 1.0
 * @ClassName CurrencyDto
 * @author: Qiao
 * @create: 2021/08/24 10:50
 **/
@Data
@ApiModel("币种入参")
public class CurrencyDto {
    @NotBlank(message = "币种主键不能为空", groups = {Update.class})
    private String id;
    @ApiModelProperty(value = "币种编码",required = true)
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "currency.code", groups = {Save.class, Update.class})
    private String code;
    @ApiModelProperty(value = "币种名称",required = true)
    @Length(min = 1, max = 20, message = "currency.currencyName", groups = {Save.class, Update.class})
    private String currencyName;


    @ApiModelProperty(value = "币种单位",required = true)
    @Pattern(regexp = GlobalConstant.CHINESE_LETTER_1_20, message = "currency.currencyUnit", groups = {Save.class, Update.class})
    private String currencyUnit;
    @ApiModelProperty(value = "单价小数位",required = true)
    private Integer priceDecimalNum;

    @ApiModelProperty(value = "金额小数位",required = true)
    private Integer amountDecimalNum;

    @ApiModelProperty(value = "汇率小数位",required = true)
    private Integer exchangeRateDecimalNum;

    @ApiModelProperty(value = "成本单价小数位",required = true)
    private Integer costPriceDecimalNum;

    @ApiModelProperty(value = "成本金额小数位",required = true)
    private Integer costAmountDecimalNum;

    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(value = "本位币 Y or N")
    private String defaultSelected;

}
