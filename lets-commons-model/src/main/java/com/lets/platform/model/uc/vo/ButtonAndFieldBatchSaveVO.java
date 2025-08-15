package com.lets.platform.model.uc.vo;

import com.lets.platform.model.uc.entity.SysMenuButtonPermission;
import com.lets.platform.model.uc.entity.SysMenuFieldPermission;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 按钮字段权限 VO
 */
@Data
public class ButtonAndFieldBatchSaveVO implements Serializable {
    private static final long serialVersionUID = 1L;
    List<SysMenuButtonPermission> buttons;
    List<SysMenuFieldPermission> fields;
    String menuCode;
}
