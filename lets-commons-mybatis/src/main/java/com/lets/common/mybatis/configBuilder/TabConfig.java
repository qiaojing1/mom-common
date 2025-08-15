package com.lets.common.mybatis.configBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TabConfig<T> {
    private final List<TableConfig<T>> tableConfigs;

    private final Integer tabIndex;

    public TabConfig(Builder<T> builder) {
        this.tabIndex = builder.tabIndex;
        this.tableConfigs = builder.tableConfigs;

    }

    public Integer getTabIndex() {
        return this.tabIndex;
    }

    public void addTableConfig(TableConfig<T> tableConfig) {
        this.tableConfigs.add(tableConfig);
    }

    public List<TableConfig<T>> getTableConfigs() {
        return this.tableConfigs;
    }

    public static class Builder<T> {
        private final List<TableConfig<T>> tableConfigs;

        private Integer tabIndex;

        public Builder() {
            // 设置默认值
            this.tableConfigs = new ArrayList<>();
            this.tabIndex = 0;
        }

        public Builder<T> tableIndex(Integer tableIndex) {
            this.tabIndex = tableIndex;
            return this;
        }

        public Builder<T> table(Consumer<TableConfig.Builder<T>> consumer) {
            TableConfig.Builder<T> builder = new TableConfig.Builder<>();
            consumer.accept(builder);
            this.tableConfigs.add(builder.build());
            return this;
        }

        public TabConfig<T> build() {
            return new TabConfig<>(this);
        }
    }

}
