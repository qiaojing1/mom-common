package com.lets.platform.model.mes.interfaces;

import com.lets.platform.model.mes.entity.MesProductionArchiveScheme;
import com.lets.platform.model.mes.entity.MesProductionParam;

import java.util.List;

public interface ProductionParamInterface {
    String getOrderId();

    String getOrderDetailId();

    String getOrderCategoryId();

    String getMaterialId();

    String getCustomerId();

    void setProductionArchiveScheme(MesProductionArchiveScheme productionArchiveScheme);

    MesProductionArchiveScheme getProductionArchiveScheme();

    void setProductionParamList(List<MesProductionParam> productionParamList);
}
