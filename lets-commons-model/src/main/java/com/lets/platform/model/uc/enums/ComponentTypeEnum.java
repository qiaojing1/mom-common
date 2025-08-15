package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 首页组件类型
 * @author DING WEI
 * @date 2022/11/3 14:32
 * @version 1.0
 */
public enum ComponentTypeEnum implements IEnum<Object> {

	LINE_CHART("1","折线图"),
	HISTOGRAM("2","柱状图"),
	PIE_CHART("3","饼图"),
	TABLE("4","表格"),
	CARD("5","卡片")
	;

	private String code;
	private String desc;

	ComponentTypeEnum(String code, String desc){
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

	public static ComponentTypeEnum getEnumByCode(String code) {
		if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (ComponentTypeEnum element : ComponentTypeEnum.values()) {
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
		for (ComponentTypeEnum element : ComponentTypeEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}

}
