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

/**
 * <p>
 * 采购取价方案配置供应商映照表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-02-28
 */
@Getter
@Setter
@TableName("psi_purchase_price_setting_supplier")
@ApiModel(value = "PsiPurchasePriceSettingSupplier对象", description = "采购取价方案配置供应商映照表")
public class PsiPurchasePriceSettingSupplier extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("setting_id")
    private String settingId;

    @ApiModelProperty("供应商id or供应商组id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("供应商编码or供应商组编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("供应商名称or供应商组名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("当前类型，0表示当前是供应商，1表示当前是供应商组")
    @TableField("guest_type")
    private Integer guestType;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;
}
