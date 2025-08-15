package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 工序设备关联Do
 */
@Data
@ApiModel("工序设备关联")
public class ProcessDeviceRelationDo extends BaseDo {
    /**
     * 工序id
     */
    private String processId;

    /**
     * 序号
     */
    private String order;

    /**
     * 设备id
     */
    private String deviceId;

    /**
     * 租户id
     */
    private String tenancyId;

}
