package com.lets.platform.model.uc.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 功能Tab页初始化 VO
 */
@Data
public class MenuDateConfigVO implements Serializable {
    private static final long serialVersionUID = 1L;
    String roleId;
    String menuCode;
    Integer tabIndex;
    List<MenuDateConfigGroupVO> groups;
}
