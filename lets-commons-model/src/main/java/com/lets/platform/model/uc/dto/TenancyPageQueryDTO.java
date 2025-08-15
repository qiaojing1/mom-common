package com.lets.platform.model.uc.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TenancyPageQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private long current;
    private long size;
    private String code;
    private String name;
}
