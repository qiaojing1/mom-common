package com.lets.platform.model.tpm.utils;

import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.ExceptionEnums;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

/**
 * @ClassName: DateUtil
 * @Description: 日期操作工具类
 * @version 1.0 创建时间: 2017年8月24日 下午2:47:28
 *
 */
@Slf4j
public class TpmDateUtil {

	public static final String TIME_PATTERN = "HH:mm:ss";
	public static final String TIME_PATTERN1 = "HH:mm";

	public static final String MONTH_PATTERN = "MM-dd HH:mm:ss";

	public static final String DATE_PATTENT = "yyyy-MM-dd";

	public static final String DATETIME_PATTENT = "yyyy-MM-dd HH:mm:ss";

	public static final String YEAR_MONTH_PATTENT = "yyyy-MM";

	public static final String YYYYMMDD_PATTERN = "yyyyMMdd";

	public static final String MMDD_PATTERN = "MM-dd";

	public static final String YYYYMMDDHHMMSS_PATTERN = "yyyyMMddHHmmss";

	public static final String DATE_SHORTTIME_PATTENT = "yyyy-MM-dd HH:mm";

	public static final String DATE_PATTENT_YMD = "yyyy年MM月dd日";

	private TpmDateUtil() {
	}

	/***
	 *
	 * @param date 时间对象
	 * @param pattern 匹配模式
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

	/**
	 * 检查日期
	 * @param startDate
	 * @param endDate
	 * @return
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

	public static String getDateFormat(Date date, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.format(date);
	}

	public static String getDateFormat(Long date, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.format(new Date(date));
	}

	/**
	 * 获取现在时间
	 * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
	 */
	public static String getStringDate() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(DATETIME_PATTENT);
		return formatter.format(currentTime);
	}

	/**
	 * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
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
	 * @param dateDate
	 * @return
	 */
	public static String dateToStrLong(Date dateDate) {
		SimpleDateFormat formatter = new SimpleDateFormat(DATETIME_PATTENT);
		return formatter.format(dateDate);
	}

	/**
	 * 将长时间格式时间转换为字符串 yyyy-MM
	 * @param dateDate
	 * @return
	 */
	public static String dateToShortStr(Date dateDate) {
		SimpleDateFormat formatter = new SimpleDateFormat(YEAR_MONTH_PATTENT);
		return formatter.format(dateDate);
	}

	/**
	 * 将短时间格式时间转换为字符串 yyyy-MM-dd
	 * @param dateDate
	 * @return
	 */
	public static String dateToStr(Date dateDate) {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTENT);
		return formatter.format(dateDate);
	}

	/**
	 * 将短时间格式字符串转换为时间 yyyy-MM-dd
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
	 * @param strDate
	 * @param pattent
	 * @return
	 */
	public static Date strToDate(String strDate, String pattent) {
		SimpleDateFormat formatter = new SimpleDateFormat(pattent);
		ParsePosition pos = new ParsePosition(0);
		return formatter.parse(strDate, pos);
	}

	public static Long strToLong(String strDate, String pattent) {
		SimpleDateFormat formatter = new SimpleDateFormat(pattent);
		ParsePosition pos = new ParsePosition(0);
		return formatter.parse(strDate, pos).getTime();
	}

	/**
	 * 获得当天零点时间
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

	public static Date getLastDay4Month(Date date) {
		Calendar cale = Calendar.getInstance();
		if (date != null) {
			cale.setTime(date);
		}
		cale.add(Calendar.MONTH, 1);
		cale.set(Calendar.DAY_OF_MONTH, 0);
		Date time = cale.getTime();
		return time;
	}

	public static String getLastDay4Month(Date date, String format) {
		return getDateFormat(getLastDay4Month(date), format);
	}

	public static String getLastDay4Month(Long date, String format) {
		return getDateFormat(getLastDay4Month(new Date(date)), format);
	}

	/**
	 * 获得昨天零点时间
	 * @return
	 */
	public static Date getYesterdayZeroTimes() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(org.apache.commons.lang3.time.DateUtils.addDays(getTodayZeroTimes(), -1));
		return cal.getTime();
	}

	public static Date getYesterday() {
		LocalDate localDate = LocalDate.now().plusDays(-1);
		Date yesterday = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		return yesterday;
	}

	public static Integer getDaysBetween(Date from, Date to) {
		if (from != null && to != null) {
			Long fromTime = from.getTime();
			Long toTime = to.getTime();
			if (fromTime <= toTime) {
				Long between = toTime - fromTime;
				Long result = between / (GlobalConstant.MILLISECOND_OF_ONE_DAY);
				return Integer.parseInt(result.toString());
			}
		}
		return GlobalConstant.ZERO;
	}

	public static Date addDays(Date date, int days) {
		if (date != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_YEAR, days);
			return calendar.getTime();
		}
		return null;
	}

	public static Date addWeeks(Date date, int weeks) {
		if (date != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_WEEK, weeks);
			return calendar.getTime();
		}
		return null;
	}

	public static Date addMonths(Date date, int months) {
		if (date != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.MONTH, months);
			return calendar.getTime();
		}
		return null;
	}

	/**
	 * 获得明天零点时间
	 * @return
	 */
	public static Date getTomorrowZeroTimes() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(org.apache.commons.lang3.time.DateUtils.addDays(getTodayZeroTimes(), 1));
		return cal.getTime();
	}

	/**
	 * 获得指定天数的那天零点时间
	 * @return
	 */
	public static Date getSpecifyZeroTimes(int num) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(org.apache.commons.lang3.time.DateUtils.addDays(getTodayZeroTimes(), num));
		return cal.getTime();
	}

	/**
	 * 获得本周一零点时间
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
	 * 获得本周日24点时间
	 * @return
	 */
	public static Date getSunday24HTimes() {
		Calendar cal = Calendar.getInstance();
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.setTime(getTodayZeroTimes());
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		cal.setTime(org.apache.commons.lang3.time.DateUtils.addDays(cal.getTime(), 1));
		return cal.getTime();
	}

	/**
	 * 获得本月一号零点时间
	 * @return
	 */
	public static Date getMonthStartZeroTimes() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getTodayZeroTimes());
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		return cal.getTime();
	}

	/**
	 * 获得本月最后一天24点时间
	 * @return
	 */
	public static Date getMonthEndTimes() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getTodayZeroTimes());
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		cal.setTime(org.apache.commons.lang3.time.DateUtils.addDays(cal.getTime(), 1));
		return cal.getTime();
	}

	/**
	 * 获得指定时间的第二天零点
	 * @param milliSecond
	 * @return
	 */
	public static long getNextDayZeroTime(long milliSecond) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(milliSecond);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.setTime(org.apache.commons.lang3.time.DateUtils.addDays(cal.getTime(), 1));
		return cal.getTimeInMillis();
	}

	/**
	 * 获取当年的第一天
	 * @param
	 * @return
	 */
	public static Date getCurrYearFirst() {
		Calendar currCal = Calendar.getInstance();
		int currentYear = currCal.get(Calendar.YEAR);
		return getYearFirst(currentYear);
	}

	/**
	 * 获取当年的最后一天
	 * @param
	 * @return
	 */
	public static Date getCurrYearLast() {
		Calendar currCal = Calendar.getInstance();
		int currentYear = currCal.get(Calendar.YEAR);
		return getYearLast(currentYear);
	}

	/**
	 * 获取某年第一天日期
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
	 * 获取指定日期的星期数
	 * @param date
	 * @return [1,7]
	 * @Author DING WEI
	 * @Date 2021/2/19 9:18
	 * @Version 1.0
	 **/
	public static Integer getIndexOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int w = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (w == 0) {
			w = 7;
		}
		return w;
	}

	/**
	 * 获取某天七天前从0点开始的时间
	 * @return Date
	 */
	public static Date getStartTime(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - 6);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 获取某天23:59:59时间
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

	public static Long getEndTime(Long date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date(date));
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime().getTime();
	}

	/**
	 * 获取当前日期 指定相差天数的天 days为相差天数 -为之前多少天
	 */
	public static String getDaysBefore(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		date = calendar.getTime();
		return formatDate(date, "yyyy-MM-dd");
	}

	/**
	 * 描述：日期格式化
	 *
	 * @param date    日期
	 * @param pattern 格式化类型
	 * @return
	 */
	public static String formatDate(Date date, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}

	/**
	 * 获取某天0:0:0时间
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

	public static Long getOpenTime(Long date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date(date));
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime().getTime();
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
	 * @param startDay
	 * @param endDay
	 * @return
	 */
	public static List<String> getbetweenDay(Date startDay, Date endDay, String format) {
		List<String> lDate = new ArrayList<>();
		SimpleDateFormat sd = new SimpleDateFormat(format);
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

	/**
	 * 算出两个时间段的所有时间集合(包括当天)
	 * @param startDay
	 * @param endDay
	 * @return
	 */
	public static List<String> getbetweenDay(Date startDay, Date endDay) {
		List<String> lDate = new ArrayList<>();
		SimpleDateFormat sd = new SimpleDateFormat(DATE_PATTENT);
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

	/**
	 * 将时长转化为时分秒
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
			return days + "天" + hours + "小时" + minutes + "分";
		} else if (hours > 0) {
			return hours + "小时" + minutes + "分" + second + "秒";
		} else if (minutes > 0) {
			return minutes + "分" + second + "秒";
		} else {
			return second + "秒";
		}
	}

	public static String timeToMD(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat(MMDD_PATTERN);
		return formatter.format(date);
	}

	public static Date stringToDate(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat(YYYYMMDD_PATTERN);
		ParsePosition pos = new ParsePosition(0);
		return formatter.parse(strDate, pos);
	}

	/**
	 * 将长时间格式字符串转换为时间
	 * @param strDate
	 * @return
	 */
	public static Date strToDateForFormatter(String strDate, String pattent) {
		SimpleDateFormat formatter = new SimpleDateFormat(pattent);
		ParsePosition pos = new ParsePosition(0);
		return formatter.parse(strDate, pos);
	}

	/**
	 * 获取yyyy-MM这样日期第一天的0点
	 * @param date
	 * @return
	 */
	public static Date getOpenTimeForMonth(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat(YEAR_MONTH_PATTENT);
		ParsePosition pos = new ParsePosition(0);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(formatter.parse(date, pos));
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		return calendar.getTime();
	}

	/**
	 * 获取yyyy-MM这样日期最后一天的23点
	 * @param date
	 * @return
	 */
	public static Date getEndTimeForMonth(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat(YEAR_MONTH_PATTENT);
		ParsePosition pos = new ParsePosition(0);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(formatter.parse(date, pos));
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return calendar.getTime();
	}

	/**
	 * 获取月的最后一天日期
	 * @return
	 */
	public static Date getCurrentMonthLast(Date date) {
		Calendar cale = Calendar.getInstance();
		cale.setTime(date);
		cale.add(Calendar.MONTH, 1);
		cale.set(Calendar.DAY_OF_MONTH, 0);
		return cale.getTime();
	}

	/**
	 * 获取月的第一天日期
	 * @return
	 */
	public static Date getMonthFirst(Date date) {
		Calendar cale = Calendar.getInstance();
		cale.setTime(date);
		cale.add(Calendar.MONTH, 0);
		cale.set(Calendar.DAY_OF_MONTH, 1);
		return cale.getTime();
	}

	/**
	 * 根据日期获取当天是周几
	 * @param datetime 日期
	 * @return 周几
	 */
	public static String dateToWeek(String datetime) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTENT);
		String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
		Calendar cal = Calendar.getInstance();
		Date date;
		try {
			date = sdf.parse(datetime);
			cal.setTime(date);
		} catch (ParseException e) {
			log.error("失败", e.getMessage());
		}
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		return weekDays[w];
	}

	/**
	 * 根据日期获取当天是周几
	 * @param datetime 日期
	 * @return 周几
	 */
	public static String dateToWeekNum(String datetime) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTENT);
		String[] weekDays = {"1", "2", "3", "4", "5", "6", "7"};
		Calendar cal = Calendar.getInstance();
		Date date;
		try {
			date = sdf.parse(datetime);
			cal.setTime(date);
		} catch (ParseException e) {
			log.error("失败", e.getMessage());
		}
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		return weekDays[w];
	}

	/**
	 * 输出String类型的明天
	 * @return
	 */
	public static String tomorrow() {
		try {
			// 取时间
			Date date = new Date();
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			// 1表示明天,-1表示昨天
			calendar.add(Calendar.DATE, 1);
			// 这个时间就是明天
			date = calendar.getTime();
			return dateToString(date, DATE_PATTENT);
		} catch (Exception e) {
			log.error("失败", e.getMessage());
			ServiceAssert.getThrow(ExceptionEnums.EXCEPTION_20011);
		}
		return null;
	}

	/**
	 * 输出long类型的明天
	 * @return
	 */
	public static Long tomorrowLong() {
		try {
			// 取时间
			Date date = new Date();
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			// 1表示明天,-1表示昨天
			calendar.add(Calendar.DATE, 1);
			// 这个时间就是明天
			date = calendar.getTime();
			return date.getTime();
		} catch (Exception e) {
			log.error("失败", e.getMessage());
			ServiceAssert.getThrow(ExceptionEnums.EXCEPTION_20011);
		}
		return null;
	}

	public static int getHour(String timeString) {
		if (!StringUtils.isEmpty(timeString)) {
			String timeStr = convertDateString(parseTimeStringDate(timeString), TIME_PATTERN1);
			if(!StringUtils.isEmpty(timeStr)) {
				return Integer.parseInt(timeStr.substring(0, 2));
			}
		}
		return GlobalConstant.ZERO;
	}

	public static int getMinute(String timeString) {
		if (!StringUtils.isEmpty(timeString)) {
			String timeStr = convertDateString(parseTimeStringDate(timeString), TIME_PATTERN1);
			if (!StringUtils.isEmpty(timeStr)) {
				return Integer.parseInt(timeStr.substring(3, 5));
			}
		}
		return GlobalConstant.ZERO;
	}

	public static int getSecond(String timeString) {
		if (!StringUtils.isEmpty(timeString)) {
			String timeStr = convertDateString(parseTimeStringDate(timeString), TIME_PATTERN);
			if(!StringUtils.isEmpty(timeStr)) {
				return Integer.parseInt(timeStr.substring(6, 8));
			}
		}
		return GlobalConstant.ZERO;
	}

	public static Date parseTimeStringDate(String timeString) {
		/*if (StringUtils.isEmpty(timeString)) {
			return null;
		}*/
		Date date = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat(TIME_PATTERN1);
			date = new Date(dateFormat.parse(timeString).getTime());
		} catch (ParseException e) {
			log.error("失败", e.getMessage());
		}
		return date;
	}

	public static String convertDateString(Date date, String pattern) {
		/*if (date == null) {
			return null;
		}*/
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}

	public static Date parseTimeStringDay(String timeString) {
		if (StringUtils.isEmpty(timeString)) {
			return null;
		}
		Date date = null;
		DateFormat dateFormat = new SimpleDateFormat(DATE_PATTENT);
		try {
			date = new Date(dateFormat.parse(timeString).getTime());
		} catch (ParseException e) {
			log.error("失败", e.getMessage());
		}
		return date;
	}

	public static int getYear(String timeString) {
		if (!StringUtils.isEmpty(timeString)) {
			String timeStr = convertDateString(parseTimeStringDay(timeString), DATE_PATTENT);
			if (!StringUtils.isEmpty(timeStr)) {
				return Integer.parseInt(timeStr.substring(0, 4));
			}
		}
		return GlobalConstant.ZERO;
	}

	public static int getMonth(String timeString) {
		if (!StringUtils.isEmpty(timeString)) {
			String timeStr = convertDateString(parseTimeStringDay(timeString), DATE_PATTENT);
			if (!StringUtils.isEmpty(timeStr)) {
				return Integer.parseInt(timeStr.substring(5, 7));
			}
		}
		return GlobalConstant.ZERO;
	}

	public static int getDay(String timeString) {
		if (!StringUtils.isEmpty(timeString)) {
			String timeStr = convertDateString(parseTimeStringDay(timeString), DATE_PATTENT);
			if(!StringUtils.isEmpty(timeStr)) {
				return Integer.parseInt(timeStr.substring(8, 10));
			}
		}
		return GlobalConstant.ZERO;
	}

	public static int getIndexBetween(LinkedHashMap<Integer, List<Long>> xPeriod, String dataTime) throws Exception {
		int index = -1;
		if (!CollectionUtils.isEmpty(xPeriod) && !StringUtils.isEmpty(dataTime)) {
			SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDD_PATTERN);
			Long dataDate = sdf.parse(dataTime).getTime();
			for (Map.Entry<Integer, List<Long>> entry : xPeriod.entrySet()) {
				List<Long> value = entry.getValue();
				Long start = value.get(0);
				Long end = value.get(1);
				if (start <= dataDate && dataDate <= end) {
					index = entry.getKey();
					break;
				}
			}
		}
		return index;
	}

	public static List<String> getPeriodRange(Date date, int days) {
		List<String> result = new ArrayList<>();
		if (days > 0) {
			for (int i = 1; i < days; i++) {
				result.add(getDateFormat(addDays(date, i), YYYYMMDD_PATTERN));
			}
		} else if (days < 0) {
			for (int i = days; i <= 0; i++) {
				result.add(getDateFormat(addDays(date, i), YYYYMMDD_PATTERN));
			}
		} else {
			result.add(getDateFormat(date, YYYYMMDD_PATTERN));
		}
		return result;
	}

	public static List<String> getPeriodRange(Long date, int days) {
		Date temp = new Date(date);
		List<String> result = new ArrayList<>();
		if (days > 0) {
			for (int i = 1; i < days; i++) {
				result.add(getDateFormat(addDays(temp, i), YYYYMMDD_PATTERN));
			}
		} else if (days < 0) {
			for (int i = days; i <= 0; i++) {
				result.add(getDateFormat(addDays(temp, i), YYYYMMDD_PATTERN));
			}
		} else {
			result.add(getDateFormat(temp, YYYYMMDD_PATTERN));
		}
		return result;
	}

	public static List<String> getPeriodRange(Date startTime, Date endTime) {
		List<String> result = new ArrayList<>();
		if (startTime != null && endTime != null) {
			Long days = (endTime.getTime() - startTime.getTime())/GlobalConstant.MILLISECOND_OF_ONE_DAY;
			result = getPeriodRange(endTime, 0 - Integer.parseInt(days.toString()));
		}
		return result;
	}

	public static List<String> getPeriodRange(Long startTime, Long endTime) {
		List<String> result = new ArrayList<>();
		if (startTime != null && endTime != null) {
			Long days = (endTime - startTime)/GlobalConstant.MILLISECOND_OF_ONE_DAY;
			result = getPeriodRange(endTime, 0 - Integer.parseInt(days.toString()));
		}
		return result;
	}

	/**
	 　　 *字符串的日期格式的计算
	 　　 */
	public static int daysBetween(String smdate, String bdate) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(smdate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(bdate));
		long time2 = cal.getTimeInMillis();
		long between_days=(time2-time1)/(1000*3600*24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 判断 时间是否小于后面时间
	 */
	public static boolean lessThanDate(Date date1, Date date2) {
		if(date1.getTime() < date2.getTime()){
			return true;
		}else{
			return false;
		}
	}

	public static boolean lessThanDate(Long date1, Long date2) {
		if(date1 < date2){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		Date today = new Date();
		int indexOfWeek = getIndexOfWeek(today);
		List<String> thisWeek = getPeriodRange(today, 0 - indexOfWeek + 1);
		List<String> lastWeek = getPeriodRange(addDays(today, 0 - indexOfWeek), -7 + 1);
		System.out.println(getIndexOfWeek(new Date()));

		Date date = addDays(today, -3);
		List<String> periodRange = getPeriodRange(date, today);
		System.out.println(periodRange);
	}

}