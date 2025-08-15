package com.lets.common.mybatis.aspect;

import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.ValidationManager;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.enums.OrderCategoryCodeEnum;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonUserDict;
import com.lets.platform.model.psi.entity.PsiMaterial;
import com.lets.platform.model.psi.entity.PsiOrderCategory;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author zhangweiyan
 * @ClassName DeleteValidateAspect
 * @Description 删除操作校验
 * @Date 2024/4/9 11:12
 **/
@Slf4j
@Aspect
@Component
public class DeleteValidateAspect {

    private final ValidationManager validationPluginManager;

    @Autowired
    public DeleteValidateAspect(ValidationManager validationPluginManager) {
        this.validationPluginManager = validationPluginManager;
    }

    @Pointcut("execution(* com.lets.common.mybatis.templates.MybatisPlusBaseServiceImpl.defaultDeleteById(..))")
    public void defaultDeleteById() {

    }

    @Pointcut("execution(* com.lets.common.mybatis.templates.MybatisPlusBaseServiceImpl.defaultDeleteBatchById(..))")
    public void defaultDeleteBatchById() {
    }

    @Before("defaultDeleteById()")
    public void beforeDefaultDeleteById(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("defaultDeleteById方法切入点, 入参为{}", args);
        if (args.length > 0 && args[0] instanceof BaseEntity) {
            BaseEntity entity = (BaseEntity) args[0];
            check(Collections.singletonList(entity));
        }
    }

    @Before("defaultDeleteBatchById()")
    public void beforeDefaultDeleteBatchById(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("beforeDefaultDeleteBatchById方法切入点, 入参为{}", args);
        if (args.length > 0 && args[0] instanceof List) {
            List<BaseEntity> entities = (List<BaseEntity>) args[0];
            check(entities);
        }
    }

    private void check(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            validationPluginManager.executeAll(entities);
        }
    }

    /**
     * 获取mysql可以直接执行的id拼成的string '1','2','3'...
     *
     * @param entity
     * @return
     */
    public static String getSingleQuotesIdStr(List<BaseEntity> entity) {
        return entity.stream()
                .map(BaseEntity::getId)
                .map(id -> "'" + id + "'")
                .collect(Collectors.joining(","));
    }
}
