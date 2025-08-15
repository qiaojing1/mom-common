package com.lets.platform.client.tpm.fallback;

import com.lets.platform.client.tpm.client.TpmRepairDurationDayClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.tpm.dto.TpmRepairDurationDayTaskDto;
import com.lets.platform.model.tpm.entity.TpmRepairDurationDeviceDay;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 设备维修时长(天表) 服务降级
 * @author DING WEI
 * @date 2024/12/9 15:15
 * @version 1.0
 */
@Service
public class TpmRepairDurationDayClientFallback extends BaseController implements TpmRepairDurationDayClient {

    @Override
    public RespMsgBean<List<TpmRepairDurationDeviceDay>> findBaseDataList(String tenancyId, String todayFormat) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<String> batSave(TpmRepairDurationDayTaskDto taskDto) {
        return failure(FAILURE, "保存数据失败");
    }

    @Override
    public RespMsgBean<BigDecimal> findDeviceRepairDuration(Collection<String> deviceIds, String tenancyId, String today) {
        return success(SUCCESS, BigDecimal.ZERO);
    }

    @Override
    public RespMsgBean<BigDecimal> findDevicePlanLossDuration(Collection<String> deviceIds, String tenancyId, String today) {
        return success(SUCCESS, BigDecimal.ZERO);
    }
}
