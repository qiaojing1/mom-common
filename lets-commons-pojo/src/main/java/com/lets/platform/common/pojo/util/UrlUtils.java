package com.lets.platform.common.pojo.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @description: URL工具类
 * @author: DING WEI
 * @date: 2022/5/23 16:51
 */
public class UrlUtils {

    /**
     * 得到文件流
     * @param url  网络图片URL地址
     * @return
     */
    public static byte[] getFileStream(String url) {
        try {
            URL httpUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection)httpUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5 * 1000);
            // 通过输入流获取图片数据
            InputStream inStream = conn.getInputStream();
            // 得到图片的二进制数据
            byte[] btImg = readInputStream(inStream);
            return btImg;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从输入流中获取数据
     * @param inStream 输入流
     * @return
     * @throws Exception
     */
    public static byte[] readInputStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while( (len=inStream.read(buffer)) != -1 ){
            outStream.write(buffer, 0, len);
        }
        inStream.close();
        return outStream.toByteArray();
    }

    public static InputStream byteByUrl(String urlOrPath) throws Exception {
        if (urlOrPath.toLowerCase().startsWith("http")) {
            URL url = new URL(urlOrPath);
            return url.openStream();
        } else {
            File file = new File(urlOrPath);
            if (!file.isFile() || !file.exists() || !file.canRead()) {
                return null;
            }
            return new FileInputStream(file);
        }
    }

    public static ByteArrayOutputStream toByteArrayOutputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, length);
        }
        outputStream.flush();
        return outputStream;
    }

    public static ByteArrayOutputStream toByteArrayOutputStream(String url) throws Exception {
        InputStream inputStream = byteByUrl(url);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, length);
        }
        outputStream.flush();
        return outputStream;
    }
}
