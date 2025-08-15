

package com.lets.platform.model.uc.flow;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskPageQueryParam {
    private String menuCode;
    private String businessCode;
    private String startUserId;
    private String startTime;
    private String endTime;
    private String status;
    private String businessId;
    private String codeOrUser;
    private String processInstanceId;
    private Long size = 10L;
    private Long current = 1L;
}

