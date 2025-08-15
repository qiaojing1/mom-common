package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonUserDict;
import com.lets.platform.model.psi.entity.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.lets.common.mybatis.aspect.DeleteValidateAspect.getSingleQuotesIdStr;

/**
 * @author zhangweiyan
 * @ClassName SettlementMethodValidationPlugin
 * @Description 结算方式删除校验
 * @Date 2025/4/3 18:10
 **/
@Component
@Slf4j
public class SettlementMethodValidationPlugin implements ValidationPluginInterface {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 校验结算方式引用
     *
     * @param entities
     */
    @Override
    public void validate(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            if (entities.get(0) instanceof PsiSettlementMethod) {
                String idStr = getSingleQuotesIdStr(entities);
                List<PsiSaleOrder> saleOrders = jdbcTemplate.query(getSaleOrderQuerySql(idStr), new BeanPropertyRowMapper<>(PsiSaleOrder.class));
                if (CollUtil.isNotEmpty(saleOrders)) {
                    throw new LetsException(0, saleOrders.get(0).getCode() + "的销售订单已引用当前结算方式");
                }
                List<PsiPurchaseOrder> purchaseOrders = jdbcTemplate.query(getPurchaseOrderQuerySql(idStr), new BeanPropertyRowMapper<>(PsiPurchaseOrder.class));
                if (CollUtil.isNotEmpty(purchaseOrders)) {
                    throw new LetsException(0, purchaseOrders.get(0).getCode() + "的采购订单已引用当前结算方式");
                }
                List<PsiCustom> customs = jdbcTemplate.query(getCustomQuerySql(idStr), new BeanPropertyRowMapper<>(PsiCustom.class));
                if (CollUtil.isNotEmpty(customs)) {
                    throw new LetsException(0, customs.get(0).getCode() + "的客户已引用当前结算方式");
                }
            }
        }
    }


    private static String getSaleOrderQuerySql(String idStr) {
        return "select code from `lets-platform-psi`.psi_sale_order " +
                "where settlement_method_id in (" + idStr + ");";

    }

    private static String getPurchaseOrderQuerySql(String idStr) {
        return "select code from `lets-platform-psi`.psi_purchase_order " +
                "where settlement_method in (" + idStr + ");";

    }

    private static String getCustomQuerySql(String idStr) {
        return "select code from `lets-platform-psi`.psi_custom " +
                "where default_settlement_way in (" + idStr + ");";

    }

}
