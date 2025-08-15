package com.lets.platform.model.uc.flow;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class DiagramHistory {
    private String bpmnXML;
    private Set<String> highLightedActivityIdList;
    private Set<String> runningActivityIdList;

    public DiagramHistory() {
    }

    public DiagramHistory(String bpmnXML, Set<String> highLightedActivityIdList, Set<String> runningActivityIdList) {
        this.bpmnXML = bpmnXML;
        this.highLightedActivityIdList = highLightedActivityIdList;
        this.runningActivityIdList = runningActivityIdList;
    }
}
