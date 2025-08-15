package com.lets.platform.common.pojo.base;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class SimpleTree<T> {

    private final String value;
    private final String label;
    private final boolean disabled;
    private final List<SimpleTree<T>> children;
    private T data;

    public SimpleTree(@NotNull String value, String label, List<SimpleTree<T>> children, T data) {
        this.value = value;
        this.label = label;
        this.disabled = false;
        this.children = children;
        this.data = data;
    }

    public SimpleTree(@NotNull String value, String label, boolean disabled, List<SimpleTree<T>> children, T data) {
        this.value = value;
        this.label = label;
        this.disabled = disabled;
        this.children = children;
        this.data = data;
    }
}
