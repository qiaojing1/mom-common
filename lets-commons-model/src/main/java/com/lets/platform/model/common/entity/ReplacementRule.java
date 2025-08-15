package com.lets.platform.model.common.entity;

import lombok.Data;

import java.util.Map;

// 规则配置类
@Data
public class ReplacementRule {
    private Class<?> entityClass; // 新增字段，指定当前列表的实体类型
    private String idField;
    private Map<String, Class<?>> relationMappings;

    public ReplacementRule(Class<?> entityClass, String idField, Map<String, Class<?>> relationMappings) {
        this.entityClass = entityClass;
        this.idField = idField;
        this.relationMappings = relationMappings;
    }
}