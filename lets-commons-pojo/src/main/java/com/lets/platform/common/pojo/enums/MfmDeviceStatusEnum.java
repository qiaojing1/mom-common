package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 模治具台账状态枚举
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum MfmDeviceStatusEnum implements IEnum<Object> {
	UNUSUAL("1","机台异常"),
	PRODUCING("2","生产中"),
	MAINTENANCEING("3","保养中"),
	REPAIRING("4","维修中"),
	NOTUPPER("5","未上模");

	private String code;
	private String desc;

	MfmDeviceStatusEnum(String code, String desc){
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
		for (MfmDeviceStatusEnum element : MfmDeviceStatusEnum.values()) {
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
		for (MfmDeviceStatusEnum element : MfmDeviceStatusEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

}
