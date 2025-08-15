package com.lets.platform.model.mes.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author FZY
 * @since 2025-06-18
 */
@Getter
@Setter
public class MesInspectionTaskTableCell {
    private String id;
    private Integer rowIndex;
    private String key;
    private String value;
    private String display;
    private MesInspectionTaskTableStandard standard;
}
