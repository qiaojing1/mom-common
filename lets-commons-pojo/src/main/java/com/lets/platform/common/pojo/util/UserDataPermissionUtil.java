package com.lets.platform.common.pojo.util;

import com.lets.platform.common.pojo.base.UserDataPermission;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @description: 解析用户数据权限工具类
 * @author: DING WEI
 * @date: 8/27/21 1:59 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDataPermissionUtil {

    private List<UserDataPermission> list;

    /**
     * 解析从缓存中获取的用户数据权限配置
     * @return
     * @author DING WEI
     * @date 8/27/21 2:00 PM
     * @version 1.0
     */
    public Set<String> getPermissionOrg() {
        Set<String> permissionOrg = new HashSet<>();
        if (!CollectionUtils.isEmpty(list)) {
            long now = System.currentTimeMillis();
            for (UserDataPermission userDataPermission : list) {
                String enable = userDataPermission.getEnable();
                Long beginTime = userDataPermission.getBeginTime();
                Long endTime = userDataPermission.getEndTime();
                // 生效时间不为空、生效时间小于当前时间、状态为启用 才是有效的配置
                if (Objects.nonNull(beginTime) && beginTime <= now && GlobalConstant.ONE_STR.equals(enable)) {
                    if (Objects.isNull(endTime) || endTime >= now) {
                        // 无结束时间表明,一直有权限 或者结束时间大于当前时间
                        String orgId = userDataPermission.getOrgId();
                        permissionOrg.add(orgId);
                    }
                }
            }
        }
        return permissionOrg;
    }

}
