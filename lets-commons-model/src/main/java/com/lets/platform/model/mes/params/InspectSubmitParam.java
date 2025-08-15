package com.lets.platform.model.mes.params;

import lombok.Data;

import java.util.Set;

@Data
public class InspectSubmitParam {
    private boolean workflow;
    private String orderId;
    private Set<String> otherIds;
}
