package com.lets.platform.common.pojo.util;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liuchun
 * @Date: 2020/5/8 9:47
 */
public class YamlUtil {
    // 首先声明一个Map存解析之后的内容:
    Iterable<Object> yamls;
    Map<String,Object> properties = new HashMap<>();
    //最多5段（default,dev,intg,pre,production）
    //现在多一段 oracle 改成6
    Map[] sections = new Map[16];
    String tmpActive;

    // 空的构造函数
    public YamlUtil() {
    }

    public YamlUtil(String content) {
        // 调基础工具类的方法
        Yaml yaml = new Yaml();
        yamls = (Iterable<Object>) yaml.loadAll(content);
        int i = 0;
        //初始化properties
        for(Object obj:yamls) {
            sections[i] =  (Map) obj;
            if(isDefault(sections[i])){
                properties.put("default",sections[i]);
            }
            if(isAcvice(sections[i])){
                properties.put("active",sections[i]);
            }
            i++;
        }
    }



    private boolean isDefault(Map section){
        try {
            Map tmpSpring  = (Map)section.get("spring");
//            Map tmpProfile  = (Map)tmpSpring.get("profiles");
//            tmpActive = (String)tmpProfile.get("active");
            tmpActive = (String)tmpSpring.get("profiles");
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean isAcvice(Map section){
        try {
            Map tmpSpring  = (Map)section.get("spring");
            String tmpProfile  = (String)tmpSpring.get("profiles");
            if (tmpProfile.equals(tmpActive)){
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    /**
     * 从Map中获取配置的值
     *
     * @param key
     * @return
     */
    public <T> T getValueByKey(String key, T defaultVal) {
        String separator = ".";
        String[] separatorKeys = null;
        if (key.contains(separator)) {
            // 取下面配置项的情况, user.path.keys 这种
            separatorKeys = key.split("\\.");
        } else {
            // 直接取一个配置项的情况, user
            Object obj = properties.get("active");
            if(obj != null) {
                Map active = (Map) obj;
                Object res = active.get(key);
                return res == null ? defaultVal : (T) res;
            }else{
                //default
                Map defaultPro = (Map) properties.get("default");
                Object res = defaultPro.get(key);
                return res == null ? defaultVal : (T) res;
            }
        }
        // 下面是取多个的情况
        String finalValue = null;
        Object tempObject = properties.get("active");

        if (tempObject == null){
            tempObject = properties.get("default");
        }

        for (int i = 0; i < separatorKeys.length; i++) {
            String innerKey = separatorKeys[i];
            Integer index = null;

            Map<String, Object> mapTempObj = (Map) tempObject;
            Object object = mapTempObj.get(innerKey);
            // 如果没有对应的配置项,则返回设置的默认值
            if (object == null) {
                return defaultVal;
            }
            Object targetObj = object;
            if (index != null) {
                // 如果是取的数组中的值,在这里取值
                targetObj = ((ArrayList) object).get(index);
            }
            // 一次获取结束,继续获取后面的
            tempObject = targetObj;
            if (i == separatorKeys.length - 1) {
                //循环结束
                return (T) targetObj;
            }

        }
        return null;

    }
}
