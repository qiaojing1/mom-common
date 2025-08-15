/*
 * csy
 */

package com.lets.platform.client.config;

import cn.hutool.extra.spring.SpringUtil;
import com.alibaba.fastjson.JSONObject;
import com.lets.platform.client.dynamic.DynamicClient;
import com.lets.platform.common.pojo.exception.LetsException;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Target;

import java.util.HashMap;
import java.util.Map;

// 认证配置
public class AiUrlConfig implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        DynamicClient bean = SpringUtil.getBean(DynamicClient.class);

        Map<String, String> params = new HashMap<>();
        params.put("code", "aiSrc");
        Object result = bean.executeGetApi("uc", "/sysParam/findAiSrc", params);
        JSONObject resultObj = JSONObject.parseObject(JSONObject.toJSONString(result));
        String code = resultObj.get("code").toString();
        if ("200".equals(code)) {
            JSONObject data = JSONObject.parseObject(resultObj.get("data").toString());
//            requestTemplate.target(data.get("value").toString() + requestTemplate.url());
            Target target = new Target.HardCodedTarget(requestTemplate.feignTarget().type(), requestTemplate.feignTarget().name(), data.get("value").toString());
            requestTemplate.feignTarget(target);
        } else {
            throw new LetsException("AI应用地址信息获取失败");
        }
    }
}