package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.poi.hpsf.Decimal;

/**
 * <p>
 * 汇率表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-05-20
 */
@Getter
@Setter
@TableName("common_exchange_rate")
@ApiModel(value = "CommonExchangeRate对象", description = "汇率表")
public class CommonExchangeRate extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("原币种id")
    @TableField("base_currency_id")
    private String baseCurrencyId;

    @ApiModelProperty("原币种编码")
    @TableField("base_currency_code")
    private String baseCurrencyCode;

    @ApiModelProperty("原币种名称")
    @TableField("base_currency_name")
    private String baseCurrencyName;

    @ApiModelProperty("原币种符号")
    @TableField("base_symbol")
    private String baseSymbol;

    @ApiModelProperty("目标币种id")
    @TableField("target_currency_id")
    private String targetCurrencyId;

    @ApiModelProperty("目标币种编码")
    @TableField("target_currency_code")
    private String targetCurrencyCode;

    @ApiModelProperty("目标币种名称")
    @TableField("target_currency_name")
    private String targetCurrencyName;

    @ApiModelProperty("目标币种符号")
    @TableField("target_symbol")
    private String targetSymbol;

    @ApiModelProperty("直接汇率")
    @TableField("direct_exchange_rate")
    private BigDecimal directExchangeRate;
    @TableField(exist = false)
    private String directExchangeRateStr;

    /**
     * @EnumName ExchangeRateTypeEnum
     */
    @ApiModelProperty("汇率策略 1:固定汇率")
    @TableField("rate_type")
    private String rateType;
    @TableField(exist = false)
    private String rateTypeName;

    @ApiModelProperty("间接汇率")
    @TableField("indirect_exchange_rate")
    private BigDecimal indirectExchangeRate;
    @TableField(exist = false)
    private String indirectExchangeRateStr;

    @ApiModelProperty("显示精度")
    @TableField("accuracy")
    private Integer accuracy;

    @ApiModelProperty("是否预设[N否Y是]")
    @TableField("is_presets")
    private String isPresets;
    @TableField(exist = false)
    private String isPresetsName;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("是否删除[N否Y是]")
      @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @TableField(exist = false)
    private BigDecimal price;

    public BigDecimal getPrice() {
        return Objects.nonNull(price) ? price : BigDecimal.ZERO;
    }

    public Integer getAccuracy() {
        return Objects.nonNull(accuracy) ? accuracy : 4;
    }

    public BigDecimal getDirectExchangeRate() {
        return Objects.nonNull(directExchangeRate) ? directExchangeRate : BigDecimal.ONE;
    }

    public BigDecimal getIndirectExchangeRate() {
        return Objects.nonNull(indirectExchangeRate) ? indirectExchangeRate : BigDecimal.ONE;
    }
}
