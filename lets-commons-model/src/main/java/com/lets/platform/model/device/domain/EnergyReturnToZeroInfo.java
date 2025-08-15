package com.lets.platform.model.device.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 能耗 归零 信息
 * @author: DING WEI
 * @date: 2023/1/9 15:46
 */
public class EnergyReturnToZeroInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 归零次数 */
    private Integer times;

    /** 上次点位值 */
    private BigDecimal lastValue;

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public BigDecimal getLastValue() {
        return lastValue;
    }

    public void setLastValue(BigDecimal lastValue) {
        this.lastValue = lastValue;
    }
}
