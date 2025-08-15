package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 模治具 预警步骤
 * @author DING WEI
 * @date 2022/9/6 9:19
 * @version 1.0
 */
public enum DieWarnStepEnum implements IEnum<Object> {

	WAIT_DISTRIBUTED("0","待派发"),
	EXAMINE("1","待审核"),
	WAIT_OPERATION("2","待操作"),
	OPERATION_ING("3","操作中");

	private String code;
	private String desc;

	DieWarnStepEnum(String code, String desc){
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
		for (DieWarnStepEnum element : DieWarnStepEnum.values()) {
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
		for (DieWarnStepEnum element : DieWarnStepEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

}
