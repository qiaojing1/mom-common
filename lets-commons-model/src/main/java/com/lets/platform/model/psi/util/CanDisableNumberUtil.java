package com.lets.platform.model.psi.util;

import com.lets.platform.model.psi.entity.PsiPurchaseOrderDetail;
import com.lets.platform.model.psi.entity.PsiSaleOrderMaterial;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 获取可关闭数量 工具类
 * @author: DING WEI
 * @date: 2024/4/11 18:39
 */
public class CanDisableNumberUtil {

    public static BigDecimal getCanDisableNumber4Purchase(PsiPurchaseOrderDetail purchaseOrderDetail, Boolean AllowOverDeliveryAndStockIn, Boolean PurStockInInProportion) {
        BigDecimal disableNumber = null;
        BigDecimal deliveryLowerNumber = purchaseOrderDetail.getDeliveryLowerNumber();
        BigDecimal number = purchaseOrderDetail.getNumber();
        Boolean canNotUseLower = Objects.isNull(deliveryLowerNumber) || deliveryLowerNumber.compareTo(number) == 0;
        if (AllowOverDeliveryAndStockIn) {
            if (PurStockInInProportion) {
                if (canNotUseLower) {
                    disableNumber = purchaseOrderDetail.getDeliveryUpperNumber();
                    if (Objects.isNull(disableNumber)) {
                        disableNumber = number;
                    }
                } else {
                    disableNumber = deliveryLowerNumber;
                }
            }
        } else {
            if (PurStockInInProportion) {
                if (canNotUseLower) {
                    disableNumber = number;
                } else {
                    disableNumber = deliveryLowerNumber;
                }
            } else {
                disableNumber = number;
            }
        }
        return disableNumber;
    }

    /**
     * 原本逻辑
     * //            if (saleOrderMaterial.getSaleUnderLimit() != null && saleOrderMaterial.getSaleUnderLimit().compareTo(BigDecimal.ZERO) > 0 && saleOrderMaterial.getSaleUnderQuantity() != null) {
     * //                remainQuantity = saleOrderMaterial.getSaleUnderQuantity().subtract(stockOutQuantity);
     * //            } else if (saleOrderMaterial.getSaleOverLimit() != null && saleOrderMaterial.getSaleOverLimit().compareTo(BigDecimal.ZERO) > 0 && saleOrderMaterial.getSaleOverQuantity() != null) {
     * //                remainQuantity = saleOrderMaterial.getSaleOverQuantity().subtract(stockOutQuantity);
     * //            } else {
     * //                remainQuantity = saleOrderMaterial.getQuantity().subtract(stockOutQuantity);
     * //            }
     * @param orderDetail 销售订单明细
     * @param AllowOverNoticeAndStockOut 允许超订单通知及出库
     * @param SaleStockOutInProportion 销售出库按比例控制
     * @return
     * @author DING WEI
     * @date 2024/4/18 18:26
     * @version 1.0
     */
    public static BigDecimal getCanDisableNumber4Sale(PsiSaleOrderMaterial orderDetail, Boolean AllowOverNoticeAndStockOut, Boolean SaleStockOutInProportion) {
        BigDecimal disableNumber = null;
        BigDecimal saleUnderQuantity = orderDetail.getSaleUnderQuantity();
        BigDecimal number = orderDetail.getQuantity();
        boolean canNotUseLower = Objects.isNull(saleUnderQuantity) || saleUnderQuantity.compareTo(number) == 0;
        if (AllowOverNoticeAndStockOut) {
            if (SaleStockOutInProportion) {
                if (canNotUseLower) {
                    disableNumber = orderDetail.getSaleOverQuantity();
                    if (Objects.isNull(disableNumber)) {
                        disableNumber = number;
                    }
                } else {
                    disableNumber = saleUnderQuantity;
                }
            }
        } else {
            if (SaleStockOutInProportion) {
                if (canNotUseLower) {
                    disableNumber = number;
                } else {
                    disableNumber = saleUnderQuantity;
                }
            } else {
                disableNumber = number;
            }
        }
        return disableNumber;
    }

}
