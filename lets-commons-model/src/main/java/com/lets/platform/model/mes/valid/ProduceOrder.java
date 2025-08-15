package com.lets.platform.model.mes.valid;

/**
 * @description: 指定字段校验顺序
 * @author: DING WEI
 * @date: 10/15/21 8:18 AM
 */
import javax.validation.GroupSequence;

public interface ProduceOrder {

    @GroupSequence({Save.planNumber.class,
            Save.routeId.class,
            Save.processId.class,
            Save.deviceId.class,
            Save.startTime.class,
            Save.endTime.class,
            Save.leaderUserId.class})
    interface Save {
        interface planNumber {}
        interface routeId {}
        interface processId {}
        interface deviceId {}
        interface startTime {}
        interface endTime {}
        interface leaderUserId {}
    }

    interface Update {
        interface id {}
        interface planNumber {}
        interface routeId {}
        interface processId {}
        interface deviceId {}
        interface startTime {}
        interface endTime {}
        interface leaderUserId {}
    }
}
