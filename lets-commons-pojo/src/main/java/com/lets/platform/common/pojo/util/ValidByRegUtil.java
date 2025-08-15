package com.lets.platform.common.pojo.util;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 根据正则校验 工具类
 *
 * @version 1.0
 * @ClassName ValidByRegUtil
 * @author: DING WEI
 * @create: 2021/05/20 09:32
 **/
public class ValidByRegUtil {

    /**
     * 是否为 手机号
     *
     * @param str
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:33
     * @version 1.0
     **/
    public static boolean isPhone(String str) {
        if (StringUtils.isBlank(str)) {
            return Boolean.FALSE;
        }
        Pattern pattern = Pattern.compile(GlobalConstant.PHONE);
        return pattern.matcher(str).matches();
    }


    /**
     * 是否为 邮件
     *
     * @param str
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:33
     * @version 1.0
     **/
    public static boolean isEmail(String str) {
        if (StringUtils.isBlank(str)) {
            return Boolean.FALSE;
        }
        Pattern pattern = Pattern.compile(GlobalConstant.EMAIL);
        return pattern.matcher(str).matches();
    }

    /**
     * 是否为 长度1~20的非中文字符
     *
     * @param input
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:33
     * @version 1.0
     **/
    public static boolean isNotChinese_1_20(String input) {
        if (StringUtils.isBlank(input)) {
            return Boolean.FALSE;
        }
        Pattern pattern = Pattern.compile(GlobalConstant.NOT_CHINESE_1_20);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    /**
     * 是否为 长度1~11的非中文字符
     *
     * @param input
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:33
     * @version 1.0
     **/
    public static boolean isNotChinese_1_11(String input) {
        if (StringUtils.isBlank(input)) {
            return Boolean.FALSE;
        }
        Pattern pattern = Pattern.compile("^[^\u4e00-\u9fa5]{1,20}$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }


    /**
     * 是否为 长度1~50的非中文字符
     *
     * @param input
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:33
     * @version 1.0
     **/
    public static boolean isNotChinese_1_50(String input) {
        if (StringUtils.isBlank(input)) {
            return Boolean.FALSE;
        }
        Pattern pattern = Pattern.compile(GlobalConstant.NOT_CHINESE_1_50);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    /**
     * 是否为 长度1~21的非中文字符
     *
     * @param input
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:33
     * @version 1.0
     **/
    public static boolean isNotChinese_1_21(String input) {
        if (StringUtils.isBlank(input)) {
            return Boolean.FALSE;
        }
        Pattern pattern = Pattern.compile(GlobalConstant.NOT_CHINESE_1_21);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    /**
     * 是否为 长度1~40的非中文字符
     *
     * @param input
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:33
     * @version 1.0
     **/
    public static boolean isNotChinese_1_40(String input) {
        if (StringUtils.isBlank(input)) {
            return Boolean.FALSE;
        }
        Pattern pattern = Pattern.compile(GlobalConstant.NOT_CHINESE_1_40);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    /**
     * 是否为 YYYY_MM_DD格式的日期字符串
     *
     * @param dateFormat
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:33
     * @version 1.0
     **/
    public static boolean checkDateFormat(String dateFormat) {
        Pattern pattern = Pattern.compile(GlobalConstant.DATE_FORMAT_YYYY_MM_DD);
        Matcher matcher = pattern.matcher(dateFormat);
        return matcher.matches();
    }


    /**
     * 是否为 YYYY/MM/DD格式的日期字符串
     *
     * @param dateFormat
     * @return
     * @author QIAO JING
     * @date 2021/10/29 9:33
     * @version 1.0
     **/
    public static boolean checkDateFormatSlash(String dateFormat) {
        Pattern pattern = Pattern.compile(GlobalConstant.DATE_FORMAT_YYYYMMDD);
        Matcher matcher = pattern.matcher(dateFormat);
        return matcher.matches();
    }

    /**
     * 是否为 长度0~20，大于等于0，保留2位小数
     *
     * @param purchaseAmount
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:33
     * @version 1.0
     **/
    public static boolean checkPurchaseAmount(String purchaseAmount) {
        Pattern pattern = Pattern.compile(GlobalConstant.GREATER_THAN_ZERO_TWO_POINT_1_20);
        Matcher matcher = pattern.matcher(purchaseAmount);
        return matcher.matches();
    }

    /**
     * 是否满足正则
     *
     * @param input 要验证的字符串
     * @param reg   正则表达式
     * @return
     * @author DING WEI
     * @date 2021/5/20 9:36
     * @version 1.0
     **/
    public static boolean isByReg(String input, String reg) {
        if (StringUtils.isBlank(input)) {
            return Boolean.FALSE;
        }
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private static final Pattern chinesePattern = Pattern.compile("[\u4E00-\u9FA5]");

    public static boolean containsChinese(String input) {
        Matcher fractionMatcher = chinesePattern.matcher(input);
        return fractionMatcher.find();
    }

    public static void main(String[] args) {
        System.out.println(containsChinese("ID"));
    }
}

