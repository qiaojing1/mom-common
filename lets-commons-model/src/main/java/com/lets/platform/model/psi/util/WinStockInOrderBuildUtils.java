package com.lets.platform.model.psi.util;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.lets.platform.model.mes.entity.MesProduceOrderDetailSpecific;
import com.lets.platform.model.psi.entity.PsiWipCompletionStockInOrderMaterialCharacteristic;

import java.util.ArrayList;
import java.util.List;

/**
 * 构建完工入库明细数据
 * @author: DING WEI
 * @date: 2024/5/23 13:39
 */
public class WinStockInOrderBuildUtils {

    public static List<PsiWipCompletionStockInOrderMaterialCharacteristic> specificConvert(List<MesProduceOrderDetailSpecific> detailSpecifics) {
        List<PsiWipCompletionStockInOrderMaterialCharacteristic> characteristics = new ArrayList<>();
        if (CollUtil.isNotEmpty(detailSpecifics)) {
            for (MesProduceOrderDetailSpecific specific : detailSpecifics) {
                PsiWipCompletionStockInOrderMaterialCharacteristic oneSpecific = new PsiWipCompletionStockInOrderMaterialCharacteristic();
                BeanUtil.copyProperties(specific, oneSpecific);
                oneSpecific.setId(null);
                oneSpecific.setParentId(null);
                oneSpecific.setOrderId(null);
                characteristics.add(oneSpecific);
            }
        }
        return characteristics;
    }
}
