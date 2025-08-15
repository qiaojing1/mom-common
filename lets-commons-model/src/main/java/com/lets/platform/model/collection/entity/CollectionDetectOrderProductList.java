package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import java.util.Map;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 产品列表
 * </p>
 *
 * @author csy
 * @since 2024-02-20
 */
@Getter
@Setter
@TableName("collection_detect_order_product_list")
@ApiModel(value = "CollectionDetectOrderProductList对象", description = "产品列表")
public class CollectionDetectOrderProductList extends BaseEntity {


    @ApiModelProperty("产品编号")
    @TableField("product_code")
    private String productCode;

    @TableField(exist = false)
    private Map<String,Object> order;

    @ApiModelProperty("工单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("工单Code")
    @TableField("detect_order_code")
    private String detectOrderCode;
    @TableField(exist = false)
    private String oldCode;

    @ApiModelProperty("报告id")
    @TableField("report_id")
    private String reportId;

    @ApiModelProperty("报告编号")
    @TableField("report_code")
    private String reportCode;

    @ApiModelProperty("报告时间")
    @TableField("report_time")
    private LocalDateTime reportTime;

    @ApiModelProperty("试验结果")
    @TableField("result")
    private String result;

    @ApiModelProperty("主阀体炉号")
    @TableField("main_heat_number")
    private String mainHeatNumber;

    @ApiModelProperty("副阀体炉号")
    @TableField("auxiliary_heat_number")
    private String auxiliaryHeatNumber;

    @ApiModelProperty("阀盖炉号")
    @TableField("bonnet_heat_number")
    private String bonnetHeatNumber;

    @ApiModelProperty("阀杆炉号")
    @TableField("stem_heat_number")
    private String stemHeatNumber;

    @ApiModelProperty("板/蝶/球炉号")
    @TableField("other_heat_number")
    private String otherHeatNumber;


    @TableField("order_code")
    private String orderCode;
    @TableField("line_number")
    private String lineNumber;
    @TableField("lrp_no")
    private String lrpNo;
    @TableField(exist = false)
    private String startSerial;
    @TableField(exist = false)
    private String trackNo;
    @TableField(exist = false)
    private String model;
    @TableField(exist = false)
    private String caliber;
    @TableField(exist = false)
    private String pressure;
    @TableField(exist = false)
    private String standard;
    @TableField(exist = false)
    private String valveTypeName;
}
