package com.lets.platform.common.pojo.base;

import com.google.common.collect.Maps;

import java.util.concurrent.ConcurrentMap;

/**
 * @Author: qiao jing
 * 执行与否的前置条件，对AtomService起作用
 * @Date: 2020/5/25 11:23
 */
public class  BaseCondition  {
    ConcurrentMap sourceMap = Maps.newConcurrentMap();
    ConcurrentMap destMap = Maps.newConcurrentMap();

    public boolean isSatisfied(){
        if(sourceMap.equals(destMap)){
            return true;
        }
        return false;
    }

    public BaseCondition() {
    }

    public <T> T addField(T t){
        return (T) sourceMap.put(t,t);
    }

    public <V> V addValue(V v){
        return (V) destMap.put(v,v);
    }
}
