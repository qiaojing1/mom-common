package com.lets.platform.model.psi.query;

import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.ConditionEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName PsiSaleStockOutDetailsQuery
 * @Description 销售出库汇总报表查询类
 * @Date 2023/12/25 11:37
 **/
@Data
@ApiModel("销售出库汇总报表查询类")
public class PsiSaleStockOutTotalQuery {

    @ApiModelProperty("出库单据日期，使用~分割")
    private String orderTime;

    @ApiModelProperty("出库单据类别")
    private String orderCategoryId;

    @ApiModelProperty("客户id")
    private String orderCustomerId;

    @ApiModelProperty("销售部门id")
    private String saleOrgId;

    @ApiModelProperty("出库单据状态")
    private String status;

    @ApiModelProperty("销售分组id")
    private String saleGroupId;

    @ApiModelProperty("销售员id")
    private String saleUserId;

    @ApiModelProperty("物料编码id")
    private String materialId;

    @ApiModelProperty("物料编码分组id")
    private String materialGroupId;
    private String materialSpecs;

    @ApiModelProperty("出库单据编号")
    private String orderCode;

    @ApiModelProperty("仓库id")
    private String storeId;

    @ApiModelProperty("当前页面大小")
    private Integer size;

    @ApiModelProperty("当前页数")
    private Integer current;

    @ApiModelProperty("全域查询")
    private List<ConditionEntity> conditionOrList;
}
