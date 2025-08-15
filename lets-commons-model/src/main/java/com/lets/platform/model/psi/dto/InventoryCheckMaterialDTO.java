package com.lets.platform.model.psi.dto;

import lombok.Data;

/**
 * <p>
 * 用于查询 物料+仓库+库位+库区 是否存在正在盘点的盘点单
 * </p>
 *
 * @author FZY
 * @since 2023-08-09
 */
@Data
public class InventoryCheckMaterialDTO {

    private String materialId;
    private String materialName;
    private String storeId;
    private String storeName;
    private String areaId;
    private String areaName;
    private String positionId;
    private String positionName;
    private Boolean flag;

    private String storeKey;

}
