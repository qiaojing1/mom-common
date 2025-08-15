package com.lets.commons.security.util;

import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZYY
 * @Date: 2020/5/8 10:46
 */
public class XSStringUtil {

    public static boolean isBlank(String string) {
        return Strings.isNullOrEmpty(string);
    }

    public static String CoventObjectToString(Object value,String defaultValue){
        if (value==null)
            return defaultValue;
        return value.toString();
    }
    public static boolean CoventObjectToBoolean(Object value,boolean defaultValue){
        if (value==null)
            return defaultValue;
        return Boolean.parseBoolean(value.toString());
    }
    public static String[] CoventObjectToStrings(Object value,String[] defaultValue){
        if (value==null)
            return defaultValue;
        if (value instanceof ArrayList){
            ArrayList list =(ArrayList)value;
            String[] values=new String[list.size()];
            for(int i=0;i<list.size();i++)
                values[i]=CoventObjectToString(list.get(i),"");
            return values;
//           return (String[])list.toArray(new String[list.size()]);
//           return (String[])((ArrayList)value).toArray();
        }
        if (value instanceof String[])
            return (String[])value;
//        if (value instanceof Object[])


        return defaultValue;
    }
    public static int CoventObjectToInt(Object value,int defaultValue){
        if (value==null)
            return defaultValue;
        return Integer.parseInt(value.toString());
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

    /**
     * 把list 组装成 字符串
     *
     * @param strings
     * @param sep
     * @param pre
     * @param end
     * @return
     */
    public static String ConvertListToString(List<String> strings,String sep,String pre,String end){
        StringBuilder stringBuilder=new StringBuilder();
        if (strings==null||strings.size()==0)
            return "";
        if (strings.size()==1)
            return pre+strings.get(0)+end;
        stringBuilder.append(pre+strings.get(0)+end);
        for(int i=1;i<strings.size();i++)
            stringBuilder.append(sep+pre+strings.get(i)+end);
        return stringBuilder.toString();
    }
}
