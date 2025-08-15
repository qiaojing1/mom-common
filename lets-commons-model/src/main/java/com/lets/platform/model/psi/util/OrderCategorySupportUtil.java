package com.lets.platform.model.psi.util;

import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.model.psi.entity.PsiOrderCategory;
import com.lets.platform.model.psi.enums.MaterialTypeEnum;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 获取单据类别支持的物料类型
 * @author: DING WEI
 * @date: 2024/3/25 15:35
 */
public class OrderCategorySupportUtil {

    public static Set<String> getOrderCategorySupports(PsiOrderCategory category) {
        Set<String> support = new HashSet<>();
        if (Objects.nonNull(category)) {
            if (YesOrNo.YES.getValue().equals(category.getIsSupportPurchase())) {
                support.add(MaterialTypeEnum.PURCHASED_PART.getValue());
            }
            if (YesOrNo.YES.getValue().equals(category.getIsSupportSelfControl())) {
                support.add(MaterialTypeEnum.SELF_MADE_PARTS.getValue());
            }
            if (YesOrNo.YES.getValue().equals(category.getIsSupportOutsourcing())) {
                support.add(MaterialTypeEnum.OUTSOURCED_PARTS.getValue());
            }
            if (YesOrNo.YES.getValue().equals(category.getIsSupportCost())) {
                support.add(MaterialTypeEnum.COST_PARTS.getValue());
            }
            if (YesOrNo.YES.getValue().equals(category.getIsSupportVirtually())) {
                support.add(MaterialTypeEnum.VIRTUAL_PARTS.getValue());
            }
            if (YesOrNo.YES.getValue().equals(category.getIsSupportService())) {
                support.add(MaterialTypeEnum.SERVICE_PARTS.getValue());
            }
            if (YesOrNo.YES.getValue().equals(category.getIsSupportAsset())) {
                support.add(MaterialTypeEnum.ASSET_PARTS.getValue());
            }
            if (YesOrNo.YES.getValue().equals(category.getIsSupportSuppliedPart())) {
                support.add(MaterialTypeEnum.CUSTOMER_SUPPLIED_PARTS.getValue());
            }
        }
        return support;
    }

}
