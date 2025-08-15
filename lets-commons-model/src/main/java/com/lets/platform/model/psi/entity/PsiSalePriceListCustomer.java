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
 * 销售价目表 客户
 * </p>
 *
 * @author csy
 * @since 2023-11-21
 */
@Getter
@Setter
@TableName("psi_sale_price_list_customer")
@ApiModel(value = "PsiSalePriceListCustomer对象", description = "销售价目表 客户")
public class PsiSalePriceListCustomer extends BaseEntity {

    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("价目表id")
    @TableField("price_list_id")
    private String priceListId;
    @TableField(exist = false)
    private String priceListCode;

    @ApiModelProperty("客户或分组id")
    @TableField("customer_or_group_id")
    private String customerOrGroupId;

    @TableField(exist = false)
    private String customerCode;
    @TableField(exist = false)
    private String customerName;

    @ApiModelProperty("0客户,1分组")
    @TableField("type")
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PsiSalePriceListCustomer customer = (PsiSalePriceListCustomer) o;
        return customerOrGroupId.equals(customer.customerOrGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerOrGroupId);
    }
}
