package com.lets.platform.model.mes.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * @author FZY
 * @since 2025-06-18
 */
@Getter
@Setter
public class MesInspectionTaskTablePage {
    private int sampleNumber;
    private int subNumber;
    private String key;
    private String display;
    private String resultId;
    private String result;
    private List<Map<String, MesInspectionTaskTableCell>> rows;
}
