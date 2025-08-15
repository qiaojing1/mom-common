package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.LoginVo;
import com.lets.platform.model.uc.entity.SysUser;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 登录Feign 业务接口
 *
 * @ClassName LoginClient
 * @author: QIAO JING
 * @create: 2022/11/21 13:50
 * @Version 1.0
 **/
@FeignClient(value = "uc")
public interface LoginClient {

    @PostMapping("/login/login")
    RespMsgBean<LoginVo> login(@RequestBody SysUser SysUser);

    @GetMapping("/login/swipeLoginByLoginId")
    RespMsgBean<Object> swipeLoginByLoginId(@ApiParam(name = "userName", value = "账号", required = true) @RequestParam("userName") String userName,
                                            @ApiParam(name = "tenancyCode", value = "租户编码", required = true) @RequestParam("tenancyCode") String tenancyCode,
                                            @ApiParam(name = "macAddress", value = "工位机MAC地址") @RequestParam(value = "macAddress", required = false) String macAddress,
                                            @ApiParam(name = "ip", value = "工位机登录IP") @RequestParam(value = "ip", required = false) String ip);

    @GetMapping("/login/devLogin")
    RespMsgBean<Object> devLogin(@RequestParam("tenancyCode") String tenancyCode,
                                 @RequestParam("userName") String userName);

    @GetMapping("/login/getXxlJobToken")
    RespMsgBean<String> getXxlJobToken(@RequestParam("tenancyId") String tenancyId);

    @GetMapping(value = "/login/getMrpTokenKey")
    RespMsgBean<String> getMrpTokenKey(@RequestParam("username") String username, @RequestParam("tenancyId") String tenancyId);

}
