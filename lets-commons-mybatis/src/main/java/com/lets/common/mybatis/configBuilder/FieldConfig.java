package com.lets.common.mybatis.configBuilder;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lets.common.mybatis.interfaces.ConditionHandlerFunction;
import com.lets.platform.common.pojo.base.QueryField;

public class FieldConfig<T> {
    //如果通过TableConfig生成的Field,该属性会被TableConfig中的值覆盖
    private final Integer tabIndex;
    //如果通过TableConfig生成的Field,该属性会被TableConfig中的值覆盖
    private final String tableAlias;
    private final String conditionKey;
    private final ConditionHandlerFunction<QueryField, QueryWrapper<T>> handler;

    public FieldConfig(Builder<T> builder) {
        this.tabIndex = builder.tabIndex;
        this.tableAlias = builder.tableAlias;
        this.conditionKey = builder.conditionKey;
        this.handler = builder.handler;
    }

    public Integer getTabIndex() {
        return tabIndex;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public String getConditionKey() {
        return this.conditionKey;
    }


    public ConditionHandlerFunction<QueryField, QueryWrapper<T>> getHandler() {
        return this.handler;
    }

    public static class Builder<T> {
        private Integer tabIndex;
        private String tableAlias;
        private String conditionKey;
        private ConditionHandlerFunction<QueryField, QueryWrapper<T>> handler;

        public Builder() {
            this.tabIndex = 0;
            this.tableAlias = "";
            this.conditionKey = null;
            this.handler = null;
        }

        public Builder<T> tabIndex(Integer tabIndex) {
            this.tabIndex = tabIndex;
            return this;
        }

        public Builder<T> tableAlias(String tableAlias) {
            this.tableAlias = tableAlias;
            return this;
        }

        public Builder<T> conditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }

        public Builder<T> handler(ConditionHandlerFunction<QueryField, QueryWrapper<T>> handler) {
            this.handler = handler;
            return this;
        }

        public FieldConfig<T> build() {
            return new FieldConfig<>(this);
        }
    }
}
