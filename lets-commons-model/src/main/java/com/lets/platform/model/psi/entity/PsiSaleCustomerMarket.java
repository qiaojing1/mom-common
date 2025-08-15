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
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * <p>
 * 销售-客户可销控制
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-06-27
 */
@Getter
@Setter
@TableName("psi_sale_customer_market")
@ApiModel(value = "PsiSaleCustomerMarket对象", description = "销售-客户可销控制")
public class PsiSaleCustomerMarket extends BaseEntity {
    @TableField(exist = false)
    private String code = "";

    @ApiModelProperty("可销范围 0:销售部门 1: 销售人员")
    @TableField("marketable_range")
    private String marketableRange;
    @TableField(exist = false)
    private String marketableRangeName;

    @ApiModelProperty("可销对象 0:客户 1:客户分组")
    @TableField("marketable_object")
    private String marketableObject;
    @TableField(exist = false)
    private String marketableObjectName;

    /**
     * @EnumName SaleControlTypeEnum
     */
    @ApiModelProperty("控制类型 0:可销售 1:不可销售 2:仅可销售")
    @TableField("control_type")
    private String controlType;
    @TableField(exist = false)
    private String controlTypeName;

    @ApiModelProperty("是否启用 0:停用 1:启用")
    @TableField("enable")
    private String enable;
    @TableField(exist = false)
    private String enableName;

    @TableField(exist = false)
    private List<PsiSaleCustomerMarketRange> ranges;
    @TableField(exist = false)
    private List<PsiSaleCustomerMarketObject> objects;
    @TableField(exist = false)
    private Integer rowIndex;

    public String getEnable() {
        return StringUtils.isNotBlank(enable) ? enable : "1";
    }
}
