package com.lets.platform.common.pojo.errorEnums;

import com.lets.platform.common.pojo.enums.EnumUnit;

/**
 * 处理状态枚举类
 *
 * @Author DING WEI
 **/
public enum RoleExceptionEnums implements EnumUnit<RoleExceptionEnums> {
    /**
     * PARENT_CODE_IS_NOT_EXIST
     */
    DISABLED("ROLE.DISABLED", "角色已停用，无登陆权限"),
    NO_PERMISSION_TO_ADMIN("ROLE.NO_PERMISSION_TO_ADMIN", "无法对系统管理员操作"),
    CODE_REPEAT("ROLE.CODE_REPEAT", "编码重复"),
    NAME_REPEAT("ROLE.NAME_REPEAT", "名称重复"),
    MNEMONIC_CODE_REPEAT("ROLE.MNEMONIC_CODE_REPEAT", "助记码重复"),
    NO_DATA("ROLE.NO_DATA", "数据不存在"),
    HAS_CHILDREN("ROLE.HAS_CHILDREN", "分组下存在角色或子分组,无法删除"),
    CANNOT_DELETE_ADMIN("ROLE.CANNOT_DELETE_ADMIN", "当前角色类型无法删除");
    private final String code;
    private final String desc;

    private RoleExceptionEnums(String code, String desc) {
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
