package com.lets.platform.model.uc.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MenuPageQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private long current;
    private long size;
    private String parentCode;
    private String type;
    private String name;
    private String pageName;
    private String status;
    private String moduleName;
}
