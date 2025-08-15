package com.lets.platform.model.adapter;

import lombok.Data;

import java.io.Serializable;

@Data
public class MdcDeviceWarnCode implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String typeId;

    private String modelId;

    private String warningNumber;

    private String warningCount;

    private String remark;

    private Long createTime;
    private Long updateTime;

    private String key;
    
    private Long count;

    private String tenancyId;

}