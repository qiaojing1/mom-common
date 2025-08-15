package com.lets.commons.security.pojo;

import com.alibaba.fastjson.JSON;
import com.lets.commons.security.util.IOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.List;

/**
 * @author QIAO JING
 * @description
 * @since date 2022/3/24 17:11
 */
@Configuration
public class LoginWhiteListConfig {

    private List<String> list;

    @Autowired
    public void init() throws IOException {
        String loginWhiteList= IOUtil.getResourceFileContext("whitelist/loginWhiteList.json");
        this.list=JSON.parseArray(loginWhiteList,String.class);
    }

    public boolean isWhiteList(String whitelist){
        return this.list.contains(whitelist);
    }
}
