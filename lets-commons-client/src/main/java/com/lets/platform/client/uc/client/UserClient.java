package com.lets.platform.client.uc.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.model.tpm.query.TpmRepairDurationDayQuery;
import com.lets.platform.model.uc.entity.SysUser;
import com.lets.platform.model.uc.entity.SysUserRole;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用户Feign 业务接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/6 8:51
 */
@FeignClient(value = "uc")
public interface UserClient {

    @GetMapping("/sysUser/findById4Do")
    RespMsgBean<SysUser> findById4Do(@RequestParam("id") String id);

    @GetMapping("/sysUser/defaultFindById")
    RespMsgBean<SysUser> findById(@RequestParam("id") String userId);

    @PostMapping("/sysUser/defaultPage")
    RespMsgBean<Page<SysUser>> defaultPage(@RequestBody AutoConditionEntity entity);

    @PostMapping("/sysUser/findByIds4Map")
    RespMsgBean<Map<String, SysUser>> findByIds4Map(@RequestBody Collection<String> userIds);

    @PostMapping("/sysUser/findByNames4Map")
    RespMsgBean<Map<String, SysUser>> findByNames4Map(@RequestBody Collection<String> names);

    @PostMapping("/sysUser/findByIds4MapAndPerfect")
    RespMsgBean<Map<String, SysUser>> findByIds4MapAndPerfect(@RequestBody Collection<String> userIds);

    @PostMapping("/sysUser/findByIds")
    RespMsgBean<List<SysUser>> findByIds(@RequestBody Collection<String> userIds);

    @PostMapping("/sysUser/defaultList")
    RespMsgBean<List<SysUser>> findList(@RequestBody Map<String, Object> queryMap);

    @GetMapping("/sysUser/findByLoginId")
    RespMsgBean<SysUser> findByLoginId(@RequestParam("loginId") String loginId, @RequestParam("tenancyId") String tenancyId);

    @PostMapping("/sysUser/findByLoginIds4Map")
    RespMsgBean<Map<String, SysUser>> findByLoginIds4Map(@RequestBody Collection<String> loginIds);

    @PostMapping("/sysUser/findByLoginIds4MapWithTenancy/{tenancyId}")
    RespMsgBean<Map<String, SysUser>> findByLoginIds4MapWithTenancy(@RequestBody Collection<String> loginIds, @PathVariable("tenancyId") String tenancyId);

    @GetMapping("/sysUser/getListByOrgType")
    RespMsgBean<List<SysUser>> getListByOrgType(@RequestParam("orgType") String orgType);

    @GetMapping("/sysUser/getById")
    RespMsgBean<SysUser> getById(@RequestParam("id") String id);

    @PostMapping("/sysUser/findByIdsWithOrgAndRole")
    RespMsgBean<Map<String, SysUser>> findByIdsWithOrgAndRole(@RequestBody Collection<String> ids);

    @GetMapping("/sysUser/findByNameLike")
    RespMsgBean<List<SysUser>> findByNameLike(@RequestParam("name") String name);

    @PostMapping("/sysUser/findByOrgIds")
    RespMsgBean<List<SysUser>> findByOrgIds(@RequestBody Collection<String> ids);

    @PostMapping("/sysUser/findIdsByOrgAndPost")
    RespMsgBean<Set<String>> findIdsByOrgAndPost(@RequestBody TpmRepairDurationDayQuery query);

    @GetMapping("/sysUser/findSysCreateAdmin")
    RespMsgBean<SysUser> findSysCreateAdmin(@RequestParam("tenancyId") String tenancyId);

    @PostMapping("/sysUserRole/findUserIdByRoleIds")
    RespMsgBean<List<SysUserRole>> findUserIdByRoleIds(@RequestBody Collection<String> roleIds);

}
