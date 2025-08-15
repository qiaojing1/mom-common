package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 供应商推荐方案-明细
 * @author DING WEI
 * @since 2024-03-11
 */
@Getter
@Setter
@TableName("psi_supplier_recommend_plan_detail")
@ApiModel(value = "PsiSupplierRecommendPlanDetail对象", description = "供应商推荐方案-明细")
public class PsiSupplierRecommendPlanDetail extends BaseEntity {

    @ApiModelProperty("方案编码")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("推荐顺序")
    @TableField("recommend_sort")
    private Integer recommendSort;

    /**
     * @see com.lets.platform.model.psi.enums.SupplierRecommendPlanEnum
     */
    @ApiModelProperty("推荐来源[1主供应商,2系统自动推荐,3货源清单,4申请建议供应商,5评分最高,6价格最低,7到货及时率最高,8合格率最高]")
    @TableField("recommend_source")
    private Integer recommendSource;
    @TableField(exist = false)
    private String recommendSourceName;
}
