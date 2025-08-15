package com.lets.commons.security.interceptor;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import com.lets.commons.redis.redlock.Redisson2Properties;
import com.lets.commons.security.pojo.EnvironEntity;
import com.lets.commons.security.pojo.LoginWhiteListConfig;
import com.lets.commons.security.pojo.UserDetailInfoVo;
import com.lets.commons.security.pojo.UserVo;
import com.lets.commons.security.util.AuthUtil;
import com.lets.commons.security.util.JWTUtil;
import com.lets.commons.security.util.ThreadEnvUtil;
import com.lets.platform.client.uc.client.LoginClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.enums.ClientEnum;
import com.lets.platform.common.pojo.enums.I18nTypeEnum;
import com.lets.platform.common.pojo.exception.LetsException;
import io.jsonwebtoken.Claims;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @Author: QIAO JING @Date: 2022/3/24 19:51
 */
@Slf4j
@Component
public class JWTInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private RedisTemplate<String, Object> letsRedisTemplate;

    @Autowired
    private LoginWhiteListConfig loginWhiteListConfig;

    @Resource
    private Redisson2Properties redisson2Properties;

    @Resource
    @Lazy
    private LoginClient loginClient;

    @Override
    public boolean preHandle(HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler)
            throws Exception {
        // 白名单
        String header = request.getHeader("x-forwarded-prefix");
        if (StringUtils.isEmpty(header)) {
            header = "";
        }
        String token = "";
        String requestURI = request.getRequestURI();
        String extToken = request.getHeader("ext_token");
        String xxlJobToken = request.getHeader("xxl_job_token");
        String language = request.getHeader("lang");
        if (StrUtil.isEmpty(language)) {
            language = I18nTypeEnum.ZH_CH.getCode();
        }
        EnvironEntity.setLanguage(language);
        if (loginWhiteListConfig.isWhiteList(requestURI) || requestURI.startsWith("/file/showFile/") || requestURI.startsWith("/jmreport/")) {
            if ("/login/login".equals(requestURI) || "/login/swipeLoginByLoginId".equals(requestURI)) {
                return true;
            }
            String tokenKey = request.getHeader("access_token");
            if (!Strings.isNullOrEmpty(tokenKey)) {
                Object tokenInRedis = letsRedisTemplate.opsForValue().get(tokenKey);
                if (Objects.isNull(tokenInRedis)) {
                    return true;
                }
                token = tokenInRedis.toString();
                UserDetailInfoVo userJWT = AuthUtil.ParseJWT(token, true);
                if (Objects.isNull(userJWT.getUser()) || StringUtils.isEmpty(userJWT.getJti())) {
                    return true;
                }
                InitEnviron(request, token);
                UserVo user = userJWT.getUser();
                request.setAttribute("UserVo", user);
                ThreadEnvUtil.SetUserObject(user);
                return true;
            }
            if (!Strings.isNullOrEmpty(extToken)) {
                Claims claims = JWTUtil.ParseJWT(extToken);
                String userName = claims.get("username").toString();
                String tenancyCode = claims.get("tenancyCode").toString();
                String clientType = ClientEnum.EXT.getClientId();
                tokenKey =
                        String.format(
                                "%s-%s-%s-%s", JWTUtil.getLoginTokenPre(), tenancyCode, clientType, userName);
                InitEnvironExt(extToken, tokenKey);
                UserDetailInfoVo userJwt = AuthUtil.ParseJWT(extToken);
                UserVo user = userJwt.getUser();
                request.setAttribute("UserVo", user);
                ThreadEnvUtil.SetUserObject(user);
                return true;
            }
            return true;
        } else if ("dev".equals(System.getenv("env"))) {
            //环境变量添加env=dev,不登陆直接调接口,方便调试
            if ("/login/devLogin".equals(requestURI)) {
                return true;
            }
            String devToken = request.getHeader("access_token");
            if (StrUtil.isNotEmpty(devToken) && devToken.split("-").length > 3) {
                String tenancyCode = devToken.split("-")[1];
                String userName = devToken.split("-")[3];
                InitEnviron(request, "");
                RespMsgBean<Object> result = loginClient.devLogin(tenancyCode, userName);
                if (result.isSuccess() && result.getData() != null) {
                    UserVo userVO = JSONObject.parseObject(result.getData().toString(), UserVo.class);
                    request.setAttribute("UserVo", userVO);
                    ThreadEnvUtil.SetUserObject(userVO);
                    return true;
                }
            }
        }

        String tokenKey = request.getHeader("access_token");

        if ((StrUtil.isEmpty(tokenKey)) && StrUtil.isEmpty(extToken) && StrUtil.isEmpty(xxlJobToken)) {
            log.info(requestURI);
            throw new LetsException(401, "用户未登录");
        }
        if (StrUtil.isNotEmpty(tokenKey)) {
            Object tokenInRedis = letsRedisTemplate.opsForValue().get(tokenKey);
            if (Objects.isNull(tokenInRedis)) {
                log.info(
                        "----------------------------------------tokenKey:{}----------------------------------------url:{}----------------------------------------redis:{}:{}----------------------------------------database:{}",
                        tokenKey, requestURI, redisson2Properties.getHost(), redisson2Properties.getPort(), redisson2Properties.getDatabase());
            }
            ServiceAssert.notNull(tokenInRedis, 401, "用户未登录");
            token = tokenInRedis.toString();
            InitEnviron(request, token);

            UserDetailInfoVo userJWT = AuthUtil.ParseJWT(token);

            UserVo user = userJWT.getUser();
            request.setAttribute("UserVo", user);
            ThreadEnvUtil.SetUserObject(user);
            return true;
        }
        if (StrUtil.isNotEmpty(extToken)) {
            // 第三方token
            Claims claims = JWTUtil.ParseJWT(extToken);
            String userName = claims.get("username").toString();
            String tenancyCode = claims.get("tenancyCode").toString();
            String clientType = ClientEnum.EXT.getClientId();
            tokenKey =
                    String.format(
                            "%s-%s-%s-%s", JWTUtil.getLoginTokenPre(), tenancyCode, clientType, userName);
            InitEnvironExt(extToken, tokenKey);
            UserDetailInfoVo userJwt = AuthUtil.ParseJWT(extToken);
            UserVo user = userJwt.getUser();
            request.setAttribute("UserVo", user);
            ThreadEnvUtil.SetUserObject(user);
            return true;
        }
        if (StrUtil.isNotEmpty(xxlJobToken)) {
            // 任务调度中心
            InitEnvironXxlJob(xxlJobToken);
            UserDetailInfoVo userJwt = AuthUtil.ParseJWT(xxlJobToken);
            UserVo user = userJwt.getUser();
            request.setAttribute("UserVo", user);
            ThreadEnvUtil.SetUserObject(user);
            return true;
        }
        return true;
    }

    /**
     * 鉴权机制调整，为feign夸线程调用准备。耗时事务建议采用异步处理。
     */
    private void InitEnviron(HttpServletRequest request, String token) {
        String client_type = request.getHeader("client_type");
        String tokenKey = request.getHeader("access_token");
        String lang = request.getHeader("lang");
        EnvironEntity.setToken(token);
        EnvironEntity.setClientType(client_type);
        EnvironEntity.setTokenKey(tokenKey);
        EnvironEntity.setLanguage(lang);
    }

    private void InitEnvironExt(String token, String tokenKey) {
        String client_type = ClientEnum.EXT.getClientId();
        EnvironEntity.setToken(token);
        EnvironEntity.setClientType(client_type);
        EnvironEntity.setTokenKey(tokenKey);
    }

    private void InitEnvironXxlJob(String token) {
        String client_type = ClientEnum.XXL_JOB.getClientId();
        EnvironEntity.setToken(token);
        EnvironEntity.setClientType(client_type);
    }
}
