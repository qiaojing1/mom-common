package com.lets.platform.model.device.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 设备备品备件清单 实体类
 * @author: DING WEI
 * @date: 2022/7/20 10:36
 */
@Data
public class DevicePrepareRelationEntity extends BaseDo {

    /** 设备主键 */
    private String deviceId;

    /** 备件物料 */
    private String materialId;

    /** 租户主键 */
    private String tenancyId;

}
