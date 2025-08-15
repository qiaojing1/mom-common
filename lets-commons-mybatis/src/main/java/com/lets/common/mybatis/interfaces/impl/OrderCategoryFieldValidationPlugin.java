package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.enums.OrderCategoryCodeEnum;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.entity.PsiMaterial;
import com.lets.platform.model.psi.entity.PsiOrderCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

import static com.lets.common.mybatis.aspect.DeleteValidateAspect.getSingleQuotesIdStr;

/**
 * @author zhangweiyan
 * @ClassName OrderCategoryFieldValidationPlugin
 * @Description 单据类别引用校验插件
 * @Date 2024/4/9 18:10
 **/
@Component
@Slf4j
public class OrderCategoryFieldValidationPlugin implements ValidationPluginInterface {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 校验单据类别字段引用到客户、部门、人员、供应商等数据
     *
     * @param entities
     */
    @Override
    @SuppressWarnings("All")
    public void validate(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            List<PsiOrderCategory> usedList = jdbcTemplate.query("select t3.name, t1.*" +
                    "from `lets-platform-psi`.psi_order_category_detail_field t1 " +
                    "left join `lets-platform-psi`.psi_order_category_field t2 on t1.field_id = t2.id " +
                    "left join `lets-platform-psi`.psi_order_category t3 on t1.order_id = t3.id where t1.default_value in ("
                    + getSingleQuotesIdStr(entities) + ") and t3.name is not null", new BeanPropertyRowMapper<>(PsiOrderCategory.class));
            if (CollectionUtil.isNotEmpty(usedList)) {
                throw new LetsException(0,
                        I18nUtils.getKey("PsiOrderCategory.used.notAllowedDelete", usedList.get(0).getName()));
            }
        }
    }
}
