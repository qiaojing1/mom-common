package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.EnumUnit;

/**
 * 大于或小于;
 * @author Qiao
 * @Date 2017年10月18日
 */
public enum GtOrLt implements EnumUnit<GtOrLt> {
	GT("0","大于"),
	LT("1","小于");

	private String code;
	private String desc;

	private GtOrLt(String code, String desc){
		this.code = code;
		this.desc = desc;
	}
	
	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getDescription() {
		return desc;
	}

	public static GtOrLt getEnumByCode(String code) {
		if(code.equals("0"))
			return GT;
		else if(code.equals("1"))
			return LT;
		return null;
	}

}
