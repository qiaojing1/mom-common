package com.lets.platform.common.pojo.base;

import cn.hutool.core.util.StrUtil;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Objects;
import java.util.Optional;

/**
 * 查询条件实体
 *
 * @author fzy
 * @since 2023-04-04
 */
@Data
@ApiModel("查询字段实体")
public class QueryField {
    private Integer tabIndex;
    private String tableAlias;
    private String conditionKey;
    private String expression;
    private Object value;
    private String conditionHandler;
    private String relationField;

    public QueryField() {
    }

    public QueryField(String conditionKey) {
        this(conditionKey, 0);
    }

    public QueryField(String conditionKey, Integer tabIndex) {
        this(conditionKey, 0, "");
    }

    public QueryField(String conditionKey, Integer tabIndex, String tableAlias) {
        this.tabIndex = tabIndex;
        this.tableAlias = tableAlias;
        this.conditionKey = conditionKey;
    }

    public QueryField(ConditionEntity condition, Integer tableIndex) {
        this.tabIndex = Optional.ofNullable(tableIndex).orElse(0);
        this.tableAlias = StrUtil.isEmpty(condition.getConditionTableAlias()) ? "" : condition.getConditionTableAlias();
        this.conditionKey = condition.getConditionKey();
        this.expression = condition.getConditionExpression();
        this.value = condition.getConditionValue();
        this.conditionHandler = condition.getConditionHandler();
        this.relationField = condition.getRelationField();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueryField field = (QueryField) o;
        return Objects.equals(tabIndex, field.tabIndex) &&
                StrUtil.equals(tableAlias, field.tableAlias) &&
                StrUtil.equals(conditionKey, field.conditionKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tabIndex, tableAlias, conditionKey);
    }
}
