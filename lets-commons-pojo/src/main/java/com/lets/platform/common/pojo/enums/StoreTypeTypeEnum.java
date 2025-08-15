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
public enum StoreTypeTypeEnum implements IEnum<Object> {

	PSI("0","进销存管理"),
	DIE_FIXTURE("1","模治具管理"),
	DEVICE("2","设备保全管理");

	private String code;
	private String desc;

	StoreTypeTypeEnum(String code, String desc){
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
		for (StoreTypeTypeEnum element : StoreTypeTypeEnum.values()) {
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
		for (StoreTypeTypeEnum element : StoreTypeTypeEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(PSI.getDescription());
		allName.add(DIE_FIXTURE.getDescription());
		allName.add(DEVICE.getDescription());
		return allName;
	}
}
