package com.lets.platform.model.mes.entity;

import lombok.Data;

import java.util.Set;

/**
 * 需要副本BOM的的数据
 * @author: DING WEI
 * @date: 2023/12/6 13:43
 */
@Data
public class MesNeedCopyDataDto {

    private String copyId;

    private String produceOrderId;

    private String produceDetailId;

    private Set<String> thisDetailCopyAllIds;

}
