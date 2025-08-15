package com.lets.platform.common.pojo.util;

import cn.hutool.crypto.digest.MD5;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5Utils
 * @author: DING WEI
 * @date: 2022/9/20 16:38
 */
public class MD5Utils {

    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
            'e', 'f'};

    private static final ThreadLocal<MessageDigest> MESSAGE_DIGEST_LOCAL = new ThreadLocal<MessageDigest>() {
        @Override
        protected MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                return null;
            }
        }
    };

    /**
     * Calculate MD5 hex string.
     *
     * @param bytes byte arrays
     * @return MD5 hex string of input
     * @throws NoSuchAlgorithmException if can't load md5 digest spi.
     */
    public static String md5Hex(byte[] bytes) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MESSAGE_DIGEST_LOCAL.get();
            if (messageDigest != null) {
                return encodeHexString(messageDigest.digest(bytes));
            }
            throw new NoSuchAlgorithmException("MessageDigest get MD5 instance error");
        } finally {
            MESSAGE_DIGEST_LOCAL.remove();
        }
    }

    /**
     * Calculate MD5 hex string with encode charset.
     *
     * @param value  value
     * @param encode encode charset of input
     * @return MD5 hex string of input
     */
    public static String md5Hex(String value, String encode) {
        try {
            return md5Hex(value.getBytes(encode));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Convert a byte array into a visible string.
     */
    public static String encodeHexString(byte[] bytes) {
        int l = bytes.length;

        char[] out = new char[l << 1];

        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = DIGITS_LOWER[(0xF0 & bytes[i]) >>> 4];
            out[j++] = DIGITS_LOWER[0x0F & bytes[i]];
        }

        return new String(out);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
//        File file1 = new File("C:\\Users\\dell\\Desktop\\template\\XSTH-202209200000002_20220920.xlsx");
//        System.out.println(file1.length());
//
//        String file1Md5 = MD5Utils.md5Hex(fileToBytes(file1)); //c4ca4238a0b923820dcc509a6f75849b
//        System.out.println(file1Md5);

        String materialSpecific = "1681126057581600770:1;1681126144848289794:2;1681127045084344322:1680099333553106945;1681130746045915137:2";
        String hex1 = MD5.create().digestHex(materialSpecific);
        System.out.println(hex1);
        String hex2 = MD5.create().digestHex(materialSpecific);
        System.out.println(hex1.equals(hex2));
    }

    /**
     * 文件转字节
     * @param file
     * @return
     */
    public static byte[] fileToBytes(File file) {
        FileInputStream in = null;
        ByteArrayOutputStream out = null;
        byte[] buffer = null;
        try{
            in = new FileInputStream(file);
            out = new ByteArrayOutputStream();
            int n;
            byte[] b = new byte[1024];
            while ((n = in.read(b)) != -1) {
                out.write(b, 0, n);
            }
            buffer = out.toByteArray();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return buffer;
    }
}
