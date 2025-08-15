package com.lets.platform.model.collection.vo;

import cn.hutool.core.date.DateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author zhangweiyan
 * @ClassName CollCollectorVo
 * @Description 采集器状态监控VO
 * @Date 2024/2/23 08:55
 **/
@Getter
@Setter
public class CollCollectorVo {

    private String code;

    private String id;

    private String name;

    /**
     * 1：正常 2:中断
     */
    private String status;
    private String statusName;

    private BigDecimal interruptDuration;

    private String interruptStartTime;
}
