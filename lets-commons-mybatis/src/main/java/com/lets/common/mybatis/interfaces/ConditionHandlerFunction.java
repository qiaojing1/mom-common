package com.lets.common.mybatis.interfaces;

@FunctionalInterface
public interface ConditionHandlerFunction<T, U> {
    void apply(T t, U u);
}