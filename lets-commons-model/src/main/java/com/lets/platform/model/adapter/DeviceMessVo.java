package com.lets.platform.model.adapter;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class DeviceMessVo {
	
	private String startTime;
	
	private String endTime;
	
	private String messageType;

	private String receiveUsers;
	
	private String pushType;
	
	private String pushParam;

	private String pushIntervalTime;

	private String tenancyId;

	public List<String> getPushTypeAsList() {
		return Arrays.asList(pushType.split(GlobalConstant.COMMA_HALF_ANGLE));
	}
}
