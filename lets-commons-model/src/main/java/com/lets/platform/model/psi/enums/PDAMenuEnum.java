package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;


/**
 * 条码控制方式
 */
public enum PDAMenuEnum implements IEnum<String> {

    BARCODE_DOUBT("3a3223c4-2c37-450b-a273-53ebcfebd189", "标签置疑"),
    BARCODE_SPLIT("b82c0f1b-8acf-4c34-a587-085dc5d8755d", "标签拆分"),
    CONTAINER_BIND("1f0ceedc-3849-4519-9103-afe83e20085b", "容器绑定"),
    CONTAINER_UNBIND("73cfa9c4-322f-4265-b0ff-9d35c3e8f0a5", "容器解绑"),
    WIP_STOCK_IN("ef2c0b00-e531-44e4-8602-2a92b4ff53d4", "完工入库"),
    SALE_STOCK_OUT("bef31607-5d16-42ff-809b-dfebd53ac343", "销售出库"),
    PURCHASE_RECEIPT("50ac3af3-8132-4110-8517-ab5278de260e", "采购收货"),
    PURCHASE_STOCK_IN("0719f3e3-5d65-4eff-a263-b42f0923fca1", "采购入库"),
    PRODUCE_PICKING("aade92b5-c60b-46d4-b0cc-4dea69fd8281", "生产领料"),
    UNPLANNED_STOCK_OUT("305c05b2-6bb4-4663-8365-03bcd2bd7525", "计划外出库"),
    PRODUCE_RETURN("cb85a39b-1452-4534-95e1-3168feab5d01", "生产退料"),
    PURCHASE_RETURN("46730b7a-fcc8-44bf-8b29-79a515d4cfe9", "采购退货"),
    SALE_RETURN("d4aaf683-d5ef-4dc8-b48e-96a91d0a9a00", "销退入库"),
    UNPLANNED_STOCK_IN("1679cbec-23a2-4dad-bbcb-362ddedfb8de", "计划外入库"),
    PACKAGE_ORDER("92840fcc-a7a3-4560-b1e6-a597da935fcf", "装箱开单"),
    SHIP_ORDER("58e3e403-4b51-4bd0-8ac7-2fdb2266d436", "装车发运"),
    REPORT("ee7fa25d-046e-4f9c-ab68-01ada42ab720", "扫码报工"),
    PRODUCTION_MATERIAL_PREPARATION("d3cb4987-be0d-4841-af33-622b41dbd732", "生产备料"),
    INCOMING_INSPECTION_SCAN("ed8833bb-4dc6-44b8-a3e0-391c07deeb5d", "来料检验-扫码"),
    STOCK_TRANSFER("b2464fe6-0025-4f0b-80a5-80e79bbcb663", "库内转储"),
    ;

    private final String menuCode;
    @Getter
    private final String menuName;


    PDAMenuEnum(String menuCode, String menuName) {
        this.menuCode = menuCode;
        this.menuName = menuName;
    }

    public static PDAMenuEnum getEnum(String value) {
        for (PDAMenuEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return menuCode;
    }

    public static String getName(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (PDAMenuEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getMenuName();
            }
        }
        return null;
    }

    public boolean equals(String menuCode) {
        return this.menuCode.equals(menuCode);
    }
}
