package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 用户创建方式枚举
 * @author DING WEI
 * @date 12/3/21 9:22 AM
 * @version 1.0
 */
public enum SysUserCreateTypeEnum implements IEnum<Object> {

	SYS("1","系统创建"),
	UN_SYS("2","非系统创建"),
	THIRD_CREATE("3","第三方同步数据"),
	THIRD_HIDE("4","第三发系统调用接口账号, 在人员管理中隐藏"),
	;

	private String code;
	private String desc;

	SysUserCreateTypeEnum(String code, String desc){
		this.code = code;
		this.desc = desc;
	}
	
	@Override
	public String getValue() {
		return code;
	}

	public String getDescription() {
		return desc;
	}

	public static SysUserCreateTypeEnum getEnumByCode(String code) {
		if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (SysUserCreateTypeEnum element : SysUserCreateTypeEnum.values()) {
            if (code.equals(element.getValue())) {
                return element;
            }
        }
        return null;
	}

	public static String getDesc(String code) {
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		for (SysUserCreateTypeEnum element : SysUserCreateTypeEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}

}
