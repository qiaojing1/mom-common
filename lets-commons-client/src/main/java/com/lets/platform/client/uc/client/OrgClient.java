package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.SysOrg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 用户Feign 业务接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/6 8:51
 */
@FeignClient(value = "uc")
public interface OrgClient {

    @PostMapping("/sysOrg/defaultList")
    RespMsgBean<List<SysOrg>> findList(@RequestBody Map<String, Object> queryMap);

    @PostMapping("/sysOrg/findByNames4Map")
    RespMsgBean<Map<String, SysOrg>> findByNames4Map(@RequestBody Collection<String> names);

    @PostMapping("/sysOrg/findByIds4Map")
    RespMsgBean<Map<String, SysOrg>> findByIds4Map(@RequestBody Collection<String> ids);
    @PostMapping("/sysOrg/findByCodes4Map")
    RespMsgBean<Map<String, SysOrg>> findByCodes4Map(@RequestBody Collection<String> codes);
    @PostMapping("/sysOrg/findByCodes4List")
    RespMsgBean<List<SysOrg>> findByCodes4List(@RequestBody Collection<String> codes);

    @GetMapping("/sysOrg/defaultFindById")
    RespMsgBean<SysOrg> findById(@RequestParam("id") String orgId);
    @GetMapping("/sysOrg/getById")
    RespMsgBean<SysOrg> getById(@RequestParam("id") String orgId);

    @GetMapping("/sysOrg/findByTenancyId")
    RespMsgBean<List<SysOrg>> findByTenancyId(@RequestParam("tenancyId") String tenancyId);

    @GetMapping("/sysOrg/findByUserId")
    RespMsgBean<SysOrg> findByUserId(@RequestParam("userId") String userId);
}
