package com.lets.platform.model.common.util;

import cn.hutool.core.date.DateUnit;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.common.pojo.util.DateUtil;
import com.lets.platform.model.common.enums.DateTypeEnum;
import com.lets.platform.model.common.query.DateFilterQuery;
import com.lets.platform.model.common.query.DynQuery;
import com.lets.platform.model.common.query.TextFilterQuery;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author QIAO JING
 * DynEntity 映射为后端map
 * @since date 2022/04/07 17:27
 */
public class DynEntityProcess {

    public static void Process(DynQuery dynEntity, Map<String, String> map) {
        map.put("tenancyId", dynEntity.getTenancyId());
        ProcessList(dynEntity, map);
        ProcessWhere(dynEntity, map);
        ProcessGroup(dynEntity, map);
        ProcessOrder(dynEntity, map);
        ProcessHaving(dynEntity, map);
    }

    public static void Process(DynQuery dynEntity, Map<String, String> map, Boolean influxDb) {
        map.put("tenancyId", dynEntity.getTenancyId());
        if (influxDb) {
            ProcessInfluxDbList(dynEntity, map);
            ProcessInFluxDbWhere(dynEntity, map);
        } else {
            ProcessList(dynEntity, map);
            ProcessWhere(dynEntity, map);
        }
        ProcessGroup(dynEntity, map);
        ProcessOrder(dynEntity, map);
        ProcessHaving(dynEntity, map);
    }

    private static String getSql(String a, String b) {

        return String.format("to_char(%s,'%s')", a, b);
    }

    //处理sql Select部分
    private static void ProcessList(DynQuery dynEntity, Map<String, String> map) {
        List<Map<String, String>> list = dynEntity.getListwd();
        list.stream().forEach((item) -> {
            String field = item.get("key");
            String underline = HumpToUnderline(field);
            //如果有需要,在此处做时间处理

            String fields = map.get("list");
            if (StringUtils.isEmpty(fields)) {
                map.put("list", String.format("%s  as %s", underline, field));
            } else {
                map.put("list", fields + "," + String.format("%s  as %s", underline, field));
            }

        });

        List<Map<String, String>> list1 = dynEntity.getListdl();
        list1.stream().forEach((item) -> {
            String field = item.get("key");
            String alias = item.get("alias");
            String Underline = HumpToUnderline(field);
            String fields = map.get("list");
            String aggmode = item.get("aggmode");
            if (StringUtils.isEmpty(fields)) {
                map.put("list", String.format("%s(%s) as %s", aggmode, Underline, alias));
            } else {
                map.put("list", fields + "," + String.format("%s(%s) as %s", aggmode, Underline, alias));
            }
        });
    }

    private static void ProcessInfluxDbList(DynQuery dynEntity, Map<String, String> map) {
        List<Map<String, String>> list = dynEntity.getListwd();
        list.stream().forEach((item) -> {
            String field = item.get("key");
            String underline = field;
            //如果有需要,在此处做时间处理

            String fields = map.get("list");
            if (StringUtils.isEmpty(fields)) {
                map.put("list", String.format("%s  as %s", underline, field));
            } else {
                map.put("list", fields + "," + String.format("%s  as %s", underline, field));
            }

        });

        List<Map<String, String>> list1 = dynEntity.getListdl();
        list1.stream().forEach((item) -> {
            String field = item.get("key");
            String alias = item.get("alias");
            String Underline = field;
            String fields = map.get("list");
//            String aggmode=item.get("aggmode");
            if (StringUtils.isEmpty(fields)) {
                map.put("list", String.format("%s as %s", Underline, alias));
            } else {
                map.put("list", fields + "," + String.format("%s as %s", Underline, alias));
            }
        });
    }

    private static void ProcessHaving(DynQuery dynEntity, Map<String, String> map) {
        List<Map<String, String>> list = dynEntity.getDlfilter();
        list.stream().forEach((item) -> {
            String field = item.get("key");
            String underline = HumpToUnderline(field);
            String fields = map.getOrDefault("having", "");
            String dlmax = item.get("dlmax");
            String dlmin = item.get("dlmin");
            String aggmode = item.get("aggmode");
            if (!StringUtils.isEmpty(dlmax)) {
                map.put("having", fields + " and " + String.format("%s(%s) <= %s", aggmode, underline, dlmax));
                fields = map.get("having");
            }
            if (!StringUtils.isEmpty(dlmin)) {
                map.put("having", fields + " and " + String.format("%s(%s) >= %s", aggmode, underline, dlmin));
            }
        });
    }

    //处理sql Where部分
    private static void ProcessWhere(DynQuery dynEntity, Map<String, String> map) {

        List<Map<String, String>> list1 = dynEntity.getListfilter();
        list1.stream().forEach((item) -> {
            String field = item.get("key");
            String Underline = HumpToUnderline(field);
            String listselectfilter = item.get("listselectfilter");
            String value = item.get("value");
            String fields = map.getOrDefault("where", "");
            if ((!StringUtils.isEmpty(Underline)) && (!StringUtils.isEmpty(listselectfilter)) && (!StringUtils.isEmpty(value))) {
                map.put("where", fields + " and " + String.format("%s %s (%s)", Underline, listselectfilter, value));
            }
        });

        List<TextFilterQuery> list2 = dynEntity.getTextfilter();
        list2.stream().forEach((item) -> {
            String field = item.getKey();

            String Underline = HumpToUnderline(field);

            String join = item.getJoin();
            List<Map<String, String>> list3 = item.getValues();
            String fields = map.getOrDefault("where", "");
            StringBuilder sql = new StringBuilder();
            String finalUnderline = Underline;
            list3.forEach((item1) -> {
                String value = item1.get("value");
                String type = item1.get("type");
                if (StringUtils.isNotEmpty(value))
                    switch (type) {
                        case "=":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + " = '" + value + "'");
                            } else {
                                sql.append(join + " " + finalUnderline + " = '" + value + "'");
                            }
                            break;
                        case "not in":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + " not like '%" + value + "%'");
                            } else {
                                sql.append(join + " " + finalUnderline + " not like '%" + value + "%'");
                            }
                            break;
                        case "in":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + "  like '%" + value + "%'");
                            } else {
                                sql.append(join + " " + finalUnderline + "  like '%" + value + "%'");
                            }
                            break;
                        case ">=":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + "  >= '" + value + "'");
                            } else {
                                sql.append(join + " " + finalUnderline + "  >= '" + value + "'");
                            }
                            break;
                        case "<=":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + "  <= '" + value + "'");
                            } else {
                                sql.append(join + " " + finalUnderline + "  <= '" + value + "'");
                            }
                            break;
                    }

            });
            if (sql.length() != 0)
                map.put("where", fields + " and " + String.format("( %s )", sql));
        });

        List<DateFilterQuery> list3 = dynEntity.getDateFilter();
        list3.stream().forEach((item) -> {
            String field = item.getKey();
            StringBuilder sql = new StringBuilder();
            String Underline = HumpToUnderline(field);
            String fields = map.getOrDefault("where", "");
            int value = item.getValue();
            String join = item.getJoin();
            String includeCurrentDay = item.getIncludeCurrentDay();
            Long startTime = null;
            Long endTime = null;
            Calendar cal = Calendar.getInstance();
            switch (value) {
                case 1:
                    startTime = DateUtil.getTadeyTimeByParams(0, 0, 0, 0).getTime();
                    Date endTimeDate = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate.getTime();
                    break;
                case 2:
                    startTime = DateUtil.getMondayZeroTimes().getTime();
                    Date endTimeDate1 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate1.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate1);
                    }
                    break;
                case 3:
                    startTime = DateUtil.getMonthStartZeroTimes().getTime();
                    Date endTimeDate2 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate2.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate2);
                    }
                    break;
                case 4:
                    startTime = DateUtil.getCurrentQuarterStartTime().getTime();
                    Date endTimeDate3 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate3.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate3);
                    }
                    break;
                case 5:
                    startTime = DateUtil.getCurrYearFirst().getTime();
                    Date endTimeDate4 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate4.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate4);
                    }
                    break;
                case 6:
                    startTime = DateUtil.getPastStartTime(1).getTime();
                    Date endTimeDate5 = DateUtil.getPastEndTime(1);
                    endTime = endTimeDate5.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate5);
                    }
                    break;
                case 7:
                    startTime = DateUtil.getPastStartTime(2).getTime();
                    Date endTimeDate6 = DateUtil.getPastEndTime(2);
                    endTime = endTimeDate6.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate6);
                    }
                    break;
                case 8:
                    startTime = DateUtil.getPastStartTime(3).getTime();
                    Date endTimeDate7 = DateUtil.getPastEndTime(3);
                    endTime = endTimeDate7.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate7);
                    }
                    break;
                case 9:
                    startTime = DateUtil.getPastStartTime(4).getTime();
                    Date endTimeDate8 = DateUtil.getPastEndTime(4);
                    endTime = endTimeDate8.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate8);
                    }
                    break;
                case 10:
                    Calendar c10 = Calendar.getInstance();
                    c10.set(Calendar.HOUR_OF_DAY, 00);
                    c10.set(Calendar.MINUTE, 00);
                    c10.set(Calendar.SECOND, 00);
                    c10.set(Calendar.MILLISECOND, 00);
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {

                        c10.add(Calendar.DATE, -7);
                    } else {
                        c10.add(Calendar.DATE, -6);
                    }

                    startTime = c10.getTime().getTime();
                    Date endTimeDate10 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate10.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate10);
                    }
                    break;
                case 11:
                    Calendar c11 = Calendar.getInstance();
                    c11.set(Calendar.HOUR_OF_DAY, 00);
                    c11.set(Calendar.MINUTE, 00);
                    c11.set(Calendar.SECOND, 00);
                    c11.set(Calendar.MILLISECOND, 00);
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        c11.add(Calendar.DATE, -14);
                    } else {
                        c11.add(Calendar.DATE, -13);
                    }
                    startTime = c11.getTime().getTime();
                    Date endTimeDate11 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate11.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate11);
                    }
                    break;
                default:
                    break;
            }
            if (sql.toString().equals("")) {
                sql.append(Underline + "  >= " + startTime + " and " + Underline + " <= " + endTime);
            } else {
                sql.append(join + " " + Underline + "  >= " + startTime + " and " + Underline + " <= " + endTime);
            }

            if (sql.length() != 0)
                map.put("where", fields + " and " + String.format("( %s )", sql));
        });
    }

    private static void ProcessInFluxDbWhere(DynQuery dynEntity, Map<String, String> map) {

        List<Map<String, String>> list1 = dynEntity.getListfilter();
        list1.stream().forEach((item) -> {
            String field = item.get("key");
            String Underline = field;
            String listselectfilter = item.get("listselectfilter");
            String value = item.get("value");
            String fields = map.getOrDefault("where", "");
            if ((!StringUtils.isEmpty(Underline)) && (!StringUtils.isEmpty(listselectfilter)) && (!StringUtils.isEmpty(value))) {
                map.put("where", fields + " and " + String.format("%s %s (%s)", Underline, listselectfilter, value));
            }
        });

        List<TextFilterQuery> list2 = dynEntity.getTextfilter();
        list2.stream().forEach((item) -> {
            String field = item.getKey();

            String Underline = field;

            String join = item.getJoin();
            List<Map<String, String>> list3 = item.getValues();
            String fields = map.getOrDefault("where", "");
            StringBuilder sql = new StringBuilder();
            String finalUnderline = Underline;
            list3.forEach((item1) -> {
                String value = item1.get("value");
                String type = item1.get("type");
                if (StringUtils.isNotEmpty(value))
                    switch (type) {
                        case "=":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + " = '" + value + "'");
                            } else {
                                sql.append(join + " " + finalUnderline + " = '" + value + "'");
                            }
                            break;
                        case "not in":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + " not like '%" + value + "%'");
                            } else {
                                sql.append(join + " " + finalUnderline + " not like '%" + value + "%'");
                            }
                            break;
                        case "in":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + "  like '%" + value + "%'");
                            } else {
                                sql.append(join + " " + finalUnderline + "  like '%" + value + "%'");
                            }
                            break;
                        case ">=":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + "  >= '" + value + "'");
                            } else {
                                sql.append(join + " " + finalUnderline + "  >= '" + value + "'");
                            }
                            break;
                        case "<=":
                            if (sql.toString().equals("")) {
                                sql.append(finalUnderline + "  <= '" + value + "'");
                            } else {
                                sql.append(join + " " + finalUnderline + "  <= '" + value + "'");
                            }
                            break;
                    }

            });
            if (sql.length() != 0)
                map.put("where", fields + " and " + String.format("( %s )", sql));
        });

        List<DateFilterQuery> list3 = dynEntity.getDateFilter();
        list3.stream().forEach((item) -> {
            String field = item.getKey();
            StringBuilder sql = new StringBuilder();
            String Underline = field;
            String fields = map.getOrDefault("where", "");
            int value = item.getValue();
            String join = item.getJoin();
            String includeCurrentDay = item.getIncludeCurrentDay();
            Long startTime = null;
            Long endTime = null;
            Calendar cal = Calendar.getInstance();
            switch (value) {
                case 1:
                    startTime = DateUtil.getTadeyTimeByParams(0, 0, 0, 0).getTime();
                    Date endTimeDate = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate.getTime();
                    break;
                case 2:
                    startTime = DateUtil.getMondayZeroTimes().getTime();
                    Date endTimeDate1 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate1.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate1);
                    }
                    break;
                case 3:
                    startTime = DateUtil.getMonthStartZeroTimes().getTime();
                    Date endTimeDate2 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate2.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate2);
                    }
                    break;
                case 4:
                    startTime = DateUtil.getCurrentQuarterStartTime().getTime();
                    Date endTimeDate3 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate3.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate3);
                    }
                    break;
                case 5:
                    startTime = DateUtil.getCurrYearFirst().getTime();
                    Date endTimeDate4 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate4.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate4);
                    }
                    break;
                case 6:
                    startTime = DateUtil.getPastStartTime(1).getTime();
                    Date endTimeDate5 = DateUtil.getPastEndTime(1);
                    endTime = endTimeDate5.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate5);
                    }
                    break;
                case 7:
                    startTime = DateUtil.getPastStartTime(2).getTime();
                    Date endTimeDate6 = DateUtil.getPastEndTime(2);
                    endTime = endTimeDate6.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate6);
                    }
                    break;
                case 8:
                    startTime = DateUtil.getPastStartTime(3).getTime();
                    Date endTimeDate7 = DateUtil.getPastEndTime(3);
                    endTime = endTimeDate7.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate7);
                    }
                    break;
                case 9:
                    startTime = DateUtil.getPastStartTime(4).getTime();
                    Date endTimeDate8 = DateUtil.getPastEndTime(4);
                    endTime = endTimeDate8.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate8);
                    }
                    break;
                case 10:
                    Calendar c10 = Calendar.getInstance();
                    c10.set(Calendar.HOUR_OF_DAY, 00);
                    c10.set(Calendar.MINUTE, 00);
                    c10.set(Calendar.SECOND, 00);
                    c10.set(Calendar.MILLISECOND, 00);
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        c10.add(Calendar.DATE, -7);
                    } else {
                        c10.add(Calendar.DATE, -6);
                    }
                    startTime = c10.getTime().getTime();
                    Date endTimeDate10 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate10.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate10);
                    }
                    break;
                case 11:
                    Calendar c11 = Calendar.getInstance();
                    c11.set(Calendar.HOUR_OF_DAY, 00);
                    c11.set(Calendar.MINUTE, 00);
                    c11.set(Calendar.SECOND, 00);
                    c11.set(Calendar.MILLISECOND, 00);
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        c11.add(Calendar.DATE, -14);
                    } else {
                        c11.add(Calendar.DATE, -13);
                    }
                    startTime = c11.getTime().getTime();
                    Date endTimeDate11 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate11.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate11);
                    }
                    break;
                default:
                    break;
            }
            String startTimeStr = DateUtil.getDateFormat(startTime, DateUtil.DATETIME_PATTENT);
            String endTimeStr = DateUtil.getDateFormat(endTime, DateUtil.DATETIME_PATTENT);
            if (sql.toString().equals("")) {
                sql.append(Underline + "  >= '" + startTimeStr + "' and " + Underline + " <= '" + endTimeStr + "'");
            } else {
                sql.append(join + " " + Underline + "  >= '" + startTimeStr + "' and " + Underline + " <= '" + endTimeStr + "'");
            }

            if (sql.length() != 0)
                map.put("where", fields + " and " + String.format("( %s )", sql));
        });
    }

    private static Long getLastDay(Calendar cal, Date endTime) {
        cal.setTime(endTime);
        cal.add(Calendar.DATE, -1);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 59);
        Long returnTime = cal.getTime().getTime();
        return returnTime;
    }

    //处理sql group部分
    private static void ProcessGroup(DynQuery dynEntity, Map<String, String> map) {
        List<Map<String, String>> list = dynEntity.getListwd();
        list.stream().forEach((item) -> {
            String field = item.get("key");
            String Underline = HumpToUnderline(field);
            //如果有需要,在此处做时间处理

            String fields = map.get("group");
            if (StringUtils.isEmpty(fields)) {
                map.put("group", "group by " + Underline);
            } else {
                map.put("group", fields + "," + String.format("%s", Underline));
            }
        });

    }

    public static Map<String, String> queryToMap(DynQuery dynQuery) {

        Map<String, String> map1 = new HashMap<>();
        List<Map<String, String>> list1 = dynQuery.getListdl();
        for (int i = list1.size() - 1; i > -1; i--) {
            Map<String, String> map = list1.get(i);
            if (map.get("key").startsWith("num")) {
//                list1.remove(i);
                map1.put(map.get("key"), "1");
            }
        }

        List<Map<String, String>> list2 = dynQuery.getDlfilter();
        for (int i = list2.size() - 1; i > -1; i--) {
            Map<String, String> map = list2.get(i);
            if (map.get("key").startsWith("num")) {
//                list2.remove(i);
                map1.put(map.get("key") + "min", map.get("dlmin"));
                map1.put(map.get("key") + "max", map.get("dlmax"));
            }
        }

        Map<String, String> map3 = dynQuery.getSortfilter();
        String key = map3.get("sortkey");
        String type = map3.get("sorttype");
        if (!org.apache.commons.lang.StringUtils.isEmpty(key)) {
            if (key.startsWith("num")) {
                map3.put("sortkey", "");
                map1.put(
                        "orderby",
                        "order by " + key + " "
                                + type);
            }
        }

        return map1;
    }

    public static List<Map<String, Object>> ReturnMap(DynQuery query, List<Map<String, Object>> list) {
        List<Map<String, String>> listdl = query.getListdl();  //度量集合
        String mainWd = query.getMainWd();  //主维度

        List<Map<String, Object>> returnMap = new ArrayList<>();
        if (StringUtils.isNotEmpty(mainWd)) {   //需要组装返回值,主维度做为X轴,副维度需要将wd做为集合返回,度量也需要做为集合返回
            List<Map<String, String>> listwd = query.getListwd();  //维度集合
            List<Map<String, String>> listwdFilter = new ArrayList<>();  //维度集合
            listwd.forEach(item -> {
                String key = item.get("key");
                if (!key.equals(mainWd)) {
                    listwdFilter.add(item);
                }
            });

            //如果有日期格式,先查出对应筛选条件内的所有日期
            List<DateFilterQuery> dateFilter = query.getDateFilter();
            Map<String, DateFilterQuery> dateFilterQueryMap = dateFilter.stream().collect(Collectors.toMap(DateFilterQuery::getKey, a -> a, (k1, k2) -> k1));
            //如果是list格式, 筛选出条件内的
            List<Object> mainWdList = new ArrayList<>();
            for (DateFilterQuery item : dateFilter) {
                if (dateFilterQueryMap.containsKey(mainWd)) {
                    DateFilterQuery dateFilterQuery = dateFilterQueryMap.get(mainWd);
                    int value = dateFilterQuery.getValue();
                    String includeCurrentDay = item.getIncludeCurrentDay();
                    Long startTime = null;
                    Long endTime = null;
                    Calendar cal = Calendar.getInstance();
                    switch (value) {
                        case 1:
                            startTime = DateUtil.getTadeyTimeByParams(0, 0, 0, 0).getTime();
                            Date endTimeDate = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                            endTime = endTimeDate.getTime();
                            break;
                        case 2:
                            startTime = DateUtil.getMondayZeroTimes().getTime();
                            Date endTimeDate1 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                            endTime = endTimeDate1.getTime();
                            break;
                        case 3:
                            startTime = DateUtil.getMonthStartZeroTimes().getTime();
                            Date endTimeDate2 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                            endTime = endTimeDate2.getTime();
                            break;
                        case 4:
                            startTime = DateUtil.getCurrentQuarterStartTime().getTime();
                            Date endTimeDate3 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                            endTime = endTimeDate3.getTime();
                            break;
                        case 5:
                            startTime = DateUtil.getCurrYearFirst().getTime();
                            Date endTimeDate4 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                            endTime = endTimeDate4.getTime();
                            break;
                        case 6:
                            startTime = DateUtil.getPastStartTime(1).getTime();
                            Date endTimeDate5 = DateUtil.getPastEndTime(1);
                            endTime = endTimeDate5.getTime();
                            break;
                        case 7:
                            startTime = DateUtil.getPastStartTime(2).getTime();
                            Date endTimeDate6 = DateUtil.getPastEndTime(2);
                            endTime = endTimeDate6.getTime();
                            break;
                        case 8:
                            startTime = DateUtil.getPastStartTime(3).getTime();
                            Date endTimeDate7 = DateUtil.getPastEndTime(3);
                            endTime = endTimeDate7.getTime();
                            break;
                        case 9:
                            startTime = DateUtil.getPastStartTime(4).getTime();
                            Date endTimeDate8 = DateUtil.getPastEndTime(4);
                            endTime = endTimeDate8.getTime();
                            break;
                        case 10:
                            Calendar c10 = Calendar.getInstance();
                            c10.set(Calendar.HOUR_OF_DAY, 00);
                            c10.set(Calendar.MINUTE, 00);
                            c10.set(Calendar.SECOND, 00);
                            c10.set(Calendar.MILLISECOND, 00);
                            if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                                c10.add(Calendar.DATE, -7);
                            } else {
                                c10.add(Calendar.DATE, -6);
                            }
                            startTime = c10.getTime().getTime();
                            Date endTimeDate10 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                            endTime = endTimeDate10.getTime();
                            break;
                        case 11:
                            Calendar c11 = Calendar.getInstance();
                            c11.set(Calendar.HOUR_OF_DAY, 00);
                            c11.set(Calendar.MINUTE, 00);
                            c11.set(Calendar.SECOND, 00);
                            c11.set(Calendar.MILLISECOND, 00);
                            if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                                c11.add(Calendar.DATE, -14);
                            } else {
                                c11.add(Calendar.DATE, -13);
                            }
                            startTime = c11.getTime().getTime();
                            Date endTimeDate11 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                            endTime = endTimeDate11.getTime();
                            break;
                        default:
                            break;
                    }
                    mainWdList = DateUtil.getBetweenDates(new Date(startTime), new Date(endTime));
                }
            }
            Map<String, String> map1 = listwdFilter.get(0);
            Map<String, String> map2 = new HashMap<>();
            if (CollectionUtils.isEmpty(listdl)) {
                return list;
            }
            map2 = listdl.get(0);
            for (Object key : mainWdList) {
                Map<String, Object> map = new HashMap<>();
                map.put(mainWd, key);
                List<Object> map1Key = new ArrayList<>();
                List<Object> map2Key = new ArrayList<>();
                for (Map<String, Object> item : list) {
                    Object value = item.get(mainWd);
                    if (key.equals(value)) {   //数据包含日期
                        map1Key.add(item.get(map1.get("key")));
                        map2Key.add(item.get(map2.get("alias")));
                    }
                }
                map.put(map1.get("key"), map1Key);
                map.put(map2.get("alias"), map2Key);
                returnMap.add(map);
            }
            return returnMap;
        }
        return list;
    }

    /**
     * 将对象作为map返回给前端
     *
     * @param tList
     * @return
     */
    public static <T> List<Map<String, Object>> ReturnMap(List<T> tList) {
        List<Map<String, Object>> resultList = new ArrayList<>();
//        Map<String, Object> map = new HashMap<>();
        for (Object t : tList) {
            resultList.add(object2Map(t));
        }
        return resultList;
    }

    public static Map<String, Object> object2Map(Object obj) {
        try {

            Map<String, Object> map = new HashMap<String, Object>();
            Field[] fields = obj.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                map.put(field.getName(), field.get(obj));
            }
            return map;
        } catch (Exception e) {
            throw new LetsException(GlobalConstant.ZERO, "转换失败!");
        }

    }

    //处理sql order部分
    private static void ProcessOrder(DynQuery dynEntity, Map<String, String> map) {
        Map<String, String> map1 = dynEntity.getSortfilter();
        String key = map1.get("sortkey");

        String type = map1.get("sorttype");
        if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(type)) {
            //如果有需要,在此处做时间处理

            map.put("order", "order by " + key + " " + type);
        } else {
            map.put("order", "");
        }
    }

    /***
     * 驼峰命名转为下划线命名
     *
     * @param para
     *        驼峰命名的字符串
     */
    public static String HumpToUnderline(String para) {
        StringBuilder sb = new StringBuilder(para);
        int temp = 0;//定位
        if (!para.contains("_")) {
            for (int i = 0; i < para.length(); i++) {
                if (Character.isUpperCase(para.charAt(i))) {
                    sb.insert(i + temp, "_");
                    temp += 1;
                }
            }
        }
        return sb.toString().toUpperCase();
    }

    public static void handleDateFilter(List<DateFilterQuery> dateFilter) {
        for (DateFilterQuery item : dateFilter) {
            int value = item.getValue();
            String includeCurrentDay = item.getIncludeCurrentDay();
            Long startTime = null;
            Long endTime = null;
            Calendar cal = Calendar.getInstance();
            switch (value) {
                case 1:
                    startTime = DateUtil.getTadeyTimeByParams(0, 0, 0, 0).getTime();
                    Date endTimeDate = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate.getTime();
                    break;
                case 2:
                    startTime = DateUtil.getMondayZeroTimes().getTime();
                    Date endTimeDate1 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate1.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate1);
                    }
                    break;
                case 3:
                    startTime = DateUtil.getMonthStartZeroTimes().getTime();
                    Date endTimeDate2 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate2.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate2);
                    }
                    break;
                case 4:
                    startTime = DateUtil.getCurrentQuarterStartTime().getTime();
                    Date endTimeDate3 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate3.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate3);
                    }
                    break;
                case 5:
                    startTime = DateUtil.getCurrYearFirst().getTime();
                    Date endTimeDate4 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate4.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate4);
                    }
                    break;
                case 6:
                    startTime = DateUtil.getPastStartTime(1).getTime();
                    Date endTimeDate5 = DateUtil.getPastEndTime(1);
                    endTime = endTimeDate5.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate5);
                    }
                    break;
                case 7:
                    startTime = DateUtil.getPastStartTime(2).getTime();
                    Date endTimeDate6 = DateUtil.getPastEndTime(2);
                    endTime = endTimeDate6.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate6);
                    }
                    break;
                case 8:
                    startTime = DateUtil.getPastStartTime(3).getTime();
                    Date endTimeDate7 = DateUtil.getPastEndTime(3);
                    endTime = endTimeDate7.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate7);
                    }
                    break;
                case 9:
                    startTime = DateUtil.getPastStartTime(4).getTime();
                    Date endTimeDate8 = DateUtil.getPastEndTime(4);
                    endTime = endTimeDate8.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate8);
                    }
                    break;
                case 10:
                    Calendar c10 = Calendar.getInstance();
                    c10.set(Calendar.HOUR_OF_DAY, 00);
                    c10.set(Calendar.MINUTE, 00);
                    c10.set(Calendar.SECOND, 00);
                    c10.set(Calendar.MILLISECOND, 00);
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {

                        c10.add(Calendar.DATE, -7);
                    } else {
                        c10.add(Calendar.DATE, -6);
                    }

                    startTime = c10.getTime().getTime();
                    Date endTimeDate10 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate10.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate10);
                    }
                    break;
                case 11:
                    Calendar c11 = Calendar.getInstance();
                    c11.set(Calendar.HOUR_OF_DAY, 00);
                    c11.set(Calendar.MINUTE, 00);
                    c11.set(Calendar.SECOND, 00);
                    c11.set(Calendar.MILLISECOND, 00);
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        c11.add(Calendar.DATE, -14);
                    } else {
                        c11.add(Calendar.DATE, -13);
                    }
                    startTime = c11.getTime().getTime();
                    Date endTimeDate11 = DateUtil.getTadeyTimeByParams(23, 59, 59, 59);
                    endTime = endTimeDate11.getTime();
                    if (YesOrNo.NO.getValue().equals(includeCurrentDay)) {
                        endTime = getLastDay(cal, endTimeDate11);
                    }
                    break;
                default:
                    break;
            }
            item.setStartTime(startTime);
            item.setEndTime(endTime);
        }
    }
}