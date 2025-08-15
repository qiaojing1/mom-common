package com.lets.platform.model.mes.query;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

@Data
public class SampleQuantityQuery {
    private String samplingPlanId;
    private BigDecimal inspectQuantity;
    private Integer sampleQuantity;
    private Integer ac;
    private Integer re;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        SampleQuantityQuery that = (SampleQuantityQuery) o;
        return Objects.equals(samplingPlanId, that.getSamplingPlanId()) && Objects.equals(inspectQuantity, that.getInspectQuantity());
    }

    public boolean equals(String samplingPlanId, BigDecimal inspectQuantity) {
        return Objects.equals(this.samplingPlanId, samplingPlanId) && Objects.equals(this.inspectQuantity, inspectQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(samplingPlanId, inspectQuantity);
    }
}
