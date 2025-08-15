package com.lets.platform.client.dynamic;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * DynamicClient
 * 使用举例
 * DynamicClient dynamicClient = SpringUtil.getBean(DynamicClient.class);
 * Object result = dynamicClient.executePostApi("common", "/dict/findByDictSigns", Arrays.asList("collectionMsgType"));
 * System.out.println("==========>"+ JSONObject.toJSONString(result));
 * @author: DING WEI
 * @date: 2023/4/18 10:29
 */
@Component
public class DynamicClient {

    @Resource
    private DynamicFeignClientFactory<DynamicService> dynamicFeignClientFactory;

    public Object executePostApi(String feignName, String url, Object params) {
        DynamicService dynamicService = dynamicFeignClientFactory.getFeignClient(DynamicService.class, feignName);
        return dynamicService.executePostApi(url, params);
    }

    public Object executeGetApi(String feignName, String url, Object params) {
        DynamicService dynamicService = dynamicFeignClientFactory.getFeignClient(DynamicService.class, feignName);
        return dynamicService.executeGetApi(url, params);
    }
}
