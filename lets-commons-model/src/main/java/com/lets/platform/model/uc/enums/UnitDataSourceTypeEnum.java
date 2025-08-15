package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 首页组件数据来源类型 1:接口请求,2:自定义SQL
 * @author DING WEI
 * @date 2022/11/3 14:32
 * @version 1.0
 */
public enum UnitDataSourceTypeEnum implements IEnum<Object> {

	INTERFACE("1","接口请求"),
	SQL("2","自定义SQL"),
	CUSTOM_LINK("3","自定义链接"),
	;

	private String code;
	private String desc;

	UnitDataSourceTypeEnum(String code, String desc){
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

	public static UnitDataSourceTypeEnum getEnumByCode(String code) {
		if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (UnitDataSourceTypeEnum element : UnitDataSourceTypeEnum.values()) {
            if (code.equals(element.getValue())) {
                return element;
            }
        }
        return null;
	}

	public static String getDesc(String code) {
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		for (UnitDataSourceTypeEnum element : UnitDataSourceTypeEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}

}
