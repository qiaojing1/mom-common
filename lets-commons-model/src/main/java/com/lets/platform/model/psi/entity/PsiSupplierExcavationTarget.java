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

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 供应商开发目标管理
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-02-27
 */
@Getter
@Setter
@TableName("psi_supplier_excavation_target")
@ApiModel(value = "PsiSupplierExcavationTarget对象", description = "供应商开发目标管理")
public class PsiSupplierExcavationTarget extends BaseEntity {

    @ApiModelProperty("年度")
    @TableField("year")
    private String year;

    @ApiModelProperty("企业年度供应商开发目标")
    @TableField("supplier_excavation_target")
    private BigDecimal supplierExcavationTarget;

    @ApiModelProperty("未分配目标")
    @TableField("not_distribute_quantity")
    private BigDecimal notDistributeQuantity;

    @ApiModelProperty("已分配目标")
    @TableField("distribute_quantity")
    private BigDecimal distributeQuantity;

    @ApiModelProperty("未分配目标(部门)")
    @TableField("dept_not_distribute_quantity")
    private BigDecimal deptNotDistributeQuantity;

    @ApiModelProperty("已分配目标(部门)")
    @TableField("dept_distribute_quantity")
    private BigDecimal deptDistributeQuantity;

    @ApiModelProperty("未分配目标(产品)")
    @TableField("product_not_distribute_quantity")
    private BigDecimal productNotDistributeQuantity;

    @ApiModelProperty("已分配目标(产品)")
    @TableField("product_distribute_quantity")
    private BigDecimal productDistributeQuantity;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

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

    /**
     * 截止2025年2月27日11:54:06明细相关功能暂未启用 预留表
     */
    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<PsiSupplierExcavationTargetDetail> detailList;

    @ApiModelProperty("是否忽略已经填写的")
    @TableField(exist = false)
    private Boolean ignore;

    public BigDecimal getMonth1NN() {
        return Objects.nonNull(month1) ? month1 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth2NN() {
        return Objects.nonNull(month2) ? month2 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth3NN() {
        return Objects.nonNull(month3) ? month3 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth4NN() {
        return Objects.nonNull(month4) ? month4 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth5NN() {
        return Objects.nonNull(month5) ? month5 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth6NN() {
        return Objects.nonNull(month6) ? month6 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth7NN() {
        return Objects.nonNull(month7) ? month7 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth8NN() {
        return Objects.nonNull(month8) ? month8 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth9NN() {
        return Objects.nonNull(month9) ? month9 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth10NN() {
        return Objects.nonNull(month10) ? month10 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth11NN() {
        return Objects.nonNull(month11) ? month11 : BigDecimal.ZERO;
    }

    public BigDecimal getMonth12NN() {
        return Objects.nonNull(month12) ? month12 : BigDecimal.ZERO;
    }

    public BigDecimal getAllMonthSum() {
        return this.getMonth1NN().add(this.getMonth2NN()).add(this.getMonth3NN()).add(this.getMonth4NN()).add(this.getMonth5NN())
                .add(this.getMonth6NN()).add(this.getMonth7NN()).add(this.getMonth8NN()).add(this.getMonth9NN()).add(this.getMonth10NN())
                .add(this.getMonth11NN()).add(this.getMonth12NN());
    }
}
