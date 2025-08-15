package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 角色类型枚举
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum RoleTypeEnum implements IEnum<Object> {

	SUPER_ADMIN_ROLE("0","超级管理员"),
	SYS_ADMIN_ROLE("1","系统管理员"),
	ORDINARY_ROLE("2","普通角色"),
	CATEGORY_ROLE("3","角色分类");

	private final String code;
	private final String desc;

	RoleTypeEnum(String code, String desc){
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

	public static String getDesc(String code) {
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		for (RoleTypeEnum element : RoleTypeEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}

	public boolean equals(String code) {
		return this.code.equals(code);
	}

}
