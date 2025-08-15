package com.lets.commons.security.util;

import com.lets.platform.common.pojo.exception.LetsException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: LY
 * @Date: 2020/5/9 15:08
 */
@Component
public class JWTUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JWTUtil.class);
    private static JWTUtil staticInstance = new JWTUtil();

    private static String loginTokenPre = "logintoken";
    private static String tokenSecretkey;
    private static int tokenRedisTimeSec;

    @Value("${spring.application.auth.token-secret-key}")
    private String vtokenSecretkey;
    @Value("${spring.application.auth.token-redis-time-sec}")
    private int vtokenRedisTimeSec;

    public static String getLoginTokenPre() {
        return loginTokenPre;
    }

    public static int getTokenRedisTimeSec() {
        return tokenRedisTimeSec;
    }

    /**
     * 判断是否需要刷新TOKEN
     *
     * @param issueAt token签发日期
     * @return 是否需要刷新TOKEN
     */
    public static boolean shouldTokenRefresh(Date issueAt) {
        return true;
    }

    public static String CreateJWT(Map<String, Object> map) {
        map.put("token_uuid", UUID.randomUUID().toString());
        return Jwts.builder().setId(map.get("userId").toString()).setSubject(map.get("userRealName").toString())
                   .setExpiration(new Date(System.currentTimeMillis() + tokenRedisTimeSec * 1000L))
                   .addClaims(map).setIssuedAt(new Date())
                   .signWith(SignatureAlgorithm.HS256, tokenSecretkey).compact();
    }

    public static String CreateNonExpirationJWT(Map<String, Object> map) {
        map.put("token_uuid", UUID.randomUUID().toString());
        return Jwts.builder().setId(map.get("userId").toString()).setSubject(map.get("userRealName").toString())
                   .setExpiration(null)
                   .addClaims(map).setIssuedAt(new Date())
                   .signWith(SignatureAlgorithm.HS256, tokenSecretkey).compact();
    }

    public static String RefreshToken(Claims claims) {
        //只要保证 uuid 不变就行
        return Jwts.builder().setId(claims.get("userId").toString()).setSubject(claims.get("userRealName").toString())
                   .setExpiration(new Date(System.currentTimeMillis() + tokenRedisTimeSec * 1000L))
                   .addClaims(claims).setIssuedAt(new Date())
                   .signWith(SignatureAlgorithm.HS256, tokenSecretkey).compact();
    }

    public static Claims ParseJWT(String token) {
        try {
            return Jwts.parser()
                       .setSigningKey(tokenSecretkey)
                       .parseClaimsJws(token)
                       .getBody();
        } catch (ExpiredJwtException e) {
            throw new LetsException(401, "登录状态过期");
        } catch (Exception e) {
            throw new LetsException(401, "请重新登录");

        }

    }

    public static Claims ParseJWT(String token, boolean flag) {
        try {
            return Jwts.parser()
                       .setSigningKey(tokenSecretkey)
                       .parseClaimsJws(token)
                       .getBody();
        } catch (ExpiredJwtException e) {
            if (flag) {
                return null;
            }
            throw new LetsException(401, "登录状态过期");
        } catch (Exception e) {
            if (flag) {
                return null;
            }
            throw new LetsException(401, "请重新登录");

        }

    }

    @PostConstruct
    public void CopyConfig() {
        LOGGER.debug("鉴权工具初始化完成");
        staticInstance.tokenSecretkey = vtokenSecretkey;
        staticInstance.tokenRedisTimeSec = vtokenRedisTimeSec;

    }

}
