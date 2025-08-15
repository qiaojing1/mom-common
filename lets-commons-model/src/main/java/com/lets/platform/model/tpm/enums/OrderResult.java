package com.lets.platform.model.tpm.enums;

import org.springframework.util.StringUtils;

public enum OrderResult {

	NORMAL("0","正常"),
	ABNORMAL("1","异常");

	String code;

	String mess;

	private OrderResult(String code, String mess) {
		this.code = code;
		this.mess = mess;
	}

	public String getCode() {
		return code;
	}

	public String getMess() {
		return mess;
	}

	public static OrderResult getEnumByCode(String code) {
		if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (OrderResult element : OrderResult.values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
	}

	public static String getName(String code) {
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		for (OrderResult element : OrderResult.values()) {
			if (code.equals(element.getCode())) {
				return element.getMess();
			}
		}
		return null;
	}
}
