package com.lets.platform.model.collection.util;

import com.lets.platform.model.collection.entity.CollRegionalEnergySetting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 区域公式
 * @author: DING WEI
 * @date: 2025/2/21 17:26
 */
public class CollRegionalFormulaUtils {

    public static Set<String> getDeviceIdsFromContent(CollRegionalEnergySetting setting, Map<String, CollRegionalEnergySetting> variableMap) {
        Set<String> deviceIdList = new HashSet<>();
        String content = setting.getContent();
        Set<String> processedVariables = new HashSet<>();

        // 使用正则表达式匹配deviceId和variableId
        Pattern pattern = Pattern.compile("(deviceId_\\w+)|(variableId_\\w+)");
        Matcher matcher = pattern.matcher(content);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String match = matcher.group();
            if (match.startsWith("deviceId_")) {
                // 如果是deviceId，直接添加到deviceIdList
                deviceIdList.add(match.replace("deviceId_", ""));
            } else if (match.startsWith("variableId_")) {
                // 如果是variableId，递归替换为对应的deviceId表达式
                String varKey = match.replace("variableId_", "");
                if (!processedVariables.contains(varKey)) {
                    processedVariables.add(varKey);
                    CollRegionalEnergySetting varSetting = variableMap.get(varKey);
                    if (varSetting != null) {
                        String replacement = "(" + getResolvedContent(varSetting, variableMap, deviceIdList, processedVariables) + ")";
                        matcher.appendReplacement(sb, Matcher.quoteReplacement(replacement));
                    } else {
                        // 不存在则保留原变量
                        matcher.appendReplacement(sb, Matcher.quoteReplacement(match));
                    }
                } else {
                    // 避免循环引用
                    matcher.appendReplacement(sb, Matcher.quoteReplacement(match));
                }
            }
        }
        matcher.appendTail(sb);
        setting.setContent(sb.toString());
        setting.setAllDeviceIdList(deviceIdList);
        return deviceIdList;
    }

    public static String getResolvedContent(CollRegionalEnergySetting setting, Map<String, CollRegionalEnergySetting> variableMap,
                                            Set<String> deviceIdList, Set<String> processedVariables) {
        String content = setting.getContent();
        Pattern pattern = Pattern.compile("(deviceId_\\w+)|(variableId_\\w+)");
        Matcher matcher = pattern.matcher(content);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String match = matcher.group();
            if (match.startsWith("deviceId_")) {
                // 如果是deviceId，直接添加到deviceIdList
                deviceIdList.add(match.replace("deviceId_", ""));
            } else if (match.startsWith("variableId_")) {
                // 如果是variableId，递归替换为对应的deviceId表达式
                String varKey = match.replace("variableId_", "");
                if (!processedVariables.contains(varKey)) {
                    processedVariables.add(varKey);
                    CollRegionalEnergySetting varSetting = variableMap.get(varKey);
                    if (varSetting != null) {
                        String replacement = "(" + getResolvedContent(varSetting, variableMap, deviceIdList, processedVariables) + ")";
                        matcher.appendReplacement(sb, Matcher.quoteReplacement(replacement));
                    } else {
                        // 不存在则保留原变量
                        matcher.appendReplacement(sb, Matcher.quoteReplacement(match));
                    }
                } else {
                    // 避免循环引用
                    matcher.appendReplacement(sb, Matcher.quoteReplacement(match));
                }
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        CollRegionalEnergySetting setting1 = new CollRegionalEnergySetting();
        setting1.setContent("variableId_4-deviceId_1+deviceId_2+variableId_3");
        setting1.setVariableList("variableId_3,variableId_4");

        CollRegionalEnergySetting setting2 = new CollRegionalEnergySetting();
        setting2.setContent("deviceId_3-deviceId_4");
        setting2.setVariableList("");

        CollRegionalEnergySetting setting3 = new CollRegionalEnergySetting();
        setting3.setContent("deviceId_5+deviceId_8");
        setting3.setVariableList("");

        Map<String, CollRegionalEnergySetting> variableMap = new HashMap<>();
        variableMap.put("3", setting2);
        variableMap.put("4", setting3);

        Set<String> deviceIds = getDeviceIdsFromContent(setting1, variableMap);
        System.out.println(setting1.getContent());
        System.out.println(deviceIds);
    }
}
