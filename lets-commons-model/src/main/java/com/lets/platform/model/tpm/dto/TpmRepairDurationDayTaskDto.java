package com.lets.platform.model.tpm.dto;

import com.lets.platform.model.tpm.entity.TpmRepairDurationDeviceDay;
import com.lets.platform.model.tpm.entity.TpmRepairDurationDeviceLoadDay;
import com.lets.platform.model.tpm.entity.TpmRepairDurationFaultDay;
import com.lets.platform.model.tpm.entity.TpmRepairDurationUserDay;
import lombok.Data;

import java.util.List;

/**
 * 定时任务 保存参数
 * @author: DING WEI
 * @date: 2024/12/14 9:28
 */
@Data
public class TpmRepairDurationDayTaskDto {

    private String tenancyId;

    // 指定时间yyyy-MM-dd
    private String dateFormat;

    // 需要保存的数据
    private List<TpmRepairDurationDeviceDay> deviceSaveList;
    private List<TpmRepairDurationUserDay> userSaveList;
    private List<TpmRepairDurationFaultDay> faultSaveList;
    // 设备负荷时长
    private List<TpmRepairDurationDeviceLoadDay> deviceLoadDayList;

}
