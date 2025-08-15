package com.lets.platform.model.uc.vo;

import com.lets.platform.model.uc.entity.SysMenuButtonPermission;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 按钮字段权限 VO
 */
@Data
public class ButtonAndFieldPermissionVO implements Serializable {
    private static final long serialVersionUID = 1L;
    List<SysMenuButtonPermission> buttons;
    List<FieldTabVO> tabs;
}
