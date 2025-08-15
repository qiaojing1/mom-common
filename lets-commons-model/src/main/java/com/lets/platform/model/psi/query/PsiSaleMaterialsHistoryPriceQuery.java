package com.lets.platform.model.psi.query;

import com.lets.platform.common.pojo.base.ConditionEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName PsiSaleMaterialsHistoryPriceQuery
 * @Description 销售订单订单历史价查询类
 * @Date 2023/12/28 10:27
 **/
@ApiModel("销售订单订单历史价查询类")
@Data
public class PsiSaleMaterialsHistoryPriceQuery implements Serializable {

    @ApiModelProperty("单据日期 (不指定范围查不出数据)")
    private String orderTime;

    @ApiModelProperty("销售订单单据类别id")
    private String orderCategoryId;

    @ApiModelProperty("销售订单业务类型id")
    private String businessId;

    @ApiModelProperty("订货客户id")
    private String orderCustomerId;

    @ApiModelProperty("销售订单单据编号")
    private String orderCode;

    @ApiModelProperty("销售部门")
    private String saleOrgId;
    private String saleUnitId;

    @ApiModelProperty("销售员")
    private String saleUserId;

    @ApiModelProperty("物料id(只有指定物料时才会返回价格分析字段)")
    private String materialId;

    @ApiModelProperty("币种id")
    private String currencyId;

    @ApiModelProperty("物料规格")
    private String materialSpecs;

    @ApiModelProperty("物料分组id")
    private String materialGroupId;

    @ApiModelProperty("客户物料编码")
    private String customerMaterialCode;
    private String customerMaterialName;

    @ApiModelProperty("实际价格")
    private String actualPrice;

    private Integer size;
    private Integer current;

    @ApiModelProperty("全域查询")
    private List<ConditionEntity> conditionOrList;
}
