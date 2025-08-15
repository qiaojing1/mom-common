package com.lets.platform.common.pojo.util;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;

/**
 * AES加密解密工具类
 * @author: DING WEI
 * @date: 2023/4/26 14:30
 */
public class AESEncodeDecodeUtils {

    private static final byte[] KEY = {-96, 1, 39, -114, 118, -120, 120, 13, 37, 89, -123, -113, -7, -100, 83, 80};

    public static String encode(String str) {
        SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, KEY);
        return aes.encryptHex(str);
    }

    public static String decode(String str) {
        SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, KEY);
        return aes.decryptStr(str, CharsetUtil.CHARSET_UTF_8);
    }

}
