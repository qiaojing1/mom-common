package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 排序方式 枚举
 *
 * @ClassName SortByEnum
 * @author: DING WEI
 * @create: 2021/04/27 19:44
 * @Version 1.0
 **/
public enum SortByEnum implements IEnum<Object> {

    ASC_UPPER_CASE("ASC", " ASC"),
    ASC_LOWER_CASE("asc", " ASC"),
    DESC_UPPER_CASE("DESC", " DESC"),
    DESC_LOWER_CASE("desc", " DESC");

    private final String value;
    @Getter
    private final String sort;

    SortByEnum(String value, String sort) {
        this.value = value;
        this.sort = sort;
    }

    public static String getSort(String value) {
        if (StringUtils.isEmpty(value)) {
            return DESC_UPPER_CASE.getSort();
        }
        for (SortByEnum element : SortByEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getSort();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

}
