package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.AccountTypeEnum;
import com.lets.platform.model.psi.enums.FinancialInstitutionsTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 资金账户
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-04-03
 */
@Getter
@Setter
@TableName("psi_fund_account")
@ApiModel(value = "PsiFundAccount对象", description = "资金账户")
public class PsiFundAccount extends BaseEntity {

    @ApiModelProperty("资金账户简称")
    @TableField("NAME")
    private String name;

    /**
     * @see AccountTypeEnum
     */
    @ApiModelProperty("账户类型 1:银行账户 2:现金账户")
    @TableField("type")
    private String type;
    @ApiModelProperty("账户类型")
    @TableField(exist = false)
    private String typeName;

    /**
     * @see FinancialInstitutionsTypeEnum
     */
    @ApiModelProperty("金融机构类型 1:银行 2:第三方支付机构 3:非银行金融机构")
    @TableField("financial_institutions_type")
    private String financialInstitutionsType;
    @ApiModelProperty("金融机构类型")
    @TableField(exist = false)
    private String financialInstitutionsTypeName;

    @ApiModelProperty("户名")
    @TableField("account_name")
    private String accountName;

    @ApiModelProperty("账户")
    @TableField("account")
    private String account;

    @ApiModelProperty("银行类型")
    @TableField("bank_type")
    private String bankType;

    @ApiModelProperty("开户行")
    @TableField("opening_bank")
    private String openingBank;

    @ApiModelProperty("是否默认收款户 Y是N否")
    @TableField("default_receive_account")
    private String defaultReceiveAccount;
    @ApiModelProperty("是否默认收款户 Y是N否")
    @TableField(exist = false)
    private String defaultReceiveAccountName;

    @ApiModelProperty("是否默认付款户 Y是N否")
    @TableField("default_payment_account")
    private String defaultPaymentAccount;
    @ApiModelProperty("是否默认付款户 Y是N否")
    @TableField(exist = false)
    private String defaultPaymentAccountName;

    @ApiModelProperty("启用状态 1是0否")
    @TableField("ENABLE")
    private Integer enable;
    @ApiModelProperty("启用状态 1是0否")
    @TableField(exist = false)
    private String enableName;
}
