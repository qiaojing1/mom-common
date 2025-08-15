package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.tpm.entity.TpmDepreciationScheme;
import com.lets.platform.model.tpm.entity.TpmInspectionItems;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

import static com.lets.common.mybatis.aspect.DeleteValidateAspect.getSingleQuotesIdStr;

/**
 * @author zhangweiyan
 * @ClassName TpmDepreciationSchemeValidationPlugin
 * @Description 折旧方案引用校验
 * @Date 2025/01/22 18:10
 **/
@Component
@Slf4j
public class TpmDepreciationSchemeValidationPlugin implements ValidationPluginInterface {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 折旧方案引用校验
     *
     * @param entities
     */
    @Override
    public void validate(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            if (entities.get(0) instanceof TpmDepreciationScheme) {
                String idStr = getSingleQuotesIdStr(entities);
                String querySql = getQuerySql(idStr);
                Integer data = jdbcTemplate.queryForObject(querySql, Integer.class);
                if (Objects.nonNull(data) && data > 0) {
                    throw new LetsException(0,
                            "已被设备引用，无法删除");
                }
            }
        }
    }


    private static String getQuerySql(String idStr) {
        return "select count(1) from `lets-platform-common`.common_device_assets " +
                "where depreciation_scheme_id in (" + idStr + ");";

    }

}
