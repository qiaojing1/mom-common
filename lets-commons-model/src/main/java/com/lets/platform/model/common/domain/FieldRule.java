package com.lets.platform.model.common.domain;

import lombok.Data;

import java.util.List;
@Data
public class FieldRule {
    private String fieldName;
    private List<String> patterns;
    
}