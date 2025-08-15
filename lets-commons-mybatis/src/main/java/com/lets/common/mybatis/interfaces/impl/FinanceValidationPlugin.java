package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonUserDict;
import com.lets.platform.model.psi.entity.PsiBusinessOpportunity;
import com.lets.platform.model.psi.entity.PsiCustomerFollowUp;
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
 * @Description 商机可能性删除校验
 * @Date 2024/4/9 18:10
 **/
@Component
@Slf4j
public class FinanceValidationPlugin implements ValidationPluginInterface {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 校验线索商机引用用户数据字典
     *
     * @param entities
     */
    @Override
    public void validate(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            if (entities.get(0) instanceof CommonUserDict) {
                String idStr = getSingleQuotesIdStr(entities);
                List<CommonUserDict> parentCodes = jdbcTemplate.query(getParentCode(idStr), new BeanPropertyRowMapper<>(CommonUserDict.class));
                CommonUserDict userDict = (CommonUserDict) parentCodes.get(0);
                if (userDict.getParentCode().equals("SJKNX")) {
                    String querySql =getQuerySql(idStr);
                    log.info("查询线索商机管理的sql ===> {}", querySql);
                    List<PsiBusinessOpportunity> data = jdbcTemplate.query(querySql, new BeanPropertyRowMapper<>(PsiBusinessOpportunity.class));
                    if (CollectionUtil.isNotEmpty(data)) {
                        throw new LetsException(0,
                                "已被线索商机[" + data.get(0).getCode() + "]引用，无法删除");
                    }
                }
            }
        }
    }


    private static String getQuerySql(String idStr) {
        return "select * from `lets-platform-psi`.psi_business_opportunity " +
                "where possibility in (" + idStr + ");";

    }

}
