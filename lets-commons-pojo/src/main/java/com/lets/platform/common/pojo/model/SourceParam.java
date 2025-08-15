package com.lets.platform.common.pojo.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SourceParam {
    String sourceMenuCode;
    String targetOrderCategoryId;
    List<String> primaryKeys;
    Map<String, Object> extraParams;
}
