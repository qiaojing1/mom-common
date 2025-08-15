package com.lets.platform.model.psi.query;

import com.lets.platform.common.pojo.base.ConditionEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName PsiPurchaseDetailsHistoryPriceQuery
 * @Description 采购订单历史价查询类
 * @Date 2023/12/27 10:27
 **/
@ApiModel("采购订单历史价查询类")
@Data
public class PsiPurchaseDetailsHistoryPriceQuery implements Serializable {

    @ApiModelProperty("单据日期 (不指定范围查不出数据)")
    private String orderTime;

    @ApiModelProperty("采购订单单据类别id")
    private String orderCategoryId;

    @ApiModelProperty("采购订单业务类型id")
    private String businessId;

    @ApiModelProperty("采购供应商id")
    private String orderSupplierId;

    @ApiModelProperty("采购订单单据编号")
    private String orderCode;

    @ApiModelProperty("采购部门")
    private String purchaseOrgId;

    @ApiModelProperty("采购员")
    private String purchaseUserId;

    @ApiModelProperty("物料id(只有指定物料时才会返回价格分析字段)")
    private String materialId;

    @ApiModelProperty("币种id")
    private String currencyId;

    @ApiModelProperty("物料规格")
    private String materialSpecs;

    @ApiModelProperty("物料分组id")
    private String materialGroupId;

    private Integer size;
    private Integer current;
    private String purchaseUnitId;
    private String settlementCurrencyId;


    @ApiModelProperty("全域查询入参")
    private List<ConditionEntity> conditionOrList;
}
