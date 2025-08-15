package com.lets.platform.util;

import cn.hutool.core.collection.CollUtil;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.uc.entity.SysEqualsSymbolConfig;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhangweiyan
 * @ClassName StrUtils
 * @Description 字符工具类
 * @Date 2025/2/28 14:36
 **/
public class StrUtils {


    /**
     * 仪表台账和区域能源配置中替换计算公式中显示的名称
     * @param content
     * @param map
     * @return
     */
    public static String replaceContent(String content, Map<String, ? extends BaseEntity> map) {
        // 构建正则表达式模式，用于匹配 variableId_ 或 deviceId_ 后面跟着 map 中的键
        StringBuilder regexBuilder = new StringBuilder();
        regexBuilder.append("(variableId_|deviceId_)(");
        boolean first = true;
        for (String key : map.keySet()) {
            if (!first) {
                regexBuilder.append("|");
            }
            regexBuilder.append(Pattern.quote(key));
            first = false;
        }
        regexBuilder.append(")");
        Pattern pattern = Pattern.compile(regexBuilder.toString());
        Matcher matcher = pattern.matcher(content);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String key = matcher.group(2);
            BaseEntity obj = map.get(key);
            if (Objects.nonNull(obj)) {
                // 通过反射拿name字段的值
                String method = "getName";
                Method getNameMethod = Arrays.stream(obj.getClass().getMethods()).filter(e -> e.getName().equals(method)).findFirst().orElse(null);
                if (Objects.isNull(getNameMethod)) {
                    continue;
                }
                try {
                    String value = (String) getNameMethod.invoke(obj);
                    matcher.appendReplacement(sb, value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /**
     * 仪表台账和区域能源配置中替换计算公式中显示的名称
     * @param map
     * @return
     */
    public static String replaceValues(String targetStr, Map<String, ? extends BaseEntity> map, String targetParamVal) {
        // 定义正则表达式来匹配 input 元素
        String regex = "<input([^>]+)>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(targetStr);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String inputElement = matcher.group();
            String newInputElement = inputElement;
            for (Map.Entry<String, ? extends BaseEntity> entry : map.entrySet()) {
                String key = entry.getKey();
                BaseEntity value = entry.getValue();
                if (inputElement.contains(targetParamVal + key + "\"") && Objects.nonNull(value)) {
                    // 通过反射拿name字段的值
                    String method = "getName";
                    Method getNameMethod = Arrays.stream(value.getClass().getMethods()).filter(e -> e.getName().equals(method)).findFirst().orElse(null);
                    if (Objects.isNull(getNameMethod)) {
                        continue;
                    }
                    try {
                        String valStr = (String) getNameMethod.invoke(value);
                        // 找到匹配的 key，替换 value 属性的值
                        String valueRegex = "value=\"([^\"]+)\"";
                        Pattern valuePattern = Pattern.compile(valueRegex);
                        Matcher valueMatcher = valuePattern.matcher(newInputElement);
                        if (valueMatcher.find()) {
                            newInputElement = valueMatcher.replaceFirst("value=\"" + valStr + "\"");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            matcher.appendReplacement(sb, newInputElement);
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /**
     * 根据系统内配置的等价符判断目标字符是否在指定列表内存在重复
     * @param targetStr 要被比对的字符
     * @param strList 希望比对的源字符
     * @param configs 系统内设置的等价符
     * @return
     */
    public static long findRepeatStrInCollection(String targetStr, List<String> strList, List<SysEqualsSymbolConfig> configs) {
        if (StringUtils.isBlank(targetStr)) {
            return 1L;
        }
        if (CollUtil.isEmpty(strList)) {
            return 0L;
        }

        // 预处理目标字符串，移除空格
        String processedTarget = targetStr.replace(" ", "");

        // 构建等价字符映射表
        Map<Character, Set<Character>> equivalenceMap = buildEquivalenceMap(configs);

        // 使用并行流处理大数据集
        return strList.parallelStream()
                .map(str -> str.replace(" ", ""))
                .anyMatch(compareStr -> compareStringsWithOrder(processedTarget, compareStr, equivalenceMap)) ? 1L : 0L;
    }

    /**
     * 根据系统内配置的等价符判断目标字符是否在指定列表内存在重复
     * @param targetStr 要被比对的字符
     * @param strList 希望比对的源字符
     * @param configs 系统内设置的等价符
     * @return
     */
    public static String findRepeatStr(String targetStr, List<String> strList, List<SysEqualsSymbolConfig> configs) {
        if (StringUtils.isBlank(targetStr) || CollUtil.isEmpty(strList)) {
            return "";
        }
        if (CollUtil.isEmpty(configs)) {
            int index = strList.indexOf(targetStr);
            return index >= 0 ? strList.get(index) : "";
        }
        targetStr = targetStr.replace(" ", "");

        // 构建等价字符映射表
        Map<Character, Set<Character>> equivalenceMap = buildEquivalenceMap(configs);

        for (String compareStr : strList) {
            if (compareStringsWithOrder(targetStr, compareStr.replace(" ", ""), equivalenceMap)) {
                return compareStr;
            }
        }

        return "";
    }

    /**
     * 判断两个字符串在考虑顺序的情况下是否根据等价符号配置相等
     * @param targetStr 目标字符串
     * @param compareStr 要比较的字符串
     * @return 相等返回 true，不相等返回 false
     */
    public static boolean compareStringsWithOrder(String targetStr, String compareStr,
                                                   Map<Character, Set<Character>> equivalenceMap) {
        if (targetStr.length() != compareStr.length()) {
            return false;
        }

        for (int i = 0; i < targetStr.length(); i++) {
            char targetChar = targetStr.charAt(i);
            char compareChar = compareStr.charAt(i);

            if (!isCharEquivalent(targetChar, compareChar, equivalenceMap)) {
                return false;
            }
        }

        return true;
    }

    /**
     * 判断两个字符串在考虑顺序的情况下是否根据等价符号配置相等
     * @param targetStr 目标字符串
     * @param compareStr 要比较的字符串
     * @return 相等返回 true，不相等返回 false
     */
    public static boolean compareStringsWithOrder(String targetStr, String compareStr,
                                                  List<SysEqualsSymbolConfig> equivalenceMap) {
        if (targetStr.length() != compareStr.length()) {
            return false;
        }

        for (int i = 0; i < targetStr.length(); i++) {
            char targetChar = targetStr.charAt(i);
            char compareChar = compareStr.charAt(i);

            if (!isCharEquivalent(targetChar, compareChar, buildEquivalenceMap(equivalenceMap))) {
                return false;
            }
        }

        return true;
    }

    // 预解析等价符号配置为Map结构，提升查找效率
    private static Map<Character, Set<Character>> buildEquivalenceMap(List<SysEqualsSymbolConfig> configs) {
        Map<Character, Set<Character>> equivalenceMap = new HashMap<>();

        for (SysEqualsSymbolConfig config : configs) {
            String[] symbols = config.getSymbol().split(",");
            Set<Character> equivalentChars = new HashSet<>();

            for (String symbol : symbols) {
                if (!symbol.isEmpty()) {
                    char c = symbol.charAt(0);
                    equivalentChars.add(c);
                }
            }

            // 将每个字符与其等价字符集合关联
            for (char c : equivalentChars) {
                equivalenceMap.computeIfAbsent(c, k -> new HashSet<>()).addAll(equivalentChars);
            }
        }

        return equivalenceMap;
    }

    /**
     * 判断两个字符是否根据等价符号配置相等
     * @param char1 第一个字符
     * @param char2 第二个字符
     * @return 相等返回 true，不相等返回 false
     */
    private static boolean isCharEquivalent(char char1, char char2,
                                            Map<Character, Set<Character>> equivalenceMap) {
        if (char1 == char2) {
            return true;
        }

        // 快速判断两个字符是否等价
        Set<Character> equivalents = equivalenceMap.get(char1);
        return equivalents != null && equivalents.contains(char2);
    }


    public static String transferYYYYMMDD2YYYY_MM_DD(String targetStr) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = inputFormat.parse(targetStr);
            return outputFormat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return targetStr;
        }
    }
}
