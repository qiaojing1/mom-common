package com.lets.commons.easyexcel.utils;

import com.alibaba.excel.annotation.ExcelProperty;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

public class ExcelStyle {
    /**
     * 修改列名
     * @param filedName
     * @param unit
     * @param excelName
     * @param srcClass
     * @return
     */
    public static Class updateField(String filedName, String unit, String excelName, Class srcClass) {
        try {
            Field field = null;
            field = srcClass.getDeclaredField(filedName);
            ExcelProperty excel = field.getAnnotation(ExcelProperty.class);
            InvocationHandler excelH = Proxy.getInvocationHandler(excel);
            Field excelF = excelH.getClass().getDeclaredField("memberValues");
            excelF.setAccessible(true);
            Map excelValues = (Map) excelF.get(excelH);
            excelValues.put("value", new String[]{excelName + "(" +unit + ")"});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return srcClass;
    }
}
