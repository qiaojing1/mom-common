package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 生产报工-生产废料-记录
 * @author DING WEI
 * @since 2024-04-22
 */
@Getter
@Setter
@TableName("mes_dispatch_detail_waste")
@ApiModel(value = "MesDispatchDetailWaste对象", description = "生产报工-生产废料-记录")
public class MesDispatchDetailWaste extends BaseEntity {

    @ApiModelProperty("生产工单编码")
    @TableField("dispatch_id")
    private String dispatchId;

    @ApiModelProperty("工序汇报单主键")
    @TableField("process_report_id")
    private String processReportId;

    @ApiModelProperty("工单报工单主键")
    @TableField("order_report_id")
    private String orderReportId;

    /**
     * @see com.lets.platform.model.psi.enums.WasteTypeEnum
     */
    @ApiModelProperty("类型[1:半成品,2:尾料]")
    @TableField("type")
    private String type;

    @ApiModelProperty("物料id")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer storable;

    @ApiModelProperty("数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;
    @ApiModelProperty("规格型号")
    @TableField(exist = false)
    private String materialSpecs;
    @ApiModelProperty("基本单位ID")
    @TableField(exist = false)
    private String basicUnitId;
    @ApiModelProperty("基本单位编码")
    @TableField(exist = false)
    private String basicUnitCode;
    @ApiModelProperty("基本单位名称")
    @TableField(exist = false)
    private String basicUnitName;
    @ApiModelProperty("基本单位精度")
    @TableField(exist = false)
    private Integer basicUnitAccuracy;
    @ApiModelProperty("基本单位舍入方式")
    @TableField(exist = false)
    private String basicUnitRoundOffType;
    @ApiModelProperty("库存单位ID")
    @TableField(exist = false)
    private String inventoryUnitId;
    @ApiModelProperty("库存单位名称")
    @TableField(exist = false)
    private String inventoryUnitCode;
    @ApiModelProperty("库存单位名称")
    @TableField(exist = false)
    private String inventoryUnitName;
    @ApiModelProperty("库存单位精度")
    @TableField(exist = false)
    private Integer inventoryUnitAccuracy;
    @ApiModelProperty("库存单位舍入类型")
    @TableField(exist = false)
    private String inventoryUnitRoundOffType;
    @ApiModelProperty("参考单位ID")
    @TableField(exist = false)
    private String referenceUnitId;
    @ApiModelProperty("参考单位编码")
    @TableField(exist = false)
    private String referenceUnitCode;
    @ApiModelProperty("参考单位名称")
    @TableField(exist = false)
    private String referenceUnitName;
    @ApiModelProperty("参考单位精度")
    @TableField(exist = false)
    private Integer referenceUnitAccuracy;
    @ApiModelProperty("参考单位舍入方式")
    @TableField(exist = false)
    private String referenceUnitRoundOffType;
    @ApiModelProperty("启用保质期管理[0:不启用;1:启用]")
    @TableField(exist = false)
    private Integer expirationDateManaged;
    @ApiModelProperty("保质期控制方式")
    @TableField(exist = false)
    private String expirationDateControlType;
    @ApiModelProperty("保质期时长")
    @TableField(exist = false)
    private Short expirationTime;
    @ApiModelProperty("保质期单位")
    @TableField(exist = false)
    private String expirationDateUnit;
    @ApiModelProperty("批号控制方式")
    @TableField(exist = false)
    private String lotNoControlType;
    @ApiModelProperty("批号编码方式")
    @TableField(exist = false)
    private String lotNoCodeRuleId;
    @ApiModelProperty("批号应用范围")
    @TableField(exist = false)
    private String lotNoScope;

    @ApiModelProperty("仓库")
    @TableField(exist = false)
    private String storeId;
    @TableField(exist = false)
    private String storeName;
    @ApiModelProperty("库区")
    @TableField(exist = false)
    private String areaId;
    @TableField(exist = false)
    private String areaName;
    @ApiModelProperty("库位")
    @TableField(exist = false)
    private String positionId;
    @TableField(exist = false)
    private String positionName;
    @ApiModelProperty("仓库部门ID")
    @TableField(exist = false)
    private String storeOrgId;
    @ApiModelProperty("仓库部门名称")
    @TableField(exist = false)
    private String storeOrgName;
    @ApiModelProperty("库管员ID")
    @TableField(exist = false)
    private String storeUserId;
    @ApiModelProperty("库管员名称")
    @TableField(exist = false)
    private String storeUserName;
}
