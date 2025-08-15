package com.lets.commons.security.config;

import com.lets.commons.redis.util.UnitUtil;
import com.lets.commons.security.util.ThreadEnvUtil;
import com.lets.platform.common.pojo.RespMsgBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * TODO
 *
 * @ClassName MyResponseBodyAdvice
 * @author: DING WEI
 * @create: 2021/04/23 17:08
 * @Version 1.0
 **/
@RestControllerAdvice(basePackages = "com.lets")
public class MyResponseBodyAdvice implements ResponseBodyAdvice {
    private static final Logger logger = LoggerFactory.getLogger(MyResponseBodyAdvice.class);

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        try {
            if (body == null) {
                return new RespMsgBean<>();
            }
            return body;
        } catch (Exception e) {
            logger.error("MyResponseBodyAdvice beforeBodyWrite unknown:", e);
            return "未知异常";
        } finally {
            ThreadEnvUtil.clear();
            UnitUtil.clearLocalCache();
        }

    }
}
