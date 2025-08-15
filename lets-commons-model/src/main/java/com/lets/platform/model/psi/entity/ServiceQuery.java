package com.lets.platform.model.psi.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.function.Supplier;

@Getter
@Setter
public class ServiceQuery {
    private String serviceName;
    private Supplier<Set<String>> querySupplier;

    public ServiceQuery() {
    }

    public ServiceQuery(String serviceName, Supplier<Set<String>> querySupplier) {
        this.serviceName = serviceName;
        this.querySupplier = querySupplier;
    }
}