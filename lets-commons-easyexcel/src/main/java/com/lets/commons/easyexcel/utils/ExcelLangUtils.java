package com.lets.commons.easyexcel.utils;

import com.alibaba.excel.annotation.ExcelProperty;
import com.lets.commons.easyexcel.entity.ExcelName;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelLangUtils {
    /**
      * easy poi导出excel表头多语言设置
      *
      * @param source 源类
      * @return       表头转换语言后的目标类
    */
    public static Class chooseLang(Class<?> source,String lang) throws NoSuchFieldException, IllegalAccessException {
        //获取所有字段
        Field[] fields = source.getDeclaredFields();
        if (fields.length > 0) {
            for (Field field : fields) {
                //获取字段的@Excel注解
                ExcelProperty anoExcel = field.getAnnotation(ExcelProperty.class);
                ExcelName anoExcelName = field.getAnnotation(ExcelName.class);
                if (anoExcel == null || anoExcelName == null) {
                    continue;
                }
                // 获取代理处理器
                InvocationHandler excelH = Proxy.getInvocationHandler(anoExcel);
                // 获取私有 memberValues 属性
                Field excelF = excelH.getClass().getDeclaredField("memberValues");
                //开启强制访问
                excelF.setAccessible(true);
                // 获取实例的属性map
                Map excelValues = (Map) excelF.get(excelH);
                // 获取ExcelName的属性值，前面自定义注解已定义好各语言所处位置
                List<String> valueList = Arrays.asList(anoExcelName.names());
                if (valueList.size() == 3) {
                    switch (lang) {
                        case "zh-CN":
                            excelValues.put("value", new String[]{valueList.get(0)});
                            break;
                        case "en-US":
                            excelValues.put("value", new String[]{valueList.get(1)});
                            break;
                        case "ja-JP":
                            excelValues.put("value", new String[]{valueList.get(2)});
                            break;
                        default:
                            excelValues.put("value", new String[]{valueList.get(0)});
                            break;
                    }
                }
 
            }
        }
        return source;
    }
}