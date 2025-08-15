package com.lets.platform.common.pojo.enums;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public enum MesMaintainOrderStatusEnum implements IEnum<Object> {


	DRAFT("0","草稿"),
	WAIT_FOR_REVIEWED("1","待审核"),
	REVIEWED("2","已审核"),
	IN_PROGRESS("3","操作中"),
	COMPLETED("4","已完成"),
	CANCELED("5","已取消"),
	REPAIRCOMPLETED("6","维修通过"),
	REPAIRNOTCOMPLETED("7","维修不通过");

	private String code;
	private String desc;

	MesMaintainOrderStatusEnum(String code, String desc){
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
		for (MesMaintainOrderStatusEnum element : MesMaintainOrderStatusEnum.values()) {
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
		for (MesMaintainOrderStatusEnum element : MesMaintainOrderStatusEnum.values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

	public static List<String> getAllDesc() {
		List<String> allName = new ArrayList<>();
		allName.add(DRAFT.getDescription());
		allName.add(WAIT_FOR_REVIEWED.getDescription());
		allName.add(REVIEWED.getDescription());
		return allName;
	}

}
