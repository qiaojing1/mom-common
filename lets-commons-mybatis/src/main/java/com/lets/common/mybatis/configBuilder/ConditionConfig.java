package com.lets.common.mybatis.configBuilder;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Getter
public class ConditionConfig<T> {
    private final List<TabConfig<T>> tabConfigs;
    private final List<FieldConfig<T>> fieldConfigs;

    private ConditionConfig(Builder<T> builder) {
        this.tabConfigs = builder.tabConfigs;
        this.fieldConfigs = builder.fieldConfigs;
    }


    public static class Builder<T> {
        private final List<TabConfig<T>> tabConfigs;
        private final List<FieldConfig<T>> fieldConfigs;

        public Builder() {
            // 设置默认值
            this.tabConfigs = new ArrayList<>();
            this.fieldConfigs = new ArrayList<>();
        }

        public Builder<T> tab(Consumer<TabConfig.Builder<T>> consumer) {
            TabConfig.Builder<T> builder = new TabConfig.Builder<>();
            consumer.accept(builder);
            this.tabConfigs.add(builder.build());
            return this;
        }

        public Builder<T> field(Consumer<FieldConfig.Builder<T>> consumer) {
            FieldConfig.Builder<T> builder = new FieldConfig.Builder<>();
            consumer.accept(builder);
            this.fieldConfigs.add(builder.build());
            return this;
        }

        public ConditionConfig<T> build() {
            return new ConditionConfig<>(this);
        }
    }

}
