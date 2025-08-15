package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * Etl设计器资源 实体类
 * @author: DING WEI
 * @date: 2022/6/24 10:59
 */
@Data
public class EtlDesignDo extends BaseDo {

    /** 名称 */
    private String name;

    /** xml */
    private String content;

    /**
     * 状态 -1未保存，0:未发布 1:已发布
     * @see com.lets.platform.model.common.enums.EtlDesignStatusEnum
     */
    private String status;

    /** 租户主键 */
    private String tenancyId;

    /** 工作流部署信息 */
    private String deploymentId;
    private String deploymentKey;

}
