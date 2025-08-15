package com.lets.platform.model.uc.vo;

import com.lets.platform.model.uc.entity.SysMenuButtonPermission;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 功能Tab页初始化 VO
 */
@Data
public class PageInitVO implements Serializable {
    private static final long serialVersionUID = 1L;
    List<TabInitVO> formTabs;
    List<TabInitVO> tableTabs;
    List<SysMenuButtonPermission> buttons;
    boolean flowable;
}
