package com.lets.platform.model.mes.dto;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.lets.platform.model.mes.entity.MesNeedCopyDataDto;
import lombok.Data;

import java.util.Map;

/**
 * 查询副本-查询对象
 * @author: DING WEI
 * @date: 2023/12/18 17:38
 */
@Data
public class FindCopyDataQuery {

    private Map<String, MesNeedCopyDataDto> needCopyBomMap;
}
