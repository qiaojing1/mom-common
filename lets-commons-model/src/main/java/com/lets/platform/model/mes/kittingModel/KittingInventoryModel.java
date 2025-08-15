package com.lets.platform.model.mes.kittingModel;

import com.lets.platform.model.psi.mrpModel.UnitModel;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class KittingInventoryModel {

    private String storeId;

    private String storeName;

    private String materialId;

    private String materialCode;

    private String materialName;

    private String materialSpecs;

    private UnitModel basicUnit;

    /**
     * 库存总数(基本单位)
     **/
    private BigDecimal quantity;

    /**
     * 库存占用数量(基本单位)
     **/
    //需求 #35252 删除lockNumber
//    private BigDecimal lockQuantity;

    /**
     * 本次占用数量(基本单位)
     **/
    private BigDecimal occupiedQuantity;

}
