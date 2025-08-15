package com.lets.platform.common.pojo.util;

import java.util.List;

/**
 * 数据库相关工具类
 * @author: DING WEI
 * @date: 2025/4/14 13:34
 */
public class DbConvertUtils {

    public static String convertList2SubSelect(List<String> values, String alias) {
        StringBuilder subSelect = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            subSelect.append(" SELECT '").append(values.get(i)).append("'");
            if (i == 0) {
                subSelect.append(" AS ").append(alias);
            }
            if (i < values.size() - 1) {
                subSelect.append(" UNION ALL ");
            }
        }
        return subSelect.toString();
    }

}
