package com.lets.platform.model.psi.mrpModel;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.util.Objects;

/**
 * MRP计算 工艺路线模型
 */
@Data
public class RouteModel {

    private String materialId;

    private String materialGroupId;

    private String factoryModeId;

    private String factoryModeName;

    private String routeId;

    private String routeName;

    public RouteModel() {
    }

    public RouteModel(MaterialModel materialModel) {
        this.materialId = StrUtil.isNotEmpty(
                materialModel.getMaterialId()) ? materialModel.getMaterialId() : StrUtil.EMPTY;
        this.materialGroupId = StrUtil.isNotEmpty(
                materialModel.getMaterialGroupId()) ? materialModel.getMaterialGroupId() : StrUtil.EMPTY;
        this.factoryModeId = StrUtil.isNotEmpty(
                materialModel.getFactoryModeId()) ? materialModel.getFactoryModeId() : StrUtil.EMPTY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        RouteModel that = (RouteModel) o;
        return Objects.equals(materialId, that.materialId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(materialId);
    }
}

