package com.lets.platform.model.base.cache;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lets.platform.model.psi.entity.PsiUnit;
import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

/**
 * 单位
 */
@Data
public class UnitCacheModel {
    private String parentCode;
    private Integer isBase;
    private String id;
    private String code;
    private String name;
    private String type;
    private Integer accuracy;
    private String roundOffType;
    private BigDecimal sourceFactor;
    private BigDecimal targetFactor;

    public UnitCacheModel() {
    }

    public UnitCacheModel(PsiUnit unit) {
        if (unit != null) {
            this.parentCode = unit.getParentCode();
            this.isBase = unit.getIsBase();
            this.id = unit.getId();
            this.code = unit.getCode();
            this.type = unit.getType();
            this.name = unit.getName();
            this.accuracy = unit.getAccuracy();
            this.roundOffType = Optional.ofNullable(unit.getRoundOffType()).orElse(String.valueOf(RoundingMode.HALF_UP.ordinal()));
            this.sourceFactor = Optional.ofNullable(unit.getSourceFactor()).orElse(BigDecimal.ONE);
            this.targetFactor = Optional.ofNullable(unit.getTargetFactor()).orElse(BigDecimal.ONE);
        }
    }

    public static UnitCacheModel fromJsonString(String jsonString) {
        if (StrUtil.isEmpty(jsonString)) {
            return null;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(jsonString, UnitCacheModel.class);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
