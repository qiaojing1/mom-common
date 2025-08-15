package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonBatchCodeRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 物料条码管理
 * </p>
 *
 * @author FZY
 * @since 2024-03-12
 */
@Getter
@Setter
@TableName("psi_material_barcode_manage")
@ApiModel(value = "PsiMaterialBarcodeManage对象", description = "物料条码管理")
public class PsiMaterialBarcodeManage extends BaseEntity {

    @ApiModelProperty("功能菜单编码")
    @TableField("order_menu_code")
    private String orderMenuCode;

    @ApiModelProperty("功能菜单名称")
    @TableField("order_menu_name")
    private String orderMenuName;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("默认通用编码规则ID")
    @TableField("default_common_rule_id")
    private String defaultCommonRuleId;

    @ApiModelProperty("默认通用编码规则名称")
    @TableField("default_common_rule_name")
    private String defaultCommonRuleName;

    /**
     * @see com.lets.platform.model.psi.enums.BarcodeGenerateSourceEnum
     */
    @ApiModelProperty("生成来源")
    @TableField(exist = false)
    private String generateSource;
    @ApiModelProperty("生产单元")
    @TableField(exist = false)
    private String factoryModeId;
    @TableField(exist = false)
    private String factoryModeCode;
    @TableField(exist = false)
    private String factoryModeName;

    @ApiModelProperty("物料明细列表")
    @TableField(exist = false)
    private List<PsiMaterialBarcodeDetail> detailList;

    @TableField(exist = false)
    private CommonBatchCodeRule rule;

    @TableField(exist = false)
    private String isStockIn;
    @TableField(exist = false)
    private String storeId;
    @TableField(exist = false)
    private String storeCode;
    @TableField(exist = false)
    private String storeName;
    @TableField(exist = false)
    private String areaId;
    @TableField(exist = false)
    private String areaName;
    @TableField(exist = false)
    private String areaCode;
    @TableField(exist = false)
    private String positionId;
    @TableField(exist = false)
    private String positionName;
    @TableField(exist = false)
    private String positionCode;
    @TableField(exist = false)
    private Boolean ignoreMaterialTemplate;

}
