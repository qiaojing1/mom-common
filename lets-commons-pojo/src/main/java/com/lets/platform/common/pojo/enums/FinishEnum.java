package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 是否完成
 * @author DING WEI
 * @date 2023/7/7 11:55
 * @version 1.0
 */
public enum FinishEnum implements IEnum<Object> {

	NOT_FINISH("0","未完成"),
	FINISH("1","已完成"),
	;

	private String code;
	private String desc;

	FinishEnum(String code, String desc){
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
		for (FinishEnum element : values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}

	public static String getCode(String desc) {
		if (StringUtils.isEmpty(desc)) {
			return null;
		}
		for (FinishEnum element : values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

}
