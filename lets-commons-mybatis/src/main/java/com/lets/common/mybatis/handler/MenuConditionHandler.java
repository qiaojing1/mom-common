package com.lets.common.mybatis.handler;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lets.common.mybatis.interfaces.ConditionHandlerInterface;
import com.lets.platform.common.pojo.base.QueryField;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import static com.lets.common.mybatis.utils.MyBatisPlusUtil.humpToUnderline;

@Component("testHandler")
public class MenuConditionHandler implements ConditionHandlerInterface {

    @Override
    public <T> void apply(QueryField field, QueryWrapper<T> queryWrapper) {
        String conditionKey = field.getRelationField();
        String tableAlias = field.getTableAlias();
        if (StringUtils.isNotBlank(tableAlias)) {
            conditionKey = tableAlias + GlobalConstant.POINT + humpToUnderline(conditionKey);
        } else {
            conditionKey = humpToUnderline(conditionKey);
        }
        queryWrapper.eq(conditionKey, field.getValue());
    }
}
