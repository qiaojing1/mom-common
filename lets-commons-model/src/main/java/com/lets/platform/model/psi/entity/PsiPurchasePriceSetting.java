package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 采购取价方案配置表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-02-28
 */
@Getter
@Setter
@TableName("psi_purchase_price_setting")
@ApiModel(value = "PsiPurchasePriceSetting对象", description = "采购取价方案配置表")
public class PsiPurchasePriceSetting extends BaseEntity {

    @ApiModelProperty("方案编码（允许自动编码）")
    @TableField("code")
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("对应单据（1.采购订单 2.采购价目表 3.工序委外结算）")
    @TableField("corresponding_doc")
    private String correspondingDoc;
    @TableField(exist = false)
    private String correspondingDocName;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private String enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("是否预设 0：未预设；1：已预设")
    @TableField("preset_state")
    private String presetState;
    @TableField(exist = false)
    private String presetStateName;

    @ApiModelProperty("是否允许价格为0, Y：是")
    @TableField("allow_zero")
    private String allowZero;
    @TableField(exist = false)
    private String allowZeroName;

    @ApiModelProperty("是否允许人工录入, Y：是")
    @TableField("allow_input")
    private String allowInput;
    @TableField(exist = false)
    private String allowInputName;

    @ApiModelProperty("是否删除 N：未删除；Y：已删除")
      @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private List<PsiPurchasePriceSettingDetail> details;

    @TableField(exist = false)
    private List<PsiPurchasePriceSettingSupplier> suppliers;
}
