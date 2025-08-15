package com.lets.platform.model.mes.utils;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.NumberUtil;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrderDetail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 计算最小领用套数
 * @author: DING WEI
 * @date: 2024/9/20 14:41
 */
public class CalMinPickingSetUtil {

    public static BigDecimal calMinPickingSetV2(List<MesProduceMaterialBillOrderDetail> billOrderDetailList) {
        if (CollUtil.isNotEmpty(billOrderDetailList)) {
            List<BigDecimal> pickingSetList = new ArrayList<>();
            for (MesProduceMaterialBillOrderDetail billOrderDetail : billOrderDetailList) {
                BigDecimal numeratorDosage = billOrderDetail.getNumeratorDosage();
                BigDecimal denominatorDosage = billOrderDetail.getDenominatorDosage();
                BigDecimal changeLossRate = billOrderDetail.getChangeLossRate();
                BigDecimal factor = BigDecimal.ONE.add(changeLossRate.divide(new BigDecimal("100"), 10, BigDecimal.ROUND_HALF_UP));
                // 单位用量=（明细的分子用量/细的分母用量）*（1+明细的变动损耗率）
                BigDecimal unitUsage = numeratorDosage.divide(denominatorDosage, 10, BigDecimal.ROUND_HALF_UP).multiply(factor);
                // 套数 = 明细的已领用量/明细的单位用量
                BigDecimal setNumber = billOrderDetail.getUsedNumber().divide(unitUsage, 10, BigDecimal.ROUND_HALF_UP);
                pickingSetList.add(setNumber);
            }
            BigDecimal[] pickingSetArr = new BigDecimal[pickingSetList.size()];
            for (int i = 0; i < pickingSetList.size(); i++) {
                pickingSetArr[i] = pickingSetList.get(i);
            }
            return NumberUtil.min(pickingSetArr);
        }
        return null;
    }

}
