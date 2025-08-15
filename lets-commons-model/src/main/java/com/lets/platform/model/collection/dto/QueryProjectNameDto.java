package com.lets.platform.model.collection.dto;

import lombok.Data;

import java.util.List;

@Data
public class QueryProjectNameDto {
    private Integer number;
    private String testStandardName;
    private String materialCode;
    private String materialSpecs;
    private String valveMaterialName;
    private List<QueryProjectNameDetails> details;
}
