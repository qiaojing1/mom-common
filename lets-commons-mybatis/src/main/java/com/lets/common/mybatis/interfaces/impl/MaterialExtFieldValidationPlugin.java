package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonUserDict;
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
 * @Description 物料扩展规格属性插件
 * @Date 2024/4/9 18:10
 **/
@Component
@Slf4j
public class MaterialExtFieldValidationPlugin implements ValidationPluginInterface {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 校验物料扩展属性引用用户数据字典
     *
     * @param entities
     */
    @Override
    public void validate(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            if (entities.get(0) instanceof CommonUserDict) {
                String idStr = getSingleQuotesIdStr(entities);
                String queryMaterialExtSql = getQueryMaterialExtSql(idStr);
                log.info("查询物料扩展属性的sql ===> {}", queryMaterialExtSql);
                List<PsiMaterial> usedMaterial = jdbcTemplate.query(queryMaterialExtSql, new BeanPropertyRowMapper<>(PsiMaterial.class));
                if (CollectionUtil.isNotEmpty(usedMaterial)) {
                    throw new LetsException(0,
                            I18nUtils.getKey("PsiMaterial.extField.used.notAllowedDelete", usedMaterial.get(0).getCode(), usedMaterial.get(0).getName()));
                }
            }
        }
    }

    private static String getQueryMaterialExtSql(String idStr) {
        return "select * from `lets-platform-psi`.psi_material " +
                "where ext_fl1 in (" + idStr + ") or " +
                "ext_fl2 in (" + idStr + ") or " +
                "ext_fl3 in (" + idStr + ") or " +
                "ext_fl4 in (" + idStr + ") or " +
                "ext_fl5 in (" + idStr + ") or " +
                "ext_fl6 in (" + idStr + ") or " +
                "ext_fl7 in (" + idStr + ") or " +
                "ext_fl8 in (" + idStr + ") or " +
                "ext_fl9 in (" + idStr + ") or " +
                "ext_fl10 in (" + idStr + ") or " +
                "ext_fl11 in (" + idStr + ") or " +
                "ext_fl12 in (" + idStr + ") or " +
                "ext_fl13 in (" + idStr + ") or " +
                "ext_fl14 in (" + idStr + ") or " +
                "ext_fl15 in (" + idStr + ") or " +
                "ext_fl16 in (" + idStr + ") or " +
                "ext_fl17 in (" + idStr + ") or " +
                "ext_fl18 in (" + idStr + ") or " +
                "ext_fl19 in (" + idStr + ") or " +
                "ext_fl20 in (" + idStr + ") or " +
                "ext_fl21 in (" + idStr + ") or " +
                "ext_fl22 in (" + idStr + ") or " +
                "ext_fl23 in (" + idStr + ") or " +
                "ext_fl24 in (" + idStr + ") or " +
                "ext_fl25 in (" + idStr + ") or " +
                "ext_fl26 in (" + idStr + ") or " +
                "ext_fl27 in (" + idStr + ") or " +
                "ext_fl28 in (" + idStr + ") or " +
                "ext_fl29 in (" + idStr + ") or " +
                "ext_fl30 in (" + idStr + ") or " +
                "ext_fl31 in (" + idStr + ") or " +
                "ext_fl32 in (" + idStr + ")";
    }
}
