package com.lets.platform.model.mes.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.*;

@Data
public class ProjectProductionProgressVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<ColumnVO> columns;
    private List<Map<String, Object>> dataList;
    private Map<String, Map<String, Object>> footerDataMap;
    private Map<Integer, Long> countMap;

    public ProjectProductionProgressVO() {
        this.columns = new ArrayList<>();
        this.dataList = new ArrayList<>();
        this.countMap = new HashMap<>();
        this.footerDataMap = new LinkedHashMap<>();
        footerDataMap.put("车间额定负荷", new HashMap<String, Object>() {{
            put("orderCode", "车间额定负荷");
            put("totalHours", 0);
        }});
        footerDataMap.put("工时平衡率", new HashMap<String, Object>() {{
            put("orderCode", "工时平衡率");
        }});
        footerDataMap.put("合计大项目工时", new HashMap<String, Object>() {{
            put("orderCode", "合计大项目工时");
            put("totalHours", 0);
        }});
        footerDataMap.put("车间装配工时", new HashMap<String, Object>() {{
            put("orderCode", "车间装配工时");
            put("totalHours", 0);
        }});
        footerDataMap.put("现场安调工时", new HashMap<String, Object>() {{
            put("orderCode", "现场安调工时");
            put("totalHours", 0);
        }});
        footerDataMap.put("非项目工时", new HashMap<String, Object>() {{
            put("orderCode", "非项目工时");
            put("totalHours", 0);
        }});
        footerDataMap.put("服务工时、质保工时", new HashMap<String, Object>() {{
            put("orderCode", "服务工时、质保工时");
            put("totalHours", 0);
        }});
    }
}
