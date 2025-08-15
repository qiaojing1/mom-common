package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.I18nTypeEnum;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理状态枚举类;
 * @author Medeson.Zhang
 * @Date 2017年10月18日
 */
public enum LetsJobState implements IEnum<Object> {

	ONTHEJOB("0","在职", "be on the job"),
	QUIT("1","离职", "depart");

	private String code;
	private String desc;
	private String english;

	LetsJobState(String code, String desc, String english){
		this.code = code;
		this.desc = desc;
		this.english = english;
	}

	@Override
	public String getValue() {
		return code;
	}

	public String getDescription() {
		return desc;
	}

	public String getEnglish() {
		return english;
	}

	public static LetsJobState getEnumByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		for (LetsJobState element : values()) {
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
		for (LetsJobState element : values()) {
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
		for (LetsJobState element : values()) {
			if (desc.equals(element.getDescription())) {
				return element.getValue();
			}
		}
		return null;
	}

	public static List<String> getAllName(String lang) {
		List<String> allName = new ArrayList<>();
		for (LetsJobState element : values()) {
			if (I18nTypeEnum.ZH_CH.getValue().equals(lang)) {
				allName.add(element.getDescription());
			} else if (I18nTypeEnum.EN_US.getValue().equals(lang)) {
				allName.add(element.getEnglish());
			}
		}
		return allName;
	}

}