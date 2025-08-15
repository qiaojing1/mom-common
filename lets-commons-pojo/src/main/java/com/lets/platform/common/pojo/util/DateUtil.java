package com.lets.platform.common.pojo.util;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.exception.LetsException;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

/**
 * @version 1.0 创建时间: 2017年8月24日 下午2:47:28
 * @ClassName: DateUtil
 * @Description: 日期操作工具类
 */
@Slf4j
public class DateUtil {

    public static DateTimeFormatter MMdd = DateTimeFormatter.ofPattern("MM月dd日");
    public static DateTimeFormatter yyyyMM_4 = DateTimeFormatter.ofPattern("yyyy年MM月");
    public static DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd");

    public static final String TIME_PATTERN = "HH:mm:ss";

    public static final String DATE_PATTENT = "yyyy-MM-dd";
    public static final String DATE_PATTENT1 = "yyyy年MM月dd日";

    public static final String DATE_PATTENT_LONG = "yyyy-MM-dd HH:mm:ss:sss";

    public static final String DATETIME_PATTENT = "yyyy-MM-dd HH:mm:ss";

    public static final String YEAR_MONTH_PATTENT = "yyyy-MM";

    public static final String YYYYMMDD_PATTERN = "yyyyMMdd";

    public static final String YYYYMMDD_PATTERN2 = "yyyy/MM/dd";

    public static final String MMDD_PATTERN = "MM-dd";

    public static final String YYYYMMDDHHMMSS_PATTERN = "yyyyMMddHHmmss";

    public static final String DATE_SHORTTIME_PATTENT = "yyyy-MM-dd HH:mm";


    public static final long MILLISECOND_OF_SECOND = 1000;
    public static final long MILLISECOND_OF_MINUTE = MILLISECOND_OF_SECOND * 60;
    public static final long MILLISECOND_OF_HOUR = MILLISECOND_OF_MINUTE * 60;
    public static final long MILLISECOND_OF_DAY = MILLISECOND_OF_HOUR * 24;
    public static final long MILLISECOND_OF_WEEK = MILLISECOND_OF_DAY * 7;
    public static final long MILLISECOND_OF_YEAR = MILLISECOND_OF_DAY * 365;
    public static final int MINUTE_OF_HALF_HOUR_ADD = 30;
    public static final int MINUTE_OF_HALF_HOUR_DEDUCE = -30;


    private DateUtil() {
    }

    /**
     * 添加或减少天数
     */
    public static Date addDay(Date date, int days) {
        if (date != null) {
            return new Date(date.getTime() + days * MILLISECOND_OF_DAY);
        }
        return date;
    }

    /***
     *
     * @param date
     *            时间对象
     * @param pattern
     *            匹配模式
     * @return
     */
    public static String dateToString(Date date, String pattern) {
        String dateStr = "";
        if (null == date) {
            //
        } else {
            SimpleDateFormat smp = new SimpleDateFormat(pattern);
            dateStr = smp.format(date);
        }
        return dateStr;
    }

    /***
     * 检查日期
     *
     * @param startDate 开始时间
     * @param endDate 结束时间
     * @return 检测结果
     */
    public static boolean checkDateValid(Date startDate, Date endDate) {
        long time = System.currentTimeMillis();
        if (startDate == null || endDate == null) {
            return false;
        }
        long stTime = startDate.getTime();
        long edTime = endDate.getTime();
        if (stTime > time || edTime > time) {
            return false;
        }
        return stTime < edTime;
    }

    /**
     * 获取今天指定时分秒的日期
     *
     * @param hour
     * @param minute
     * @param second
     * @param millisecond
     * @return
     */
    public static Date getTadeyTimeByParams(int hour, int minute, int second, int millisecond) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);
        cal.set(Calendar.MILLISECOND, millisecond);
        return cal.getTime();
    }

    /**
     * 获取现在时间
     *
     * @return 返回时间类型 yyyy-MM-dd HH:mm:ss
     */
    public static Date getNowDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(DATETIME_PATTENT);
        String dateString = formatter.format(date);

        DateFormat df = new SimpleDateFormat(DATETIME_PATTENT);
        Date currentTime = null;
        try {
            currentTime = df.parse(dateString);
        } catch (ParseException e) {
            //
        }
        return currentTime;
    }

    public static String getNowDateString() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(YYYYMMDDHHMMSS_PATTERN);
        return formatter.format(date);
    }

    /**
     * 获取现在时间
     *
     * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
     */
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(DATETIME_PATTENT);
        return formatter.format(currentTime);
    }
    /**
     * 获取现在时间
     *
     * @return返回字符串格式 DATE_PATTENT1
     */
    public static String getStringDateChiness() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTENT1);
        return formatter.format(currentTime);
    }

    /**
     * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
     *
     * @param strDate
     * @return
     */
    public static Date strToDateLong(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATETIME_PATTENT);
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(strDate, pos);
    }

    /**
     * 将长时间格式时间转换为字符串 yyyy-MM-dd HH:mm:ss
     *
     * @param dateDate
     * @return
     */
    public static String dateToStrLong(Date dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATETIME_PATTENT);
        return formatter.format(dateDate);
    }

    public static String longToStrLong(Long dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATETIME_PATTENT);
        return formatter.format(new Date(dateDate));
    }

    /**
     * 将时长转化为时分秒
     *
     * @param second
     * @return
     */
    public static String secondToTime(long second) {
        long days = second / (24 * 60 * 60); // 转换天数
        second = second % (24 * 60 * 60); // 剩余秒数
        long hours = second / (60 * 60); // 转换小时
        second = second % (60 * 60); // 剩余秒数
        long minutes = second / 60; // 转换分钟
        second = second % 60; // 剩余秒数
        if (days > 0) {
            return days + "天" + hours + "小时" + minutes + "分" + second + "秒";
        } else if (hours > 0) {
            return hours + "小时" + minutes + "分" + second + "秒";
        } else if (minutes > 0) {
            return minutes + "分" + second + "秒";
        } else {
            return second + "秒";
        }
    }

    public static String secondToTimeWithoutDay(long second, String format) {
        long hours = second / (60 * 60); // 转换小时
        second = second % (60 * 60); // 剩余秒数
        long minutes = second / 60; // 转换分钟
        second = second % 60; // 剩余秒数
        String hour = hours + "";
        if (hours < 10) {
            hour = StrUtil.padPre(hour, 2, '0');
        }
        String minute = StrUtil.padPre(minutes + "", 2, '0');
        String diffSecond = StrUtil.padPre(second + "", 2, '0');
        if (StringUtils.isBlank(format)) {
            format = "HH:mm:ss";
        }
        return format.toLowerCase().replace("hh", hour).replace("mm", minute).replace("ss", diffSecond);
    }

    /**
     * 将长时间格式时间转换为字符串 yyyy-MM
     *
     * @param dateDate
     * @return
     */
    public static String dateToShortStr(Date dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(YEAR_MONTH_PATTENT);
        return formatter.format(dateDate);
    }

    /**
     * 将短时间格式时间转换为字符串 yyyy-MM-dd
     *
     * @param dateDate
     * @return
     */
    public static String dateToStr(Date dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTENT);
        return formatter.format(dateDate);
    }

    /**
     * 将短时间格式字符串转换为时间 yyyy-MM-dd
     *
     * @param strDate
     * @return
     */
    public static Date strToDate(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTENT);
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(strDate, pos);
    }

    /**
     * 将时间字符串转换为指定格式的时间
     *
     * @param strDate
     * @param pattent
     * @return
     */
    public static Date strToDate(String strDate, String pattent) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattent);
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(strDate, pos);
    }

    /**
     * 获得当天零点时间
     *
     * @return
     */
    public static Date getTodayZeroTimes() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }


    /**
     * 获得本周一零点时间
     *
     * @return
     */
    public static Date getMondayZeroTimes() {
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.setTime(getTodayZeroTimes());
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return cal.getTime();
    }


    /**
     * 获得本月一号零点时间
     *
     * @return
     */
    public static Date getMonthStartZeroTimes() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getTodayZeroTimes());
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    /**
     * 获取当年的第一天
     *
     * @return
     */
    public static Date getCurrYearFirst() {
        Calendar currCal = Calendar.getInstance();
        int currentYear = currCal.get(Calendar.YEAR);
        return getYearFirst(currentYear);
    }

    /**
     * 获取当年的最后一天
     *
     * @return
     */
    public static Date getCurrYearLast() {
        Calendar currCal = Calendar.getInstance();
        int currentYear = currCal.get(Calendar.YEAR);
        return getYearLast(currentYear);
    }

    /**
     * 获取某年第一天日期
     *
     * @param year 年份
     * @return Date
     */
    public static Date getYearFirst(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        Date currYearFirst = calendar.getTime();
        return currYearFirst;
    }

    /**
     * 获取某年最后一天日期
     *
     * @param year 年份
     * @return Date
     */
    public static Date getYearLast(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date currYearLast = calendar.getTime();
        return currYearLast;
    }

    /**
     * 根据数字月获取对应的中文
     *
     * @param num
     * @return
     */
    public static String getMonthByNum(int num) {
        String month = "";
        switch (num) {
            case 1:
                month = "一月";
                break;
            case 2:
                month = "二月";
                break;
            case 3:
                month = "三月";
                break;
            case 4:
                month = "四月";
                break;
            case 5:
                month = "五月";
                break;
            case 6:
                month = "六月";
                break;
            case 7:
                month = "七月";
                break;
            case 8:
                month = "八月";
                break;
            case 9:
                month = "九月";
                break;
            case 10:
                month = "十月";
                break;
            case 11:
                month = "十一月";
                break;
            case 12:
                month = "十二月";
                break;
            default:
                break;
        }
        return month;
    }

    /**
     * 获取某天七天前从0点开始的时间
     *
     * @return Date
     */
    public static Date getStartTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - 7);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取某天23:59:59时间
     *
     * @return Date
     */
    public static Date getEndTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

    /**
     * 获取某天0:0:0时间
     *
     * @return Date
     */
    public static Date getOpenTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取0到10的中文
     */
    public static String getChineseByNumZore2Ten(Integer num) {
        String[] s1 = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        return s1[num];
    }

    /**
     * 判断是否是同一天
     *
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameDay(Date date1, Date date2) {
        Calendar calDateA = Calendar.getInstance();
        calDateA.setTime(date1);

        Calendar calDateB = Calendar.getInstance();
        calDateB.setTime(date2);

        return calDateA.get(Calendar.YEAR) == calDateB.get(Calendar.YEAR)
                && calDateA.get(Calendar.MONTH) == calDateB.get(Calendar.MONTH)
                && calDateA.get(Calendar.DAY_OF_MONTH) == calDateB
                .get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 算出两个时间段的所有时间集合(包括当天)
     *
     * @param startDay
     * @param endDay
     * @return
     */
    public static List<String> getBetweenDay(Date startDay, Date endDay) {
        List<String> lDate = new ArrayList<>();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        lDate.add(sd.format(startDay));
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(startDay);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(endDay);
        // 测试此日期是否在指定日期之后
        while (endDay.after(calBegin.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            lDate.add(sd.format(calBegin.getTime()));
        }
        return lDate;
    }

    public static List<String> getBetweenDay(LocalDate startDay, LocalDate endDay, DateTimeFormatter formatter) {
        List<String> lDate = new ArrayList<>();
        while (!startDay.isAfter(endDay)) {
            lDate.add(startDay.format(formatter));
            startDay = startDay.plusDays(1);
        }
        return lDate;
    }

    public static List<String> getBetweenDay(LocalDateTime startDay, LocalDateTime endDay, DateTimeFormatter formatter) {
        List<String> lDate = new ArrayList<>();
        while (!startDay.isAfter(endDay)) {
            lDate.add(startDay.format(formatter));
            startDay = startDay.plusDays(1);
        }
        return lDate;
    }

    public static List<String> getBetweenMonth(LocalDate startDay, LocalDate endDay, DateTimeFormatter formatter) {
        List<String> lDate = new ArrayList<>();
        while (!startDay.isAfter(endDay)) {
            lDate.add(startDay.format(formatter));
            startDay = startDay.plusMonths(1);
        }
        return lDate;
    }

    /**
     * 切割時間段
     *
     * @param dateType 类型 M/D/H/N -->每月/每天/每小時/每分鐘
     * @param start    yyyy-MM-dd HH:mm:ss
     * @param end      yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static List<String> cutDate(String dateType, String start, String end) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date dBegin = sdf.parse(start);
            Date dEnd = sdf.parse(end);
            return findDates(dateType, dBegin, dEnd);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static List<String> findDates(String dateType, Date dBegin, Date dEnd) throws Exception {
        List<String> listDate = new ArrayList<>();
        Calendar calBegin = Calendar.getInstance();
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        calEnd.setTime(dEnd);
        while (calEnd.after(calBegin)) {
            switch (dateType) {
                case "M":
                    calBegin.add(Calendar.MONTH, 1);
                    break;
                case "D":
                    calBegin.add(Calendar.DAY_OF_YEAR, 1);
                    break;
                case "H":
                    calBegin.add(Calendar.HOUR, 1);
                    break;
                case "N":
                    calBegin.add(Calendar.SECOND, 1);
                    break;
            }
            if (calEnd.after(calBegin))
                listDate.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calBegin.getTime()));
            else
                listDate.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calEnd.getTime()));
        }
        return listDate;
    }

    /**
     * 获取到当天结束还有多少毫秒
     *
     * @return
     */
    public static Long getThisDayEndTime(Long thisDay) {
        Calendar todayEnd = Calendar.getInstance();
        // Calendar.HOUR 12小时制;HOUR_OF_DAY 24小时制
        todayEnd.setTime(new Date(thisDay));
        todayEnd.set(Calendar.HOUR_OF_DAY, 24);
        todayEnd.set(Calendar.MINUTE, 00);
        todayEnd.set(Calendar.SECOND, 00);
        return todayEnd.getTimeInMillis();
    }

    public static Long getThisDayEndTimeNot24(Long thisDay) {
        Calendar todayEnd = Calendar.getInstance();
        // Calendar.HOUR 12小时制;HOUR_OF_DAY 24小时制
        todayEnd.setTime(new Date(thisDay));
        todayEnd.set(Calendar.HOUR_OF_DAY, 23);
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        return todayEnd.getTimeInMillis();
    }

    /**
     * 获取到当天结束还有多少毫秒
     *
     * @return
     */
    public static Long getThisDayStartTime(Long thisDay) {
        Calendar todayStart = Calendar.getInstance();
        // Calendar.HOUR 12小时制;HOUR_OF_DAY 24小时制
        todayStart.setTime(new Date(thisDay));
        todayStart.set(Calendar.HOUR_OF_DAY, 00);
        todayStart.set(Calendar.MINUTE, 00);
        todayStart.set(Calendar.SECOND, 00);
        todayStart.set(Calendar.MILLISECOND, 000);
        return todayStart.getTimeInMillis();
    }

    @SneakyThrows
    public static Long getTime(SimpleDateFormat sdf24, SimpleDateFormat sdf20, SimpleDateFormat sdf23, String time) {
        if (time.length() == 24) {
            return sdf24.parse(time).getTime();
        } else if (time.length() == 20) {
            return sdf20.parse(time).getTime();
        } else if (time.length() == 23) {
            return sdf23.parse(time).getTime();
        } else {
            return sdf24.parse(time).getTime();
        }
    }

    @SneakyThrows
    public static LocalDateTime getTime(DateTimeFormatter sdf24, DateTimeFormatter sdf23, DateTimeFormatter sdf20, String time) {
        if (time.length() == 24) {
            return LocalDateTime.parse(time, sdf24);
        } else if (time.length() == 20) {
            return LocalDateTime.parse(time, sdf20);
        } else if (time.length() == 23) {
            return LocalDateTime.parse(time, sdf23);
        } else {
            return LocalDateTime.parse(time, sdf24);
        }
    }

    public static Boolean isBetween(LocalTime min, LocalTime max, LocalTime time) {
        if (max.toNanoOfDay() == 0L) {
            return time.compareTo(min) != -1;
        } else {
            return time.compareTo(min) != -1 && time.compareTo(max) != 1;
        }
    }

    /**
     * 比较时间是否在min=max内
     *
     * @param min  00:00
     * @param max  24:00
     * @param time xx:xx
     * @return
     * @author DING WEI
     * @date 2022/12/13 9:05
     * @version 1.0
     */
    public static Boolean isBetween(Integer min, Integer max, Integer time) {
        return time >= min && time <= max;
    }

    public static String getDateFormat(Date date, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static String getDateFormat(Long date, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(new Date(date));
    }

    /**
     * @param
     * @Description 根据当前日期获取本季度第一天
     * @Throws
     * @Return java.util.Date
     * @Date 2021-08-31 15:37:11
     * @Author WangKun
     **/
    public static Date getCurrentQuarterStartTime() {
        Calendar c = Calendar.getInstance();
        int currentMonth = c.get(Calendar.MONTH) + 1;
        SimpleDateFormat longSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = null;
        try {
            if (currentMonth <= 3)
                c.set(Calendar.MONTH, 0);
            else if (currentMonth <= 6)
                c.set(Calendar.MONTH, 3);
            else if (currentMonth <= 9)
                c.set(Calendar.MONTH, 6);
            else if (currentMonth <= 12)
                c.set(Calendar.MONTH, 9);
            c.set(Calendar.DATE, 1);
            now = longSdf.parse(shortSdf.format(c.getTime()) + " 00:00:00");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return now;
    }

    /**
     * 算出两个时间段的所有时间集合(包括当天)
     *
     * @param startDay
     * @param endDay
     * @return
     */
    public static List<Object> getbetweenDayDateTime(Date startDay, Date endDay) {
        List<Object> lDate = new ArrayList<Object>();
        lDate.add(startDay.getTime());
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(startDay);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(endDay);
        // 测试此日期是否在指定日期之后
        while (endDay.after(calBegin.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            lDate.add(calBegin.getTime().getTime());
        }
        return lDate;
    }

    public static List<Object> getBetweenDates(Date start, Date end) {
        List<Object> result = new ArrayList<Object>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(start);
//		tempStart.add(Calendar.DAY_OF_YEAR, 1);

        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(end);
        while (tempStart.before(tempEnd)) {
            result.add(tempStart.getTime().getTime());
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }

    public static List<Object> getBetweenDatesExistEnd(Date start, Date end) {
        List<Object> result = new ArrayList<Object>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(start);
//		tempStart.add(Calendar.DAY_OF_YEAR, 1);

        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(end);
        while (tempStart.before(tempEnd) || tempStart.equals(tempEnd)) {
            result.add(tempStart.getTime().getTime());
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }

    /**
     * 获取两个日期之间的所有天数
     *
     * @param start
     * @param end
     * @param includedEnd
     * @return
     */
    public static List<String> getDaysBetweenTwoDate(Date start, Date end, boolean includedEnd) {
        String startDateStr;
        String endDateStr;
        try {
            startDateStr = DateUtil.getDateFormat(start, DATETIME_PATTENT);
            endDateStr = DateUtil.getDateFormat(end, DATETIME_PATTENT);
        } catch (Exception e) {
            e.printStackTrace();
            throw new LetsException(0, "传入的日期格式不正确，开始日期为" + start.toString() + "，结束日期为" + end.toString());
        }
        int startDate = Integer.parseInt(startDateStr.split(" ")[0].replace("-", ""));
        int endDate = Integer.parseInt(endDateStr.split(" ")[0].replace("-", ""));

        List<String> dateList = new ArrayList<>();
        int startYear = startDate / 10000;
        int startMonth = startDate % 10000 / 100;
        int startDay = startDate - startYear * 10000 - startMonth * 100;
        LocalDate startTime = LocalDate.of(startYear, startMonth, startDay);

        int endYear = endDate / 10000;
        int endMonth = endDate % 10000 / 100;
        int endDay = endDate - endYear * 10000 - endMonth * 100;
        LocalDate endTime = LocalDate.of(endYear, endMonth, endDay);
        if (includedEnd) {
            endTime = endTime.plusDays(1);
        }
        LocalDate currentDate = startTime;

        while (currentDate.isBefore(endTime)) {
            dateList.add(currentDate.format(DateTimeFormatter.ofPattern(DATE_PATTENT)));
            currentDate = currentDate.plusDays(1);
        }

        return dateList;
    }

    /**
     * 根据查询时间类型构造表头
     *
     * @param timeType
     * @param startTime
     * @param endTime
     * @param shownTitle
     * @return
     */
    public static List<String> getTitles(String timeType, int startTime, int endTime, boolean shownTitle) {
        List<String> res = new ArrayList<>();
        switch (timeType) {
            case "1":
                // 返回时间范围内的每一天日期
                res = getDatesInRange(startTime, endTime);
                break;
            case "2":
                // 返回时间范围内的每一周的天数
                res = getWeekDays(Integer.parseInt(startTime + "" + "01"));
                break;
            case "3":
                // 返回时间范围内的每一个月
                res = getMonthsInRange(startTime, endTime);
                break;
        }
        if (shownTitle) {
            if ("1".equals(timeType)) {
                List<String> tmp = new ArrayList<>();
                res.forEach(e -> tmp.add(transferDate(e)));
                res = tmp;
            } else if ("3".equals(timeType)) {
                List<String> tmp = new ArrayList<>();
                res.forEach(e -> tmp.add(transferMonth(e)));
                res = tmp;
            }

        }
        return res;
    }

    /**
     * 获取两个指定时间范围内的每一天
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static List<String> getDatesInRange(int startDate, int endDate) {
        List<String> dateList = new ArrayList<>();
        int startYear = startDate / 10000;
        int startMonth = startDate % 10000 / 100;
        int startDay = startDate - startYear * 10000 - startMonth * 100;
        LocalDate startTime = LocalDate.of(startYear, startMonth, startDay);

        int endYear = endDate / 10000;
        int endMonth = endDate % 10000 / 100;
        int endDay = endDate - endYear * 10000 - endMonth * 100;
        LocalDate endTime = LocalDate.of(endYear, endMonth, endDay);
        endTime = endTime.plusDays(1);
        LocalDate currentDate = startTime;

        while (currentDate.isBefore(endTime)) {
            dateList.add(currentDate.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            currentDate = currentDate.plusDays(1);
        }

        return dateList;
    }

    /**
     * 获取指定月份这一周的数据情况, 如202301，则代表获取2023年1月的每周所有的天数
     *
     * @param targetDate
     * @return
     */
    public static List<String> getWeekDays(int targetDate) {
        SimpleDateFormat format = new SimpleDateFormat("MM-dd");
        List<String> res = new LinkedList<>();
        Calendar cal = Calendar.getInstance();
        cal.setTime(strToDate(String.valueOf(targetDate), YYYYMMDD_PATTERN));
        // 1月从0开始
        int count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        StringBuilder sb = new StringBuilder();
        String firstDayInThisWeek = "";
        int i = 1;
        for (int j = 1; j <= count; j++) {
            int w = (week + j - 2) % 7;
            // 判断日期是不是一周的第一天 如果是的话则拼接
            if (StringUtils.isBlank(firstDayInThisWeek)) {
                sb.append(getChinese(i)).append("(").append(format.format(cal.getTime())).append("~");
                firstDayInThisWeek = format.format(cal.getTime());
            }
            if (w == 0 || j == count) {
                firstDayInThisWeek = "";
                sb.append(format.format(cal.getTime())).append(")");
                res.add(sb.toString());
                sb = new StringBuilder();
                i++;
            }
            cal.add(Calendar.DAY_OF_YEAR, 1);
        }
        return res;
    }

    public static String getChinese(int i) {
        switch (i) {
            case 1:
                return "第一周";
            case 2:
                return "第二周";
            case 3:
                return "第三周";
            case 4:
                return "第四周";
            case 5:
                return "第五周";
            case 6:
                return "第六周";
        }
        return "未知周数";
    }

    /**
     * 获取两个指定范围内的每一个月份
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static List<String> getMonthsInRange(int startDate, int endDate) {
        List<String> months = new ArrayList<>();

        int yearStart = startDate / 10000;
        int monthStart = startDate % 10000 / 100;

        int yearEnd = endDate / 10000;
        int monthEnd = endDate % 10000 / 100;

        int smallestMonth = yearStart < yearEnd ? monthStart : Math.min(monthStart, monthEnd);

        for (int year = yearStart; year <= yearEnd; year++) {
            if (year != yearStart) {
                monthStart = 1;
                smallestMonth = monthStart;
            }
            for (int month = smallestMonth; (month <= Math.max(monthStart, monthEnd) || (year != yearEnd && month <= 12)); month++) {
                months.add(String.format("%d%02d", year, month));

                if (month == 12) {
                    break;
                }
            }
            if (year == yearEnd) {
                break;
            }
        }

        return months;
    }

    /**
     * 获取指定月份的天数map 传参为月份的1号
     *
     * @param month
     * @return
     */
    public static Map<String, String> getWeek(String month) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Map<String, String> result = new LinkedHashMap<>();
        Calendar cal = Calendar.getInstance();
        cal.setTime(strToDate(month, YYYYMMDD_PATTERN));
        // 1月从0开始
        int count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        int i = 1;
        for (int j = 1; j <= count; j++) {
            int w = (week + j - 2) % 7;
            result.put(format.format(cal.getTime()), getChinese(i));
            cal.add(Calendar.DAY_OF_YEAR, 1);
            if (w == 0) {
                i++;
            }
        }
        return result;
    }

    public static String transferMonth(String tmpStr) {
        return tmpStr.substring(0, 4) + "-" + tmpStr.substring(4, 6);
    }

    /**
     * 把20231101 --> 2023-11-01
     *
     * @param tmpStr
     * @return
     */
    public static String transferDate(String tmpStr) {
        return tmpStr.substring(0, 4) + "-" + tmpStr.substring(4, 6) + "-" + tmpStr.substring(6, 8);
    }

    /**
     * 获取指定日期的上一天 date格式为20240706...
     * @param date
     * @return
     */
    public static String getTargetDateBeforeDate(String date) {
        if (date.length() != 8 || ValidByRegUtil.isByReg(date, YYYYMMDD_PATTERN)) {
            throw new LetsException(0, "日期格式不规范,无法获取前一天");
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(strToDate(date, YYYYMMDD_PATTERN));
        cal.add(Calendar.DAY_OF_YEAR, -1);
        return format.format(cal.getTime());
    }

    /**
     * 获取指定日期的后一天 date格式为20240706...
     * @param date
     * @return
     */
    public static String getTargetDateAfterDate(String date) {
        if (date.length() != 8 || ValidByRegUtil.isByReg(date, YYYYMMDD_PATTERN)) {
            throw new LetsException(0, "日期格式不规范,无法获取后一天");
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(strToDate(date, YYYYMMDD_PATTERN));
        cal.add(Calendar.DAY_OF_YEAR, 1);
        return format.format(cal.getTime());
    }

    /**
     * @param
     * @Description 获取前一天, 前一周,前一月,前一季度,前一年 开始时间
     * @Throws
     * @Return java.util.Date
     **/
    public static Date getPastStartTime(int type) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        switch (type) {
            case 1:
                c.setTime(new Date());
                c.add(Calendar.DATE, -1);
                break;
            case 2:
                Date mondayZeroTimes = getMondayZeroTimes();
                c.setTime(mondayZeroTimes);
                c.add(Calendar.DATE, -7);
                break;
            case 3:
                Date monthStartZeroTimes = getMonthStartZeroTimes();
                c.setTime(monthStartZeroTimes);
                c.add(Calendar.MONTH, -1);
                break;
            case 4:
                Date currentQuarterStartTime = getCurrentQuarterStartTime();
                c.setTime(currentQuarterStartTime);
                c.add(Calendar.MONTH, -3);
                break;
            case 5:
                Date currYearFirst = getCurrYearFirst();
                c.setTime(currYearFirst);
                c.add(Calendar.YEAR, -1);
                break;
        }
        Date d = c.getTime();
        return d;
    }

    /**
     * @param
     * @Description 获取前一周, 前一月, 前一季度, 前一年 结束时间
     * @Throws
     * @Return java.util.Date
     **/
    public static Date getPastEndTime(int type) {
        Calendar c = Calendar.getInstance();
        switch (type) {
            case 1:
                Date pastStartTime = getPastStartTime(2);
                c.setTime(pastStartTime);
                break;
            case 2:
                Date startTimeWeek = getPastStartTime(2);
                c.setTime(startTimeWeek);
                //指定日期月份减去一
                c.add(Calendar.DATE, 6);
                break;
            case 3:
                //指定日期月份减去一
                c.add(Calendar.MONTH, -1);
                //指定日期月份减去一后的 最大天数
                c.set(Calendar.DATE, c.getActualMaximum(Calendar.DATE));
                break;
            case 4:
                Date startTime = getPastStartTime(4);
                DateTime dateTime = cn.hutool.core.date.DateUtil.endOfQuarter(startTime);
                c.setTime(dateTime);
                break;
            case 5:
                Date startTimeYear = getPastStartTime(5);
                c.setTime(startTimeYear);
                int year = c.get(Calendar.YEAR);
                Date yearLast = getYearLast(year);
                c.setTime(yearLast);
                break;
            default:
                break;
        }
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        c.set(Calendar.MILLISECOND, 59);
        Date d = c.getTime();
        return d;
    }

    public static Date firstDayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 0);
        //设置为1号,当前日期既为本月第一天
        cal.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        cal.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        cal.set(Calendar.MINUTE, 0);
        //将秒至0
        cal.set(Calendar.SECOND, 0);
        //将毫秒至0
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date nextMonthFirstDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 1);
        //设置为1号,当前日期既为本月第一天
        cal.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        cal.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        cal.set(Calendar.MINUTE, 0);
        //将秒至0
        cal.set(Calendar.SECOND, 0);
        //将毫秒至0
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date lastDayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.roll(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }

    public static Date lastDayOfMonth2(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int value = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, value);
        return cal.getTime();
    }

    public static Date lastDayOfMonth3(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    /**
     * 获取某月的最后一天
     */
    public static Date getLastDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR, year);
        //设置月份
        cal.set(Calendar.MONTH, month);
        //获取当月最小值
        int lastDay = cal.getMinimum(Calendar.DAY_OF_MONTH);
        //设置日历中的月份，当月+1月-1天=当月最后一天
        cal.set(Calendar.DAY_OF_MONTH, lastDay - 1);
        //格式化日期
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String lastDayOfMonth = sdf.format(cal.getTime());
        return cal.getTime();
    }

    /**
     * 获取时间之前的连续7天时间
     *
     * @param format
     * @param time
     * @return
     * @author DING WEI
     * @date 2022/4/25 8:24
     * @version 1.0
     */
    public static List<String> getBeforeSevenDay(String format, Long time) {
        List<String> dataList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar c = null;
        for (int i = 0; i < 7; i++) {
            c = Calendar.getInstance();
            c.setTime(new Date(time));
            c.add(Calendar.DAY_OF_YEAR, -i);
            dataList.add(sdf.format(c.getTime()));
        }
        Collections.reverse(dataList);
        return dataList;
    }

    public static List<Integer> getBeforeSevenDayAsInteger(String format, Date time) {
        List<Integer> dataList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar c = null;
        for (int i = 0; i < 7; i++) {
            c = Calendar.getInstance();
            c.setTime(time);
            c.add(Calendar.DAY_OF_YEAR, -i);
            dataList.add(Integer.parseInt(sdf.format(c.getTime())));
        }
        Collections.reverse(dataList);
        return dataList;
    }

    public static void main(String[] args) {
//		Date pastStartTime = getPastEndTime(1);
//		String s = dateToStrLong(pastStartTime);
//		System.out.println(s);
//
//		Date date = firstDayOfMonth(new Date());
//		System.out.println(date);
//		Date date1 = nextMonthFirstDay(date);
//		System.out.println(date1);
//
//		List<String> beforeSevenDay = getBeforeSevenDay("yyyy/MM/dd", 1651393078000L);
//		System.out.println(beforeSevenDay);
//
//		Long thisDayEndTime = getThisDayEndTime(1653363814000L);
//		Long thisDayEndTime1 = getThisDayEndTime(1653408000999L);
//		System.out.println(thisDayEndTime1 - thisDayEndTime);
//
//		List<String> betweenDay = getBetweenDay(date, date1);
//		System.out.println(betweenDay);
//        Date date = DateUtil.strToDate(2023 + "-" + 03 + "-01");
//        Date lastDayOfMonth = lastDayOfMonth3(date);
//        System.out.println(lastDayOfMonth.getTime());
        // 定义星期几到“周几”的映射
//        Map<DayOfWeek, String> weekdayMap = new HashMap<>();
//        weekdayMap.put(DayOfWeek.MONDAY, "周一");
//        weekdayMap.put(DayOfWeek.TUESDAY, "周二");
//        weekdayMap.put(DayOfWeek.WEDNESDAY, "周三");
//        weekdayMap.put(DayOfWeek.THURSDAY, "周四");
//        weekdayMap.put(DayOfWeek.FRIDAY, "周五");
//        weekdayMap.put(DayOfWeek.SATURDAY, "周六");
//        weekdayMap.put(DayOfWeek.SUNDAY, "周日");
//        LocalDate date1 = LocalDate.parse("2024-11-29", DateTimeFormatter.ISO_DATE);
//        DayOfWeek dayOfWeek = date1.getDayOfWeek();
//        String weekday = weekdayMap.get(dayOfWeek);
//
//        Date start = new Date();
//        start.setTime(1735660800000L);
//        Date end = new Date();
//        end.setTime(1736524799000L);
//
//        List<String> d = new ArrayList<>();
//        try {
//            d = findDates("D", start, end);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(d);

//        List<String> betweenDay = getBetweenDay(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 9), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        System.out.println(betweenDay);

        LocalDate startDate = LocalDate.of(2025, 4, 30);
        System.out.println(formatWeekInMonth(Boolean.TRUE, startDate, null, null));

//        LocalDate endDate = LocalDate.of(2025, 7, 6);
//        System.out.println(getGroup(startDate, endDate, "2",  Boolean.TRUE,null, null));
//        System.out.println(getGroup(startDate, endDate, "2"));
//        System.out.println(getGroup(startDate, endDate, "3"));


        // 示例数据
        LocalDateTime startTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.of(9, 0));   // 班制开始 09:00
        LocalDateTime endTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.of(18, 0));     // 班制结束 18:00

        LocalDateTime startTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.of(8, 0));     // 实际运行开始 08:00
        LocalDateTime endTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.of(20, 0));      // 实际运行结束 20:00

        long difference = calculateDifference(startTime1, endTime1, startTime2, endTime2);
        System.out.println("不在班制时间内的毫秒数：" + difference/1000/60/60);

    }

    public static int changeDate2Int(Date time) {
        String format = "";
        try {
            format = cn.hutool.core.date.DateUtil.format(time, DATE_PATTENT);
        } catch (Exception e) {
            e.printStackTrace();
            throw new LetsException(0, "日期格式化失败，传入日期为:" + time);
        }

        return Integer.parseInt(format.replace("-", ""));
    }

    /**
     * 纠正时间字符串格式，统一修改成yyyy-MM-dd HH:mm:ss
     * @author DING WEI
     * @date 2025/1/11 11:52
     * @version 1.0
     */
    public static StringBuilder timeFormatCorrect(String timeStr) {
        StringBuilder timeStrBuild = new StringBuilder();
        if (StrUtil.isNotBlank(timeStr)) {
            String[] subDateAndTime = timeStr.split(" ");
            if (subDateAndTime.length == 2) {
                String subDateStr = subDateAndTime[0];
                if (StrUtil.isNotBlank(subDateStr)) {
                    String[] dateArr = null;
                    if (subDateStr.contains("/")) {
                        dateArr = subDateStr.split("/");
                    } else if (subDateStr.contains("-")) {
                        dateArr = subDateStr.split("-");
                    }
                    if (Objects.nonNull(dateArr) && dateArr.length == 3) {
                        timeStrBuild.append(dateArr[0]).append("-");
                        timeStrBuild.append(dateArr[1].length() == 1 ? "0" + dateArr[1] : dateArr[1]).append("-");
                        timeStrBuild.append(dateArr[2].length() == 1 ? "0" + dateArr[2] : dateArr[2]);
                    }
                }
                timeStrBuild.append(" ");
                String subTimeStr = subDateAndTime[1];
                if (StrUtil.isNotBlank(subTimeStr)) {
                    String[] timeArr = subTimeStr.split(":");
                    if (timeArr.length == 3) {
                        timeStrBuild.append(timeArr[0].length() == 1 ? "0" + timeArr[0] : timeArr[0]).append(":");
                        timeStrBuild.append(timeArr[1].length() == 1 ? "0" + timeArr[1] : timeArr[1]).append(":");
                        timeStrBuild.append(timeArr[2].length() == 1 ? "0" + timeArr[2] : timeArr[2]);
                    }
                }
            }
        }
        return timeStrBuild;
    }


    /**
     * 将20250114 ==> 2025-01-14
     * @param timeStr
     * @return
     */
    public static String changeInt2YYYY_MM_DD(String timeStr) {
        if (timeStr.length() != 8) {
            return "";
        }

        return LocalDate.of(Integer.parseInt(timeStr.substring(0, 4)),
                Integer.parseInt(timeStr.substring(4, 6)),
                Integer.parseInt(timeStr.substring(6, 8))).toString();
    }

    /**
     * 获取当前日期在当前月的“整周”编号（从每月第一个完整周开始计算）
     * 示例：2025-06-01 → 上个月的第4周，2025-06-02 → 6月第1周
     * @return 当前月的周数（1~6）
     */
    public static int getWeekOfMonth(LocalDate date) {
        // 获取当月第一天
        LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
        // 找到当月第一个完整周的周一（如果1号不是周一，则从下一个周一开始计算）
        LocalDate firstMondayOfMonth = firstDayOfMonth;
        if (firstDayOfMonth.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstMondayOfMonth = firstDayOfMonth.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        // 如果当前日期在第一个完整周之前，则属于上个月的周
        if (date.isBefore(firstMondayOfMonth)) {
            return 0; // 0 表示属于上个月的周
        }
        // 计算当前日期与第一个完整周周一的天数差，除以7得到周数
        long weeks = (date.toEpochDay() - firstMondayOfMonth.toEpochDay()) / 7 + 1;
        return (int) weeks;
    }
    // 辅助方法：获取当月第一个完整周的周一
    private static LocalDate getFirstMondayOfMonth(LocalDate date) {
        LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
        return (firstDay.getDayOfWeek() == DayOfWeek.MONDAY) ? firstDay : firstDay.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    }
    public static String formatWeekInMonth(Boolean calendarWeek, LocalDate date, List<LocalDate> startDateList, List<LocalDate> endDateList) {
        if (Objects.isNull(calendarWeek) || !calendarWeek) {
            // 获取当月的第一天
            LocalDate firstDayOfMonth = date.withDayOfMonth(1);
            // 获取该月第一天所在的周的周一
            LocalDate firstMondayOfMonth = firstDayOfMonth.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
            // 计算当前日期在本月中的第几周：当前日期 - 第一个周一 + 7 天后除以 7
            long daysFromFirstMonday = ChronoUnit.DAYS.between(firstMondayOfMonth, date);
            int weekNumber = (int) ((daysFromFirstMonday + 7) / 7);
            // 找出当前周的周一和周日
            LocalDate startOfWeek = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
            LocalDate endOfWeek = startOfWeek.plusDays(6); // 周日
            // 截断 endOfWeek 到当月最后一天
            LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
            if (endOfWeek.isAfter(lastDayOfMonth)) {
                endOfWeek = lastDayOfMonth;
            }
            // 如果 startOfWeek 在上个月，调整为当月1号
            if (startOfWeek.isBefore(firstDayOfMonth)) {
                startOfWeek = firstDayOfMonth;
            }
            if (Objects.nonNull(startDateList)) {
                startDateList.add(startOfWeek);
            }
            if (Objects.nonNull(endDateList)) {
                endDateList.add(endOfWeek);
            }
            return String.format("第%d周(%s-%s)",
                    weekNumber,
                    startOfWeek.format(dd),
                    endOfWeek.format(dd));
        } else {
            // 1. 找到当月第一个完整周的周一
            LocalDate firstMondayOfMonth = getFirstMondayOfMonth(date);
            // 2. 如果当前日期在第一个完整周之前，返回上个月的周（但按需求应属于当前月第0周）
            if (date.isBefore(firstMondayOfMonth)) {
                LocalDate lastMonday = firstMondayOfMonth.minusWeeks(1);
                return String.format("第1周(%s-%s)", lastMonday.format(dd), lastMonday.plusDays(6).format(dd));
            }
            // 3. 计算当前日期是第几周
            int weekNumber = (int) ((date.toEpochDay() - firstMondayOfMonth.toEpochDay()) / 7) + 1;
            // 4. 获取当前周的周一和周日
            LocalDate weekStart = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
            LocalDate weekEnd = weekStart.plusDays(6);
            if (Objects.nonNull(startDateList)) {
                startDateList.add(weekStart);
            }
            if (Objects.nonNull(endDateList)) {
                endDateList.add(weekEnd);
            }
            return String.format("第%d周(%s-%s)", weekNumber, weekStart.format(dd), weekEnd.format(dd));
        }
    }

    public static List<String> getGroup(LocalDate startDate, LocalDate endData,
                                        String selectType, Boolean calendarWeek,
                                        List<LocalDate> startDateList, List<LocalDate> endDateList) {
        List<String> groupList = new ArrayList<>();
        if (Objects.nonNull(startDate) && Objects.nonNull(endData)) {
            if ("1".equals(selectType)) {
                // 按天分组
                while (startDate.isBefore(endData) || startDate.isEqual(endData)) {
                    startDateList.add(startDate);
                    endDateList.add(startDate);
                    groupList.add(startDate.format(MMdd));
                    startDate = startDate.plusDays(1);
                }
            } else if ("2".equals(selectType)) {
                // 按周分组
                while (startDate.isBefore(endData) || startDate.isEqual(endData)) {
                    groupList.add(formatWeekInMonth(calendarWeek, startDate, startDateList, endDateList));
                    startDate = startDate.plusWeeks(1);
                }
            } else if ("3".equals(selectType)) {
                // 按月分组
                while (startDate.isBefore(endData) || startDate.isEqual(endData)) {
                    String format = startDate.format(yyyyMM_4);
                    groupList.add(format);
                    String start = format.replace("年", "-").replace("月", "-01");
                    startDateList.add(LocalDate.parse(start, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    endDateList.add(LocalDate.of(startDate.getYear(), startDate.getMonth(), 1)
                            .plusMonths(1)
                            .minusDays(1));
                    startDate = startDate.plusMonths(1);
                }
            }
        }
        return groupList;
    }

    public static long calculateDifference(LocalDateTime startTime1, LocalDateTime endTime1,
                                           LocalDateTime startTime2, LocalDateTime endTime2) {
        // 如果没有交集，则整个 [startTime2, endTime2] 都是差集
        if (endTime2.isBefore(startTime1) || startTime2.isAfter(endTime1)) {
            return Duration.between(startTime2, endTime2).toMillis();
        }
        // 如果完全包含在班制时间内，则差集为0
        if (!startTime2.isBefore(startTime1) && !endTime2.isAfter(endTime1)) {
            return 0;
        }
        long diff = 0;
        // 前半段：startTime2 到 startTime1
        if (startTime2.isBefore(startTime1)) {
            diff += Duration.between(startTime2, startTime1).toMillis();
        }
        // 后半段：endTime1 到 endTime2
        if (endTime2.isAfter(endTime1)) {
            diff += Duration.between(endTime1, endTime2).toMillis();
        }
        log.info("实际时间{}-{}，班次：{}-{}，计划外时间：{}秒", startTime2, endTime2, startTime1, endTime1, diff/1000);
        return diff;
    }

    public static long calculateNonOverlappingMillis(LocalTime startTime1, LocalTime endTime1,
                                                     LocalTime startTime2, LocalTime endTime2) {
        // 确保所有时间点都是按顺序的
        if (!endTime1.isBefore(startTime1) && !endTime2.isBefore(startTime2)) {
            // 情况1：完全不重叠（时间段2在时间段1之前）
            if (endTime2.compareTo(startTime1) <= 0) {
                return ChronoUnit.MILLIS.between(startTime2, endTime2);
            }
            // 情况1：完全不重叠（时间段2在时间段1之后）
            if (startTime2.compareTo(endTime1) >= 0) {
                return ChronoUnit.MILLIS.between(startTime2, endTime2);
            }
            // 情况3：时间段2完全包含在时间段1内
            if (startTime2.compareTo(startTime1) >= 0 && endTime2.compareTo(endTime1) <= 0) {
                return 0;
            }
            // 情况2：部分重叠
            long totalMillis = ChronoUnit.MILLIS.between(startTime2, endTime2);
            long overlapMillis = 0;
            // 计算重叠部分
            LocalTime overlapStart = startTime2.isBefore(startTime1) ? startTime1 : startTime2;
            LocalTime overlapEnd = endTime2.isAfter(endTime1) ? endTime1 : endTime2;
            if (overlapStart.isBefore(overlapEnd)) {
                overlapMillis = ChronoUnit.MILLIS.between(overlapStart, overlapEnd);
            }
            return totalMillis - overlapMillis;
        }
        return 0L;
    }
}
