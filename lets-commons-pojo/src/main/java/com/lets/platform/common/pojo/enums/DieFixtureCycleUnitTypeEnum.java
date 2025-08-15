package com.lets.platform.common.pojo.enums;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

/**
 * 模治具保养计划周期类别单位
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum DieFixtureCycleUnitTypeEnum implements IEnum<Object> {
//定期、产量、使用时长、开合次数
	TIME("0","定期","天"),
	MIN("1","使用时长","小时"),
	HOUR("2","产量","个"),
	DAY("3","开合次数","次");

	private String code;
	private String desc;
	private String unit;

	DieFixtureCycleUnitTypeEnum(String code, String desc, String unit){
		this.code = code;
		this.desc = desc;
		this.unit = unit;
	}
	
	@Override
	public String getValue() {
		return code;
	}

	public String getDescription() {
		return desc;
	}
	
	public String getUnit() {
		return unit;
	}

	public static String getDesc(String code) {
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		for (DieFixtureCycleUnitTypeEnum element : DieFixtureCycleUnitTypeEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}
	
	public static String getUnit(String code) {
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		for (DieFixtureCycleUnitTypeEnum element : DieFixtureCycleUnitTypeEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getUnit();
			}
		}
		return null;
	}

	public static String getCode(String desc) {
		if (StringUtils.isEmpty(desc)) {
			return null;
		}
		for (DieFixtureCycleUnitTypeEnum element : DieFixtureCycleUnitTypeEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
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
