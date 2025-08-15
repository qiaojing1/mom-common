package com.lets.commons.easyexcel.utils;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lets.commons.easyexcel.entity.DynamicHeadEntity;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 动态列 工具类
 * @author: DING WEI
 * @date: 2023/2/7 16:01
 */
public class DynamicColUtils {

    /**
     * 获取该对象的所有导出列信息
     * @param entityClass
     * @param notShowCols 不需要展示的列
     * @return
     * @author DING WEI
     * @date 2023/2/7 16:04
     * @version 1.0
     */
    public static List<DynamicHeadEntity> getDynamicHeads(Class entityClass, List<String> notShowCols) {
        List<DynamicHeadEntity> customizeHeads = new ArrayList<>();
        Field[] fields = entityClass.getDeclaredFields();
        // 获取类的注解
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            boolean annotationPresent = field.isAnnotationPresent(ExcelProperty.class);
            if (annotationPresent) {
                String name = field.getName();
                if (!notShowCols.contains(name)) {
                    ExcelProperty excelProperty = field.getAnnotation(ExcelProperty.class);
                    List<String> head = Arrays.asList(excelProperty.value());
                    int index = excelProperty.index();
                    int order = excelProperty.order();
                    DynamicHeadEntity headEntity = DynamicHeadEntity.builder().headTitle(head).index(index).order(order).key(name).build();
                    customizeHeads.add(headEntity);
                }
            }
        }
        Collections.sort(customizeHeads);
        return customizeHeads;
    }

    /**
     * 把对象数据转成List<Map<String, Object>>数据格式
     * @param excelDataList
     * @return List<Map<String, Object>>
     * @author DING WEI
     * @date 2023/2/7 16:47
     * @version 1.0
     */
    public static <T> List<Map<String, Object>> excelDataToListMap(List<T> excelDataList) {
        List<Map<String, Object>> listMap = new ArrayList<>();
        if (!CollectionUtils.isEmpty(excelDataList)) {
            for (Object excelData : excelDataList) {
                Map<String, Object> innerMap = JSON.parseObject(JSONObject.toJSONString(excelData)).getInnerMap();
                listMap.add(innerMap);
            }
        }
        return listMap;
    }

    /**
     * 将数据放到List<Map>中
     * @param dynamicHeads 动态列
     * @param excelDataMapList 所有数据
     * @param heads 需要导出的列名称
     * @param dataList 需要导出的数据
     * @return
     * @author DING WEI
     * @date 2023/2/7 16:48
     * @version 1.0
     */
    public static void handle(List<DynamicHeadEntity> dynamicHeads,
                              List<Map<String, Object>> excelDataMapList,
                              List<List<String>> heads,
                              List<List<Object>> dataList) {
        if (!CollectionUtils.isEmpty(dynamicHeads)) {
            List<String> keys = new ArrayList<>();
            for (int i = 0; i <= dynamicHeads.size() - 1; i++) {
                heads.add(dynamicHeads.get(i).getHeadTitle());
                keys.add(dynamicHeads.get(i).getKey());
            }
            if (!CollectionUtils.isEmpty(excelDataMapList)) {
                excelDataMapList.stream().forEach(e -> {
                    List<Object> obj = new ArrayList<>();
                    for (int i = 0; i < keys.size(); i++) {
                        obj.add(e.get(keys.get(i)));
                    }
                    dataList.add(obj);
                });
            }
        }
    }
}
