package com.lets.platform.model.adapter.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("计算公式")
public class MdcDeviceFormula {

    /** 设备主键 */
    private String deviceId;
    /** 状态小类主键 */
    private String smallStatusId;
    private String smallStatusCode;
    private String smallStatusName;
    /** 状态大类主键 */
    private String bigStatusId;
    private String bigStatusCode;
    private String bigStatusName;
    /** 公式优先级(越小优先级越高) */
    private String priority;
    /** 公式 */
    private String formula;

}
