package com.lets.platform.common.pojo.enums;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public enum MesUrgencyGrade implements IEnum<Object> {


	VERY_URGENT("1","非常紧急"),
	URGENT("2","紧急"),
	COMMON("3","一般");

	private String code;
	private String desc;

	MesUrgencyGrade(String code, String desc){
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
		for (MesUrgencyGrade element : MesUrgencyGrade.values()) {
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
		for (MesUrgencyGrade element : MesUrgencyGrade.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(VERY_URGENT.getDescription());
		allName.add(URGENT.getDescription());
		allName.add(COMMON.getDescription());
		return allName;
	}

}
