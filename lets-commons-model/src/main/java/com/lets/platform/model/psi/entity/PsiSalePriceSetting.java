package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 销售取价方案配置表
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-18
 */
@Getter
@Setter
@TableName("psi_sale_price_setting")
@ApiModel(value = "PsiSalePriceSetting对象", description = "销售取价方案配置表")
public class PsiSalePriceSetting extends BaseEntity {

    @ApiModelProperty("方案编码（允许自动编码）")
    @TableField("code")
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("对应单据（1.销售订单 2.销售报价单 3.销售价目表）")
    @TableField("corresponding_doc")
    private String correspondingDoc;
    @TableField(exist = false)
    private String correspondingDocName;

    @ApiModelProperty("是否启用 N：未启用；Y：已启用")
    @TableField("enable")
    private String enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("是否预设 N：未预设；Y：已预设")
    @TableField("preset_state")
    private String presetState;
    @TableField(exist = false)
    private String presetStateName;

    @ApiModelProperty("是否允许价格为0, Y：是")
    @TableField("allow_zero")
    private String allowZero;
    @TableField(exist = false)
    private String allowZeroName;

    @ApiModelProperty("是否删除 默认为 N 未删除")
    private String deleted;

    @ApiModelProperty("是否允许人工录入, Y：是")
    @TableField("allow_input")
    private String allowInput;
    @TableField(exist = false)
    private String allowInputName;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private List<PsiSalePriceSettingDetail> details;
    @TableField(exist = false)
    private List<PsiSalePriceSettingGuest> guests;
}
