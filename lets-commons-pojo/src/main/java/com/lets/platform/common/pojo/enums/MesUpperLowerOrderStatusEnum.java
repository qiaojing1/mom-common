package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public enum MesUpperLowerOrderStatusEnum implements IEnum<Object> {


	WAIT_DISTRIBUTE("0","待派发"),
	WAIT_PROGRESS("2","待操作"),
	IN_PROGRESS("3","操作中"),
	COMPLETED("4","已完成");

	private String code;
	private String desc;

	MesUpperLowerOrderStatusEnum(String code, String desc){
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
		for (MesUpperLowerOrderStatusEnum element : MesUpperLowerOrderStatusEnum.values()) {
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
		for (MesUpperLowerOrderStatusEnum element : MesUpperLowerOrderStatusEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(WAIT_DISTRIBUTE.getDescription());
		allName.add(WAIT_PROGRESS.getDescription());
		allName.add(IN_PROGRESS.getDescription());
		allName.add(COMPLETED.getDescription());
		return allName;
	}

}
