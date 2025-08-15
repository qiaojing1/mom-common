package com.lets.platform.model.psi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 单据性质
 * @author: DING WEI
 * @date: 2023/8/1 9:06
 */
@Data
@ApiModel("单据性质")
public class PsiOrderCategoryOrderNature {

    @ApiModelProperty("单据性质")
    private String orderNature;

    @ApiModelProperty("单据性质名称")
    private String orderNatureName;

    @ApiModelProperty("父级")
    private String parentCode;

    @ApiModelProperty("子级")
    private List<PsiOrderCategoryOrderNature> children;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
}
