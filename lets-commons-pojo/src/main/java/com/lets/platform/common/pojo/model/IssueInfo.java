package com.lets.platform.common.pojo.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class IssueInfo {
    String sourceMenuCode;
    String targetMenuCode;
    Object data;

    public IssueInfo() {
    }

    public IssueInfo(String sourceMenuCode, String targetMenuCode, Object data) {
        this.sourceMenuCode = sourceMenuCode;
        this.targetMenuCode = targetMenuCode;
        this.data = data;
    }
}
