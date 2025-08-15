package com.lets.platform.common.pojo.constant;

/**
 * RSA加解密常量
 * @ClassName: RsaConstant
 * @Author: DING WEI
 * @Date: 2021/04/23 13:50
 * @Version: 1.0
 */
public class RsaConstant {

    public static final String ALGORITHM_NAME = "RSA";

    public static final String MD5_RSA = "MD5withRSA";

    /**
     * RSA加密 密文长度
     */
    public static final Integer ENCRYPTION_LENGTH = 172;

    /**
     * RSA加密公钥 缓存信息 KEY
     */
    public static final String RSA_PUBLIC_KEY = "RSA:PUBLIC_KEY";
    /**
     * RSA加密私钥 缓存信息 KEY
     */
    public static final String RSA_PRIVATE_KEY = "RSA:PRIVATE_KEY";

    public static final String PASSWORD =  "password";

    public static final String OLD_PASSWORD =  "oldPassword";
}
