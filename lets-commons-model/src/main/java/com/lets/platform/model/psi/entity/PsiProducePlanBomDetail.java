package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * 计划订单-BOM管理-明细-副本
 * @author DING WEI
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("psi_produce_plan_bom_detail")
@ApiModel(value = "PsiProducePlanBomDetail对象", description = "计划订单-BOM管理-明细-副本")
public class PsiProducePlanBomDetail extends BaseEntity {

    @TableField(exist = false)
    private String dataSource;
    @TableField(exist = false)
    private String jumpId;
    @TableField(exist = false)
    private String parentId;

    @ApiModelProperty("计划订单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("计划订单明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("源BOM明细主键")
    @TableField("bom_detail_id")
    private String bomDetailId;

    @ApiModelProperty("bom主键")
    @TableField("bom_id")
    private String bomId;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("物料属性[采购件、自制件、委外件、虚拟件]")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("是否必须有BOM[NY]")
    @TableField("must_has_bom")
    private String mustHasBom;

    @ApiModelProperty("库存单位")
    @TableField("store_unit_id")
    private String storeUnitId;
    @ApiModelProperty("库存单位名称")
    @TableField("store_unit_name")
    private String storeUnitName;
    @ApiModelProperty("库存单位精度")
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;
    @ApiModelProperty("库存单位舍入方式")
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("生产单位")
    @TableField(exist = false)
    private String productUnitId;
    @ApiModelProperty("生产单位名称")
    @TableField(exist = false)
    private String productUnitName;
    @ApiModelProperty("生产单位精度")
    @TableField(exist = false)
    private Integer productUnitAccuracy;
    @ApiModelProperty("生产单位舍入方式")
    @TableField(exist = false)
    private Integer productUnitRoundOffType;

    @ApiModelProperty("BOM版本")
    @TableField("bom_version")
    private String bomVersion;
    @ApiModelProperty("子项BOM版本主键")
    @TableField("bom_version_id")
    private String bomVersionId;

    @ApiModelProperty("忽略断阶[NY]")
    @TableField("ignore_disconnect")
    private String ignoreDisconnect;

    @ApiModelProperty("用量类型[1变动2固定]")
    @TableField("dosage_type")
    private String dosageType;

    @ApiModelProperty("分子用量")
    @TableField("numerator_dosage")
    private BigDecimal numeratorDosage;

    @ApiModelProperty("分母用量")
    @TableField("denominator_dosage")
    private BigDecimal denominatorDosage;

    @ApiModelProperty("固定损耗")
    @TableField("fixed_loss")
    private BigDecimal fixedLoss;

    @ApiModelProperty("变动损耗率(%)")
    @TableField("change_loss_rate")
    private BigDecimal changeLossRate;

    @ApiModelProperty("允许替代[YN]")
    @TableField("allow_replace")
    private String allowReplace;

    @ApiModelProperty("是否关键件")
    @TableField("production_key_components")
    private Integer productionKeyComponents;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PickingWayEnum
     */
    @ApiModelProperty("领料方式")
    @TableField("picking_way")
    private String pickingWay;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String pickingWayName;

    @ApiModelProperty("子项类型[1标准件，2退回件]")
    @TableField("sub_type")
    private String subType;

    @ApiModelProperty("发料考虑损耗[01]")
    @TableField("issue_consider_loss")
    private Integer issueConsiderLoss;

    @TableField(exist = false)
    private List<PsiProducePlanBomDetail> child;
}
