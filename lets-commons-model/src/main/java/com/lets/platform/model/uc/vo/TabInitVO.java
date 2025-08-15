package com.lets.platform.model.uc.vo;

import com.lets.platform.model.uc.entity.SysMenuConditionScheme;
import com.lets.platform.model.uc.entity.SysMenuFieldPermission;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 功能Tab页初始化 VO
 */
@Data
public class TabInitVO implements Serializable {
    private static final long serialVersionUID = 1L;
    Integer index;
    String name;
    List<SysMenuFieldPermission> fields;
    List<SysMenuConditionScheme> scheme;
}
