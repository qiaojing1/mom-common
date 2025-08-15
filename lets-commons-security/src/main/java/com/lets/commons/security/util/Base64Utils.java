package com.lets.commons.security.util;

import java.util.Base64;

/**
 * Base64加解密工具类
 * @ClassName: Base64Utils
 * @Author: DING WEI
 * @Date: 2021/04/23 13:50
 * @Version: 1.0
 */
public class Base64Utils {

    public static final Base64.Encoder encoder = Base64.getEncoder();
    public static final Base64.Decoder decoder = Base64.getDecoder();

    /**
     * base64 加密
     * @param encodeText 明文
     * @return
     */
    public static byte[] encoder(byte[] encodeText) {
        return encoder.encode(encodeText);
    }

    /**
     * base64 解密
     * @param decodeText 密文
     */
    public static byte[] decoder(byte[] decodeText) {
        return decoder.decode(decodeText);
    }

}
