package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 产品档案清单
 * </p>
 *
 * @author FZY
 * @since 2024-11-29
 */
@Getter
@Setter
@TableName("mes_production_archive_list")
@ApiModel(value = "MesProductionArchiveList对象", description = "产品档案清单")
public class MesProductionArchiveList extends BaseEntity {

    @ApiModelProperty("方案ID")
    @TableField("scheme_id")
    private String schemeId;

    @ApiModelProperty("方案编码")
    @TableField("scheme_code")
    private String schemeCode;

    @ApiModelProperty("方案名称")
    @TableField("scheme_name")
    private String schemeName;

    @ApiModelProperty("标签条码ID")
    @TableField("barcode_id")
    private String barcodeId;

    @ApiModelProperty("标签条码")
    @TableField("barcode")
    private String barcode;

    @ApiModelProperty("条码序列号id")
    @TableField("source_serial_id")
    private String sourceSerialId;

    @ApiModelProperty("序列号前缀")
    @TableField("prefix_serial")
    private String prefixSerial;

    @ApiModelProperty("序列号后缀流水")
    @TableField("suffix_serial")
    private String suffixSerial;

    @ApiModelProperty("完整序列号编码")
    @TableField("total_serial")
    private String totalSerial;

    @ApiModelProperty("客户物料编码ID")
    @TableField("customer_material_id")
    private String customerMaterialId;

    @ApiModelProperty("客户物料编码")
    @TableField("customer_material_code")
    private String customerMaterialCode;

    @ApiModelProperty("客户物料名称")
    @TableField("customer_material_name")
    private String customerMaterialName;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField("material_specific_name")
    private String materialSpecificName;

    @ApiModelProperty("关联销售订单ID")
    @TableField("relate_order_id")
    private String relateOrderId;

    @ApiModelProperty("关联销售订单单号")
    @TableField("relate_order_code")
    private String relateOrderCode;

    @ApiModelProperty("关联销售订单日期")
    @TableField("relate_order_date")
    private LocalDate relateOrderDate;

    @ApiModelProperty("关联销售订单明细ID")
    @TableField("relate_order_detail_id")
    private String relateOrderDetailId;

    @ApiModelProperty("关联销售订单明细行号")
    @TableField("relate_order_line_number")
    private Long relateOrderLineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("客户ID")
    @TableField("customer_id")
    private String customerId;

    @ApiModelProperty("客户名称")
    @TableField("customer_name")
    private String customerName;

    @TableField(exist = false)
    private List<MesProductionArchiveListParam> paramList;

    @TableField(exist = false)
    private Map<String, String> paramCodeValueMap;
}
