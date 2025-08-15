package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 库存出入库记录
 * @author DING WEI
 * @since 2023-08-16
 */
@Getter
@Setter
@TableName("psi_store_material_record")
@ApiModel(value = "PsiStoreMaterialRecord对象", description = "库存出入库记录")
public class PsiStoreMaterialRecord extends BaseEntity {

    @ApiModelProperty("出入库单据主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("出入库单据编号")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ApiModelProperty("出库入单据状态")
    @TableField("source_order_status")
    private String sourceOrderStatus;
    @ApiModelProperty("出入库单据类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("出入库单明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("出入库单据的源单据主键")
    @TableField("stock_source_order_id")
    private String stockSourceOrderId;
    @ApiModelProperty("出入库单据的源单据编码")
    @TableField("stock_source_order_code")
    private String stockSourceOrderCode;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;
    @ApiModelProperty("源单据行号")
    @TableField(exist = false)
    private String sourceLineNumber;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeStr;

    /**
     * @see com.lets.platform.model.psi.enums.StockSourceEnum
     */
    @ApiModelProperty("单据类型[1:采购入库单,......]")
    @TableField("order_type")
    private String orderType;
    @TableField(exist = false)
    private String orderTypeName;

    @ApiModelProperty("物料")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料属性")
    @TableField(exist = false)
    private String materialType;
    @ApiModelProperty("规格型号")
    @TableField("material_specs")
    private String specs;
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;
    @TableField("show_material_specific")
    private String showMaterialSpecific;
    @ApiModelProperty("英文名称")
    @TableField(exist = false)
    private String englishName;
    @ApiModelProperty("助记码")
    @TableField(exist = false)
    private String mnemonicCode;
    @ApiModelProperty("旧编码")
    @TableField(exist = false)
    private String oldCode;
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
    @ApiModelProperty("扩展规格备注一")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("扩展规格备注二")
    @TableField(exist = false)
    private String remark2;

    @ApiModelProperty("仓库")
    @TableField("store_id")
    private String storeId;
    @TableField("store_code")
    private String storeCode;
    @TableField("store_name")
    private String storeName;

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

    @ApiModelProperty("变动数量")
    @TableField("change_number")
    private BigDecimal changeNumber;
    @ApiModelProperty("基本数量")
    @TableField("basic_number")
    private BigDecimal basicNumber;
    @ApiModelProperty("占用数量")
    @TableField(exist = false)
    private BigDecimal lockNumber;
    @ApiModelProperty("库存数量(明细过账之后的当时库存结余)")
    @TableField("store_number")
    private BigDecimal storeNumber;

    @ApiModelProperty("保质期至")
    @TableField("period_date")
    private LocalDateTime periodDate;

    /**
     * @see com.lets.platform.common.pojo.enums.StockTypeEnum
     */
    @ApiModelProperty("类型")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @TableField(exist = false)
    private List<PsiStoreMaterialSpecific> specifics;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String storeKey;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer basicUnitAccuracy;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer basicUnitRoundOffType;
    @ApiModelProperty("物料-基本单位")
    @TableField(exist = false)
    private String basicUnitId;
    @TableField(exist = false)
    private String basicUnitCode;
    @TableField(exist = false)
    private String basicUnitName;

    @ApiModelProperty("物料-库存单位")
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

    @ApiModelProperty("上游单据-库存单位")
    @TableField("store_unit_id")
    private String storeUnitId;
    @TableField("store_unit_code")
    private String storeUnitCode;
    @TableField("store_unit_name")
    private String storeUnitName;
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    private String supplierId;
    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty("生产部门主键")
    @TableField("factory_org_id")
    private String factoryOrgId;
    @ApiModelProperty("生产部门名称")
    @TableField("factory_org_name")
    private String factoryOrgName;

    @ApiModelProperty("客户主键")
    @TableField("custom_id")
    private String customId;
    @ApiModelProperty("客户名称")
    @TableField("custom_name")
    private String customName;

    @ApiModelProperty("生产日期")
    @TableField("produce_time")
    private LocalDateTime produceDate;

    @ApiModelProperty("期初库存")
    @TableField(exist = false)
    private BigDecimal openingQuantity;
    @ApiModelProperty("期末库存")
    @TableField(exist = false)
    private BigDecimal closingQuantity;
    @ApiModelProperty("入库数量")
    @TableField(exist = false)
    private BigDecimal inboundQuantity;
    @ApiModelProperty("出库数量")
    @TableField(exist = false)
    private BigDecimal outboundQuantity;

    public BigDecimal lockNumberNN() {
        if (Objects.isNull(lockNumber)) {
            return BigDecimal.ZERO;
        } else {
            return lockNumber;
        }
    }
}
