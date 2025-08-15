package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * <p>
 * 税种管理
 * </p>
 *
 * @author csy
 * @since 2023-07-04
 */
@Getter
@Setter
@TableName("common_tax")
@ApiModel(value = "CommonTax对象", description = "税种管理")
public class CommonTax extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value="税种编号",index = 0)
    @ApiModelProperty("税种编号")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "CommonTax.code", groups = {Save.class, Update.class})
    @TableField("code")
    private String code;

    @ExcelIgnore
    @ApiModelProperty("计税值")
    @TableField("tax_value")
    private String taxValue;
    @ColumnWidth(20)
    @ExcelProperty(value = "计税值",index = 2)
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String taxValueStr;

    @ApiModelProperty("税种精度")
    @Min(value = 0, message = "CommonTax.taxAccuracy", groups = {Save.class, Update.class})
    @Max(value = 10, message = "CommonTax.taxAccuracy", groups = {Save.class, Update.class})
    @TableField("tax_accuracy")
    @ExcelIgnore
    private Integer taxAccuracy;
    @ColumnWidth(20)
    @ExcelProperty(value = "税种精度",index = 4)
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String taxAccuracyStr;

    @ExcelIgnore
    @ApiModelProperty("计税单位")
    @TableField("tax_unit")
//    @NotNull(message = "CommonTax.taxUnit",groups = {Save.class,Update.class})
    private String taxUnit;
    @ColumnWidth(20)
    @ExcelProperty(value = "计税单位",index = 5)
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String taxUnitName;

    @ColumnWidth(20)
    @ExcelProperty(value="税种名称",index = 1)
    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    @Length(min = 1, max = 20, message = "CommonTax.taxName", groups = {Save.class, Update.class})
    private String taxName;
    @TableField(exist = false)
    @ExcelIgnore
    private String name;

    /**
     * @see com.lets.platform.model.common.enums.TaxTypeEnum
     */
    @ExcelIgnore
    @ApiModelProperty("计税类型")
    @TableField("tax_type")
    @NotNull(message = "CommonTax.taxType",groups = {Save.class,Update.class})
    private String taxType;
    @ColumnWidth(20)
    @ExcelProperty(value = "计税类型",index = 3)
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String taxTypeName;

    @ExcelIgnore
    @ApiModelProperty("是否启用 0:禁用 1:启用")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String enableName;

    @ColumnWidth(20)
    @ExcelProperty(value = "生效日期",index = 6)
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String effectiveDateStr;
//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    @ApiModelProperty("生效日期")
    @TableField("effective_date")
    @ExcelIgnore
    @NotNull(message = "CommonTax.effectiveDate",groups = {Save.class,Update.class})
    private LocalDate effectiveDate;

    @ColumnWidth(20)
    @ExcelProperty(value = "失效日期",index = 7)
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String expiringDateStr;
    @ApiModelProperty("失效日期")
    @ExcelIgnore
    @TableField("expiring_date")
    private LocalDate expiringDate;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ExcelIgnore
    @ApiModelProperty("是否预设")
    @TableField("is_presets")
    private String isPresets;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String isPresetsName;
}
