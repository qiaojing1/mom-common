package com.lets.platform.common.pojo.util;

import com.alibaba.fastjson.JSONObject;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import org.apache.commons.lang3.StringUtils;

/**
 * 胜捷-校验NG
 * @author: DING WEI
 * @date: 2025/5/19 9:11
 */
public class SjCheckNgValues {

    public static boolean checkValues(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        if (input.startsWith("{") && input.endsWith("}")) {
            JSONObject object = JSONObject.parseObject(input);
            for (Object value : object.values()) {
                if (value instanceof String) {
                    String strValue = (String) value;
                    if (strValue.isEmpty() || "NG".equalsIgnoreCase(strValue)) {
                        return false;
                    }
                }
            }
        } else if (input.startsWith("Data:") && input.endsWith(";")) {
            input = input.substring(5, input.length() - 1);
            return checkValues(input);
        } else {
            String[] pairs = input.split(GlobalConstant.SEMICOLON_HALF_ANGLE);
            for (String pair : pairs) {
                if (pair.trim().isEmpty()) {
                    // 跳过空字符串
                    continue;
                }
                String[] keyValue = pair.split(GlobalConstant.COLON_HALF_ANGLE);
                if (keyValue.length != 2) {
                    // 如果分割后不是key:value格式，视为无效
                    return false;
                }
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                // 检查value是否为空或NG
                if (value.isEmpty() || "NG".equalsIgnoreCase(value)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String getValue(String input, String itemKey) {
        if (input == null || input.trim().isEmpty()) {
            return null;
        }
        if (input.startsWith("{") && input.endsWith("}")) {
            JSONObject object = JSONObject.parseObject(input);
            return object.getString("code");
        } else if (input.startsWith("Data:") && input.endsWith(";")) {
            input = input.substring(5, input.length() - 1);
            return getValue(input, itemKey);
        } else {
            String[] pairs = input.split(GlobalConstant.SEMICOLON_HALF_ANGLE);
            for (String pair : pairs) {
                if (pair.trim().isEmpty()) {
                    continue;
                }
                String[] keyValue = pair.split(GlobalConstant.COLON_HALF_ANGLE);
                if (keyValue.length == 2) {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();
                    if (StringUtils.equals(key, itemKey)) {
                        return value;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "Data:{\"yjd\":\"229.12°\",\"zjd\":\"242.09mg\",\"ylz\":\"237.14°\",\"jlz\":\"213.652mg\",\"zlz\":\"259.12mg\",\"jjz\":\"26.46°\",\"jg\":\"OK\"};";
        boolean b = checkValues(str);
        System.out.println(b);
    }
}
