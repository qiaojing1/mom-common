package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.SysPost;
import com.lets.platform.model.uc.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Map;

/**
 * 用户Feign接口
 * @author DING WEI
 * @date 2023/7/6 8:47
 * @version 1.0
 */
@FeignClient(value = "uc")
public interface PostClient {

    @GetMapping("/sysPost/findById4Do")
    RespMsgBean<SysPost> findById4Do(@RequestParam("id") String id);

    @PostMapping("/sysPost/findByIds4Map")
    RespMsgBean<Map<String, SysUser>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/sysPost/findByNames4Map")
    RespMsgBean<Map<String, SysUser>> findByNames4Map(@RequestBody Collection<String> names);

}
