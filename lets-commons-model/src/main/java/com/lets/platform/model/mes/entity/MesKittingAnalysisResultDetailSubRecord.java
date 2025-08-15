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
 * <p>
 * 齐套分析清单明细子项供应明细
 * </p>
 *
 * @author FZY
 * @since 2024-06-05
 */
@Getter
@Setter
@TableName("mes_kitting_analysis_result_detail_sub_record")
@ApiModel(value = "MesKittingAnalysisResultDetailSubRecord对象", description = "齐套分析清单明细子项供应明细")
public class MesKittingAnalysisResultDetailSubRecord extends BaseEntity {

    @ApiModelProperty("齐套分析结果ID")
    @TableField("result_id")
    private String resultId;

    @ApiModelProperty("齐套分析清单明细子项ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("类型[1:在途;2:在制;3:库存]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("来源单据类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("来源单据ID")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("来源单据编码")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("来源单据明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("来源单据明细行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("单位")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    private String unitCode;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
}
