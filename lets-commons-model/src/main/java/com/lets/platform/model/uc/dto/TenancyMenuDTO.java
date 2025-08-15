package com.lets.platform.model.uc.dto;

import com.lets.platform.model.uc.entity.SysMenu;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TenancyMenuDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String tenancyId;
    private Integer type;
    private String isCover;  //是否覆盖
    private List<SysMenu> menuList;
}
