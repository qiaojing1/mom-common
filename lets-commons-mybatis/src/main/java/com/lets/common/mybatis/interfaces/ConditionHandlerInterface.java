package com.lets.common.mybatis.interfaces;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lets.platform.common.pojo.base.QueryField;

public interface ConditionHandlerInterface {
    <T> void apply(QueryField field, QueryWrapper<T> queryWrapper);
}
