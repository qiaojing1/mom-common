package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * <p>
 * 预留关系表
 * </p>
 *
 * @author FZY
 * @since 2025-02-12
 */
@Getter
@Setter
@TableName("psi_reservation_relationship")
@ApiModel(value = "PsiReservationRelationship对象", description = "预留关系表")
public class PsiReservationRelationship extends BaseEntity {

    @ApiModelProperty("预留类型[1:库存预留;2:单据预留]")
    @TableField("type")
    private Integer type;

    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("强弱预留类型[1:强预留;2:弱预留]")
    @TableField("reservation_type")
    private String reservationType;

    @TableField(exist = false)
    private String reservationTypeName;

    @ApiModelProperty("预留仓库ID")
    @TableField("store_id")
    private String storeId;

    @TableField(exist = false)
    private String storeName;

    @ApiModelProperty("预留库区ID")
    @TableField("area_id")
    private String areaId;

    @TableField(exist = false)
    private String areaName;

    @ApiModelProperty("预留库位ID")
    @TableField("position_id")
    private String positionId;

    @TableField(exist = false)
    private String positionName;

    @ApiModelProperty("预留批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("预留单据ID")
    @TableField(exist = false)
    private String useId;

    @ApiModelProperty("预留单据编码")
    @TableField(exist = false)
    private String useMenuCode;

    @ApiModelProperty("预留单据明细ID")
    @TableField("use_detail_id")
    private String useDetailId;

    @TableField(exist = false)
    private String useOrderCode;

    @TableField(exist = false)
    private Long useLineNumber;

    @ApiModelProperty("预留单据类型")
    @TableField("use_order_type")
    private String useOrderType;

    @ApiModelProperty("预留单据类型")
    @TableField(exist = false)
    private String useOrderTypeName;

    @TableField(exist = false)
    private LocalDate useNeedDate;

    @ApiModelProperty("被占用单据ID")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("被占用单据明细行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("被占用单据明细ID")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("被占用单据编码")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("单据类型")
    @TableField("order_type")
    private String orderType;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @TableField(exist = false)
    private String materialCode;

    @TableField(exist = false)
    private String materialName;

    @TableField(exist = false)
    private String materialSpecs;

    @TableField(exist = false)
    private String unitId;

    @TableField(exist = false)
    private String unitCode;

    @TableField(exist = false)
    private String unitName;

    @TableField(exist = false)
    private Integer unitAccuracy;

    @TableField(exist = false)
    private String unitRoundOffType;

    @TableField(exist = false)
    private String trackNo;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @TableField(exist = false)
    private String materialSpecificName;

    @ApiModelProperty("bom明细ID")
    @TableField("bom_detail_id")
    private String bomDetailId;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("解锁数量")
    @TableField(exist = false)
    private BigDecimal unlockQuantity;

    @ApiModelProperty("可解锁数量")
    @TableField(exist = false)
    private BigDecimal availableQuantity;

    @ApiModelProperty("占用顺序")
    @TableField("sort")
    private Integer sort;

    @TableField(exist = false)
    private String rootId;

    @TableField(exist = false)
    private String rootCode;

    @TableField(exist = false)
    private String rootType;

    @TableField(exist = false)
    private String rootDetailId;

    @TableField(exist = false)
    private Long rootLineNumber;

    @TableField(exist = false)
    private String rootOrderCategoryId;

    @TableField(exist = false)
    private String rootMenuCode;

    @TableField(exist = false)
    private String rootMenuName;

    @TableField(exist = false)
    private String customerName;

    @TableField(exist = false)
    private String projectCode;

    @TableField(exist = false)
    private boolean used;

    @TableField(exist = false)
    private boolean changed;
}