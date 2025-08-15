package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.entity.CollectionHeatBatchNo;
import com.lets.platform.model.common.entity.CommonUserDict;
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
 * @Description 客户跟进分类删除校验
 * @Date 2024/4/9 18:10
 **/
@Component
@Slf4j
public class HeatBatchNoValidationPlugin implements ValidationPluginInterface {
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
                if (userDict.getParentCode().equals("FMBJ")) {
                    String querySql =  getQuerySql(idStr);
                    log.info("查询炉批号档案的sql ===> {}", querySql);
                    List<CollectionHeatBatchNo> data = jdbcTemplate.query(querySql, new BeanPropertyRowMapper<>(CollectionHeatBatchNo.class));
                    if (CollectionUtil.isNotEmpty(data)) {
                        throw new LetsException(0,
                                "已被炉批号档案[" + data.get(0).getCode() + "]引用，无法删除");
                    }
                }
            }
        }
    }


    private static String getQuerySql(String idStr) {
        return "select * from `lets-platform-collection`.collection_heat_batch_no " +
                "where part_id in (" + idStr + ");";

    }
}
