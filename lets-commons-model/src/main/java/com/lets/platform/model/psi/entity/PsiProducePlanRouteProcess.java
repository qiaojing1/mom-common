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

/**
 * 计划订单-工艺路线-明细-工序信息-副本
 * @author DING WEI
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("psi_produce_plan_route_process")
@ApiModel(value = "PsiProducePlanRouteProcess对象", description = "计划订单-工艺路线-明细-工序信息-副本")
public class PsiProducePlanRouteProcess extends BaseEntity {

    @ApiModelProperty("计划订单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("计划订单明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("工艺路线主键")
    @TableField("route_id")
    private String routeId;

    @ApiModelProperty("公益路线明细主键")
    @TableField("route_detail_id")
    private String routeDetailId;

    @ApiModelProperty("工序组主键")
    @TableField("process_group_id")
    private String processGroupId;

    @ApiModelProperty("工序组名称")
    @TableField("process_group_name")
    private String processGroupName;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("工序编码")
    @TableField("process_code")
    private String processCode;

    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("工序类型[1加工,2包装,3委外,4检验,5入库,6出库]")
    @TableField("process_type")
    private String processType;

    @ApiModelProperty("步骤,组排序")
    @TableField("process_step")
    private Integer processStep;

    @ApiModelProperty("顺序,组内工序排序")
    @TableField("process_sort")
    private Integer processSort;

    @ApiModelProperty("检验类型[1自检,2PQC]")
    @TableField("inspect_type")
    private String inspectType;

    @ApiModelProperty("质检标准")
    @TableField("inspect_standard")
    private String inspectStandard;

    @ApiModelProperty("是否报工工序[01]")
    @TableField("is_report")
    private Integer isReport;

    @ApiModelProperty("报工方式[1手动报工2自动报工]")
    @TableField("report_way")
    private String reportWay;

    @ApiModelProperty("基本批量")
    @TableField("basic_batch_size")
    private BigDecimal basicBatchSize;

    @ApiModelProperty("计件工资")
    @TableField("work_price")
    private BigDecimal workPrice;

    @ApiModelProperty("准备时长")
    @TableField("prepare_time")
    private Integer prepareTime;

    @ApiModelProperty("标准工时")
    @TableField("standard_time")
    private Integer standardTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("标准产能(只有物料类型的工艺路线有该属性，小数位取物料的生产单位精度)")
    @TableField("standard_capacity")
    private BigDecimal standardCapacity;
    /**
     * @see com.lets.platform.model.base.enums.StandardCapacityUnitEnum
     */
    @ApiModelProperty("标准产能单位")
    @TableField("standard_capacity_unit")
    private String standardCapacityUnit;
    @TableField(exist = false)
    private String standardCapacityUnitName;

    @ApiModelProperty("转换系数")
    @TableField("convert_ratio")
    private BigDecimal convertRatio;

    @ApiModelProperty("工序单位主键")
    @TableField("process_unit_id")
    private String processUnitId;

    @ApiModelProperty("工序单位名称")
    @TableField("process_unit_name")
    private String processUnitName;

    @ApiModelProperty("工序单位精度")
    @TableField("process_unit_accuracy")
    private Integer processUnitAccuracy;

    @ApiModelProperty("工序单位舍入方式")
    @TableField("process_unit_round_off_type")
    private Integer processUnitRoundOffType;

    @ApiModelProperty("默认仓库")
    @TableField("default_store_id")
    private String defaultStoreId;

    @ApiModelProperty("默认库区")
    @TableField("default_area_id")
    private String defaultAreaId;

    @ApiModelProperty("默认库位")
    @TableField("default_position_id")
    private String defaultPositionId;

    @ApiModelProperty("默认供应商")
    @TableField("default_supplier_id")
    private String defaultSupplierId;

    @ApiModelProperty("默认供应商名称")
    @TableField("default_supplier_name")
    private String defaultSupplierName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("是否连续委外[0：否，1：是]")
    @TableField("series")
    private Integer series;

    @ApiModelProperty("启用汇报顺序控制[0:否,1:是]")
    @TableField("report_orderly")
    private Integer reportOrderly;

    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("委外单价")
    @TableField("outsource_price")
    private BigDecimal outsourcePrice;

    @ApiModelProperty("工时单价")
    @TableField("hour_price")
    private BigDecimal hourPrice;
}
