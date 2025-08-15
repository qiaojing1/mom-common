package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 模治具台账状态枚举
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum DieFixtureStatusEnum implements IEnum<Object> {
	CAN_PACKAGE("1","可组装"),
	WAIT_PACKAGE("2","待组装"),
	PACKAGING("3","组装中"),
	WAIT_USE("4","待领用"),
	COLLECT("5","已领用"),
	WAIT_UPPER_MOLD("6","待上模"),
	UPPER_MOLD("7","上模中"),
	USING("8","使用中"),
	WAIT_DOWN_MOLD("9","待下模"),
	DOWN_MOLD("10","下模中"),
	WAIT_DISMANTLE("11","待拆卸"),
	DISMANTLING("12","拆卸中"),
	WAIT_REPAIRED("13","待维修"),
	REPAIRING("14","维修中"),
	WAIT_MAINTAIN("15","待保养"),
	MAINTAINING("16","保养中"),
	ABNORMAL("17","异常"),
	SCRAP("18","报废");

	private String code;
	private String desc;

	DieFixtureStatusEnum(String code, String desc){
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
		for (DieFixtureStatusEnum element : DieFixtureStatusEnum.values()) {
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
		for (DieFixtureStatusEnum element : DieFixtureStatusEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

}
