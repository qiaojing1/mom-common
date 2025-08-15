package com.lets.platform.model.mes.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ColumnVO {

    private String field;
    private String title;
    private Integer width;
    private String className;
    private String headerClassName;
    private String footerClassName;
    private boolean visible;
    private Map<String, String> slots;
    private Map<String, Object> params;
    private List<ColumnVO> children;
}
