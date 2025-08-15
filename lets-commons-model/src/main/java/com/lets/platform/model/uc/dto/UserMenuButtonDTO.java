package com.lets.platform.model.uc.dto;

import com.lets.platform.model.uc.entity.SysMenuButtonPermission;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserMenuButtonDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String menuCode;
    private List<SysMenuButtonPermission> buttons;
}
