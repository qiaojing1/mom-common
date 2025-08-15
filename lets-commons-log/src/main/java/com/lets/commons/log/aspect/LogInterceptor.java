package com.lets.commons.log.aspect;

import com.lets.platform.common.pojo.RespMsgBean;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 创建环绕通知,拦截指定方法
 * @author DING WEI
 * @date 8/17/21 10:33 AM
 * @version 1.0
 */
@Component
public class LogInterceptor implements MethodInterceptor {

    @Autowired
    private LogAspectService logAspectService;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // 执行业务
        boolean success = false;
        long start = System.currentTimeMillis();
        Object result = null;
        long time = 0L;
        RespMsgBean respMsgBean = null;
        String menuCodeHeader = "";
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

            if (attributes != null) {
                HttpServletRequest request = attributes.getRequest();
                menuCodeHeader = request.getHeader("Menucode");
            }

            result = invocation.proceed();
            success = true;
        } catch (Throwable throwable) {
             time = System.currentTimeMillis() - start;
             respMsgBean = new RespMsgBean();
             respMsgBean.setCode(0);
             respMsgBean.setMsg(throwable.getMessage());
             logAspectService.createLog(invocation, time, respMsgBean,menuCodeHeader);
             throw throwable;
        }
        if(success){
            time = System.currentTimeMillis() - start;
            // 异步记录日志
            logAspectService.createLog(invocation, time, result,menuCodeHeader);
        }
        return result;
    }
}