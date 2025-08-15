package com.lets.platform.model.psi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * 查询物料库存
 * @author DING WEI
 * @date 2023/9/8 16:19
 * @version 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PsiMaterialStoreNumberQuery {

    @ApiModelProperty("标识")
    private String id;

    @ApiModelProperty("物料")
    private String materialId;

    @ApiModelProperty("仓库")
    private String storeId;
    @ApiModelProperty("库区")
    private String areaId;
    @ApiModelProperty("库位")
    private String positionId;

    @ApiModelProperty("批号")
    private String batchNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("库存数量")
    private BigDecimal storeNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("占用数量")
    private BigDecimal lockNumber;

    @ApiModelProperty("要转换的单位id")
    private String unitId;
    @ApiModelProperty("要转换的单位精度")
    private Integer unitAccuracy;
    @ApiModelProperty("要转换的单位舍入方式")
    private Integer unitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转换后库存数量")
    private BigDecimal convertStoreNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转换后占用数量")
    private BigDecimal convertLockNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转换后可用数量")
    private BigDecimal convertUsableNumber;

    @ApiModelProperty("物料特征")
    private List<PsiStoreMaterialSpecific> specificList;
    @ApiModelProperty(hidden = true)
    private String materialSpecific;
    @ApiModelProperty(hidden = true)
    private String storeKey;

    public BigDecimal lockNumberNN() {
        if (Objects.isNull(lockNumber)) {
            return BigDecimal.ZERO;
        } else {
            return lockNumber;
        }
    }

    public BigDecimal storeNumberNN() {
        if (Objects.isNull(storeNumber)) {
            return BigDecimal.ZERO;
        } else {
            return storeNumber;
        }
    }

    public BigDecimal convertStoreNumberNN() {
        if (Objects.isNull(convertStoreNumber)) {
            return BigDecimal.ZERO;
        } else {
            return convertStoreNumber;
        }
    }

    public BigDecimal convertLockNumberNN() {
        if (Objects.isNull(convertLockNumber)) {
            return BigDecimal.ZERO;
        } else {
            return convertLockNumber;
        }
    }
}
