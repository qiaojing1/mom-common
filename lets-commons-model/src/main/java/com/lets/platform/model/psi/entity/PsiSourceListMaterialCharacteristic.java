package com.lets.platform.model.psi.entity;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * <p>
 * 货源清单物料明细特征属性
 * </p>
 *
 * @author csy
 * @since 2025-03-31
 */
@Getter
@Setter
@TableName("psi_source_list_material_characteristic")
@ApiModel(value = "PsiSourceListMaterialCharacteristic对象", description = "货源清单物料明细特征属性")
public class PsiSourceListMaterialCharacteristic extends BaseEntity {


    @ApiModelProperty("货源清单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("货源清单ID")
    @TableField("source_list_id")
    private String sourceListId;

    @ApiModelProperty("是否必填")
    @TableField("required")
    private Integer required;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料特征属性ID")
    @TableField("specific_id")
    private String specificId;

    @ApiModelProperty("物料特征属性名称")
    @TableField("specific_name")
    private String specificName;

    @ApiModelProperty("值来源[1用户数据字典,2手工输入]")
    @TableField("value_source")
    private Integer valueSource;

    @ApiModelProperty("物料特征属性值")
    @TableField("VALUE")
    private String value;

    @ApiModelProperty("物料特征属性值名称")
    @TableField("name")
    private String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PsiSourceListMaterialCharacteristic that = (PsiSourceListMaterialCharacteristic) o;
        return specificId.equals(that.specificId) &&
                StrUtil.equals(value,that.value) &&
                StrUtil.equals(name,that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specificId, value, name);
    }
}
