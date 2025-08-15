package com.lets.platform.common.pojo.util;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Author: chunliu
 * @Date: 2020/4/20 4:31 AM
 */
public class ResultHolder {

    private static Logger logger = LoggerFactory.getLogger(ResultHolder.class);


    /**
     * 线程级别的私有变量
     */
    private static final ThreadLocal<JSONObject> HOLDER = new ThreadLocal<>();

    public static JSONObject getResult () {
        return HOLDER.get();
    }

    public static void setResult (JSONObject jsonObject) {
        HOLDER.set(jsonObject);
    }

    /**
     * 一定要先移除
     */
    public static void removeResult () {
        HOLDER.remove();
    }



}
