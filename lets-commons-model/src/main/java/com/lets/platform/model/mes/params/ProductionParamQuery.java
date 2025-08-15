package com.lets.platform.model.mes.params;

import com.lets.platform.model.mes.entity.MesProductionArchiveScheme;
import com.lets.platform.model.mes.entity.MesProductionParam;
import com.lets.platform.model.mes.interfaces.ProductionParamInterface;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductionParamQuery implements ProductionParamInterface {
    String orderId;
    String orderDetailId;
    String orderCategoryId;
    String materialId;
    String customerId;
    MesProductionArchiveScheme productionArchiveScheme;
    List<MesProductionParam> productionParamList;
    String key;
}
