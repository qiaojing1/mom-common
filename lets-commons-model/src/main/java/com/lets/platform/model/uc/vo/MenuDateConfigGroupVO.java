package com.lets.platform.model.uc.vo;

import com.lets.platform.model.uc.entity.SysMenuDataPermissionConfig;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 功能Tab页初始化 VO
 */
@Data
public class MenuDateConfigGroupVO implements Serializable {
    private static final long serialVersionUID = 1L;
    Integer groupIndex;
    List<SysMenuDataPermissionConfig> configs;
}
