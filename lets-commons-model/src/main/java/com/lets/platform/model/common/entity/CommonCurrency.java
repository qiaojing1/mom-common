package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.RoundOffTypeCurrencyEnum;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * <p>
 * 币种
 * </p>
 *
 * @author DING WEI
 * @since 2023-07-03
 */
@Getter
@Setter
@TableName("common_currency")
@ApiModel(value = "CommonCurrency对象", description = "币种")
public class CommonCurrency extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value = "币种编码", index = 0)
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_10, message = "CommonCurrency.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value = "币种名称", index = 1)
    @Length(min = 1, max = 20, message = "CommonCurrency.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ExcelIgnore
    @Min(value = 0, message = "CommonCurrency.priceAccuracy", groups = {Save.class, Update.class})
    @Max(value = 10, message = "CommonCurrency.priceAccuracy", groups = {Save.class, Update.class})
    @ApiModelProperty("单价精度")
    @TableField("price_accuracy")
    private Integer priceAccuracy;
    @TableField(exist = false)
    @ColumnWidth(20)
    @ExcelProperty(value = "单价精度", index = 2)
    @ApiModelProperty(hidden = true)
    private String priceAccuracyFormat;

    @ExcelIgnore
    @Min(value = 0, message = "CommonCurrency.amountAccuracy", groups = {Save.class, Update.class})
    @Max(value = 4, message = "CommonCurrency.amountAccuracy", groups = {Save.class, Update.class})
    @ApiModelProperty("金额精度")
    @TableField("amount_accuracy")
    private Integer amountAccuracy;
    @TableField(exist = false)
    @ColumnWidth(20)
    @ExcelProperty(value = "金额精度", index = 3)
    @ApiModelProperty(hidden = true)
    private String amountAccuracyFormat;

    @ExcelIgnore
    @ValidatedEnum(enumClass = RoundOffTypeCurrencyEnum.class, required = true, message = "CommonCurrency.roundOffType", groups = {Save.class, Update.class})
    @ApiModelProperty("舍入类型[4四舍五入,6四舍六入五成双]")
    @TableField("round_off_type")
    private Integer roundOffType;
    @ColumnWidth(20)
    @ExcelProperty(value = "舍入类型", index = 4)
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String roundOffTypeName;

    @ColumnWidth(20)
    @ExcelProperty(value = "币种符号", index = 5)
    @Pattern(regexp = GlobalConstant.CURRENCY_SYMBOL, message = "CommonCurrency.symbol", groups = {Save.class, Update.class})
    @ApiModelProperty("币种符号")
    @TableField("symbol")
    private String symbol;

    @ValidatedEnum(enumClass = YesOrNo.class, message = "CommonCurrency.isBasicUnit", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("是否本位币[N否Y是]")
    @TableField("is_basic_unit")
    private String isBasicUnit;
    @ColumnWidth(20)
    @ExcelProperty(value = "是否本位币", index = 6)
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String isBasicUnitName;

    @ValidatedEnum(enumClass = IsOrNotEnum.class, message = "SysUser.enable", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ColumnWidth(20)
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String enableName;

    @ExcelIgnore
    @ApiModelProperty("是否预设")
    @TableField("is_presets")
    private String isPresets;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String isPresetsName;

    @ExcelIgnore
    @ApiModelProperty(value = "是否删除[N否Y是]", hidden = true)
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;
}
