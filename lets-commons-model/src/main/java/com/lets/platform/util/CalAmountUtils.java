package com.lets.platform.util;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.model.psi.entity.PsiPurchaseDeliveryOrder;
import com.lets.platform.model.psi.entity.PsiPurchaseDeliveryOrderDetail;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

/**
 * 计算金额等数据
 * @author: DING WEI
 * @date: 2025/4/24 9:56
 */
public class CalAmountUtils {

    public static void calAmount(Map<String, PsiPurchaseDeliveryOrder> deliveryOrderMap, PsiPurchaseDeliveryOrderDetail detail) {
        PsiPurchaseDeliveryOrder order = deliveryOrderMap.get(detail.getOrderId());
        BigDecimal exchangeRate;
        if (StrUtil.isBlank(order.getExchangeRate())) {
            exchangeRate = BigDecimal.ONE;
        } else {
            exchangeRate = new BigDecimal(order.getExchangeRate());
        }
        // 计算 金额 金额(本位币)
        BigDecimal amount = detail.getPrice().multiply(detail.getNumber());
        BigDecimal baseCurrencyAmount = amount.multiply(exchangeRate);
        detail.setAmount(amount);
        detail.setBaseCurrencyAmount(baseCurrencyAmount);
        // 计算 税额 税额(本位币)
        BigDecimal taxAmount;
        BigDecimal BasicTaxAmount;
        if (StrUtil.isNotEmpty(detail.getTaxId())) {
            BigDecimal taxRate = detail.getTaxRate();
            taxAmount = amount.multiply(taxRate);
            BigDecimal baseCurrencyTaxAmount = taxAmount.multiply(exchangeRate);
            detail.setTaxAmount(taxAmount);
            detail.setBaseCurrencyTaxAmount(baseCurrencyTaxAmount);
        } else {
            taxAmount = BigDecimal.ZERO;
            BasicTaxAmount = BigDecimal.ZERO;
            detail.setTaxAmount(taxAmount);
            detail.setBaseCurrencyTaxAmount(BasicTaxAmount);
        }
        // 含税合计 含税合计(本位币)
        BigDecimal amountIncludingTax = amount.add(taxAmount);
        BigDecimal baseCurrencyAmountIncludingTax = amountIncludingTax.multiply(exchangeRate);
        detail.setAmountIncludingTax(amountIncludingTax);
        detail.setBaseCurrencyAmountIncludingTax(baseCurrencyAmountIncludingTax);
    }

    public static void calAmount(PsiPurchaseDeliveryOrder order, PsiPurchaseDeliveryOrderDetail sourceDetail, PsiPurchaseDeliveryOrderDetail updateDetail) {
        BigDecimal exchangeRate;
        if (Objects.isNull(order) || StrUtil.isBlank(order.getExchangeRate())) {
            exchangeRate = BigDecimal.ONE;
        } else {
            exchangeRate = new BigDecimal(order.getExchangeRate());
        }
        // 计算 金额 金额(本位币)
        BigDecimal amount = sourceDetail.getPrice().multiply(updateDetail.getNumber());
        BigDecimal baseCurrencyAmount = amount.multiply(exchangeRate);
        updateDetail.setAmount(amount);
        updateDetail.setBaseCurrencyAmount(baseCurrencyAmount);
        // 计算 税额 税额(本位币)
        BigDecimal taxAmount;
        BigDecimal BasicTaxAmount;
        if (StrUtil.isNotEmpty(sourceDetail.getTaxId())) {
            BigDecimal taxRate = sourceDetail.getTaxRate();
            taxAmount = amount.multiply(taxRate);
            BigDecimal baseCurrencyTaxAmount = taxAmount.multiply(exchangeRate);
            updateDetail.setTaxAmount(taxAmount);
            updateDetail.setBaseCurrencyTaxAmount(baseCurrencyTaxAmount);
        } else {
            taxAmount = BigDecimal.ZERO;
            BasicTaxAmount = BigDecimal.ZERO;
            updateDetail.setTaxAmount(taxAmount);
            updateDetail.setBaseCurrencyTaxAmount(BasicTaxAmount);
        }
        // 含税合计 含税合计(本位币)
        BigDecimal amountIncludingTax = amount.add(taxAmount);
        BigDecimal baseCurrencyAmountIncludingTax = amountIncludingTax.multiply(exchangeRate);
        updateDetail.setAmountIncludingTax(amountIncludingTax);
        updateDetail.setBaseCurrencyAmountIncludingTax(baseCurrencyAmountIncludingTax);
    }

}
