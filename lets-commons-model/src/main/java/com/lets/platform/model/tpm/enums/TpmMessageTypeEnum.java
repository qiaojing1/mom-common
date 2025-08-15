package com.lets.platform.model.tpm.enums;

import org.springframework.util.StringUtils;
import com.lets.platform.model.tpm.enums.*;
public enum TpmMessageTypeEnum {
	
	CAIGOU("1","采购申请", "1",""),
	BAOFEI("8","报废申请", "8",""),
	REPAIR("3","维修工单", "3","9104"),
	OUTORDER("9","维修领用", "9",""),
	REPORTORDER("5","报修工单", "5","9103"),
	FAULT_KNOWLEDGE("6","故障知识申请", "6",""),
	DEVICE_ALLOCATION("7","设备调拨申请", "7-",""),
	PREPARE("11","备件预警", "11",""),
	SPOT("12","点检预警", "12",""),
	MAINTAIN("13","保养预警", "13",""),
	REPAIRWARN("14","维修预警", "14",""),
	REPORTWARN("15","维修预警-待审核", "15",""),
	PREAPREUSE("16","备件领用", "16",""),
	REPAIRHANGUP("17","维修挂起-备件采购", "17",""),;

	String code;
	
	String description;

	String applyType;

	String menuCode;

	private TpmMessageTypeEnum(String code, String description, String applyType,String menuCode) {
		this.code = code;
		this.description = description;
		this.applyType = applyType;
		this.menuCode = menuCode;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public String getApplyType() {
		return applyType;
	}
	public String getMenuCode() {
		return menuCode;
	}

	public static TpmMessageTypeEnum getEnumByCode(String code) {
		if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (TpmMessageTypeEnum element : TpmMessageTypeEnum.values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
	}

	public static TpmMessageTypeEnum getEnumByApplyType(String applyType) {
		if (StringUtils.isEmpty(applyType)) {
			return null;
		}
		for (TpmMessageTypeEnum element : TpmMessageTypeEnum.values()) {
			if (applyType.equals(element.getApplyType())) {
				return element;
			}
		}
		return null;
	}

	public static String getCodeByApplyType(String applyType) {
		if (StringUtils.isEmpty(applyType)) {
			return null;
		}
		for (TpmMessageTypeEnum element : TpmMessageTypeEnum.values()) {
			if (applyType.equals(element.getApplyType())) {
				return element.getCode();
			}
		}
		return null;
	}

	public static String getTitleByApplyType(String applyType) {
		if (StringUtils.isEmpty(applyType)) {
			return null;
		}
		for (TpmMessageTypeEnum element : TpmMessageTypeEnum.values()) {
			if (applyType.equals(element.getApplyType())) {
				return element.getDescription();
			}
		}
		return null;
	}

}
