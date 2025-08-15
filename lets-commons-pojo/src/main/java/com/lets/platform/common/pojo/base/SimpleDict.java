package com.lets.platform.common.pojo.base;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SimpleDict<T> {

    private String value;
    private String label;
    private T data;

    public SimpleDict() {
    }

    public SimpleDict(@NotNull String value, @NotNull String label, T data) {
        this.value = value;
        this.label = label;
        this.data = data;
    }
}
