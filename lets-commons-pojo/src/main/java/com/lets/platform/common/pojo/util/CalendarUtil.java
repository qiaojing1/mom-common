package com.lets.platform.common.pojo.util;

import com.lets.platform.common.pojo.base.Day;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.LegalHolidayEnum;
import com.lets.platform.common.pojo.enums.YesOrNo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/**
 * @description: 日历工具类
 * @author: DING WEI
 * @date: 9/23/21 10:29 AM
 */
public class CalendarUtil {

    /**
     * 获取某年的所有日期、周
     * @param year
     * @return
     * @author DING WEI
     * @date 9/23/21 11:04 AM
     * @version 1.0
     */
    public static List<Day> getAllDayWholeYear(Integer year) {
        List<Day> allDay = new ArrayList<>();
        if (Objects.nonNull(year)) {
            // 月份计数
            int m = 1;
            while (m < 13) {
                int month = m;
                // 计算季度
                int quarter = month % 3 == 0 ? month / 3 : month / 3 + 1;
                // 获得当前日期对象
                Calendar cal = Calendar.getInstance();
                // 清除信息
                cal.clear();
                cal.set(Calendar.YEAR, year);
                // 1月从0开始
                cal.set(Calendar.MONTH, month - 1);
                int count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
                int week = cal.get(Calendar.DAY_OF_WEEK);
                for (int j = 1; j <= count; j++) {
                    String dayTimeFormat = "" + year + (month < 10 ? ("0" + month) : month) + (j < 10 ? ("0" + j) : j);
                    int w = (week + j - 2) % 7;
                    String workDay = w > 0 && w < 6 ? YesOrNo.YES.getValue() : YesOrNo.NO.getValue();
                    String holidayId = getHolidayId(month, j);
                    Day day = new Day(year, quarter, month, j, dayTimeFormat, workDay, holidayId, w);
                    allDay.add(day);
                }
                m++;
            }
        }
        return allDay;
    }

    /**
     * 获取法定节假日
     * @param month
     * @param day
     * @return
     * @author DING WEI
     * @date 9/23/21 7:18 PM
     * @version 1.0
     */
    public static String getHolidayId(int month, int day) {
        if (month == 5 && day < 6) {
            return LegalHolidayEnum.MAY_DAY.getDescribe();
        }
        if (month == 10 && day < 8) {
            return LegalHolidayEnum.NATIONAL_HOLIDAY.getDescribe();
        }
        return "";
    }

    /**
     * 获取当前季度
     * @param
     * @return
     * @author DING WEI
     * @date 9/23/21 6:38 PM
     * @version 1.0
     */
    public static int getCurrentQuarter() {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        return month % 3 == 0 ? month / 3 : month / 3 + 1;
    }

    /**
     * 获取该季度的月份
     * @param
     * @return
     * @author DING WEI
     * @date 9/23/21 6:38 PM
     * @version 1.0
     */
    public static List<Integer> getMonthByQuarter(Integer quarter) {
        if (Objects.isNull(quarter)) {
            quarter = getCurrentQuarter();
        }
        List<Integer> months = new ArrayList<>();
        if (quarter == GlobalConstant.ONE) {
            months.add(GlobalConstant.ONE);
            months.add(GlobalConstant.TWO);
            months.add(GlobalConstant.THREE);
        } else if (quarter == GlobalConstant.TWO) {
            months.add(GlobalConstant.FOUR);
            months.add(GlobalConstant.FIVE);
            months.add(GlobalConstant.SIX);
        } else if (quarter == GlobalConstant.THREE) {
            months.add(GlobalConstant.SEVEN);
            months.add(GlobalConstant.EIGHT);
            months.add(GlobalConstant.NINE);
        } else if (quarter == GlobalConstant.FOUR) {
            months.add(GlobalConstant.TEN);
            months.add(GlobalConstant.TEN + GlobalConstant.ONE);
            months.add(GlobalConstant.TEN + GlobalConstant.TWO);
        }
        return months;
    }

    /**
     * 打印日历
     * @param year
     * @return
     * @author DING WEI
     * @date 9/23/21 11:03 AM
     * @version 1.0
     */
    public static void printCalendar(Integer year) {
        // 月份计数
        int m = 1;
        while (m < 13) {
            int month = m;
            // 获得当前日期对象
            Calendar cal = Calendar.getInstance();
            // 清除信息
            cal.clear();
            cal.set(Calendar.YEAR, year);
            // 1月从0开始
            cal.set(Calendar.MONTH, month - 1);
            int count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            int week = cal.get(Calendar.DAY_OF_WEEK);
            System.out.printf("\t\t\t%d年%d月\n\n", year, month);
            System.out.print("日\t一\t二\t三\t四\t五\t六\n");
            int i;
            for (i = 0; i < week - 1; i++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= count; j++) {
                System.out.print(j + "\t");
                if ((i + j) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            m++;
        }
    }

    public static void main(String[] args) {
        printCalendar(2021);
        List<Day> allDayWholeYear = getAllDayWholeYear(2021);
        int currentQuarter = getCurrentQuarter();
        System.out.println(allDayWholeYear);
    }
}
