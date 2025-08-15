package com.lets.platform.model.mes.vo;

import com.lets.platform.model.mes.entity.MesProducePickingApplyDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProducePickingApplySubmitVO {
    private String containerId;
    private String containerBarcodeId;
    private String containerBarcodeCode;
    private String orderId;
    private List<MesProducePickingApplyDetail> detailList;
}
