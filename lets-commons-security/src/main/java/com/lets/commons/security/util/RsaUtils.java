package com.lets.commons.security.util;

import com.lets.platform.common.pojo.constant.RsaConstant;
import org.apache.commons.codec.binary.Base64;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * RSA加解密工具类
 * @ClassName: RsaUtils
 * @Author: DING WEI
 * @Date: 2021/04/23 13:50
 * @Version: 1.0
 */
@Component
public class RsaUtils {

    public static RsaUtils rsaUtils;

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @PostConstruct
    public void init(){
        rsaUtils = this;
        rsaUtils.redisTemplate = this.redisTemplate;
    }

    /**
     * RSA最大加密明文大小
     */
    private static final int MAX_ENCRYPT_BLOCK = 117;

    /**
     * RSA最大解密密文大小
     */
    private static final int MAX_DECRYPT_BLOCK = 128;

    /**
     * 获取密钥对
     *
     * @return java.security.KeyPair
     * @author DING WEI
     * @Date 2021/04/23 9:55
     */
    public static KeyPair getKeyPair() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024);
        return generator.generateKeyPair();
    }

    /**
     * 获取公钥、私钥
     * @return
     * @author DING WEI
     * @date 2021/04/23 9:40
     * @version 1.0
     */
    public static Map<String, String> getKeys() throws Exception {
        KeyPair keyPair = getKeyPair();
        String privateKey = new String(Base64Utils.encoder(keyPair.getPrivate().getEncoded()));
        String publicKey = new String(Base64Utils.encoder(keyPair.getPublic().getEncoded()));
        Map<String, String> keys = new HashMap<>();
        keys.put(RsaConstant.RSA_PUBLIC_KEY, publicKey);
        keys.put(RsaConstant.RSA_PRIVATE_KEY, privateKey);
        return keys;
    }

    /**
     * 获取私钥
     *
     * @param privateKey 私钥字符串
     * @return java.security.PrivateKey
     * @author DING WEI
     * @Date 2021/04/23 9:55
     */
    public static PrivateKey getPrivateKey(String privateKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance(RsaConstant.ALGORITHM_NAME);
        byte[] decodedKey = Base64Utils.decoder(privateKey.getBytes());
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decodedKey);
        return keyFactory.generatePrivate(keySpec);
    }

    /**
     * 获取公钥
     *
     * @param publicKey 公钥字符串
     * @return java.security.PublicKey
     * @author DING WEI
     * @Date 2021/04/23 9:55
     */
    public static PublicKey getPublicKey(String publicKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance(RsaConstant.ALGORITHM_NAME);
        byte[] decodedKey = Base64Utils.decoder(publicKey.getBytes());
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(decodedKey);
        return keyFactory.generatePublic(keySpec);
    }

    /**
     * RSA加密
     *
     * @param data      待加密数据
     * @param publicKey 公钥
     * @return java.lang.String
     * @author DING WEI
     * @Date 2021/04/23 9:55
     */
    public static String encrypt(String data, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RsaConstant.ALGORITHM_NAME);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        int inputLen = data.getBytes().length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offset = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段加密
        while (inputLen - offset > 0) {
            if (inputLen - offset > MAX_ENCRYPT_BLOCK) {
                cache = cipher.doFinal(data.getBytes(), offset, MAX_ENCRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(data.getBytes(), offset, inputLen - offset);
            }
            out.write(cache, 0, cache.length);
            i++;
            offset = i * MAX_ENCRYPT_BLOCK;
        }
        byte[] encryptedData = out.toByteArray();
        out.close();
        // 获取加密内容使用base64进行编码,并以UTF-8为标准转化成字符串
        // 加密后的字符串
        return new String(Base64Utils.encoder(encryptedData));
    }

    /**
     * RSA解密
     *
     * @param data       待解密数据
     * @param privateKey 私钥
     * @return java.lang.String
     * @author DING WEI
     * @Date 2021/04/23 9:55
     */
    public static String decrypt(String data, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RsaConstant.ALGORITHM_NAME);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] dataBytes = Base64.decodeBase64(data);
        int inputLen = dataBytes.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offset = 0;
        byte[] cache;
        int i = 0;
        //对数据分段解密
        while (inputLen - offset > 0) {
            if (inputLen - offset > MAX_DECRYPT_BLOCK) {
                cache = cipher.doFinal(dataBytes, offset, MAX_DECRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(dataBytes, offset, inputLen - offset);
            }
            out.write(cache, 0, cache.length);
            i++;
            offset = i * MAX_DECRYPT_BLOCK;
        }
        byte[] decryptedData = out.toByteArray();
        out.close();
        // 解密后的内容
        return new String(decryptedData, "UTF-8");
    }

    /**
     * 签名
     *
     * @param data       待签名数据
     * @param privateKey 私钥
     * @return java.lang.String
     * @author DING WEI
     * @Date 2021/04/23 9:55
     */
    public static String sign(String data, PrivateKey privateKey) throws Exception {
        byte[] keyBytes = privateKey.getEncoded();
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(RsaConstant.ALGORITHM_NAME);
        PrivateKey key = keyFactory.generatePrivate(keySpec);
        Signature signature = Signature.getInstance(RsaConstant.MD5_RSA);
        signature.initSign(key);
        signature.update(data.getBytes());
        return new String(Base64Utils.encoder(signature.sign()));
    }

    /**
     * 验签
     *
     * @param srcData   原始字符串
     * @param publicKey 公钥
     * @param sign      签名
     * @return boolean 是否验签通过
     * @author DING WEI
     * @Date 2021/04/23 9:55
     */
    public static boolean verify(String srcData, PublicKey publicKey, String sign) throws Exception {
        byte[] keyBytes = publicKey.getEncoded();
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(RsaConstant.ALGORITHM_NAME);
        PublicKey key = keyFactory.generatePublic(keySpec);
        Signature signature = Signature.getInstance(RsaConstant.MD5_RSA);
        signature.initVerify(key);
        signature.update(srcData.getBytes());
        return signature.verify(Base64Utils.decoder(sign.getBytes()));
    }

    /**
     * 获取字符串类型的公钥
     * @author DING WEI
     * @date 2021/04/23 11:31
     * @version 1.0
     */
    public static String getPublicKey() {
        if (rsaUtils.redisTemplate.hasKey(RsaConstant.RSA_PUBLIC_KEY)) {
            Object redisVal = rsaUtils.redisTemplate.opsForValue().get(RsaConstant.RSA_PUBLIC_KEY);
            if (redisVal != null) {
                return redisVal.toString();
            }
        } else {
            return setKey2Redis(RsaConstant.RSA_PUBLIC_KEY);
        }
        return null;
    }

    /**
     * 获取字符串类型的秘钥
     * @author DING WEI
     * @date 2021/04/23 11:31
     * @version 1.0
     */
    public static String getPrivateKey() {
        if (rsaUtils.redisTemplate.hasKey(RsaConstant.RSA_PRIVATE_KEY)) {
            Object redisVal = rsaUtils.redisTemplate.opsForValue().get(RsaConstant.RSA_PRIVATE_KEY);
            if (redisVal != null) {
                return redisVal.toString();
            }
        } else {
            return setKey2Redis(RsaConstant.RSA_PRIVATE_KEY);
        }
        return null;
    }

    /**
     * 添加秘钥对到Redis缓存
     * @param type RSAConstant.RSA_PUBLIC_KEY 公钥
     *             RSAConstant.RSA_PRIVATE_KEY 私钥
     * @return
     * @author DING WEI
     * @date 2021/04/23 11:31
     * @version 1.0
     */
    public static String setKey2Redis(String type) {
        try {
            Map<String, String> keys = RsaUtils.getKeys();
            String publicKey = keys.get(RsaConstant.RSA_PUBLIC_KEY);
            String privateKey = keys.get(RsaConstant.RSA_PRIVATE_KEY);
            rsaUtils.redisTemplate.opsForValue().set(RsaConstant.RSA_PRIVATE_KEY, privateKey, 7L, TimeUnit.DAYS);
            rsaUtils.redisTemplate.opsForValue().set(RsaConstant.RSA_PUBLIC_KEY, publicKey, 7L, TimeUnit.DAYS);
            return type.equals(RsaConstant.RSA_PUBLIC_KEY) ? publicKey : privateKey;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            // 生成密钥对
            KeyPair keyPair = getKeyPair();
            String privateKey = new String(Base64Utils.encoder(keyPair.getPrivate().getEncoded()));
//            String publicKey = new String(Base64Utils.encoder(keyPair.getPublic().getEncoded()));
            String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCHixBPJJjHDittUm9E1qOEOlB4Yqla66fPK4t1Nn/rwYIiIydu+YNbfhwJZx+GvxeTD4ozYetHk7rgLYnPgHRRNNnwxVW1SzB4DIwAvG8BYMXFnWikLbXOCUxpJt9Ngk5WEl/4ZhCgieZ4W7IHWOao+m7igexA0C7G6klDY/j8fQIDAQAB";
            System.out.println("私钥:" + privateKey);
            System.out.println("公钥:" + publicKey);
            // RSA加密
            String data = "19941014dw";
            String encryptData = encrypt(data, getPublicKey(publicKey));
            System.out.println("加密后内容:" + encryptData);
            // RSA解密
            String decryptData = decrypt(encryptData, getPrivateKey(privateKey));
            System.out.println("解密后内容:" + decryptData);
            // RSA签名
            String sign = sign(data, getPrivateKey(privateKey));
            System.out.println("签名:" + sign);
            // RSA验签
            boolean result = verify(data, getPublicKey(publicKey), sign);
            System.out.print("验签结果:" + result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("加解密异常");
        }
    }

}
