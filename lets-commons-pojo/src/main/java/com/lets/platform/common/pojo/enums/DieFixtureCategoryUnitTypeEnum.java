package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 模治具类别单位
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum DieFixtureCategoryUnitTypeEnum implements IEnum<Object> {

	TIME("0","次"),
	MIN("1","分钟"),
	HOUR("2","小时"),
	DAY("3","天");

	private String code;
	private String desc;

	DieFixtureCategoryUnitTypeEnum(String code, String desc){
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
		for (DieFixtureCategoryUnitTypeEnum element : DieFixtureCategoryUnitTypeEnum.values()) {
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
		for (DieFixtureCategoryUnitTypeEnum element : DieFixtureCategoryUnitTypeEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}
	public static List<String> getAllDescByType(String typeId){
		List<String> allName = new ArrayList<>();
		if (typeId.equals("1")){
			allName.add(TIME.getDescription());
		}else {
			allName.add(MIN.getDescription());
			allName.add(HOUR.getDescription());
			allName.add(DAY.getDescription());
		}
		return allName;
	}

	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(TIME.getDescription());
		allName.add(MIN.getDescription());
		allName.add(HOUR.getDescription());
		allName.add(DAY.getDescription());
		return allName;
	}

}
