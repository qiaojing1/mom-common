package com.lets.platform.client.dynamic;

import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * DynamicFeignClientFactory
 * @author: DING WEI
 * @date: 2023/4/18 10:29
 */
@Component
public class DynamicFeignClientFactory<T> {

    private final FeignClientBuilder feignClientBuilder;

    public DynamicFeignClientFactory(ApplicationContext appContext) {
        this.feignClientBuilder = new FeignClientBuilder(appContext);
    }

    public T getFeignClient(final Class<T> type, String serviceId) {
        return this.feignClientBuilder.forType(type, serviceId).build();
    }

}
