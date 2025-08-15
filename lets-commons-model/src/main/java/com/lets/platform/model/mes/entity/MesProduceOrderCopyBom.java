package com.lets.platform.model.mes.entity;

import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * BOM数据拷贝传输
 * @author: DING WEI
 * @date: 2023/12/6 11:22
 */
@Data
public class MesProduceOrderCopyBom {

    private Set<String> produceDetailIds;
    private List<MesProduceOrderBom> bomList;
    private List<MesProduceOrderBomDetail> detailList;

}
