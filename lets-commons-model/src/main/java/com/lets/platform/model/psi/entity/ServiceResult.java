/*
 * csy
 */

package com.lets.platform.model.psi.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ServiceResult {
    private String serviceName;
    private Set<String> materialIds;

    public ServiceResult() {
    }

    public ServiceResult(String serviceName, Set<String> materialIds) {
        this.serviceName = serviceName;
        this.materialIds = materialIds;
    }
}