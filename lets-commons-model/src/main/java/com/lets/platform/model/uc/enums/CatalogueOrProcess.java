package com.lets.platform.model.uc.enums;

/**
 * 目录或程序;
 * @author Qiao
 * @Date 2017年10月18日
 */
public enum CatalogueOrProcess {
	PROCESS(0,"程序"),
	CATALOGUE(1,"目录");

	private Integer code;
	private String desc;

	private CatalogueOrProcess(Integer code, String desc){
		this.code = code;
		this.desc = desc;
	}
	

	public Integer getCode() {
		return code;
	}


	public String getDescription() {
		return desc;
	}

	public static CatalogueOrProcess getEnumByCode(Integer code) {
		if(code == 0)
			return PROCESS;
		else if(code == 1)
			return CATALOGUE;
		return null;
	}

}
