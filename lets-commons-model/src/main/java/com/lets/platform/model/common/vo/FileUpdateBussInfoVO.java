package com.lets.platform.model.common.vo;

import lombok.Data;

import java.util.List;

@Data
public class FileUpdateBussInfoVO {
    private String bussType;
    private String bussId;
    private List<String> ids;
}
