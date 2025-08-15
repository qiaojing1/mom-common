package com.lets.platform.model.mes.dto;

import com.lets.platform.model.mes.entity.MesProduceOrderBom;
import com.lets.platform.model.mes.entity.MesProduceOrderBomDetail;
import lombok.Data;

import java.util.Map;
import java.util.Set;

/**
 * 查询BOM
 * @author: DING WEI
 * @date: 2024/4/29 9:43
 */
@Data
public class FindBomTreeDto {

    private Map<String, MesProduceOrderBom> bomMap;

    private Map<String, Map<String, MesProduceOrderBomDetail>> bomTree;

    private Set<String> materialIds;

}
