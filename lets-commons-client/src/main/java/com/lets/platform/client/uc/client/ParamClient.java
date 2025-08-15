package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.SysParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 系统参数Feign 业务接口
 *
 * @ClassName ParamClient
 * @author: Qiao
 * @create: 2021/09/01 17:41
 * @Version 1.0
 **/
@FeignClient(value = "uc")
public interface ParamClient {

    /**
     * 根据code查询系统参数
     * @param code
     * @return
     * @Author Qiao
     * @Date 2021/9/01 17:42
     * @Version 1.0
     **/
    @GetMapping(value = "/sysParam/findByCode")
    RespMsgBean<SysParam> findByCode(@RequestParam("code") String code, @RequestParam(value = "tenancyId",required = false) String tenancyId);

    @GetMapping(value = "/sysParam/findByCode")
    RespMsgBean<SysParam> findByCode(@RequestParam("code") String code);
}
