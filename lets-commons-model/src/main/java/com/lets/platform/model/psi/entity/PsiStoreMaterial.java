package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * 物料库存
 * @author DING WEI
 * @since 2023-08-16
 */
@Getter
@Setter
@TableName("psi_store_material")
@ApiModel(value = "PsiStoreMaterial对象", description = "物料库存")
public class PsiStoreMaterial extends BaseEntity {

    @TableField(exist = false)
    private String rowKey;

    @ApiModelProperty("物料")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Collection<String> materialIds;
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;
    @TableField(exist = false)
    private String materialSpecificName;
    @TableField(exist = false)
    private String materialSpecificKey;
    @TableField(exist = false)
    private List<PsiStoreMaterialSpecific> specificList;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("英文名称")
    @TableField(exist = false)
    private String englishName;
    @ApiModelProperty("规格型号")
    @TableField("material_specs")
    private String specs;
    @ApiModelProperty("助记码")
    @TableField(exist = false)
    private String mnemonicCode;
    @ApiModelProperty("助记码")
    @TableField(exist = false)
    private String oldCode;
    @ApiModelProperty("物料属性")
    @TableField(exist = false)
    private String type;
    @TableField(exist = false)
    private String typeName;
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
    @ApiModelProperty("物料分组")
    @TableField(exist = false)
    private String groupId;
    @TableField(exist = false)
    private String groupName;
    @ApiModelProperty("生命周期")
    @TableField(exist = false)
    private String lifeCycleId;
    @TableField(exist = false)
    private String lifeCycleName;
    @ApiModelProperty("扩展规格备注一")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("扩展规格备注二")
    @TableField(exist = false)
    private String remark2;
    @ApiModelProperty("库存单位")
    @TableField(exist = false)
    private String inventoryUnitId;
    @TableField(exist = false)
    private String inventoryUnitCode;
    @TableField(exist = false)
    private String inventoryUnitName;
    @TableField(exist = false)
    private Integer inventoryUnitAccuracy;
    @TableField(exist = false)
    private Integer inventoryUnitRoundOffType;
    @ApiModelProperty("参考单位")
    @TableField(exist = false)
    private String inventoryReferenceUnitId;
    @TableField(exist = false)
    private String inventoryReferenceUnitCode;
    @TableField(exist = false)
    private String inventoryReferenceUnitName;
    @TableField(exist = false)
    private Integer inventoryReferenceUnitAccuracy;
    @TableField(exist = false)
    private Integer inventoryReferenceUnitRoundOffType;
    @ApiModelProperty("参考数量")
    @TableField(exist = false)
    private BigDecimal inventoryReferenceNumber;

    @ApiModelProperty("基础单位")
    @TableField(exist = false)
    private String basicUnitId;
    @TableField(exist = false)
    private String basicUnitCode;
    @TableField(exist = false)
    private String basicUnitName;
    @TableField(exist = false)
    private Integer basicUnitAccuracy;
    @TableField(exist = false)
    private Integer basicUnitRoundOffType;
    @TableField(exist = false)
    private BigDecimal basicNumber;

    @ApiModelProperty("仓库")
    @TableField("store_id")
    private String storeId;
    @TableField("store_code")
    private String storeCode;
    @TableField("store_name")
    private String storeName;
    @ApiModelProperty("仓库归属")
    @TableField(exist = false)
    private String storeBelong;
    @ApiModelProperty("库区")
    @TableField("area_id")
    private String areaId;
    @TableField("area_code")
    private String areaCode;
    @TableField("area_name")
    private String areaName;
    @ApiModelProperty("库位")
    @TableField("position_id")
    private String positionId;
    @TableField("position_code")
    private String positionCode;
    @TableField("position_name")
    private String positionName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("库存数量")
    @TableField("store_number")
    private BigDecimal storeNumber;
    //需求 #35252 删除lockNumber
    @ApiModelProperty("占用数量")
    @TableField(exist = false)
    private BigDecimal lockNumber;
    @ApiModelProperty("可用数量")
    @TableField(exist = false)
    private BigDecimal availableNumber;
    @ApiModelProperty("安全库存")
    @TableField(exist = false)
    private BigDecimal safeNumber;

    @TableField(exist = false)
    private BigDecimal paramStoreNumber;
    @TableField(exist = false)
    private BigDecimal paramLockNumber;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("保质期至")
    @TableField("period_date")
    private LocalDateTime periodDate;

    /**
     * @see com.lets.platform.model.psi.enums.IsExpiredEnum
     */
    @ApiModelProperty("状态(是否过期)")
    @TableField(exist = false)
    private String isExpired;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String storeKey;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String storeReferenceUnitCode;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String referenceStoreUnitCode;

    @TableField(exist = false)
    private String supplierId;
    @TableField(exist = false)
    private String supplierName;
    @TableField(exist = false)
    private String factoryOrgId;
    @TableField(exist = false)
    private String factoryOrgName;
    @TableField("produce_date")
    private LocalDateTime produceDate;
    @TableField(exist = false)
    private String storeUnitId;
    @TableField(exist = false)
    private String storeUnitName;

    @ApiModelProperty("批号明细")
    @TableField(exist = false)
    private List<PsiStoreMaterialRecord> batchDetails;

    @ApiModelProperty("保质期明细")
    @TableField(exist = false)
    private List<PsiStoreMaterialRecord> periodDetail;

    @ApiModelProperty("忽略特征属性 Y 代表忽略")
    @TableField(exist = false)
    private String ignoreSpecific;

    @ApiModelProperty("库存状态, Y表示库存充足")
    @TableField(exist = false)
    private String safeOrNot;
    @TableField(exist = false)
    private String safeOrNotName;

    /**
     * 当前日期-批次的入库日期
     */
    @ApiModelProperty("呆滞天数")
    @TableField(exist = false)
    private Long sluggishnessDay;
    @ApiModelProperty("拼接起来的仓库-库区-库位名称")
    @TableField(exist = false)
    private String splicingStoreName;

    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFl13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFl14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFl15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFl16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFl17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFl18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFl19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFl20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFl21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFl22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFl23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFl24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFl25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFl26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFl27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFl28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFl29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFl30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFl31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFl32;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlName1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlName2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlName3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlName4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlName5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlName6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlName7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlName8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlName9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlName10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlName11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlName12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlName13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlName14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlName15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlName16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlName17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlName18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlName19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlName20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlName21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlName22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlName23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlName24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlName25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlName26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlName27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlName28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlName29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlName30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlName31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlName32;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("阶段一数量")
    @TableField(exist = false)
    private BigDecimal stageOneNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("阶段二数量")
    @TableField(exist = false)
    private BigDecimal stageTwoNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("阶段三数量")
    @TableField(exist = false)
    private BigDecimal stageThreeNumber;

    @ApiModelProperty(hidden = true, value = "X1=(X4/2)为整数则减1，如果(X4/2)为小数则直接取整")
    @TableField(exist = false)
    private Integer obsoleteDaysX1;
    @ApiModelProperty(hidden = true, value = "X2=X1+1")
    @TableField(exist = false)
    private Integer obsoleteDaysX2;
    @ApiModelProperty(hidden = true, value = "X3=X4-1")
    @TableField(exist = false)
    private Integer obsoleteDaysX3;
    @ApiModelProperty("呆滞天数(X4)")
    @TableField(exist = false)
    private Integer obsoleteDaysX4;

    public BigDecimal storeNumberNotNull() {
        if (Objects.isNull(storeNumber)) {
            return BigDecimal.ZERO;
        } else {
            return storeNumber;
        }
    }
}
