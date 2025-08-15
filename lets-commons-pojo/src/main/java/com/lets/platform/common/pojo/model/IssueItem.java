package com.lets.platform.common.pojo.model;

import cn.hutool.core.collection.CollUtil;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class IssueItem {
    String code;
    String businessCode;
    String name;
    Integer sort;
    boolean isDefault;
    List<CategoryItem> categoryItemList;

    public IssueItem() {}

    private IssueItem(Builder builder) {
        this.code = builder.code;
        this.businessCode = builder.businessCode;
        this.name = builder.name;
        this.sort = builder.sort;
        this.categoryItemList = builder.categoryItemList;
        this.isDefault = categoryItemList.stream().anyMatch(CategoryItem::isDefault);
    }

    public boolean isEmpty() {
        return CollUtil.isEmpty(categoryItemList);
    }

    public boolean isNotEmpty() {
        return CollUtil.isNotEmpty(categoryItemList);
    }

    public static class Builder {
        private String code;
        private String businessCode;
        private String name;
        private Integer sort;
        private List<CategoryItem> categoryItemList = new ArrayList<>();

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder businessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder sort(Integer sort) {
            this.sort = sort;
            return this;
        }

        public Builder addCategoryItemList(String id, String code, String businessCode, String name, boolean isDefault) {
            this.categoryItemList.add(new CategoryItem(id, code, businessCode, name, isDefault));
            return this;
        }

        public Builder addCategoryItemList(String id, String code, String businessCode, String name, boolean isDefault, Integer sort) {
            this.categoryItemList.add(new CategoryItem(id, code, businessCode, name, isDefault, sort));
            return this;
        }

        public Builder categoryItemList(List<CategoryItem> categoryItemList) {
            this.categoryItemList = categoryItemList;
            return this;
        }

        public IssueItem build() {
            return new IssueItem(this);
        }
    }
}
