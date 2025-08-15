package com.lets.platform.model.mes.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * 载具条码绑定物料数量 处理
 * @author: DING WEI
 * @date: 2024/9/29 9:13
 */
@Data
public class HandleContainerNumberDto {

    private String id;

    private Collection<String> relationIds;

    private String currentProcessDetailId;
    private String preProcessDetailId;

    /**
     * @see com.lets.platform.model.psi.enums.ContainerMaterialRecordTypeEnum
     */
    private String type;

    private BigDecimal number;

}
