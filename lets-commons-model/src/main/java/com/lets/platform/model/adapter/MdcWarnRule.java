package com.lets.platform.model.adapter;

import lombok.Data;

import java.io.Serializable;

@Data
public class MdcWarnRule implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ruleId;
    private String modelId;
    private String rangeType;
    private String warnCode;
    private String relationId;

    private String remark;

    private Long createTime;

    private String tenancyId;

}