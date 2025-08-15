package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 工序设备关联Dto
 */
@Data
@ApiModel("工序设备关联")
public class ProcessDeviceRelationDto extends BaseDo {
    /**
     * 序号
     */
    private String order;

    /**
     * 设备id
     */
    private String deviceId;

}
