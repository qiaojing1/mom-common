package com.lets.platform.model.common.vo;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.util.Objects;

@Data
public class SelectOptionVO {
    private String value;
    private String label;
    private Object extra;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SelectOptionVO option = (SelectOptionVO) o;
        return StrUtil.equals(value, option.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
