package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 工序定义Do
 */
@Data
@ApiModel("工序定义")
public class ProcessDo extends BaseDo {
    /**
     * 名称
     */
    private String name;

    /**
     * 准备时长
     */
    private String readyDuration;

    /**
     * 标准工时
     */
    private String standardDuration;

    /**
     * 报工方式
     * @see com.lets.platform.model.common.enums.ReportWayEnum
     */
    private String reportWay;

    /**
     * 质检标准
     */
    private String checkStandard;

    /**
     * 状态
     */
    private String status;

    /**
     * 租户id
     */
    private String tenancyId;

}
