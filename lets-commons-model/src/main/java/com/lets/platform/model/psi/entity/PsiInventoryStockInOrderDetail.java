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
import java.util.List;

/**
 * 盘盈入库单-明细
 * @author DINGWEI
 * @since 2023-10-16
 */
@Getter
@Setter
@TableName("psi_inventory_stock_in_order_detail")
@ApiModel(value = "PsiInventoryStockInOrderDetail对象", description = "盘盈入库单-明细")
public class PsiInventoryStockInOrderDetail extends BaseEntity {

    @ApiModelProperty("盘盈入库单据主键")
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    private String orderCode;
    @TableField(exist = false)
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderStatus;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("批号控制方式")
    @TableField("lot_no_control_type")
    private String lotNoControlType;
    @ApiModelProperty("批号应用范围")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("库存单位")
    @TableField("store_unit_id")
    private String storeUnitId;
    @ApiModelProperty("库存单位编码")
    @TableField("store_unit_code")
    private String storeUnitCode;
    @ApiModelProperty("库存单位名称")
    @TableField("store_unit_name")
    private String storeUnitName;
    @ApiModelProperty("库存单位精度")
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;
    @ApiModelProperty("库存单位舍入类型")
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("盘点前数量")
    @TableField("before_number")
    private BigDecimal beforeNumber;

    @ApiModelProperty("盘点数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("盘盈数量")
    @TableField("stock_in_number")
    private BigDecimal stockInNumber;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("生产日期")
    @TableField("produce_time")
    private LocalDateTime produceTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("有效期至")
    @TableField("period_time")
    private LocalDateTime periodTime;

    @ApiModelProperty("仓库")
    @TableField("store_id")
    private String storeId;
    @TableField(exist = false)
    private String storeName;
    @ApiModelProperty("库区")
    @TableField("area_id")
    private String areaId;
    @TableField(exist = false)
    private String areaName;
    @ApiModelProperty("库位")
    @TableField("position_id")
    private String positionId;
    @TableField(exist = false)
    private String positionName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;
    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;
    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("乐观锁版本号")
    @TableField("version")
    private Integer version;

    @ApiModelProperty("盘点单主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("盘点单编码")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @TableField(exist = false)
    private List<PsiInventoryStockOrderDetailSpecific> detailSpecifics;
}
