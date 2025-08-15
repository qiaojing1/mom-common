package com.lets.commons.security.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @Author: qiao jing
 * @Date: 2020/5/26 15:13
 */
public final class IOUtil {
    private IOUtil() {
    }

    public static String getResourceFileContext(String fileName) throws IOException {
        Resource resource=new ClassPathResource(fileName);
        try (InputStream is=resource.getInputStream();
             InputStreamReader isr=new InputStreamReader(is,StandardCharsets.UTF_8);
             BufferedReader br=new BufferedReader(isr);) {
            String data=null;
            StringBuilder stringBuilder = new StringBuilder();
            while ((data=br.readLine())!=null) {
                stringBuilder.append(data);
            }
            return stringBuilder.toString();
        }
    }
}
