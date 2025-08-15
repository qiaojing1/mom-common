package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
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
import java.util.Map;

/**
 * BOM管理-明细
 * @author DING WEI
 * @since 2023-11-08
 */
@Getter
@Setter
@TableName("mes_bom_detail")
@ApiModel(value = "MesBomDetail对象", description = "BOM管理-明细")
public class MesBomDetail extends BaseEntity {

    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sheetName;

    @ExcelIgnore
    @ApiModelProperty("bom主键")
    @TableField("bom_id")
    private String bomId;
    @ColumnWidth(20)
    @ExcelProperty("BOM编码")
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String bomCode;

    /**
     * @see com.lets.platform.model.mes.enums.BillSubTypeEnum
     */
//    @ValidatedEnum(message = "[子项类型]非法", enumClass = BillSubTypeEnum.class, required = true, groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("子项类型[1标准件，2退回件]")
    @TableField("sub_type")
    private String subType;
    @ExcelIgnore
    @TableField(exist = false)
    private String subTypeName;

    @ExcelIgnore
    @NotBlank(message = "MesBomDetail.materialId", groups = {Save.class, Update.class})
    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ColumnWidth(20)
    @ExcelProperty("物料编码")
    @NotBlank(message = "MesBomDetail.materialCode", groups = {Save.class, Update.class})
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ColumnWidth(20)
    @ExcelProperty("物料名称")
    @NotBlank(message = "MesBomDetail.materialName", groups = {Save.class, Update.class})
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ColumnWidth(40)
    @ExcelProperty("物料规格型号")
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ExcelIgnore
    @ApiModelProperty("物料类型[采购件、自制件、委外件、虚拟件]")
    @TableField("material_type")
    private String materialType;
    @ColumnWidth(20)
    @ExcelProperty("物料类型")
    @TableField(exist = false)
    private String materialTypeName;
    @ExcelIgnore
    @ApiModelProperty(value = "必须有BOM", hidden = true)
    @TableField("must_has_bom")
    private String mustHasBom;

    @ExcelIgnore
    @NotBlank(message = "MesBomDetail.storeUnitId", groups = {Save.class, Update.class})
    @ApiModelProperty("库存单位")
    @TableField("store_unit_id")
    private String storeUnitId;
    @ColumnWidth(20)
    @ExcelProperty("库存单位")
    @TableField("store_unit_name")
    private String storeUnitName;
    @ExcelIgnore
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;
    @ExcelIgnore
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ExcelIgnore
    @ApiModelProperty("可用库存")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal storeNumber;

    @ExcelIgnore
    @ApiModelProperty("子项BOM版本主键")
    @TableField("bom_version_id")
    private String bomVersionId;
    @ColumnWidth(20)
    @ExcelProperty("子项BOM版本")
    @TableField("bom_version")
    private String bomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField("bom_version_describe")
    private String bomVersionDescribe;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "MesBomDetail.ignoreDisconnect", groups = {Save.class, Update.class})
    @ApiModelProperty("忽略断阶[NY]")
    @TableField("ignore_disconnect")
    private String ignoreDisconnect;
    @ColumnWidth(20)
    @ExcelProperty("忽略断阶")
    @TableField(exist = false)
    private String ignoreDisconnectName;

    @ExcelIgnore
    @NotBlank(message = "MesBomDetail.dosageType.NotBlank", groups = {Save.class, Update.class})
    @ValidatedEnum(enumClass = BomDosageTypeEnum.class, message = "MesBomDetail.dosageType", groups = {Save.class, Update.class})
    @ApiModelProperty("用量类型[1变动2固定]")
    @TableField("dosage_type")
    private String dosageType;
    @ColumnWidth(20)
    @ExcelProperty("用量类型")
    @TableField(exist = false)
    private String dosageTypeName;

    @ColumnWidth(20)
    @ExcelProperty("分子用量")
    @ValidBigDecimal(message = "MesBomDetail.numeratorDosage", max = "1000000000", includeMax = false, groups = {Save.class, Update.class})
    @ApiModelProperty("分子用量")
    @TableField("numerator_dosage")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal numeratorDosage;

    @ColumnWidth(20)
    @ExcelProperty("分母用量")
    @ValidBigDecimal(message = "MesBomDetail.denominatorDosage", max = "1000000000", includeMax = false, groups = {Save.class, Update.class})
    @ApiModelProperty("分母用量")
    @TableField("denominator_dosage")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal denominatorDosage;

    @ColumnWidth(20)
    @ExcelProperty("固定损耗")
    @ValidBigDecimal(message = "MesBomDetail.fixedLoss", max = "1000000000", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("固定损耗")
    @TableField("fixed_loss")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal fixedLoss;

    @ColumnWidth(20)
    @ExcelProperty("变动损耗率(%)")
    @ValidBigDecimal(message = "MesBomDetail.changeLossRate", max = "100", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("变动损耗率(%)")
    @TableField("change_loss_rate")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal changeLossRate;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "MesBomDetail.allowReplace", groups = {Save.class, Update.class})
    @ApiModelProperty("允许替代[YN]")
    @TableField("allow_replace")
    private String allowReplace;
    @ColumnWidth(20)
    @ExcelProperty("允许替代")
    @TableField(exist = false)
    private String allowReplaceName;

    @ExcelIgnore
    @ApiModelProperty("是否关键件[0否1是]")
    @TableField("production_key_components")
    private Integer productionKeyComponents;
    @ColumnWidth(20)
    @ExcelProperty("是否关键件")
    @TableField(exist = false)
    private String productionKeyComponentsName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PickingWayEnum
     */
    @ExcelIgnore
    @ApiModelProperty("领料方式")
    @TableField("picking_way")
    private String pickingWay;
    @ColumnWidth(20)
    @ExcelProperty("领料方式")
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String pickingWayName;

    @ApiModelProperty("发料考虑损耗[01]")
    @TableField("issue_consider_loss")
    private Integer issueConsiderLoss;

    @ApiModelProperty(hidden = true)
    @TableField("material_group_id")
    private String materialGroupId;
    @TableField("material_group_name")
    private String materialGroupName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer extHash;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Map<String, Object> flMap;
    @ApiModelProperty(value = "背景颜色", hidden = true)
    @TableField(exist = false)
    private String backgroundColour;
    @ApiModelProperty(value = "文字颜色", hidden = true)
    @TableField(exist = false)
    private String fontColour;
}
