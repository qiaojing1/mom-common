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
public enum StatisticsTypeEnum implements IEnum<Object> {

	BY_TIME("0","使用时长"),
	BY_NUM("1","使用次数"),
	SPECIFIED_DURATION("2","指定时长");

	private String code;
	private String desc;

	StatisticsTypeEnum(String code, String desc){
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
		for (StatisticsTypeEnum element : StatisticsTypeEnum.values()) {
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
		for (StatisticsTypeEnum element : StatisticsTypeEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}
	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(BY_TIME.getDescription());
		allName.add(BY_NUM.getDescription());
		allName.add(SPECIFIED_DURATION.getDescription());

		return allName;
	}

}
