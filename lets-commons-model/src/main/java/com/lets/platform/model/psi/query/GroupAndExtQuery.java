package com.lets.platform.model.psi.query;

import lombok.Data;

import java.util.Map;

@Data
public class GroupAndExtQuery {

    private String groupId;

    private Map<String, String> extMap;

    private String tenancyId;

}
