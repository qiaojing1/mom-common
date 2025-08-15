package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 销售目标管理-明细
 * @author DING WEI
 * @since 2024-05-14
 */
@Getter
@Setter
@TableName("psi_sale_target_detail")
@ApiModel(value = "PsiSaleTargetDetail对象", description = "销售目标管理-明细")
public class PsiSaleTargetDetail extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sheetName;

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    /**
     * @see com.lets.platform.model.psi.enums.SaleTargetDetailTypeEnum
     */
    @ApiModelProperty("类型[1:部门,2:员工,3:产品]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("部门、人员、产品分类主键")
    @TableField("relation_id")
    private String relationId;

    @ApiModelProperty("部门、人员、产品分类名称")
    @TableField("relation_name")
    private String relationName;

    @ApiModelProperty("父级主键")
    @TableField("parent_id")
    private String parentId;
    @TableField(exist = false)
    private String parentName;

    @ApiModelProperty("一月")
    @TableField("month1")
    private BigDecimal month1;
    @ApiModelProperty("二月")
    @TableField("month2")
    private BigDecimal month2;
    @ApiModelProperty("三月")
    @TableField("month3")
    private BigDecimal month3;
    @ApiModelProperty("四月")
    @TableField("month4")
    private BigDecimal month4;
    @ApiModelProperty("五月")
    @TableField("month5")
    private BigDecimal month5;
    @ApiModelProperty("六月")
    @TableField("month6")
    private BigDecimal month6;
    @ApiModelProperty("七月")
    @TableField("month7")
    private BigDecimal month7;
    @ApiModelProperty("八月")
    @TableField("month8")
    private BigDecimal month8;
    @ApiModelProperty("九月")
    @TableField("month9")
    private BigDecimal month9;
    @ApiModelProperty("十月")
    @TableField("month10")
    private BigDecimal month10;
    @ApiModelProperty("十一月")
    @TableField("month11")
    private BigDecimal month11;
    @ApiModelProperty("十二月")
    @TableField("month12")
    private BigDecimal month12;

    @ApiModelProperty("目标金额")
    @TableField("user_target_amount")
    private BigDecimal userTargetAmount;
    @ApiModelProperty("未分配目标金额(人员)")
    @TableField("user_not_distribute_amount")
    private BigDecimal userNotDistributeAmount;
    @ApiModelProperty("已分配目标金额(人员)")
    @TableField("user_distribute_amount")
    private BigDecimal userDistributeAmount;

    @ApiModelProperty("产品分类年度目标")
    @TableField("product_year_amount")
    private BigDecimal productYearAmount;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("部门层级")
    @TableField(exist = false)
    private Integer deptLevel;

    @ApiModelProperty("是否有上级")
    @TableField(exist = false)
    private Boolean hasParent;

    @ApiModelProperty("部门年度实际销售额 KPI报表中使用")
    @TableField(exist = false)
    private BigDecimal deptYearReactAmount;

    @ApiModelProperty("产品年度实际销售额 KPI报表中使用")
    @TableField(exist = false)
    private BigDecimal productYearReactAmount;

    @ApiModelProperty("子级")
    @TableField(exist = false)
    private List<PsiSaleTargetDetail> child;

    public BigDecimal month1NN() {
        if (Objects.isNull(month1)) {
            return BigDecimal.ZERO;
        } else {
            return month1;
        }
    }
    public BigDecimal month2NN() {
        if (Objects.isNull(month2)) {
            return BigDecimal.ZERO;
        } else {
            return month2;
        }
    }
    public BigDecimal month3NN() {
        if (Objects.isNull(month3)) {
            return BigDecimal.ZERO;
        } else {
            return month3;
        }
    }
    public BigDecimal month4NN() {
        if (Objects.isNull(month4)) {
            return BigDecimal.ZERO;
        } else {
            return month4;
        }
    }
    public BigDecimal month5NN() {
        if (Objects.isNull(month5)) {
            return BigDecimal.ZERO;
        } else {
            return month5;
        }
    }
    public BigDecimal month6NN() {
        if (Objects.isNull(month6)) {
            return BigDecimal.ZERO;
        } else {
            return month6;
        }
    }
    public BigDecimal month7NN() {
        if (Objects.isNull(month7)) {
            return BigDecimal.ZERO;
        } else {
            return month7;
        }
    }
    public BigDecimal month8NN() {
        if (Objects.isNull(month8)) {
            return BigDecimal.ZERO;
        } else {
            return month8;
        }
    }
    public BigDecimal month9NN() {
        if (Objects.isNull(month9)) {
            return BigDecimal.ZERO;
        } else {
            return month9;
        }
    }
    public BigDecimal month10NN() {
        if (Objects.isNull(month10)) {
            return BigDecimal.ZERO;
        } else {
            return month10;
        }
    }
    public BigDecimal month11NN() {
        if (Objects.isNull(month11)) {
            return BigDecimal.ZERO;
        } else {
            return month11;
        }
    }
    public BigDecimal month12NN() {
        if (Objects.isNull(month12)) {
            return BigDecimal.ZERO;
        } else {
            return month12;
        }
    }

    public BigDecimal productYearAmountNN() {
        if (Objects.isNull(productYearAmount)) {
            return BigDecimal.ZERO;
        } else {
            return productYearAmount;
        }
    }

    public Integer emptyMonthNum() {
        Integer emptyMonthNumber = GlobalConstant.ZERO;
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month1) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month2) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month3) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month4) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month5) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month6) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month7) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month8) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month9) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month10) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month11) ? 1 : 0);
        emptyMonthNumber = emptyMonthNumber + (Objects.isNull(month12) ? 1 : 0);
        return emptyMonthNumber;
    }
    public List<BigDecimal> emptyMonthSet(BigDecimal value, Boolean ignore) {
        List<BigDecimal> avgMonthAmountList = new ArrayList<>();
        if (ignore || Objects.isNull(month1)) {
            this.month1 = value;
        }
        avgMonthAmountList.add(this.month1);
        if (ignore || Objects.isNull(month2)) {
            this.month2 = value;
        }
        avgMonthAmountList.add(this.month2);
        if (ignore || Objects.isNull(month3)) {
            this.month3 = value;
        }
        avgMonthAmountList.add(this.month3);
        if (ignore || Objects.isNull(month4)) {
            this.month4 = value;
        }
        avgMonthAmountList.add(this.month4);
        if (ignore || Objects.isNull(month5)) {
            this.month5 = value;
        }
        avgMonthAmountList.add(this.month5);
        if (ignore || Objects.isNull(month6)) {
            this.month6 = value;
        }
        avgMonthAmountList.add(this.month6);
        if (ignore || Objects.isNull(month7)) {
            this.month7 = value;
        }
        avgMonthAmountList.add(this.month7);
        if (ignore || Objects.isNull(month8)) {
            this.month8 = value;
        }
        avgMonthAmountList.add(this.month8);
        if (ignore || Objects.isNull(month9)) {
            this.month9 = value;
        }
        avgMonthAmountList.add(this.month9);
        if (ignore || Objects.isNull(month10)) {
            this.month10 = value;
        }
        avgMonthAmountList.add(this.month10);
        if (ignore || Objects.isNull(month11)) {
            this.month11 = value;
        }
        avgMonthAmountList.add(this.month11);
        if (ignore || Objects.isNull(month12)) {
            this.month12 = value;
        }
        avgMonthAmountList.add(this.month12);
        return avgMonthAmountList;
    }
    public List<BigDecimal> everyMonthSet() {
        List<BigDecimal> avgMonthAmountList = new ArrayList<>();
        avgMonthAmountList.add(this.month1);
        avgMonthAmountList.add(this.month2);
        avgMonthAmountList.add(this.month3);
        avgMonthAmountList.add(this.month4);
        avgMonthAmountList.add(this.month5);
        avgMonthAmountList.add(this.month6);
        avgMonthAmountList.add(this.month7);
        avgMonthAmountList.add(this.month8);
        avgMonthAmountList.add(this.month9);
        avgMonthAmountList.add(this.month10);
        avgMonthAmountList.add(this.month11);
        avgMonthAmountList.add(this.month12);
        return avgMonthAmountList;
    }
}
