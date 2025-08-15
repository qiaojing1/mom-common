package com.lets.platform.common.pojo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则 工具库类
 * @author: DING WEI
 * @date: 2024/9/3 16:31
 */
public class PatternUtils {

    /**
     * 获取两个字符之间的值
     * @param start 适配字符开始
     * @param end 适配字符结束
     * @param input 被适配字符
     * @return
     * @author DING WEI
     * @date 2024/9/3 16:33
     * @version 1.0
     */
    public static String getBetween(String start, String end, String input) {
        String regex = start + "(.*?)" + end;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            String extractedValue = matcher.group(1);
            return extractedValue;
        }
        return null;
    }

    public static void main(String[] args) {
        String between = getBetween("第", "行", "第1行第2行");
        System.out.println(between);
    }

}
