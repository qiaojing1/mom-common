package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算方式
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum CalculationTypeEnum implements IEnum<Object> {

	MANUAL_ENTRY("0","手工录入"),
	WORK_REPORT("1","按报工"),
	DATA_ACQUISITION("2","按数据采集"),
	UPPER_AND_LOWER("3","按上下模");

	private String code;
	private String desc;

	CalculationTypeEnum(String code, String desc){
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
		for (CalculationTypeEnum element : CalculationTypeEnum.values()) {
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
		for (CalculationTypeEnum element : CalculationTypeEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(MANUAL_ENTRY.getDescription());
		allName.add(WORK_REPORT.getDescription());
		allName.add(DATA_ACQUISITION.getDescription());
		allName.add(UPPER_AND_LOWER.getDescription());
		return allName;
	}
}
