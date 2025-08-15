package com.lets.platform.model.psi.query;

import lombok.Data;

/**
 * 预留关系分页查询参数
 *
 * @author fzy
 * @since 2023-04-04
 */
@Data
public class RelationshipPageQuery {
    private int size;
    private int current;
    private Integer type;
    private Integer reservationType;
    private Integer status;
    private String materialId;
    private String materialSpecific;
    private String batchNumber;
    private String storeId;
    private String areaId;
    private String positionId;
}
