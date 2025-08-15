package com.lets.platform.model.psi.entity;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 货源清单表明细
 * </p>
 *
 * @author csy
 * @since 2025-03-31
 */
@Getter
@Setter
@TableName("psi_source_list_detail")
@ApiModel(value = "PsiSourceListDetail对象", description = "货源清单表明细")
public class PsiSourceListDetail extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @TableField("line_number")
    @ExcelIgnore
    private Long lineNumber;

    @ExcelIgnore
    @ApiModelProperty("货源清单ID")
    @TableField("parent_id")
    private String parentId;

    @ExcelProperty("货源清单编码")
    @TableField(exist = false)
    private String sourceListCode;

    @ExcelIgnore
    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @ExcelProperty("物料编码")
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ExcelProperty("物料名称")
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ExcelProperty("物料规格型号")
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ExcelIgnore
    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ExcelIgnore
    @ApiModelProperty("采购单位ID")
    @TableField("purchase_unit")
    private String purchaseUnit;

    @ExcelIgnore
    @ApiModelProperty("采购单位code")
    @TableField("purchase_unit_code")
    private String purchaseUnitCode;

    @ExcelProperty("采购单位")
    @ApiModelProperty("采购单位名称")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;

    @ExcelIgnore
    @ApiModelProperty("采购单位精度")
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;

    @ExcelIgnore
    @ApiModelProperty("采购单位舍入类型")
    @TableField("purchase_unit_round_off_type")
    private String purchaseUnitRoundOffType;

    @ExcelProperty("备注")
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiSourceListMaterialCharacteristic> characteristicList;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PsiSourceListDetail that = (PsiSourceListDetail) o;
        return materialId.equals(that.materialId) &&
                purchaseUnit.equals(that.purchaseUnit) &&
                sameList(characteristicList,that.characteristicList)&& sameList(that.characteristicList,characteristicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), materialId, purchaseUnit, characteristicList);
    }


    private boolean sameList(List<PsiSourceListMaterialCharacteristic> l1, List<PsiSourceListMaterialCharacteristic> l2) {
        boolean flag = false;
        int flagCount = 0;
        if (CollUtil.isEmpty(l1) && CollUtil.isEmpty(l2)) {
            return true;
        }
        if (l1.size() != l2.size()) {
            return false;
        }
        for (PsiSourceListMaterialCharacteristic characteristic : l2) {
            if (CollUtil.isEmpty(l1) || !l1.contains(characteristic)) {
                continue;
            }
            flagCount++;
        }
        if (flagCount == l1.size()) {
            flag = true;
        }
        return flag;
    }
}
