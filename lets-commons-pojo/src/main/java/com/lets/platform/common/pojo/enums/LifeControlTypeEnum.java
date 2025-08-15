package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 寿命管控
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum LifeControlTypeEnum implements IEnum<Object> {

	WARNING("0","警告"),
	STOP("1","暂停生产");

	private String code;
	private String desc;

	LifeControlTypeEnum(String code, String desc){
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
		for (LifeControlTypeEnum element : LifeControlTypeEnum.values()) {
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
		for (LifeControlTypeEnum element : LifeControlTypeEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(WARNING.getDescription());
		allName.add(STOP.getDescription());
		return allName;
	}
}
