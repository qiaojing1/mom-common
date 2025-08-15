package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 备品备件出库单据类型 枚举
 * [1模治具保养,2模治具维修,3TPM保养,4TPM维修]
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum PrepareStockOutOrderTypeEnum implements IEnum<Object> {

	FIX_MAINTAIN_ORDER("1","模治具保养工单"),
	FIX_REPAIR_ORDER("2","模治具维修工单"),
	TPM_MAINTAIN_ORDER("3","TPM保养工单"),
	TPM_REPAIR_ORDER("4","TPM维修工单");

	private String code;
	private String desc;

	PrepareStockOutOrderTypeEnum(String code, String desc){
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
		for (PrepareStockOutOrderTypeEnum element : PrepareStockOutOrderTypeEnum.values()) {
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
		for (PrepareStockOutOrderTypeEnum element : PrepareStockOutOrderTypeEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

}
