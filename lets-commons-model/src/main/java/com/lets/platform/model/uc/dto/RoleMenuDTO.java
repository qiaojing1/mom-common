package com.lets.platform.model.uc.dto;

import com.lets.platform.model.uc.entity.SysMenu;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RoleMenuDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String roleId;
    private Integer type;
    private List<SysMenu> menuList;
}
