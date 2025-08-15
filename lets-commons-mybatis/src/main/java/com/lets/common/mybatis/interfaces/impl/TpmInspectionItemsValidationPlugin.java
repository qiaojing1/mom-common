package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.entity.PsiCustomerFollowUp;
import com.lets.platform.model.tpm.entity.TpmInspectionItems;
import com.lets.platform.model.tpm.entity.TpmInspectionItemsPlanItems;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

import static com.lets.common.mybatis.aspect.DeleteValidateAspect.getSingleQuotesIdStr;

/**
 * @author zhangweiyan
 * @ClassName TpmInspectionItemsValidationPlugin
 * @Description 点检项目引用校验
 * @Date 2024/11/13 18:10
 **/
@Component
@Slf4j
public class TpmInspectionItemsValidationPlugin implements ValidationPluginInterface {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 点检项目引用校验
     *
     * @param entities
     */
    @Override
    public void validate(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            if (entities.get(0) instanceof TpmInspectionItems) {
                String idStr = getSingleQuotesIdStr(entities);
                String querySql = getQuerySql(idStr);
//                Integer data = jdbcTemplate.queryForObject(querySql, Integer.class);
//                if (Objects.nonNull(data) && data > 0) {
//                    throw new LetsException(0,
//                            "已被点检计划引用，无法删除");
//                }
//                data = jdbcTemplate.queryForObject(getQuerySql1(idStr), Integer.class);
//                if (Objects.nonNull(data) && data > 0) {
//                    throw new LetsException(0,
//                            "已被点检工单引用，无法删除");
//                }
            }
        }
    }


    private static String getQuerySql(String idStr) {
        return "select count(1) from `lets-platform-tpm`.tpm_inspection_items_plan_items " +
                "where item_id in (" + idStr + ");";

    }

    private static String getQuerySql1(String idStr) {
        return "select count(1) from `lets-platform-tpm`.tpm_inspection_items_order_detail " +
                "where inspection_items_id in (" + idStr + ");";

    }
}
