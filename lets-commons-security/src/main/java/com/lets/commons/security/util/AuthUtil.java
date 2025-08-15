package com.lets.commons.security.util;

import cn.hutool.core.lang.Console;
import com.lets.commons.security.pojo.UserAuthentication;
import com.lets.commons.security.pojo.UserDetailInfoVo;
import com.lets.commons.security.pojo.UserVo;
import io.jsonwebtoken.Claims;
import org.springframework.util.Base64Utils;
import org.springframework.util.DigestUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author: LY
 * @Date: 2020/5/5 11:21
 */
public class AuthUtil {


    private final static String salt = "126edd24-850a-44ea-ad14-42b4eecac6d7";

    public static String getHttpBasic(String clientId, String clientSecret) {
        String value = clientId + ":" + clientSecret;
        byte[] encode = Base64Utils.encode(value.getBytes());
        return "Basic " + new String(encode);
    }

    public static String MD5(String beforeString) {
        return DigestUtils.md5DigestAsHex(beforeString.getBytes());
    }

    /*
       加盐 处理密码
     */
    public static String handlePsw(String userId, String psw) {
        return AuthUtil.MD5(userId + psw + salt);
    }

    public static Map<String, Object> CreateJWT(UserAuthentication user, String tenancyCode) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", user.getId());
        map.put("username", user.getUsername());
        map.put("userRealName", user.getName());
        map.put("tenancyId", user.getTenancyId());
        map.put("roleType", user.getRoleType());
        map.put("tenancyCode", tenancyCode);
        map.put("roles", user.getRoles());
        map.put("orgId", user.getOrgId());
        map.put("supplierId", user.getSupplierId());
        String token = JWTUtil.CreateJWT(map);
        map.put("token", token);
        return map;
    }

    public static Map<String, Object> CreateNonExpirationJWT(UserAuthentication user, String tenancyCode) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", user.getId());
        map.put("username", user.getUsername());
        map.put("userRealName", user.getName());
        map.put("tenancyId", user.getTenancyId());
        map.put("roleType", user.getRoleType());
        map.put("tenancyCode", tenancyCode);
        map.put("roles", user.getRoles());
        map.put("orgId", user.getOrgId());
        map.put("supplierId", user.getSupplierId());
        String token = JWTUtil.CreateNonExpirationJWT(map);
        map.put("token", token);
        return map;
    }

    public static UserDetailInfoVo ParseJWT(String token) {
        final Claims claims = JWTUtil.ParseJWT(token);
        UserDetailInfoVo userDetailInfoVO = new UserDetailInfoVo();
        userDetailInfoVO.setJti(claims.get("token_uuid").toString());
        userDetailInfoVO.setClientType(SecurityUtils.getClientId());
        UserVo user = new UserVo();
        user.setId(XSStringUtil.CoventObjectToString(claims.get("userId"), null));
        user.setUsername(XSStringUtil.CoventObjectToString(claims.get("username"), null));
        user.setName(XSStringUtil.CoventObjectToString(claims.get("userRealName"), null));
        user.setTenancyId(XSStringUtil.CoventObjectToString(claims.get("tenancyId"), null));
        user.setRoleType(XSStringUtil.CoventObjectToString(claims.get("roleType"), null));
        user.setTenancyCode(XSStringUtil.CoventObjectToString(claims.get("tenancyCode"), ""));
        user.setPassword(XSStringUtil.CoventObjectToString(claims.get("userPassword"), ""));
        user.setOrgId(XSStringUtil.CoventObjectToString(claims.get("orgId"), ""));
        user.setSupplierId(XSStringUtil.CoventObjectToString(claims.get("supplierId"), ""));

        if (Objects.nonNull(claims.get("roles"))) {
            user.setRoles(Arrays.asList(XSStringUtil.CoventObjectToStrings(claims.get("roles"), null)));
        }
        userDetailInfoVO.setUser(user);
        return userDetailInfoVO;


    }

    public static UserDetailInfoVo ParseJWT(String token, boolean flag) {
        final Claims claims = JWTUtil.ParseJWT(token, flag);
        if (Objects.isNull(claims) && flag) {
            return new UserDetailInfoVo();
        }
        UserDetailInfoVo userDetailInfoVO = new UserDetailInfoVo();
        userDetailInfoVO.setJti(claims.get("token_uuid").toString());
        userDetailInfoVO.setClientType(SecurityUtils.getClientId());
        UserVo user = new UserVo();
        user.setId(XSStringUtil.CoventObjectToString(claims.get("userId"), null));
        user.setUsername(XSStringUtil.CoventObjectToString(claims.get("username"), null));
        user.setName(XSStringUtil.CoventObjectToString(claims.get("userRealName"), null));
        user.setTenancyId(XSStringUtil.CoventObjectToString(claims.get("tenancyId"), null));
        user.setRoleType(XSStringUtil.CoventObjectToString(claims.get("roleType"), null));
        user.setTenancyCode(XSStringUtil.CoventObjectToString(claims.get("tenancyCode"), ""));
        user.setPassword(XSStringUtil.CoventObjectToString(claims.get("userPassword"), ""));
        user.setOrgId(XSStringUtil.CoventObjectToString(claims.get("orgId"), ""));
        user.setSupplierId(XSStringUtil.CoventObjectToString(claims.get("supplierId"), ""));
        if (Objects.nonNull(claims.get("roles"))) {
            user.setRoles(Arrays.asList(XSStringUtil.CoventObjectToStrings(claims.get("roles"), null)));
        }
        userDetailInfoVO.setUser(user);
        return userDetailInfoVO;


    }

    public static String ParseJWT(String token, String key) {
        final Claims claims = JWTUtil.ParseJWT(token);
        return XSStringUtil.CoventObjectToString(claims.get(key), null);
    }

    public static void main(String[] args) {
        String psd = handlePsw("7f16492b-3ead-4d37-8dd1-707edfc669f8", "0659c7992e268962384eb17fafe88364");
        Console.log("psd = {}\n", psd);
    }

}
