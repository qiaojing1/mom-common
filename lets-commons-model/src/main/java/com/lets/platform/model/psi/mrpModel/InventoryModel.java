package com.lets.platform.model.psi.mrpModel;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Data
public class InventoryModel {

    private String materialId;

    private String materialSpecific;

    private String materialSpecificNames;

    private UnitModel basicUnit;

    /**
     * 库存总数(基本单位)
     **/
    private BigDecimal quantity;

    /**
     * 库存占用数量(基本单位)
     **/
    private BigDecimal lockQuantity;

    /**
     * 本次占用数量(基本单位)
     **/
    private BigDecimal occupyQuantity;

    /**
     * 其他mrp运算占用数量(基本单位)
     **/
    private BigDecimal mrpOccupyQuantity;

    private List<IncomingModel> incomingList;

    /**
     * 补充安全库存数量(基本单位)
     **/
    private BigDecimal safeInventoryQuantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        InventoryModel that = (InventoryModel) o;
        return StrUtil.equals(materialId, that.materialId) && StrUtil.equals(materialSpecific, that.materialSpecific);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialId, materialSpecific);
    }

}
