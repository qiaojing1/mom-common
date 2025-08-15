package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 菜单类型枚举
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum MenuTypeEnum implements IEnum<Object> {

	SYS("0","系统所属"),
	SYS_TO_TENANCY("1","系统分配给租户的"),
	TENANCY("2","租户自定义的");

	private String code;
	private String desc;

	MenuTypeEnum(String code, String desc){
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
		for (MenuTypeEnum element : MenuTypeEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}

}
