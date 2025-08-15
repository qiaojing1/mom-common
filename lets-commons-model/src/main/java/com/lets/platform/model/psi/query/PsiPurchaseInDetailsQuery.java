package com.lets.platform.model.psi.query;

import com.lets.platform.common.pojo.base.ConditionEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName PsiPurchaseInDetailsQuery
 * @Description 采购入库明细&汇总报表查询类
 * @Date 2024/01/03 11:37
 **/
@Data
@ApiModel("采购入库明细&汇总报表查询类")
public class PsiPurchaseInDetailsQuery {

    @ApiModelProperty("入库单据日期，使用~分割")
    private String orderTime;

    @ApiModelProperty("入库单据类别")
    private String orderCategoryId;

    @ApiModelProperty("供应商id")
    private String supplySupplierId;

    @ApiModelProperty("采购部门id")
    private String purchaseInOrgId;

    @ApiModelProperty("入库单据状态")
    private String status;

    @ApiModelProperty("采购员id")
    private String purchaseInUserId;

    @ApiModelProperty("物料编码id")
    private String materialId;

    @ApiModelProperty("物料编码分组id")
    private String materialGroupId;

    @ApiModelProperty("出库单据编号")
    private String orderCode;

    @ApiModelProperty("仓库id")
    private String storeId;

    @ApiModelProperty("当前页面大小")
    private Integer size;

    @ApiModelProperty("当前页数")
    private Integer current;

    @ApiModelProperty("全域查询入参")
    private List<ConditionEntity> conditionOrList;
}
