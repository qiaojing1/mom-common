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

/**
 * <p>
 * 供应商目标开发管理-明细
 * </p>
 *  截止2025年2月27日11:54:06明细相关功能暂未启用 预留表
 * @author zhangweiyan
 * @since 2025-02-27
 */
@Getter
@Setter
@TableName("psi_supplier_excavation_target_detail")
@ApiModel(value = "PsiSupplierExcavationTargetDetail对象", description = "供应商目标开发管理-明细")
public class PsiSupplierExcavationTargetDetail extends BaseEntity {

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

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

    @ApiModelProperty("一月")
    @TableField("month1")
    private Long month1;

    @ApiModelProperty("二月")
    @TableField("month2")
    private Long month2;

    @ApiModelProperty("三月")
    @TableField("month3")
    private Long month3;

    @ApiModelProperty("四月")
    @TableField("month4")
    private Long month4;

    @ApiModelProperty("五月")
    @TableField("month5")
    private Long month5;

    @ApiModelProperty("六月")
    @TableField("month6")
    private Long month6;

    @ApiModelProperty("七月")
    @TableField("month7")
    private Long month7;

    @ApiModelProperty("八月")
    @TableField("month8")
    private Long month8;

    @ApiModelProperty("九月")
    @TableField("month9")
    private Long month9;

    @ApiModelProperty("十月")
    @TableField("month10")
    private Long month10;

    @ApiModelProperty("十一月")
    @TableField("month11")
    private Long month11;

    @ApiModelProperty("十二月")
    @TableField("month12")
    private Long month12;

    @ApiModelProperty("目标金额")
    @TableField("user_target_amount")
    private Long userTargetAmount;

    @ApiModelProperty("未分配目标金额(人员)")
    @TableField("user_not_distribute_amount")
    private Long userNotDistributeAmount;

    @ApiModelProperty("已分配目标金额(人员)")
    @TableField("user_distribute_amount")
    private Long userDistributeAmount;

    @ApiModelProperty("产品分类年度目标")
    @TableField("product_year_amount")
    private Long productYearAmount;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
}
