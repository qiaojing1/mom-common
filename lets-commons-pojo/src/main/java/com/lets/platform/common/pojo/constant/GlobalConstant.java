package com.lets.platform.common.pojo.constant;

import com.lets.platform.common.pojo.util.ValidByRegUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 全局常量类 @ClassName GlobalConstant
 * 半角字符：对应asc码表，半角字符包含数字，英文以及其它的一些特定符，正则表达式是：[\x00-\xff]+
 * 半角符号：[\u0000-\u00FF]
 * 汉字：[\u4E00-\u9FA5]
 * 全角符号：[\uFF00-\uFFFF]
 * 数字英文半角符号：^[0-9a-zA-Z\u0000-\u00FF]+$
 * 空字符串：^\s*$
 *
 * @author: DING WEI
 * @create: 2021/04/23 16:17 @Version 1.0
 */
public class GlobalConstant {

    public static final Integer ZERO = 0;
    public static final Integer ONE = 1;
    public static final Integer TWO = 2;
    public static final Integer THREE = 3;
    public static final Integer FOUR = 4;
    public static final Integer FIVE = 5;
    public static final Integer SIX = 6;
    public static final Integer SEVEN = 7;
    public static final Integer EIGHT = 8;
    public static final Integer NINE = 9;
    public static final Integer TEN = 10;
    public static final Integer TWELVE = 12;
    public static final Integer TWENTY = 20;
    public static final Integer TWENTY_FOUR = 24;
    public static final Integer FIFTY = 50;
    public static final Integer SIXTY = 60;
    public static final BigDecimal SIXTY_AS_BIG = new BigDecimal(SIXTY);
    public static final BigDecimal ONE_MIN_MILL_AS_BIG = new BigDecimal("60000");
    public static final Integer ONE_HUNDRED = 100;
    public static final BigDecimal ONE_HUNDRED_AS_BIG = new BigDecimal(GlobalConstant.ONE_HUNDRED_STR);
    public static final Integer TWO_HUNDRED = 200;
    public static final Integer ONE_THOUSAND = 1000;
    public static final Integer ONE_HOUR = 3600;
    public static final BigDecimal ONE_HOUR_MILL_AS_BIG = new BigDecimal("3600000");
    public static final Integer NINE_NINE_NINE_NINE = 9999;
    /**
     * 一天分钟数
     */
    public static final Integer ONE_DAY_MINUTE = GlobalConstant.TWENTY_FOUR * GlobalConstant.SIXTY;
    /**
     * 一天秒数
     */
    public static final Long ONE_DAY_SECOND = 1L * GlobalConstant.TWENTY_FOUR * GlobalConstant.SIXTY * GlobalConstant.SIXTY;
    /**
     * 一天毫秒数
     */
    public static final Long ONE_DAY_MILLISECOND = ONE_DAY_SECOND * GlobalConstant.ONE_THOUSAND;

    public static final String EMPTY_STR = "";
    public static final String ZERO_STR = "0";
    public static final String ONE_STR = "1";
    public static final String TWO_STR = "2";
    public static final String THREE_STR = "3";
    public static final String FOUR_STR = "4";
    public static final String FIVE_STR = "5";
    public static final String SIX_STR = "6";
    public static final String SEVEN_STR = "7";
    public static final String EIGHT_STR = "8";
    public static final String NINE_STR = "9";
    public static final String TEN_STR = "10";
    public static final String ELEVEN_STR = "10";
    public static final String TWELVE_STR = "12";
    public static final String TWENTY_FOUR_STR = "24";
    public static final BigDecimal ONE_DAY_AS_BIG = new BigDecimal(TWENTY_FOUR_STR);
    public static final String SIXTY_STR = "60";
    public static final String ONE_HUNDRED_STR = "100";
    public static final String ONE_THOUSAND_STR = "1000";
    public static final BigDecimal ONE_THOUSAND_AS_BIG = new BigDecimal(ONE_THOUSAND_STR);
    public static final String NINETY_NINE_STR = "99";

    public static final String COMMA_HALF_ANGLE = ",";
    public static final String COMMA_FULL_ANGLE = "，";

    public static final String SEMICOLON_HALF_ANGLE = ";";
    public static final String SEMICOLON_FULL_ANGLE = "；";

    public static final String COLON_HALF_ANGLE = ":";

    public static final String QUESTION_MARK_HALF_ANGLE = "?";
    public static final String AND = "&";
    public static final String PLUS = "+";
    public static final String MULTIPLY = "*";
    public static final String EQUAL = "=";

    public static final String ADMIN = "admin";
    public static final String MOM_WEB = "mom_web";
    public static final String SWIPE = "swipe";
    public static final String TOKEN_UUID = "token_uuid";
    public static final String TOKEN = "token";

    public static final String CODE_STR = "code";
    public static final String MSG_STR = "msg";
    public static final String DATA = "data";
    public static final String STARS = "****";
    public static final String POINT = ".";
    public static final String AT = "@";
    public static final String UNDERLINE = "_";
    public static final String DOUBLE_GT = ">>";
    public static final String MIDDLE_LINE = "-";
    public static final String DOUBLE_MIDDLE_LINE = MIDDLE_LINE + MIDDLE_LINE;
    public static final String SLASH = "/";
    public static final String BACKSLASH = "\\\\";
    public static final String MIND_CASE = " COLLATE utf8mb4_bin";

    public static final String STATION_MACHINE_OCCUPY = "该批次已被其他工位机占用,不可操作";
    public static final String NEXT_WAIT_NUMBER_CHANGE = "下一工序待流转数量已变化,请刷新后重试";
    public static final String STATION_NO_USE = "未开启生产管理,不可操作工位机";
    public static final String PERMISSION_LIMIT = "权限不足，拒绝访问";
    public static final String DQL = "请输入DQL[数据库查询语言,关键字：SELECT...FROM...WHERE]";
    public static final String DQL_ERROR = "请输入合法的DQL";
    public static final String REQUEST_FROM = "request_from";
    public static final String SERVER_INNER = "server_inner";
    public static final String FEIGN_HEADER = REQUEST_FROM + "=" + SERVER_INNER;
    public static final String CURRENT = "/current";

    public static final List<String> AQL = new ArrayList<>();
    public static final List<String> FIGURE = new ArrayList<>();
    public static final Integer MAX_INTEGER_EIGHT_DIGITS = 99999999;
    /**
     * 一周的天数
     */
    public static final Integer DAY_OF_ONE_WEEK = 7;
    /**
     * 一天的小时数
     */
    public static final Integer HOUR_OF_ONE_DAY = 24;
    /**
     * 一小时的分钟数、一分钟的秒数
     */
    public static final Integer MINUTE_OF_ONE_HOUR = 60;
    /**
     * 一周的秒数
     */
    public static final Integer MINUTE_OF_ONE_WEEK = MINUTE_OF_ONE_HOUR * MINUTE_OF_ONE_HOUR * HOUR_OF_ONE_DAY * DAY_OF_ONE_WEEK;
    /**
     * 一分钟的毫秒数
     */
    public static final Integer MILLISECOND_OF_ONE_MINUTE = 1000 * 60;
    /**
     * 一小时的毫秒数 = 一分钟的毫秒数 * 一小时的分钟数
     */
    public static final Integer MILLISECOND_OF_ONE_HOUR = MILLISECOND_OF_ONE_MINUTE * MINUTE_OF_ONE_HOUR;
    /**
     * 一天的毫秒数 = 一小时的毫秒数 * 一天的小时数
     */
    public static final Integer MILLISECOND_OF_ONE_DAY = MILLISECOND_OF_ONE_HOUR * HOUR_OF_ONE_DAY;
    /**
     * 正则匹配{}中的文字
     */
    public static final String BIG_PARENTHESES = "(?<=\\{)(.+?)(?=\\})";
    /**
     * 正则匹配{{}}中的文字
     */
    public static final String DOUBLE_BIG_PARENTHESES = "(?<=\\{\\{)(.+?)(?=\\}\\})";
    /**
     * 正则匹配[]中的文字
     */
    public static final String MIDDLE_PARENTHESES = "(?<=\\[)(.+?)(?=\\])";
    /**
     * 系统默认密码
     */
    public static final String SYS_DEFAULT_PASSWORD = "abcd1234";
    /**
     * 手机号
     */
    public static final String PHONE = "^[1][1,2,3,4,5,6,7,8,9][0-9]{9}$";

    /**
     * 1-200整数
     */
    public static final String INTERGER_1_200 = "^(1[0-9]{2}|200|[1-9][0-9]?|)$";
    /**
     * 1-1000整数
     */
    public static final String INTERGER_1_1000 = "^([1-9][0-9]{2}|1000|[1-9][0-9]?|)$";


    /**
     * 小数点前8位 小数点后2位
     */
    public static final String WEIGHT = "^-?\\d{1,8}([.]\\d{1,2})?$";

    public static final String WEIGHT3 = "^-?\\d{1,7}([.]\\d{1,3})?$";
    /**
     * MAC地址
     */
    public static final String MAC_ADDRESS = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";

    public static final String MAC_ADDRESS_WIN = "^((([a-f0-9]{2}-){5})|(([a-f0-9]{2}-){5}))[a-f0-9]{2}$";
    /**
     * 邮箱
     */
    public static final String EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    /**
     * 图片
     */
    public static final String PHOTO = ".+(.JPEG|.jpeg|.JPG|.jpg|.png|.PNG)$";
    /**
     * mp3
     */
    public static final String MP3 = ".+(.MP3|.mp3)$";
    /**
     * 修改密码规则
     */
    public static final String UPDATE_PASSWORD = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";
    /**
     * 长度1~20,字母、数字、下划线、短横线
     */
    public static final String LETTER_NUMBER_UNDERLINE_DASH_1_20 = "^[A-Za-z0-9_-]{1,20}$";
    /**
     * 长度1~50,字母、数字、下划线、短横线
     */
    public static final String LETTER_NUMBER_UNDERLINE_DASH_1_50 = "^[A-Za-z0-9_-]{1,50}$";
    /**
     * 长度1~50,字母、数字、下划线,首字母不能是数字
     */
    public static final String LETTER_NUMBER_UNDERLINE_1_50_START_WITH_NOT_NUMBER = "^(?![0-9])[a-zA-Z0-9_]{1,50}$";
    public static final String LETTER_NUMBER_UNDERLINE_1_50 = "^[a-zA-Z0-9_]{1,50}$";
    /**
     * 长度1~20,数字、短横线
     */
    public static final String NUMBER_DASH_1_20 = "^[0-9_-]{1,20}$";
    /**
     * 长度0~20,数字、短横线、括号
     */
    public static final String NUMBER_DASH_BRACKET_0_20 = "^[0-9-()（）]{0,20}$";
    /**
     * 长度1~10,字母、数字、下划线、短横线
     */
    public static final String LETTER_NUMBER_UNDERLINE_DASH_1_10 = "^[A-Za-z0-9_-]{1,10}$";
    /**
     * 长度1~10,字母、数字、下划线
     */
    public static final String LETTER_NUMBER_UNDERLINE_1_10 = "^[A-Za-z0-9_]{1,10}$";
    /**
     * 长度0~20,字母、数字、下划线
     */
    public static final String LETTER_NUMBER_UNDERLINE_0_20 = "^[A-Za-z0-9_]{0,20}$";
    /**
     * 长度1~20,字母、数字、下划线
     */
    public static final String LETTER_NUMBER_UNDERLINE_1_20 = "^[A-Za-z0-9_]{1,20}$";
    /**
     * 长度1~10,中文、字母
     */
    public static final String CHINESE_LETTER_1_10 = "^[\u4E00-\u9FA5A-Za-z]{1,10}$";

    /**
     * 长度1~10,中文
     */
    public static final String CHINESE = "^[\u4E00-\u9FA5]+$";

    /**
     * 长度1~20,中文、字母
     */
    public static final String CHINESE_LETTER_1_20 = "^[\u4E00-\u9FA5A-Za-z]{1,20}$";
    /**
     * 长度1~20,中文、字母、数字、下划线
     */
    public static final String CHINESE_LETTER_NUMBER_UNDERLINE_1_20 = "^[\u4E00-\u9FA5A-Za-z0-9_]{1,20}$";
    /**
     * 长度1~50,中文、字母、数字、下划线
     */
    public static final String CHINESE_LETTER_NUMBER_UNDERLINE_1_50 = "^[\u4E00-\u9FA5A-Za-z0-9_]{1,50}$";
    /**
     * 长度1~100,中文、字母、数字、下划线
     */
    public static final String CHINESE_LETTER_NUMBER_UNDERLINE_0_100 = "^[\u4E00-\u9FA5A-Za-z0-9_]{0,100}$";
    /**
     * 长度0~20,中文、字母、数字、下划线
     */
    public static final String CHINESE_LETTER_NUMBER_UNDERLINE_0_20 = "^[\u4E00-\u9FA5A-Za-z0-9_]{0,20}$";
    /**
     * 长度0~40,中文、字母、数字、下划线
     */
    public static final String CHINESE_LETTER_NUMBER_UNDERLINE_0_40 = "^[\u4E00-\u9FA5A-Za-z0-9_]{0,40}$";
    /**
     * 长度0~21,数字
     */
    public static final String NUMBER_0_21 = "^[0-9]{0,21}$";
    public static final String NUMBER_0_20 = "^[0-9]{0,20}$";
    public static final String NUMBER_0_7 = "^[0-9]{0,7}$";
    /**
     * [0.01,9999.99]
     */
    public static final String NUMBER_0_POINT_01_TO_9999_POINT_99 = "^(0\\.0[1-9]|[0-9]{1,4}(?:\\.\\d{1,2})?|9999(?:\\.[0-8][0-9]?)?)$";
    public static final String NUMBER_0_TO_999999_POINT_999 = "^[0-9]{1,6}(\\.[0-9]{1,3})?$";
    public static final String NUMBER_0_TO_999999_POINT_99 = "^[0-9]{1,6}(\\.[0-9]{1,2})?$";
    public static final String NUMBER_0_TO_99999_POINT_999 = "^[0-9]{1,5}(\\.[0-9]{1,3})?$";
    public static final String NUMBER_0_30 = "^[0-9]{0,30}$";
    public static final String NUMBER_0_50 = "^[0-9]{0,50}$";
    public static final String NUMBER_0_10 = "^[0-9]{0,10}$";
    public static final String NUMBER_0_9 = "^[0-9]$";
    /**
     * 长度1~20,数字,端横线
     */
    public static final String NUMBER_LINE_0_21 = "^[0-9-]{1,20}$";
    /**
     * 长度1~30,中文、字母、数字
     */
    public static final String CHINESE_LETTER_NUMBER_1_30 = "^[\u4E00-\u9FA5A-Za-z0-9]{1,30}$";
    /**
     * 长度0~200,中文、字母、数字、下划线
     */
    public static final String CHINESE_LETTER_NUMBER_UNDERLINE_0_200 = "^[\u4E00-\u9FA5A-Za-z0-9_]{0,200}$";
    /**
     * 密码：长度8,字母、数字、符号
     */
    public static final String NOT_CHINESE_8_20 = "^[^\u4e00-\u9fa5]{8,20}$";
    /**
     * 长度1~10,字母、数字、符号
     */
    public static final String NOT_CHINESE_1_10 = "^[0-9a-zA-Z\u0000-\u00FF]{1,10}$";
    /**
     * 长度1~20,字母、数字、符号
     */
    public static final String NOT_CHINESE_1_20 = "^[0-9a-zA-Z\u0000-\u00FF]{1,20}$";

    /**
     * 长度1~40,字母、数字、符号
     */
    public static final String NOT_CHINESE_1_40 = "^[0-9a-zA-Z\u0000-\u00FF]{1,40}$";

    /**
     * 长度10~40,字母、数字、符号
     */
    public static final String NOT_CHINESE_10_40 = "^[0-9a-zA-Z\u0000-\u00FF]{10,40}$";

    /**
     * 长度1~50,字母、数字、符号
     */
    public static final String NOT_CHINESE_1_50 = "^[\u0000-\u00FF]{1,50}$";
    /**
     * 长度0~50,字母、数字、符号
     */
    public static final String NOT_CHINESE_0_50 = "^[\u0000-\u00FF]{0,50}$";
    /**
     * 长度1~2,字母、符号
     */
//    public static final String LETTER_SYMBOL_1_2 = "^[^\u4e00-\u9fa50-9]{1,2}$";
    public static final String LETTER_SYMBOL_1_2 = "^[\\x00-\\x2F\\x3A-\\xFF]{1,2}$";

    /**
     * 长度1~50 字母 数字 下划线 首字母不能为数字
     */
    public static final String FIRST_CHAR_NOT_NUM_0_50 = "^[a-zA-Z_][a-zA-Z0-9_]{0,49}$";
    /**
     * 长度0~4,字母、符号
     * \x2F-\x3A标识数字0-9
     */
//    public static final String LETTER_SYMBOL_1_4 = "^[^\u4e00-\u9fa50-9]{1,4}$";
    public static final String LETTER_SYMBOL_0_4 = "^[\\x00-\\x2F\\x3A-\\xFF]{0,4}$";
    /**
     * 货币符号：长度0~4,非中文数字 (也可以说是字母、符号)
     */
    public static final String CURRENCY_SYMBOL = "^[^\\u4e00-\\u9fa5^0-9]{0,4}$";
    /**
     * 长度1~30,字母、数字、符号
     */
//    public static final String NOT_CHINESE_1_30 = "^[^\u4e00-\u9fa5]{1,30}$";
    public static final String NOT_CHINESE_1_30 = "^[\\x00-\\xff]{1,30}$";
    /**
     * 长度1~30,字母、数字
     */
    public static final String NUMBER_LETTER_1_30 = "^[A-Za-z0-9]{1,30}$";
    /**
     * 长度1~100,字母、数字
     */
    public static final String NUMBER_LETTER_1_100 = "^[A-Za-z0-9]{1,100}$";
    /**
     * 长度1~10，支持字母、数字
     */
    public static final String NUMBER_LETTER_1_10 = "^[A-Za-z0-9]{1,10}$";
    /**
     * 长度1~10，支持字母
     */
    public static final String LETTER_1_10 = "^[A-Za-z]{1,10}$";
    /**
     * 长度1~50,字母、数字、符号
     */
//    public static final String NOT_CHINESE_1_50 = "^[^\u4e00-\u9fa5]{1,50}$";
    /**
     * 长度1~21,字母、数字、符号
     */
//    public static final String NOT_CHINESE_1_21 = "^[^\u4e00-\u9fa5]{1,21}$";
    public static final String NOT_CHINESE_1_21 = "^[\\x00-\\xff]{1,21}$";
    /**
     * 长度1~200,字母、数字、符号
     */
//    public static final String NOT_CHINESE_1_200 = "^[^\u4e00-\u9fa5]{1,200}$";
    public static final String NOT_CHINESE_1_200 = "^[\\x00-\\xff]{1,200}$";
    /**
     * 长度0~20,字母、数字、符号
     */
//    public static final String NOT_CHINESE_0_20 = "^[^\u4e00-\u9fa5]{0,20}$";
    public static final String NOT_CHINESE_0_20 = "^[\\x00-\\xff]{0,20}$";
    /**
     * 长度0~30,字母、数字、符号
     */
//    public static final String NOT_CHINESE_0_30 = "^[^\u4e00-\u9fa5]{0,20}$";
    public static final String NOT_CHINESE_0_30 = "^[\\x00-\\xff]{0,30}$";
    /**
     * 长度0~40,字母、数字、符号
     */
//    public static final String NOT_CHINESE_0_40 = "^[^\u4e00-\u9fa5]{0,40}$";
    public static final String NOT_CHINESE_0_40 = "^[\\x00-\\xff]{0,40}$";
    /**
     * 长度0~20，大于等于0，保留2位小数
     */
    public static final String GREATER_THAN_ZERO_TWO_POINT_1_20 = "(^[0-9]{1,17})+(\\.[0-9]{2})$";
    /**
     * 长度0~10，大于等于0，可保留2位小数
     */
    public static final String GREATER_THAN_ZERO_TWO_POINT_1_10 = "(^[0-9]{1,7})(\\.\\d{1,2})?$";
    /**
     * 长度0~11，大于等于0，可保留4位小数
     */
    public static final String GT0_4_P_1_11 = "(^[0-9]{1,6})(\\.\\d{1,4})?$";
    /**
     * 长度0~10，大于等于0，可保留3位小数
     */
    public static final String GT0_3_P_1_10 = "(^[0-9]{1,6})(\\.\\d{1,3})?$";
    /**
     * 长度0~13，大于等于0，可保留3位小数
     */
    public static final String GT0_3_P_1_13 = "(^[0-9]{1,10})(\\.\\d{1,3})?$";
    /**
     * 长度0~12，大于等于0，可保留2位小数
     */
    public static final String GT0_2_P_1_12 = "(^[0-9]{1,10})(\\.\\d{1,2})?$";
    /**
     * 数字
     */
    public static final String GT0_X_P_1_12 = "(^[0-9])(\\.\\d{0,2})?$";
    /**
     * 长度0~13，大于等于0，可保留2位小数
     */
    public static final String GREATER_THAN_ZERO_TWO_POINT_1_13 = "(^[0-9]{1,10})(\\.\\d{1,2})?$";
    /**
     * 长度0~20，大于等于0，可保留2位小数
     */
    public static final String GREATER_THAN_ZERO_TWO_POINT_1_20_EASY =
            "(^[0-9]{1,17})(\\.\\d{1,2})?$";
    /**
     * 长度0~20，大于等于0，可保留3位小数
     */
    public static final String GREATER_THAN_ZERO_THREE_POINT_1_20_EASY =
            "(^[0-9]{1,16})(\\.\\d{1,3})?$";

    /**
     * 长度1～20 算上小数点 大于0，可保留任意小数
     */
    public static final String GREATER_THAN_ZERO_INFINITY_POINT_1_20 = "^(?=.{1,20}$)[0-9]*\\.?[0-9]*$";
    /**
     * 长度1～10 算上小数点 大于0，可保留任意小数
     */
    public static final String GREATER_THAN_ZERO_INFINITY_POINT_1_10 = "^(?=.{1,10}$)[0-9]*\\.?[0-9]*$";
    /**
     * 长度1~5，大于0，可保留2位小数
     */
    public static final String GREATER_THAN_ZERO_TWO_POINT_1_5 = "(^[0-9]{1,3})(\\.\\d{1,2})?$";
    /**
     *
     */
    public static final String NUMBER = "-?[0-9]*\\.?[0-9]*";
    /**
     * 长度0~3，大于等于0，可保留2位小数
     */
    public static final String GREATER_THAN_ZERO_TWO_POINT_1_3 = "(^[0-9])(\\.\\d{1,2})?$";
    /**
     * 日期格式：yyyy-mm-dd
     */
    public static final String DATE_FORMAT_YYYY_MM_DD = "^\\d{4}-\\d{1,2}-\\d{1,2}";
    /**
     * 日期时间格式：yyyy-mm-dd HH:mm:ss
     */
    public static final String DATE_FORMAT_YYYY_MM_DD_HH_MM_SS = "([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))([ ])([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";
    /**
     * 日期格式：yyyy-mm-dd 限制月份日为两位
     */
    public static final String DATE_FORMAT_YYYY_MM_DD_2 = "^\\d{4}-\\d{2,2}-\\d{2,2}";
    /**
     * 日期格式：yyyy-mm 限制月份日为两位
     */
    public static final String DATE_FORMAT_YYYY_MM_2 = "^\\d{4}-\\d{2,2}";
    /**
     * 日期格式：yyyy/mm/dd
     */
    public static final String DATE_FORMAT_YYYYMM = "^\\d{4}/\\d{1,2}";
    /**
     * 日期格式：yyyy/mm/dd
     */
    public static final String DATE_FORMAT_YYYYMMDD = "^\\d{4}/\\d{1,2}/\\d{1,2}";
    /**
     * 日期格式：yyyyMMdd
     */
    public static final String DATE_FORMAT_YYYYMMDD_1 = "^\\d{8}$";
    /**
     * MM-dd 格式正则表达式（01-12月，01-31日）
     */
    public static final String DATE_MM_DD = "^(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
    /**
     * IPV4
     */
    public static final String IPV4 =
            "((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}";
    /**
     * 中国邮政编码(中国邮政编码为6位数字)
     */
    public static final String POSTAL_CODE = "[1-9]\\d{5}(?!\\d)";
    /**
     * 腾讯QQ号(腾讯QQ号从10000开始)
     */
    public static final String QQ = "[1-9][0-9]{4,}";
    /**
     * 域名
     */
    public static final String DOMAIN_NAME =
            "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+\\.?";
    /**
     * InternetURL
     */
    public static final String INTERNET_URL = "[a-zA-z]+://[^\\s]*";
    /**
     * 身份证号(15位、18位数字)，最后一位是校验位，可能为数字或字符X
     */
    public static final String ID_CARD = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
    /**
     * xml文件
     */
    public static final String XML_FILE = "^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\\\.[x|X][m|M][l|L]$";
    /**
     * 半角符号
     */
    public static final String HALF_ANGLE = "[\\x21-\\x2f\\x3a-\\x40\\x5b-\\x60\\x7B-\\x7F]";
    /**
     * 长度1~10，输入：字母、数字、半角符号
     */
    public static final String LETTER_NUMBER_HALF_ANGLE_1_10 =
            "^[a-zA-Z0-9\\x21-\\x2f\\x3a-\\x40\\x5b-\\x60\\x7B-\\x7F]{1,10}$";
    /**
     * 长度1~40，输入：字母、数字、半角符号
     */
    public static final String LETTER_NUMBER_HALF_ANGLE_1_40 =
            "^[a-zA-Z0-9\\x21-\\x2f\\x3a-\\x40\\x5b-\\x60\\x7B-\\x7F]{1,40}$";
    /**
     * 长度1~10，输入：中文、字母、数字、半角符号
     */
    public static final String CHINESE_LETTER_NUMBER_HALF_ANGLE_1_10 =
            "^[\u4E00-\u9FA5a-zA-Z0-9\\x21-\\x2f\\x3a-\\x40\\x5b-\\x60\\x7B-\\x7F]{1,10}$";

    /***
     * 0.001~999999.999
     */
    public static final String FLOAT_RANGE_0_dot_001_999999_dot_999_WITH_EMPTY_STRING =
            "^$|(?!0\\.00[0]*$)(\\d{1,6}(\\.\\d{1,3})?|0\\.\\d{1,3})";

    /***
     * 1~200
     */
    public static final String RANGE_1_200 =
            "([1-9]|[1-9]\\d|1\\d{2}|200)";

    /***
     * 1~1000
     */
    public static final String RANGE_1_1000 =
            "([1-9]|[1-9]\\d|[1-9]\\d{2}|1000)";

    /**
     * 全角符号
     */
    public static final String FULL_ANGLE = "[^\\x21-\\x2f\\x3a-\\x40\\x5b-\\x60\\x7B-\\x7F]";
    /**
     * yyyy-MM-dd格式的字符串形式的日期
     */
    public static final String YYYY_MM_DD = "^\\d{4}-\\d{1,2}-\\d{1,2}";
    /**
     * yyyy/MM/dd格式的字符串形式的日期
     */
    public static final String YYYY_MM_DD_2 = "^\\d{4}/\\d{1,2}/\\d{1,2}";
    /**
     * yyyyMMdd格式的字符串形式的日期
     */
    public static final String YYYY_MM_DD_3 = "^\\d{4}\\d{1,2}\\d{1,2}";

    public static final String PARAM_ORDER_DESC_1 = "updateTime";
    public static final String PARAM_ORDER_DESC_2 = "createTime";
    public static final String PARAM_ORDER_ASC_3 = "id";
    public static final String PARAM_ORDER_ASC = "asc";

    static {
        AQL.add("0.01");
        AQL.add("0.015");
        AQL.add("0.025");
        AQL.add("0.04");
        AQL.add("0.065");
        AQL.add("0.1");
        AQL.add("0.15");
        AQL.add("0.25");
        AQL.add("0.4");
        AQL.add("0.65");
        AQL.add("1");
        AQL.add("1.5");
        AQL.add("2.5");
        AQL.add("4");
        AQL.add("6.5");
        AQL.add("10");
        AQL.add("15");
        AQL.add("25");
        AQL.add("40");
        AQL.add("65");
        AQL.add("100");
        AQL.add("150");
        AQL.add("250");
        AQL.add("400");
        AQL.add("650");
        AQL.add("1000");

        FIGURE.add("A");
        FIGURE.add("B");
        FIGURE.add("C");
        FIGURE.add("D");
        FIGURE.add("E");
        FIGURE.add("F");
        FIGURE.add("G");
        FIGURE.add("H");
        FIGURE.add("J");
        FIGURE.add("K");
        FIGURE.add("L");
        FIGURE.add("M");
        FIGURE.add("N");
        FIGURE.add("P");
        FIGURE.add("Q");
        FIGURE.add("R");
    }

    public static final String UNDER_LINE = "_";

    public final static Long MILLISECOND_DAY = 1000L * 60 * 60 * 24;

    public final static String SUF = "";
    public final static String QUEUE_NAME = "MDC2" + SUF;
    /**
     * 报警 交换机、队列
     */
    public final static String WARN_QUEUE = "MDC_WARN_QUEUE" + SUF;
    public final static String WARN_EXCHANGE = "MDC_WARN_EXCHANGE" + SUF;
    /**
     * TPM报警工单 交换机、队列
     */
    public final static String TPM_CALL_REPAIR_QUEUE = "TPM_CALL_REPAIR_QUEUE" + SUF;
    public final static String TPM_CALL_REPAIR_EXCHANGE = "TPM_CALL_REPAIR_EXCHANGE" + SUF;
    /**
     * 报警项 交换机、队列
     */
    public final static String ALARM_ITEM_QUEUE = "MDC_ALARM_ITEM_QUEUE" + SUF;
    public final static String ALARM_ITEM_EXCHANGE = "MDC_ALARM_ITEM_EXCHANGE" + SUF;
    /**
     * COMMON点位 交换机、队列
     */
    public final static String COMMON_QUEUE = "MDC_COMMON_QUEUE" + SUF;
    public final static String COMMON_EXCHANGE = "MDC_COMMON_EXCHANGE" + SUF;
    /**
     * toInfluxDb 交换机、队列
     */
    public final static String TO_INFLUXDB_QUEUE = "MDC_TO_INFLUXDB_QUEUE" + SUF;
    public final static String TO_INFLUXDB_EXCHANGE = "MDC_TO_INFLUXDB_EXCHANGE" + SUF;
    /**
     * status_mysql 交换机、队列
     */
    public final static String HISTORY_MYSQL_QUEUE = "MDC_HISTORY_MYSQL_QUEUE" + SUF;
    public final static String HISTORY_MYSQL_EXCHANGE = "MDC_HISTORY_MYSQL_EXCHANGE" + SUF;
    /**
     * 实时点位 交换机、队列
     */
    public final static String REAL_ITEM_QUEUE = "MDC_REAL_ITEM_QUEUE" + SUF;
    public final static String REAL_ITEM_EXCHANGE = "MDC_REAL_ITEM_EXCHANGE" + SUF;
    /**
     * 解锁设备 交换机、队列
     */
    public final static String MES_UNLOCK_QUEUE = "MES_UNLOCK_QUEUE" + SUF;
    public final static String MES_UNLOCK_EXCHANGE = "MES_UNLOCK_EXCHANGE" + SUF;
    /**
     * 解锁设备-设备状态变更 交换机、队列
     */
    public final static String MES_UNLOCK_WAIT_OP_QUEUE = "MES_UNLOCK_WAIT_OP_QUEUE" + SUF;
    public final static String MES_UNLOCK_WAIT_OP_EXCHANGE = "MES_UNLOCK_WAIT_OP_EXCHANGE" + SUF;
    /**
     * 解锁设备-自动线建模 交换机、队列
     */
    public final static String MES_UNLOCK_AUTO_LINE_MODELING_QUEUE = "MES_UNLOCK_AUTO_LINE_MODELING_QUEUE" + SUF;
    public final static String MES_UNLOCK_AUTO_LINE_MODELING_EXCHANGE = "MES_UNLOCK_AUTO_LINE_MODELING_EXCHANGE" + SUF;
    /**
     * 设备解锁状态 交换机、队列
     */
    public final static String MES_LOCK_STATUS_QUEUE = "MES_LOCK_STATUS_QUEUE" + SUF;
    public final static String MES_LOCK_STATUS_EXCHANGE = "MES_LOCK_STATUS_EXCHANGE" + SUF;
    /**
     * 工单执行-自动扫码上料、扫码执行 交换机、队列
     */
    public final static String PRODUCE_ORDER_PURSUANCE_QUEUE = "PRODUCE_ORDER_PURSUANCE_QUEUE" + SUF;
    public final static String PRODUCE_ORDER_PURSUANCE_EXCHANGE = "PRODUCE_ORDER_PURSUANCE_EXCHANGE" + SUF;


    public static final String LETS_DEVICE_DO = "LETS:DEVICE:DO";
    public static final String LETS_USER_DO = "LETS:USER:DO";

    /**
     * 异常掉线
     */
    public static final String LETS_OFFLINE_TIME = "LETS:OFFLINE:";
    public static final String LETS_OFFLINE_TIME_CLOSE = "LETS:OFFLINE:CLOSE";
    /**
     * 采集数据和服务时间 延时过大提醒
     */
    public static final String LETS_RELAYED_SEND = "LETS:RELAYED:";
    public static final String LETS_RELAYED_SEND_CLOSE = "LETS:RELAYED:CLOSE";
    /**
     * 产量点位值
     */
    public static final String LETS_OUTPUT_VALUE = "LETS:OUTPUT:VALUE";
    /**
     * 产品点位值
     */
    public static final String LETS_PRODUCT_VALUE = "LETS:OUTPUT:VALUE";
    /**
     * GWB2.0采集数据格式字段常量
     */
    public static final String STATUS_TIME = "host_time";
    public static final String ITEM_ARRAY = "tags";

    /**
     * GWB2.0点位字段常量
     */
    public static final String TAG_ID = "tag_id";
    public static final String TAG_NAME = "tag_name";
    public static final String TAG_VALUE = "tag_value";
    public static final String VALUE_TYPE = "value_type";
    public static final String TAG_CATEGORY = "tag_category";
    public static final String TIMESTAMP = "timestamp";

    /**
     * 异常掉线消息配置
     */
    public static final String ERROR_OFFLINE_MSG_CONFIG = "ERROR_OFFLINE_MSG_CONFIG:";
    /**
     * 采集器信息
     */
    public static final String COLLECTOR_DO = "LETS:COLLECTION:COLLECTOR_DO:";

    /**
     * returnToZero 归零
     */
    public static final String RTZ = "RETURN_TO_ZERO:";
    public static final String TIME = "time";
    public static final String WATER = "water";
    public static final String POWER = "power";
    public static final String GAS = "gas";
    public static final List<String> ENERGY_KEY = Arrays.asList(WATER, POWER, GAS);

    public static final String ENERGY_REAL = "real_";

    public static final String COLLECTOR_ID = "collectorId";
    public static final String TENANCY_ID = "tenancyId";
    public static final String DEVICE_ID = "deviceId";
    public static final String TYPE_CLASSIFY = "typeClassify";
    public static final String DEVICE_ASSET_STATUS = "DeviceAssetStatus";

    /**
     * 设备解锁点位
     */
    public static final String LETS_UNLOCK_SCAN_CODE = "lets_unlock_scan_code";

    public static void main(String[] args) {
////        String test = "¥";
//        String test = "123456789012345678901";
//        //一个Pattern对象和一个正则表达式相关联 长度1~20,字母、数字、符号
//        Pattern pattern = Pattern.compile(NUMBER_0_21);
//        //一个Matcher对象和一个具体的字符串相关联，表示在指定模式下与这个字符串匹配
//        Matcher matcher = pattern.matcher(test);
//        //判断字符串和正则表达式是否匹配，匹配返回true
//        System.out.println(matcher.matches());
//        //截取匹配的字符串
//        while (matcher.find()) {
//            String str = matcher.group();
//            System.out.println(str);
//        }
        System.out.println(ValidByRegUtil.isByReg("0",RANGE_1_1000));
    }
}