package com.lets.platform.common.pojo.base;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 流程VO
 *
 * @author FZY
 * @since 2023-11-10
 */
@Getter
@Setter
public class FlowableProcess {
    String menuCode;
    String businessId;
    String processInstanceId;
    JSONObject data;
    String force;
    String comment;
    List<String> nextUser;
    String reason;
    String tenancyId;
}
