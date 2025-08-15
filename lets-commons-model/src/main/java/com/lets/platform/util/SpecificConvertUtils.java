package com.lets.platform.util;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.lets.platform.model.mes.entity.MesProduceOrderDetailSpecific;
import com.lets.platform.model.mes.entity.MesProducePickingDetailSpecific;
import com.lets.platform.model.psi.entity.PsiPurchaseApplyMaterialCharacteristic;
import com.lets.platform.model.psi.entity.PsiStoreMaterialSpecific;

import java.util.ArrayList;
import java.util.List;

/**
 * 特征属性转换
 * @author: DING WEI
 * @date: 2024/8/27 11:16
 */
public class SpecificConvertUtils {

    public static List<PsiStoreMaterialSpecific> convert4Picking(List<MesProducePickingDetailSpecific> detailSpecific) {
        List<PsiStoreMaterialSpecific> materialSpecifics = new ArrayList<>();
        if (CollUtil.isNotEmpty(detailSpecific)) {
            for (MesProducePickingDetailSpecific specific : detailSpecific) {
                PsiStoreMaterialSpecific materialSpecific = new PsiStoreMaterialSpecific();
                BeanUtil.copyProperties(specific, materialSpecific);
                materialSpecifics.add(materialSpecific);
            }
        }
        return materialSpecifics;
    }

    public static List<PsiStoreMaterialSpecific> convert4ProduceDetail(List<MesProduceOrderDetailSpecific> detailSpecific) {
        if (CollUtil.isNotEmpty(detailSpecific)) {
            List<PsiStoreMaterialSpecific> materialSpecifics = new ArrayList<>();
            for (MesProduceOrderDetailSpecific specific : detailSpecific) {
                PsiStoreMaterialSpecific materialSpecific = new PsiStoreMaterialSpecific();
                BeanUtil.copyProperties(specific, materialSpecific);
                materialSpecifics.add(materialSpecific);
            }
            return materialSpecifics;
        }
        return null;
    }

    public static List<PsiStoreMaterialSpecific> convert4PurchaseApply(List<PsiPurchaseApplyMaterialCharacteristic> materialCharacteristicList) {
        if (CollUtil.isNotEmpty(materialCharacteristicList)) {
            List<PsiStoreMaterialSpecific> materialSpecifics = new ArrayList<>();
            for (PsiPurchaseApplyMaterialCharacteristic specific : materialCharacteristicList) {
                PsiStoreMaterialSpecific materialSpecific = new PsiStoreMaterialSpecific();
                BeanUtil.copyProperties(specific, materialSpecific);
                materialSpecifics.add(materialSpecific);
            }
            return materialSpecifics;
        }
        return null;
    }
}
