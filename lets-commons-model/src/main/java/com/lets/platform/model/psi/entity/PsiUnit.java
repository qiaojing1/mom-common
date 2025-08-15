package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 计量单位
 * </p>
 *
 * @author DING WEI
 * @since 2023-07-04
 */
@Getter
@Setter
@TableName("psi_unit")
@ApiModel(value = "PaiUnit对象", description = "计量单位")
public class PsiUnit extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ExcelIgnore
    @ApiModelProperty("分组编码")
    @TableField(exist = false)
    private String groupCode;

    @ExcelIgnore
    @ApiModelProperty("分组名称")
    @TableField(exist = false)
    private String groupName;

    @ColumnWidth(20)
    @ExcelProperty(value = "单位编码", index = 0)
    @ApiModelProperty("单位编码")
    @TableField("code")
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value = "单位名称", index = 1)
    @Length(min = 1, max = 20, message = "PsiUnit.name", groups = {Save.class, Update.class})
    @ApiModelProperty("单位名称")
    @TableField("name")
    private String name;

    @ExcelIgnore
    @TableField("parent_code")
    @ApiModelProperty(value = "单位分组编码", hidden = true)
    @NotBlank(message = "PsiUnit.ParentCode.NotBlank", groups = {Save.class, Update.class})
    private String parentCode;

    @ColumnWidth(20)
    @ExcelProperty(value = "单位分组", index = 2)
    @TableField(exist = false)
    @ApiModelProperty(value = "单位分组名称", hidden = true)
    private String parentName;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(value = "后端没有实际用处,只是前端不好展示用到", hidden = true)
    private String parentId;

    @ExcelIgnore
    @Min(value = 0, message = "PsiUnit.accuracy", groups = {Save.class, Update.class})
    @Max(value = 10, message = "PsiUnit.accuracy", groups = {Save.class, Update.class})
    @ApiModelProperty("单位精度")
    @TableField("accuracy")
    private Integer accuracy;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer baseUnitAccuracy;

    @ExcelIgnore
    @TableField(exist = false)
    private String baseUnitCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String baseUnitName;

    @ColumnWidth(20)
    @ExcelProperty(value = "单位精度", index = 3)
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String accuracyFormat;

    @ExcelIgnore
    @ApiModelProperty("舍入类型[4四舍五入、0直接进位、1直接舍位]")
    @TableField("round_off_type")
    private String roundOffType;

    @ColumnWidth(20)
    @ExcelProperty(value = "舍入类型", index = 4)
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String roundOffTypeName;

    @ExcelIgnore
    @ApiModelProperty("是否预设[N否Y是]")
    @TableField("is_presets")
    private String isPresets;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String isPresetsName;

    @ValidatedEnum(enumClass = IsOrNotEnum.class, message = "SysUser.enable", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;

    @ColumnWidth(20)
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String enableName;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiUnit> children;

    @ExcelIgnore
    @ApiModelProperty("是否基准计量单位")
    @TableField("is_base")
    private Integer isBase;

    @ExcelIgnore
    @ApiModelProperty("换算类型[1固定,2浮动]")
    @TableField("type")
    private String type;

    @ColumnWidth(20)
    @ExcelProperty(value = "换算类型", index = 5)
    @ApiModelProperty("换算类型[1固定,2浮动]")
    @TableField(exist = false)
    private String typeName;

    @ExcelIgnore
    @ApiModelProperty("换算分母")
    @TableField("source_factor")
    private BigDecimal sourceFactor;

    @ColumnWidth(20)
    @ExcelProperty(value = "换算分母", index = 6)
    @ApiModelProperty("换算分母")
    @TableField(exist = false)
    private String sourceFactorString;

    @ExcelIgnore
    @ApiModelProperty("换算分子")
    @TableField("target_factor")
    private BigDecimal targetFactor;

    @ColumnWidth(20)
    @ExcelProperty(value = "换算分子", index = 7)
    @ApiModelProperty("换算分子")
    @TableField(exist = false)
    private String targetFactorString;

    @ColumnWidth(20)
    @ExcelProperty(value = "描述", index = 8)
    @Length(max = 40, message = "PsiUnit.description", groups = {Save.class, Update.class})
    @ApiModelProperty("描述")
    @TableField("description")
    private String description;


    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        if (!super.equals(o)) {return false;}
        PsiUnit psiUnit = (PsiUnit) o;
        return Objects.equals(code, psiUnit.code)
               && Objects.equals(name, psiUnit.name)
               && Objects.equals(parentCode, psiUnit.parentCode)
               && Objects.equals(parentId, psiUnit.parentId)
               && Objects.equals(accuracy, psiUnit.accuracy)
               && Objects.equals(roundOffType, psiUnit.roundOffType)
               && Objects.equals(description, psiUnit.description)
               && Objects.equals(isPresets, psiUnit.isPresets)
               && Objects.equals(enable, psiUnit.enable)
               && Objects.equals(isBase, psiUnit.isBase)
               && Objects.equals(sourceFactor, psiUnit.sourceFactor)
               && Objects.equals(targetFactor, psiUnit.targetFactor)
               && Objects.equals(type, psiUnit.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), code, name, parentCode, parentId, accuracy, roundOffType, description, isPresets, enable, isBase, sourceFactor, targetFactor, type);
    }
}
