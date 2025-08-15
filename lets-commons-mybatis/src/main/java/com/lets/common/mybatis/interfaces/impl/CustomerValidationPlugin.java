package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonUserDict;
import com.lets.platform.model.common.enums.CommonUserDictGroupCodeEnum;
import com.lets.platform.model.psi.entity.PsiCustomerFollowUp;
import com.lets.platform.model.psi.entity.PsiMaterial;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.lets.common.mybatis.aspect.DeleteValidateAspect.getSingleQuotesIdStr;

/**
 * @author zhangweiyan
 * @ClassName MaterialExtFieldValidationPlugin
 * @Description 客户跟进分类删除校验
 * @Date 2024/4/9 18:10
 **/
@Component
@Slf4j
public class CustomerValidationPlugin implements ValidationPluginInterface {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 校验客户跟进引用用户数据字典
     *
     * @param entities
     */
    @Override
    public void validate(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            if (entities.get(0) instanceof CommonUserDict) {
                String idStr = getSingleQuotesIdStr(entities);
                List<CommonUserDict> parentCodes = jdbcTemplate.query(getParentCode(idStr), new BeanPropertyRowMapper<>(CommonUserDict.class));
                CommonUserDict userDict=parentCodes.get(0);
                if (userDict.getParentCode().equals("FTYPE") || userDict.getParentCode().equals("KHGJFL")) {
                    String querySql = userDict.getParentCode().equals("FTYPE") ? getQuerySql2(idStr) : getQuerySql(idStr);
                    log.info("查询客户跟进记录管理的sql ===> {}", querySql);
                    List<PsiCustomerFollowUp> data = jdbcTemplate.query(querySql, new BeanPropertyRowMapper<>(PsiCustomerFollowUp.class));
                    if (CollectionUtil.isNotEmpty(data)) {
                        throw new LetsException(0,
                                "已被客户跟进[" + data.get(0).getCode() + "]引用，无法删除");
                    }
                }
            }
        }
    }


    private static String getQuerySql(String idStr) {
        return "select * from `lets-platform-psi`.psi_customer_follow_up " +
                "where type in (" + idStr + ");";

    }

    private static String getQuerySql2(String idStr) {
        return "select * from `lets-platform-psi`.psi_customer_follow_up_cost " +
                "where cost_type in (" + idStr + ");";
    }
}
