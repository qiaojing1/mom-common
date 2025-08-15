package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.SettlementBusinessTypeEnum;
import com.lets.platform.model.psi.enums.SettlementMethodTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 结算方式
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-04-02
 */
@Getter
@Setter
@TableName("psi_settlement_method")
@ApiModel(value = "PsiSettlementMethod对象", description = "结算方式")
public class PsiSettlementMethod extends BaseEntity {

    @ApiModelProperty("结算方式编码")
    @TableField("CODE")
    private String code;

    @ApiModelProperty("结算方式名称")
    @TableField("NAME")
    private String name;

    /**
     * @see SettlementMethodTypeEnum
     */
    @ApiModelProperty("结算方式类型")
    @TableField("type")
    private String type;
    @ApiModelProperty("结算方式类型")
    @TableField(exist = false)
    private String typeName;

    /**
     * @see SettlementBusinessTypeEnum
     */
    @ApiModelProperty("业务类型")
    @TableField("business_type")
    private String businessType;
    @ApiModelProperty("业务类型")
    @TableField(exist = false)
    private String businessTypeName;

    @ApiModelProperty("是否默认结算方式 Y是N否")
    @TableField("default_method")
    private String defaultMethod;
    @ApiModelProperty("是否默认结算方式")
    @TableField(exist = false)
    private String defaultMethodName;

    @ApiModelProperty("是否支付手续费 Y是N否")
    @TableField("payment_handling_fee")
    private String paymentHandlingFee;
    @ApiModelProperty("是否支付手续费")
    @TableField(exist = false)
    private String paymentHandlingFeeName;

    @ApiModelProperty("启用状态 1是0否")
    @TableField("ENABLE")
    private Integer enable;
    @ApiModelProperty("启用状态")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("是否预设 1是0否")
    @TableField("is_preset")
    private Integer isPreset;
    @ApiModelProperty("是否预设")
    @TableField(exist = false)
    private String isPresetName;
}
