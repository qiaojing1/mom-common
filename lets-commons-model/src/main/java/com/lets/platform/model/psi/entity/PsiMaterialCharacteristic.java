package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 物料特征信息
 * </p>
 *
 * @author FZY
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_material_characteristic")
@ApiModel(value = "PsiMaterialCharacteristic对象", description = "物料特征信息")
public class PsiMaterialCharacteristic extends MaterialBaseEntity {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty("物料ID")
    @TableField(value = "material_id")
    private String materialId;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String materialCode;

    @ApiModelProperty("物料特征ID")
    @TableField("specific_id")
    private String specificId;

    @ApiModelProperty("物料特征名称")
    @TableField(exist = false)
    private String specificName;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("销售控制")
    @TableField("sale_control")
    private Integer saleControl;

    @ApiModelProperty("库存控制")
    @TableField("inventory_control")
    private Integer inventoryControl;

    @ApiModelProperty("采购控制")
    @TableField("purchase_control")
    private Integer purchaseControl;

    @ApiModelProperty("计划控制")
    @TableField("plan_control")
    private Integer planControl;

    @ApiModelProperty("生产控制")
    @TableField("production_control")
    private Integer productionControl;

    @ApiModelProperty("质量控制")
    @TableField("quality_control")
    private Integer qualityControl;

    @ApiModelProperty("是否必填")
    @TableField(exist = false)
    private Integer required;

    @ApiModelProperty("物料特征项")
    @TableField(exist = false)
    private List<PsiMaterialCharacteristicItem> items;

    @ApiModelProperty("值来源[1用户数据字典,2手工输入]")
    @TableField(exist = false)
    private String valueSource;

    @TableField(exist = false)
    private LocalDateTime createTime;

    @TableField(exist = false)
    private List<PsiMaterialCharacteristicItem> options;
}
