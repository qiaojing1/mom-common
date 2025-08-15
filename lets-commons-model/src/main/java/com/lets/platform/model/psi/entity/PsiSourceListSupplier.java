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

import java.util.Objects;

/**
 * <p>
 * 货源清单表 客户
 * </p>
 *
 * @author csy
 * @since 2025-03-31
 */
@Getter
@Setter
@TableName("psi_source_list_supplier")
@ApiModel(value = "PsiSourceListSupplier对象", description = "货源清单表 客户")
public class PsiSourceListSupplier extends BaseEntity {

    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("货源清单id")
    @TableField("parent_id")
    private String parentId;

    @TableField(exist = false)
    private String sourceListCode;

    @ApiModelProperty("供应商或分组id")
    @TableField("supplier_or_group_id")
    private String supplierOrGroupId;

    @TableField(exist = false)
    private String supplierCode;
    @TableField(exist = false)
    private String supplierName;

    @ApiModelProperty("0供应商,1供应商分组")
    @TableField("type")
    private String type;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PsiSourceListSupplier customer = (PsiSourceListSupplier) o;
        return supplierOrGroupId.equals(customer.supplierOrGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), supplierOrGroupId);
    }
}
