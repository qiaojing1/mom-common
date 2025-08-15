package com.lets.platform.model.uc.entity;

import lombok.Data;

import java.util.List;

/**
 * 用户详情数据
 *
 * @ClassName SysUserDetailVo
 * @author: DING WEI
 * @create: 2021/04/28 10:03
 * @Version 1.0
 **/
@Data
public class SysUserDetailVo {

    /**
     * 用户数据
     */
    private SysUser user;

    /**
     * 所属租户数据
     */
    private SysTenancy tenancy;

    /**
     * 该用户的菜单
     */
    private List<SysMenu> menuList;
}
