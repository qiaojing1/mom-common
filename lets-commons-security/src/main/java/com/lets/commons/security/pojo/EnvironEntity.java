package com.lets.commons.security.pojo;

import com.lets.commons.security.constant.EnvironCons;

/**
 * @author QIAO JING
 * @description
 * @since 2022/3/23 19:22
 */
public class EnvironEntity {

    public static String getTokenKey() {
        return (String) GlobalMemcache.getL(EnvironCons.TOKENKEY);
    }

    public static void setTokenKey(String tokenKey) {
        GlobalMemcache.setL(EnvironCons.TOKENKEY, tokenKey);
    }

    public static void delTokenKey() {
        GlobalMemcache.del(EnvironCons.TOKENKEY);
    }

    public static String getToken() {
        return (String) GlobalMemcache.getL(EnvironCons.TOKEN);
    }

    public static void setToken(String token) {
        GlobalMemcache.setL(EnvironCons.TOKEN, token);
    }

    public static String getClientType() {
        return (String) GlobalMemcache.getL(EnvironCons.CLIENTTYPE);
    }

    public static void setClientType(String ClientType) {
        GlobalMemcache.setL(EnvironCons.CLIENTTYPE, ClientType);
    }

    public static String getModule() {
        return (String) GlobalMemcache.getL(EnvironCons.MODULE);
    }

    public static void setModule(String Module) {
        GlobalMemcache.setL(EnvironCons.MODULE, Module);
    }

    public static String getView() {
        return (String) GlobalMemcache.getL(EnvironCons.VIEW);
    }

    public static void setView(String View) {
        GlobalMemcache.setL(EnvironCons.VIEW, View);
    }

    public static String getLanguage() {
        return (String) GlobalMemcache.getL(EnvironCons.LANGUAGE);
    }

    public static void setLanguage(String Language) {
        GlobalMemcache.setL(EnvironCons.LANGUAGE, Language);
    }
}
