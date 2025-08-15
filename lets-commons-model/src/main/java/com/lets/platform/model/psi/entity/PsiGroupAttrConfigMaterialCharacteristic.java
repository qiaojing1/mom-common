package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 物料分组属性配置-特征信息
 * @author DING WEI
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("psi_group_attr_config_material_characteristic")
@ApiModel(value = "PsiGroupAttrConfigMaterialCharacteristic对象", description = "物料分组属性配置-特征信息")
public class PsiGroupAttrConfigMaterialCharacteristic extends BaseEntity {

    @ApiModelProperty("物料分组ID")
    @TableField("group_id")
    private String groupId;

    @ApiModelProperty("物料特征ID")
    @TableField("specific_id")
    private String specificId;
    @TableField(exist = false)
    private String specificName;
    @TableField(exist = false)
    private String valueSource;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    private Short enable;

    @ApiModelProperty("销售控制")
    @TableField("sale_control")
    private Short saleControl;

    @ApiModelProperty("库存控制")
    @TableField("inventory_control")
    private Short inventoryControl;

    @ApiModelProperty("采购控制")
    @TableField("purchase_control")
    private Short purchaseControl;

    @ApiModelProperty("计划控制")
    @TableField("plan_control")
    private Short planControl;

    @ApiModelProperty("生产控制")
    @TableField("production_control")
    private Short productionControl;

    @ApiModelProperty("质量控制")
    @TableField("quality_control")
    private Short qualityControl;

    @ApiModelProperty("物料特征项")
    @TableField(exist = false)
    private List<PsiGroupAttrConfigMaterialCharacteristicItem> items;
}
