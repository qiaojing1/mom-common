package com.lets.platform.common.pojo.base;


import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @Author: qiao jing
 * 一个完整的input/output参数，其中部分可以具备参数映射到已有对象的能力
 * @Date: 2020/5/25 11:08
 */
public class BaseParamSet<T> {

    Map<String, T> mpParams;

    public T addParam(BaseParam<T> param){
        return  mpParams.put(param.getKeyName(),param.getT());
    }

    public T getParam(String keyName){
        return  mpParams.get(keyName);
    }

    public BaseParamSet() {
        mpParams = Maps.newConcurrentMap();
    }

    public Map<String, T> getMpParams() {
        return mpParams;
    }

    public void setMpParams(Map<String, T> mpParams) {
        this.mpParams = mpParams;
    }
}
