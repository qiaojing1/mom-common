package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 * 盘点单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-10-09
 */
@Getter
@Setter
@TableName("psi_inventory_check_order_material")
@ApiModel(value = "PsiInventoryCheckOrderMaterial对象", description = "盘点单物料明细")
public class PsiInventoryCheckOrderMaterial extends BaseEntity {

    @ApiModelProperty("销售订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料分组ID")
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料创建时间[用于默认排序]")
    @TableField(exist = false)
    private LocalDateTime materialCreateTime;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("批号控制方式")
    @TableField("lot_no_control_type")
    private String lotNoControlType;

    @ApiModelProperty("批号编码方式")
    @TableField("lot_no_code_rule_id")
    private String lotNoCodeRuleId;

    @ApiModelProperty("批号应用范围")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("启用保质期管理[0:不启用;1:启用]")
    @TableField("expiration_date_managed")
    private Integer expirationDateManaged;

    @ApiModelProperty("保质期控制方式")
    @TableField("expiration_date_control_type")
    private String expirationDateControlType;

    @ApiModelProperty("保质期时长")
    @TableField("expiration_time")
    private Short expirationTime;

    @ApiModelProperty("保质期单位")
    @TableField("expiration_date_unit")
    private String expirationDateUnit;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    private LocalDateTime productionDate;

    @ApiModelProperty("保质期到期日")
    @TableField("expiration_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expirationDate;

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_id")
    private String inventoryUnitId;

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_code")
    private String inventoryUnitCode;

    @ApiModelProperty("库存单位名称")
    @TableField("inventory_unit_name")
    private String inventoryUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField("inventory_unit_accuracy")
    private Integer inventoryUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField("inventory_unit_round_off_type")
    private String inventoryUnitRoundOffType;

    @ApiModelProperty("库存数量")
    @TableField("inventory_quantity")
    private BigDecimal inventoryQuantity;

    @ApiModelProperty("盘点数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("盘盈数量")
    @TableField("excess_quantity")
    private BigDecimal excessQuantity;

    @ApiModelProperty("盘亏数量")
    @TableField("deficit_quantity")
    private BigDecimal deficitQuantity;

    @ApiModelProperty("误差")
    @TableField("error_rate")
    private BigDecimal errorRate;

    @ApiModelProperty("误差")
    @TableField(exist = false)
    private String errorRateFormat;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库编码")
    @TableField("store_code")
    private String storeCode;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("库区ID")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty("库区编码")
    @TableField("area_code")
    private String areaCode;

    @ApiModelProperty("库区名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("库位ID")
    @TableField("position_id")
    private String positionId;

    @ApiModelProperty("库位编码")
    @TableField("position_code")
    private String positionCode;

    @ApiModelProperty("库位名称")
    @TableField("position_name")
    private String positionName;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("是否可编辑(手动新增的可以编辑,系统创建的无法编辑)[0:否;1:是]")
    @TableField("editable")
    private Integer editable;

    @ApiModelProperty("库存ID")
    @TableField(exist = false)
    private String storeMaterialId;

    @ApiModelProperty("物料明细")
    @TableField(exist = false)
    private List<PsiInventoryCheckOrderMaterialCharacteristic> materialCharacteristicList;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private String key;

    public void setKey(Integer nonSpecificMaterial) {
        if (IsOrNotEnum.IS.equals(nonSpecificMaterial)) {
            this.key = Optional.ofNullable(storeId).orElse("") + "-" + Optional.ofNullable(areaId).orElse("") + "-" + Optional.ofNullable(positionId).orElse("") + "-" + Optional.ofNullable(materialId)
                                                                                                                                                                                 .orElse("") + "-" + Optional.ofNullable(
                    batchNumber).orElse("");
        } else {
            this.key = this.lineNumber.toString();
        }
    }
}
