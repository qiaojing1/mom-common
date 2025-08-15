package com.lets.platform.model.mes.vo;

import com.lets.platform.common.pojo.base.SimpleDict;
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
public class MesInspectionTaskTable {
    private List<MesInspectionTaskTableColumn> columns;
    private List<MesInspectionTaskTablePage> pages;
    private Map<String, List<SimpleDict<?>>> optionMap;
}
