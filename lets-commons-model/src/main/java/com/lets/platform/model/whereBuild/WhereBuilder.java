package com.lets.platform.model.whereBuild;

import com.baomidou.mybatisplus.core.conditions.interfaces.Compare;
import com.baomidou.mybatisplus.core.conditions.interfaces.Func;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lets.platform.common.pojo.enums.ConditionExpressionEnum;
import com.lets.platform.model.base.BaseEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * 构造where条件
 *
 * @author: DING WEI
 * @date: 2023/4/19 11:12
 */
@Slf4j
public class WhereBuilder {

    private static final Map<ConditionExpressionEnum, Con3<QueryWrapper<? extends BaseEntity>, String, Object>> whereMap = new HashMap<ConditionExpressionEnum, Con3<QueryWrapper<? extends BaseEntity>, String, Object>>() {{
        put(ConditionExpressionEnum.EQUALS, Compare::eq);
        put(ConditionExpressionEnum.NOT_EQUALS, Compare::ne);
        put(ConditionExpressionEnum.LT, Compare::lt);
        put(ConditionExpressionEnum.LE, Compare::le);
        put(ConditionExpressionEnum.GT, Compare::gt);
        put(ConditionExpressionEnum.GE, Compare::ge);
        put(ConditionExpressionEnum.LIKE, Compare::like);
        put(ConditionExpressionEnum.NOT_LIKE, Compare::notLike);
        put(ConditionExpressionEnum.LEFT_LIKE, Compare::likeLeft);
        put(ConditionExpressionEnum.RIGHT_LIKE, Compare::likeRight);
        put(ConditionExpressionEnum.IN, Func::in);
        put(ConditionExpressionEnum.NOT_IN, Func::notIn);
        put(ConditionExpressionEnum.IN_SQL, (queryWrapper, column, value) -> queryWrapper.inSql(column, value.toString()));
        put(ConditionExpressionEnum.NOT_IN_SQL, (queryWrapper, column, value) -> queryWrapper.notInSql(column, value.toString()));
    }};

    private WhereBuilder() {
    }

    public static <T extends BaseEntity> QueryWrapper<T> build(T t) {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        if (Objects.isNull(t)) {
            return queryWrapper;
        }
        Class<?> tc = t.getClass();
        Stream.of(tc.getDeclaredFields())
                .peek(field -> field.setAccessible(true))
                .filter(field -> {
                    try {
                        Object o = field.get(t);
                        boolean notNull = Objects.nonNull(o);
                        if (o instanceof String) {
                            notNull = StringUtils.isNotBlank(o.toString());
                        }
                        return notNull && Objects.nonNull(field.getAnnotation(Where.class));
                    } catch (IllegalAccessException e) {
                        log.error("获取字段时异常:", e);
                        return false;
                    }
                })
                .forEach(field -> {
                    try {
                        Where where = field.getAnnotation(Where.class);
                        ConditionExpressionEnum condition = where.value();
                        String column = where.column();
                        Object value = field.get(t);
                        whereMap.get(condition).invoke(queryWrapper, column, value);
                    } catch (Exception e) {
                        log.error("执行条件拼接时异常:", e);
                    }
                });
        return queryWrapper;
    }
}
