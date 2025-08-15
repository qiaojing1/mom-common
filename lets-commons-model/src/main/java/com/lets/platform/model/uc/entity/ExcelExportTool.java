package com.lets.platform.model.uc.entity;
import java.util.*;

/**
 * 导出工具类
 */
public class ExcelExportTool {
    public static List<List<String>> getHead(List<SysMenuFieldPermission> fields) {
        List<List<String>> heads = new ArrayList<>();
        for (SysMenuFieldPermission field : fields) {
            List<String> head = new ArrayList<>();
            head.add(field.getFieldName());
            heads.add(head);
        }
        return heads;
    }

    public static Map<Integer, Integer> getWidth(List<SysMenuFieldPermission> fields) {
        Map<Integer, Integer> widthMap = new HashMap<>();
        for (int i = 0; i < fields.size(); i++) {
            SysMenuFieldPermission field = fields.get(i);
            widthMap.put(i, field.getTableWidth() == null ? 6000 : field.getTableWidth() * 50);
        }
        return widthMap;
    }

}
