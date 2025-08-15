package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * JAVA字段类型枚举
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum JavaFieldTypeEnum implements IEnum<Object> {

	STRING("0","字符串"),
	NOT_STRING("1","非字符串"),
	;

	private String code;
	private String desc;

	JavaFieldTypeEnum(String code, String desc){
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
		for (JavaFieldTypeEnum element : JavaFieldTypeEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}

}
