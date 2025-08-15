package com.lets.commons.log.aspect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lets.commons.log.service.LogService;
import com.lets.commons.log.util.IpUtil;
import com.lets.commons.log.util.MyReflectionUtils;
import com.lets.commons.security.pojo.User;
import com.lets.commons.security.pojo.UserVo;
import com.lets.commons.security.util.SecurityUtils;
import com.lets.platform.client.uc.client.MenuClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.annotation.EnableLog;
import com.lets.platform.model.common.entity.LogDo;
import com.lets.platform.common.pojo.enums.RespCodeEnum;
import com.lets.platform.common.pojo.util.IdUtil;
import com.lets.platform.model.uc.entity.SysMenu;
import io.swagger.annotations.ApiOperation;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 异步日志
 *
 * @author DING WEI
 * @version 1.0
 * @date 8/17/21 10:34 AM
 */
@Service
public class LogAspectService {

    public static final String REG = "[\t\r\n]";
    private static final Logger logger = LoggerFactory.getLogger(LogAspectService.class);
    @Resource
    private LogService logService;
    @Resource
    @Lazy
    private MenuClient menuClient;

    /**
     * 切面异步日志存储
     *
     * @author DING WEI
     * @date 8/17/21 11:04 AM
     */
    public void createLog(MethodInvocation invocation, long time, Object o,String menuCodeHeader) throws Throwable {
        this.createAsync(this.generateLog(invocation.getThis().getClass(), invocation.getMethod(), invocation.getArguments(), time, o,menuCodeHeader));
    }

    /**
     * 登陆日志
     *
     * @param user 用户对象
     * @author DING WEI
     * @date 2022/03/06 9:50
     */
    public void createLoginLog(User user) {
        if (user != null) {
            this.createAsync(this.newLogForLogin(user, LoginKind.LOGIN));
        }
    }

    /**
     * 登出日志
     *
     * @author DING WEI
     * @date 8/17/21 11:03 AM
     */
    public void createLogoutLog(User user) {
        if (user != null) {
            this.createAsync(this.newLogForLogin(user, LoginKind.LOGOUT));
        }
    }

    /**
     * 异步日志存储
     *
     * @author DING WEI
     * @date 8/17/21 11:02 AM
     */
    @Async
    public void createAsync(LogDo log) {
        this.logService.insert(log);
    }

    /**
     * 创建登录日志
     *
     * @author DING WEI
     * @date 8/17/21 11:01 AM
     */
    public LogDo newLogForLogin(User user, LoginKind kind) {
        LogDo log = new LogDo();
        log.setId(IdUtil.getStrId());
        log.setType(Type.LOGIN.name());
        log.setName(kind.getValue());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        setLogRequest(attributes, log);
        if (Objects.nonNull(user)) {
            log.setCreateUser(user.getId());
            log.setTenancyId(user.getTenancyId());
            log.setMacAddress(user.getMacAddress());
            String loginIp = user.getLoginIp();
            if (StringUtils.isNotBlank(loginIp)) {
                log.setRequestIp(loginIp);
            }
        }
        log.setCreateTime(LocalDateTime.now());
        log.setSuccess(true);
        log.setException(null);
        return log;
    }

    /**
     * 设置日志请求头
     *
     * @author DING WEI
     * @date 8/17/21 11:00 AM
     */
    private void setLogRequest(ServletRequestAttributes attributes, LogDo log) {
        if (null != attributes) {
            HttpServletRequest request = attributes.getRequest();
            log.setRequestUrl(request.getRequestURL().toString());
            log.setRequestType(request.getMethod());
            String requestIp = IpUtil.getClientIP(request);
            log.setRequestIp(requestIp);
            logger.info("HttpServletRequest获取ip地址为：RemoteAddr-{},RemoteHost-{};IpUtil获取的地址为：{}",
                    request.getRemoteAddr(), request.getRemoteHost(), requestIp);
        }
    }

    /**
     * 构建日志
     *
     * @author DING WEI
     * @date 8/17/21 11:00 AM
     */
    public LogDo generateLog(Class<?> clazz, Method method, Object[] args, long time, Object o,String menuCodeHeader) {

        LogDo log = new LogDo();
        log.setId(IdUtil.getStrId());
        // 记录日志
        ApiOperation operation = method.getAnnotation(ApiOperation.class);
        if (Objects.nonNull(operation)) {
            log.setName(operation.value());
        }

        EnableLog enableLog = method.getAnnotation(EnableLog.class);
        if (Objects.nonNull(enableLog)) {
            String belongMenu = enableLog.belongMenu();
            if(StringUtils.isEmpty(belongMenu) && StringUtils.isNotEmpty(menuCodeHeader)) {
                belongMenu = menuCodeHeader;
            }
            boolean importData = method.getName().equals("importData");
            try{
                if(!importData) {
                    JSONObject requestParam = JSON.parseObject(JSON.toJSONString(args[0]));
                    if(StringUtils.isEmpty(belongMenu) && requestParam.containsKey("menuCode")) {
                        String menuCode = requestParam.getString("menuCode");
                        belongMenu = menuCode;
                    }
                }else {
                    String menuCode = args[1].toString();
                    SysMenu handler = menuClient.getByCode(menuCode).handler();
                    if(Objects.nonNull(handler)) {
                        belongMenu = menuCode;
                    }
                }

            }catch (Exception e) {

            }
            if(StringUtils.isNotEmpty(belongMenu)) {
                log.setBelongMenu(belongMenu);
                SysMenu handler = menuClient.getByCode(belongMenu).handler();
                if(Objects.nonNull(handler)) {
                    log.setBelongMenuName(handler.getName());
                }
            }
            String triggerEvent = enableLog.triggerEvent();
            log.setTriggerEvent(triggerEvent);
        }
        log.setType(LogAspectService.Type.SYSTEM.name());
        log.setRequestClass(clazz.getSimpleName());
        log.setRequestMethod(method.getName());
        try{
            log.setRequestParameter(JSON.toJSONString(args[0]));
        }catch (Exception e) {

        }
        log.setConsumeTime(time);

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        setLogRequest(attributes, log);

        UserVo userEntity = SecurityUtils.currentUser();
        String name = "[" + userEntity.getUsername() + "]" + userEntity.getName();
        if (null != userEntity) {
            log.setCreateUser(userEntity.getId());
            log.setCreateUserName(name);
        }
        log.setCreateTime(LocalDateTime.now());

        boolean success = true;
        String msg = null;
        RespMsgBean<?> bean = null;
        if (o != null) {
            if (o instanceof RespMsgBean) {
                bean = (RespMsgBean<?>) o;
            }
            if (bean != null) {
                int code = bean.getCode();
                if (!RespCodeEnum.SUCCESS.getCode().equals(code)) {
                    success = false;
                }
                msg = JSON.toJSONString(bean);
            }
            log.setSuccess(success);
            log.setException(getMsgLimit1000(msg));
        }
        log.setSuccess(success);
        log.setException(msg);
        log.setTenancyId(SecurityUtils.getTenancyId());
        return log;
    }

    /**
     * 报错信息截取,最多获取1000个字符
     *
     * @author DING WEI
     * @date 8/24/21 9:11 PM
     */
    public String getMsgLimit1000(String msg) {
        Pattern p = Pattern.compile(REG);
        if (StringUtils.isNotBlank(msg)) {
            Matcher m = p.matcher(msg);
            msg = m.replaceAll("").replaceAll("\\s+", " ");
            if (msg.length() > 1000) {
                msg = msg.substring(0, 1000);
            }
        }
        return msg;
    }

    /**
     * 通过反射获取值
     *
     * @author DING WEI
     * @date 8/17/21 10:57 AM
     */
    public String getParams(Method method, Object[] args) throws RuntimeException {
        String msg;
        try {
            return MyReflectionUtils.getParams(method, args);
        } catch (Exception ex) {
            msg = "获取参数错误";
        }
        return msg;
    }

    public enum Type {
        LOGIN, SYSTEM
    }

    public enum LoginKind {
        LOGIN("登录"),
        LOGOUT("登出");
        private final String value;

        LoginKind(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}