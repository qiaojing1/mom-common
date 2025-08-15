package com.lets.platform.common.pojo.errorEnums;

import com.lets.platform.common.pojo.enums.EnumUnit;

/**
 * 处理状态枚举类
 *
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
public enum MenuExceptionEnums implements EnumUnit<MenuExceptionEnums> {
    /**
     * PARENT_CODE_IS_NOT_EXIST
     */
    NO_PERMISSION("MENU.NO_PERMISSION", "无操作权限"),
    NO_DISPLAY_NAME("MENU.NO_DISPLAY_NAME", "MENU.NO_DISPLAY_NAME"),
    NO_DATA("MENU.NO_DATA", "无法找到该目录"),
    NO_PARENT("MENU.NO_PARENT", "无法找到上一级"),
    CANNOT_ENABLE("MENU.CANNOT_ENABLE", "无法启用当前菜单"),
    EXPORT_ERROR("MENU.EXPORT_ERROR", "导出失败"),
    IMPORT_ERROR("MENU.IMPORT_ERROR", "导入失败"),
    PARENT_IS_NOT_EXIST("MENU.PARENT_IS_NOT_EXIST", "菜单父目录不存在"),
    PARENT_HAVE_SAME_NAME_MENU("MENU.PARENT_HAVE_SAME_NAME_MENU", "同级目录下存在相同名称的菜单"),
    MENU_LEVEL_ERROR("MENU.MENU_LEVEL_ERROR", "目录层级错误"),
    MENU_TYPE_ERROR("MENU.MENU_TYPE_ERROR", "菜单类型与父级不一致"),
    MENU_CANNOT_DELETE("MENU.MENU_TYPE_ERROR", "禁止删除此菜单"),
    PARENT_IS_NOT_DIR("MENU.PARENT_IS_NOT_DIR", "菜单父级不是一个目录"),
    NO_SCHEME_DETAIL("MENU.NO_SCHEME_DETAIL", "方案中查询字段为空"),
    CANNOT_EDIT_OTHER_USER_SCHEME("MENU.CANNOT_EDIT_OTHER_USER_SCHEME", "无法修改他人的方案"),
    CANNOT_DELETE_OTHER_USER_SCHEME("MENU.CANNOT_DELETE_OTHER_USER_SCHEME", "无法删除他人的方案"),
    SCHEME_DOES_NOT_EXIST("MENU.SCHEME_DOES_NOT_EXIST", "方案不存在"),
    CANNOT_DELETE_SUPER_SCHEME("MENU.CANNOT_DELETE_SUPER_SCHEME", "无法删除系统默认方案");
    private final String code;
    private final String desc;

    private MenuExceptionEnums(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return desc;
    }

}
