package com.lets.common.mybatis.configBuilder;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TableConfig<T> {
    private final List<FieldConfig<T>> fieldConfigs;
    @Getter
    private final String tableAlias;

    private TableConfig(Builder<T> builder) {
        this.fieldConfigs = builder.fieldConfigs;
        this.tableAlias = builder.tableAlias;
    }

    public List<FieldConfig<T>> getFieldConfig() {
        return this.fieldConfigs;
    }

    public static class Builder<T> {
        private final List<FieldConfig<T>> fieldConfigs;
        private String tableAlias;

        public Builder() {
            this.fieldConfigs = new ArrayList<>();
            this.tableAlias = "";
        }


        public Builder<T> tableAlias(String tableAlias) {
            this.tableAlias = tableAlias;
            return this;
        }


        public Builder<T> field(Consumer<FieldConfig.Builder<T>> consumer) {
            FieldConfig.Builder<T> builder = new FieldConfig.Builder<>();
            consumer.accept(builder);
            this.fieldConfigs.add(builder.build());
            return this;
        }

        public TableConfig<T> build() {
            return new TableConfig<>(this);
        }
    }

}
