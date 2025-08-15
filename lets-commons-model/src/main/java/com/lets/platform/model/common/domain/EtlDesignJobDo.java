package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 任务 实体类
 * @author: DING WEI
 * @date: 2022/7/6 13:33
 */
@Data
public class EtlDesignJobDo extends BaseDo {

    /** 设计资源主键 */
    private String designId;

    /** 任务名称[默认在生成任务的时候从设计资源带过来的] */
    private String name;

    /** 状态 0:停止 1:运行 */
    private String status;

    /** 运行方式 1点击执行，2定时执行 */
    private String type;

    /** 定时执行时的cron表达式 */
    private String cron;

    /** 上次运行时间 */
    private Long lastRunTime;

    /** 上次增量截止主键 */
    private String lastUpdateId;

    /** 上次增量截止时间 */
    private String lastUpdateTime;

    /** 租户主键 */
    private String tenancyId;
    /** xxl-job任务 */
    private Integer xxlJobTaskId;

}
