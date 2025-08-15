package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 客户跟进记录-费用
 * </p>
 *
 * @author csy
 * @since 2024-04-28
 */
@Getter
@Setter
@TableName("psi_customer_follow_up_cost")
@ApiModel(value = "PsiCustomerFollowUpCost对象", description = "客户跟进记录-费用")
public class PsiCustomerFollowUpCost extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @TableField(exist = false)
    @ExcelProperty("计划编号")
    private String code;

    @ApiModelProperty("客户跟进记录id")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @ApiModelProperty("费用类型")
    @TableField("cost_type")
    @ExcelIgnore
    private String costType;
    @TableField(exist = false)
    @ExcelProperty("费用类型")
    private String costTypeName;

    @ApiModelProperty("金额")
    @TableField("price_amount")
    @ExcelIgnore
    private BigDecimal priceAmount;
    @ExcelProperty("金额（元）")
    @TableField(exist = false)
    private String priceAmountStr;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelProperty("描述")
    private String remark;
}
