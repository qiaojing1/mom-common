package com.lets.platform.model.psi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 用于自动生成物料条码
 * @author FZY
 * @since 2024-10-28
 */
@Data
public class AutoBarcodeDTO {

    private String detailId;
    private String menuCode;
    private String orderCategoryId;
    private String unitId;
    private BigDecimal quantity;

    /**
     * 第三方系统生成的条码
     */
    private List<String> extBarcodeList;
    private Boolean ignoreMaterialTemplate;

    /**
     * @see com.lets.platform.model.psi.enums.BarcodeGenerateSourceEnum
     */
    @ApiModelProperty("生成来源")
    private String generateSource;

    @ApiModelProperty("生产单元")
    private String factoryModeId;
    private String factoryModeCode;
    private String factoryModeName;

    private String isStockIn;
    private String storeId;
    private String storeCode;
    private String storeName;
    private String areaId;
    private String areaName;
    private String areaCode;
    private String positionId;
    private String positionName;
    private String positionCode;
    private String ext;
    private String hmiId;
    private String materialCode;
}
