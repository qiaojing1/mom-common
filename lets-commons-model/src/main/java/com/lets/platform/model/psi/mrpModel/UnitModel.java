package com.lets.platform.model.psi.mrpModel;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.model.psi.entity.PsiUnit;
import lombok.Data;

import java.math.RoundingMode;

/**
 * MRP计算 单位模型
 */
@Data
public class UnitModel {
    private String id;
    private String code;
    private String name;
    private Integer accuracy;
    private RoundingMode roundOffType;

    public UnitModel() {
    }

    public UnitModel(PsiUnit unit) {
        if (unit != null) {
            this.id = unit.getId();
            this.code = unit.getCode();
            this.name = unit.getName();
            this.accuracy = unit.getAccuracy();
            this.roundOffType = StrUtil.isEmpty(unit.getRoundOffType()) ? RoundingMode.HALF_UP : RoundingMode.valueOf(Integer.parseInt(unit.getRoundOffType()));
        }
    }
}
