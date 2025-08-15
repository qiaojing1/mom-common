package com.lets.platform.model.device.domain;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.model.common.entity.CommonDevice;
import lombok.Data;

import java.util.List;

/**
 * 临时变量
 * @author: DING WEI
 * @date: 2022/12/12 14:08
 */
@Data
public class DeviceTemp {

    private String tenancyId;
    private List<CommonDevice> deviceList;
    private Page<CommonDevice> devicePage;

    private Integer meters;
}
