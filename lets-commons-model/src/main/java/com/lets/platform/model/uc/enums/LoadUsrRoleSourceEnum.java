package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 加载url和角色关系来源 枚举
 * @author DING WEI
 * @date 2021/4/30 17:55
 * @version 1.0
 **/
public enum LoadUsrRoleSourceEnum implements IEnum<Object> {

	INIT("init","服务启动"),
	METHOD("method","方法自调"),;

	private String code;
	private String desc;

	LoadUsrRoleSourceEnum(String code, String desc){
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
		for (LoadUsrRoleSourceEnum element : LoadUsrRoleSourceEnum.values()) {
			if (code.equals(element.getValue())) {
				return element.getDescription();
			}
		}
		return null;
	}

}
