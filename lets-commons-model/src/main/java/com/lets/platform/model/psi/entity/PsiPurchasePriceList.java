package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

/**
 * <p>
 * 采购价目表
 * </p>
 *
 * @author csy
 * @since 2023-11-17
 */
@Getter
@Setter
@TableName("psi_purchase_price_list")
@ApiModel(value = "PsiPurchasePriceList对象", description = "采购价目表")
public class PsiPurchasePriceList extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @ApiModelProperty("价目表编码")
    @TableField("CODE")
    @ExcelProperty("价目表编码")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20,message = "[价目表编码] 长度1~20，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("价目表名称")
    @TableField("NAME")
    @ExcelProperty("价目表名称")
    @Length(max = 20,min = 1,message = "[价目表名称] 支持长度1~20，输入：中文、字母、数字、常用符号" ,groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("价目币种")
    @TableField("currency_id")
    @ExcelIgnore
    private String currencyId;
    @TableField(exist = false)
    @ExcelProperty("价目币种")
    private String currencyName;
    @TableField(exist = false)
    @ExcelIgnore
    private Integer currencyPriceAccuracy;
    @TableField(exist = false)
    @ExcelIgnore
    private Integer currencyRoundType;

    @ApiModelProperty("单价含税[YN]")
    @TableField("price_included_tax")
    @ExcelIgnore
    private String priceIncludedTax;
    @TableField(exist = false)
    @ExcelIgnore
    private String priceIncludedTaxName;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    @ExcelProperty("作价模式")
    private String pricingMode;
    @TableField(exist = false)
    @ExcelIgnore
    private String pricingModeName;

    @ApiModelProperty("业务类型ID")
    @TableField("business_id")
    @ExcelIgnore
    private String businessId;

    @ApiModelProperty("限定方式[0供应商1供应商分组]")
    @TableField(value = "limit_type",fill = FieldFill.UPDATE)
    @ExcelIgnore
    private String limitType;
    @ExcelProperty("限定方式")
    @TableField(exist = false)
    private String limitTypeName;

    @ApiModelProperty("生效日期")
    @TableField("effective_time")
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime effectiveTime;
    @ExcelProperty("生效日期")
    @TableField(exist = false)
    private String effectiveTimeStr;

    @ApiModelProperty("失效日期")
    @TableField("expiring_time")
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expiringTime;
    @ExcelProperty("失效日期")
    @TableField(exist = false)
    private String expiringTimeStr;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    @Length(max = 200,message = "[备注] 支持长度0~200，输入：中文、字母、数字、常用符号", groups = {Save.class, Update.class})
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("STATUS")
    @ExcelIgnore
    private Integer status;
    @TableField(exist = false)
    @ExcelIgnore
    private String statusName;

    @ExcelIgnore
    @ApiModelProperty("启用状态")
    @TableField("ENABLE")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    @ExcelIgnore
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    @ExcelIgnore
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    @ExcelIgnore
    private String auditUserName;

    @TableField(exist = false)
    @ExcelIgnore
    private String validTag;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiPurchasePriceListSupplier> suppliers;
    @ExcelIgnore
    @Valid
    @TableField(exist = false)
    private List<PsiPurchasePriceListDetails> details;
}
