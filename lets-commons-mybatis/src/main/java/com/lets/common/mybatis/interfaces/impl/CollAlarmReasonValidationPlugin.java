package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.entity.CollAlarmClassifyWarnCode;
import com.lets.platform.model.collection.entity.CollAlarmReason;
import com.lets.platform.model.psi.entity.PsiBusinessOpportunity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.lets.common.mybatis.aspect.DeleteValidateAspect.getSingleQuotesIdStr;

/**
 * @author zhangweiyan
 * @ClassName CollAlarmReasonValidationPlugin
 * @Description 报警原因删除校验
 * @Date 2024/12/3 18:10
 **/
@Component
@Slf4j
public class CollAlarmReasonValidationPlugin implements ValidationPluginInterface {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 校验报警分类配置引用报警原因
     *
     * @param entities
     */
    @Override
    public void validate(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            if (entities.get(0) instanceof CollAlarmReason) {
                String idStr = getSingleQuotesIdStr(entities);
                String querySql = getQuerySql(idStr);
                log.info("查询报警分类配置管理的sql ===> {}", querySql);
                List<CollAlarmClassifyWarnCode> data = jdbcTemplate.query(querySql, new BeanPropertyRowMapper<>(CollAlarmClassifyWarnCode.class));
                if (CollectionUtil.isNotEmpty(data)) {
                    throw new LetsException(0,
                            "已被报警分类[" + data.get(0).getParentCode() + "]引用，无法删除");
                }
            }
        }
    }


    private static String getQuerySql(String idStr) {
        return "select t1.*, t2.code parentCode from `lets-platform-collection`.coll_alarm_classify_warn_code t1 " +
                "left join `lets-platform-collection`.coll_alarm_classify t2 on t1.parent_id = t2.id " +
                "where warn_code_id in (" + idStr + ");";

    }

}
