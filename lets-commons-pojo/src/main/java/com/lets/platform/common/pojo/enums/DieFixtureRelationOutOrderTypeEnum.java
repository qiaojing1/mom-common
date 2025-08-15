package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 模治具分类
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum DieFixtureRelationOutOrderTypeEnum implements IEnum<Object> {

	REPAIR_ORDER("1","维修工单"),
	MAINTAIN_ORDER("2","保养工单");

	private String code;
	private String desc;

	DieFixtureRelationOutOrderTypeEnum(String code, String desc){
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
		for (DieFixtureRelationOutOrderTypeEnum element : DieFixtureRelationOutOrderTypeEnum.values()) {
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
		for (DieFixtureRelationOutOrderTypeEnum element : DieFixtureRelationOutOrderTypeEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(REPAIR_ORDER.getDescription());
		allName.add(MAINTAIN_ORDER.getDescription());
		return allName;
	}
}
