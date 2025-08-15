package com.lets.platform.model.collection.dto;

import lombok.Data;

import java.util.Collection;

@Data
public class RepairDurationDto {

    private String tenancyId;

    private Integer dayFormat;

    private Collection<String> deviceIds;

    private Collection<String> typeIds;
}
