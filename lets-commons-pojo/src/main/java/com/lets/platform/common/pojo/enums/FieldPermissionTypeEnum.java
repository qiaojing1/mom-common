package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 字段权限类型 枚举
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum FieldPermissionTypeEnum implements IEnum<Object> {

	MAIN_DATA("1","主表数据权限"),
	DETAIL_DATA("2","明细数据权限"),
	BATCH_DATA("3","批次数据权限"),
	FROM_DATA("4","表单数据权限");

	private String code;
	private String desc;

	FieldPermissionTypeEnum(String code, String desc){
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
		for (FieldPermissionTypeEnum element : FieldPermissionTypeEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}

}
