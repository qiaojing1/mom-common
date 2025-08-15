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
public enum DieFixtureTypeEnum implements IEnum<Object> {

	MOULD("0","模具"),
	KNIFE_TOOL("1","刀具"),
	FROCK("2","工装"),
	INSPECTION_TOOL("3","检具");

	private String code;
	private String desc;

	DieFixtureTypeEnum(String code, String desc){
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
		for (DieFixtureTypeEnum element : DieFixtureTypeEnum.values()) {
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
		for (DieFixtureTypeEnum element : DieFixtureTypeEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(MOULD.getDescription());
		allName.add(KNIFE_TOOL.getDescription());
		allName.add(FROCK.getDescription());
		allName.add(INSPECTION_TOOL.getDescription());
		return allName;
	}
}
