package com.lets.platform.common.pojo.model;

import lombok.Getter;

@Getter
public class CategoryItem {
    private String id;
    private String code;
    private String businessCode;
    private String name;
    private Integer sort;
    private boolean isDefault;

    public CategoryItem() {
    }

    public CategoryItem(String id, String code, String businessCode, String name, boolean isDefault) {
        this.id = id;
        this.code = code;
        this.businessCode = businessCode;
        this.name = name;
        this.isDefault = isDefault;
    }
    public CategoryItem(String id, String code, String businessCode, String name, boolean isDefault, Integer sort) {
        this.id = id;
        this.code = code;
        this.businessCode = businessCode;
        this.name = name;
        this.isDefault = isDefault;
        this.sort = sort;
    }
}
