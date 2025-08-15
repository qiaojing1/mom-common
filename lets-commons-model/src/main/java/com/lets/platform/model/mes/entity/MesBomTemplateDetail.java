package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.enums.BomDosageTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

/**
 * BOM模板管理-明细
 * @author DING WEI
 * @since 2025-03-05
 */
@Getter
@Setter
@TableName("mes_bom_template_detail")
@ApiModel(value = "MesBomTemplateDetail对象", description = "BOM模板管理-明细")
public class MesBomTemplateDetail extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sheetName;

    @ApiModelProperty("bom主键")
    @TableField("bom_id")
    private String bomId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String bomCode;

    /**
     * @see com.lets.platform.model.mes.enums.BillSubTypeEnum
     */
    @ApiModelProperty("子项类型[1标准件，2退回件]")
    @TableField("sub_type")
    private String subType;
    @TableField(exist = false)
    private String subTypeName;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @NotBlank(message = "[子项名称]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("子项名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ApiModelProperty("物料类型[采购件、自制件、委外件、虚拟件]")
    @TableField("material_type")
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;
    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;

    @ApiModelProperty(value = "必须有BOM", hidden = true)
    @TableField("must_has_bom")
    private String mustHasBom;

    @ApiModelProperty("库存单位")
    @TableField("store_unit_id")
    private String storeUnitId;
    @TableField("store_unit_name")
    private String storeUnitName;
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("子项BOM版本主键")
    @TableField("bom_version_id")
    private String bomVersionId;
    @TableField("bom_version")
    private String bomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField("bom_version_describe")
    private String bomVersionDescribe;

    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "MesBomDetail.ignoreDisconnect", groups = {Save.class, Update.class})
    @ApiModelProperty("忽略断阶[NY]")
    @TableField("ignore_disconnect")
    private String ignoreDisconnect;
    @TableField(exist = false)
    private String ignoreDisconnectName;

    @ValidatedEnum(enumClass = BomDosageTypeEnum.class, required = true, message = "MesBomDetail.dosageType", groups = {Save.class, Update.class})
    @ApiModelProperty("用量类型[1变动2固定]")
    @TableField("dosage_type")
    private String dosageType;
    @TableField(exist = false)
    private String dosageTypeName;

    @ApiModelProperty("分子用量")
    @TableField("numerator_dosage")
    private String numeratorDosage;

    @ApiModelProperty("分母用量")
    @TableField("denominator_dosage")
    private String denominatorDosage;

    @ValidBigDecimal(message = "MesBomDetail.fixedLoss", max = "1000000000", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("固定损耗")
    @TableField("fixed_loss")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal fixedLoss;

    @ValidBigDecimal(message = "MesBomDetail.changeLossRate", max = "100", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("变动损耗率(%)")
    @TableField("change_loss_rate")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal changeLossRate;

    @ApiModelProperty("允许替代[YN]")
    @TableField("allow_replace")
    private String allowReplace;
    @TableField(exist = false)
    private String allowReplaceName;

    @ApiModelProperty("是否关键件[0否1是]")
    @TableField("production_key_components")
    private Integer productionKeyComponents;
    @TableField(exist = false)
    private String productionKeyComponentsName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PickingWayEnum
     */
    @ApiModelProperty("领料方式")
    @TableField("picking_way")
    private String pickingWay;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String pickingWayName;

    @ApiModelProperty("发料考虑损耗[01]")
    @TableField("issue_consider_loss")
    private Integer issueConsiderLoss;

    @ApiModelProperty("扩展规格属性-展示内容")
    @TableField("show_esa")
    private String showEsa;
    @ApiModelProperty("扩展规格属性")
    @TableField(exist = false)
    private List<MesBomTemplateDetailEsa> detailEsaList;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer extHash;
}
