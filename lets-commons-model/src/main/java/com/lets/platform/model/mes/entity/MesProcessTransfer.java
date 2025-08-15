package com.lets.platform.model.mes.entity;

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
import java.util.Objects;

/**
 * 工序转移单
 * @author DING WEI
 * @since 2024-01-02
 */
@Getter
@Setter
@TableName("mes_process_transfer")
@ApiModel(value = "MesProcessTransfer对象", description = "工序转移单")
public class MesProcessTransfer extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("流水号")
    @TableField("serial_number")
    private Integer serialNumber;

    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeFormat;

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
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    /**
     * @see com.lets.platform.model.mes.enums.processTransfer.TransferDirectionEnum
     */
    @ApiModelProperty("转移方向[1：转入 2：转出]")
    @TableField("transfer_direction")
    private Integer transferDirection;
    @TableField(exist = false)
    private String transferDirectionName;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("派工单主键")
    @TableField("dispatch_id")
    private String dispatchId;

    /**
     * @see com.lets.platform.model.mes.enums.processTransfer.TransferSourceOrderTypeEnum
     */
    @ApiModelProperty("源单类型[1：工序计划单]")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("源单主键(工序计划单-主键)")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单编码(工序计划单-编码)")
    @TableField(exist = false)
    private String sourceOrderCode;
    @ApiModelProperty("源单明细主键(工序计划单-明细-主键)")
    @TableField("source_order_detail_id")
    private String sourceOrderDetailId;
    @ApiModelProperty("源单行号(工序计划工序号)")
    @TableField("source_line_number")
    private String sourceLineNumber;
    @ApiModelProperty("回冲源单主键")
    @TableField("backwash_source_order_id")
    private String backwashSourceOrderId;
    @ApiModelProperty("回冲源单编码")
    @TableField("backwash_source_order_code")
    private String backwashSourceOrderCode;

    @ApiModelProperty("是否生成汇报入库单(过程-工位机接收)(YN)")
    @TableField("generate_wip")
    private String generateWip;

    @ApiModelProperty("生产工单-主键")
    @TableField(exist = false)
    private String produceOrderId;
    @ApiModelProperty("生产工单-编码")
    @TableField(exist = false)
    private String produceOrderCode;
    @ApiModelProperty("生产工单-行号")
    @TableField(exist = false)
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-明细主键")
    @TableField(exist = false)
    private String produceDetailId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产工单-数量")
    @TableField(exist = false)
    private BigDecimal produceNumber;
    @ApiModelProperty("生产工单-单位主键")
    @TableField(exist = false)
    private String produceUnitId;
    @ApiModelProperty("物料生产单位编码")
    @TableField(exist = false)
    private String produceUnitCode;
    @ApiModelProperty("物料生产单位名称")
    @TableField(exist = false)
    private String produceUnitName;
    @ApiModelProperty("物料生产单位精度")
    @TableField(exist = false)
    private Integer produceUnitAccuracy;
    @ApiModelProperty("物料生产单位舍入类型")
    @TableField(exist = false)
    private Integer produceUnitRoundOffType;
    @ApiModelProperty("生产工单-批号")
    @TableField(exist = false)
    private String produceBatchNumber;
    @ApiModelProperty("生产工单-BOM版本")
    @TableField(exist = false)
    private String produceBomId;
    @ApiModelProperty("生产工单-BOM版本")
    @TableField(exist = false)
    private String produceBomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String produceBomVersionDescribe;
    @ApiModelProperty("生产工单-工艺路线")
    @TableField(exist = false)
    private String produceRouteId;
    @ApiModelProperty("生产工单-工艺路线名称")
    @TableField(exist = false)
    private String produceRouteName;
    @ApiModelProperty("生产工单-生产部门")
    @TableField(exist = false)
    private String produceOrgId;
    @ApiModelProperty("生产工单-生产部门名称")
    @TableField(exist = false)
    private String produceOrgName;
    @ApiModelProperty("生产单元")
    @TableField(exist = false)
    private String produceFactoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField(exist = false)
    private String produceFactoryModeName;

    @ApiModelProperty("转出-工序计划单-主键")
    @TableField("out_process_plan_id")
    private String outProcessPlanId;
    @ApiModelProperty("转出-工序计划单-编码")
    @TableField("out_process_plan_code")
    private String outProcessPlanCode;
    @ApiModelProperty("转出-工序号")
    @TableField("out_process_no")
    private String outProcessNo;
    @ApiModelProperty("转出-工序主键")
    @TableField("out_process_id")
    private String outProcessId;
    @ApiModelProperty("转出-工序编码")
    @TableField("out_process_code")
    private String outProcessCode;
    @ApiModelProperty("转出-工序名称")
    @TableField("out_process_name")
    private String outProcessName;
    @ApiModelProperty("转出-工序类型")
    @TableField("out_process_type")
    private String outProcessType;
    @TableField(exist = false)
    private String outProcessTypeName;
    @ApiModelProperty("转出-工序组主键")
    @TableField("out_process_group_id")
    private String outProcessGroupId;
    @ApiModelProperty("转出-工序组名称")
    @TableField("out_process_group_name")
    private String outProcessGroupName;
    @ApiModelProperty("转出-工序单位主键")
    @TableField("out_process_unit_id")
    private String outProcessUnitId;
    @ApiModelProperty("转出-工序单位名称")
    @TableField("out_process_unit_name")
    private String outProcessUnitName;
    @ApiModelProperty("转出-工序单位精度")
    @TableField("out_process_unit_accuracy")
    private Integer outProcessUnitAccuracy;
    @ApiModelProperty("转出-工序单位舍入方式")
    @TableField("out_process_unit_round_off_type")
    private Integer outProcessUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转出数量")
    @TableField("out_transfer_number")
    private BigDecimal outTransferNumber;

    @ApiModelProperty("转入-工序计划单-主键")
    @TableField("in_process_plan_id")
    private String inProcessPlanId;
    @ApiModelProperty("转入-工序计划单-编码")
    @TableField("in_process_plan_code")
    private String inProcessPlanCode;
    @ApiModelProperty("转入-工序号")
    @TableField("in_process_no")
    private String inProcessNo;
    @ApiModelProperty("转入-工序主键")
    @TableField("in_process_id")
    private String inProcessId;
    @ApiModelProperty("转入-工序编码")
    @TableField("in_process_code")
    private String inProcessCode;
    @ApiModelProperty("转入-工序名称")
    @TableField("in_process_name")
    private String inProcessName;
    @ApiModelProperty("转入-工序类型")
    @TableField("in_process_type")
    private String inProcessType;
    @TableField(exist = false)
    private String inProcessTypeName;
    @ApiModelProperty("转入-工序组主键")
    @TableField("in_process_group_id")
    private String inProcessGroupId;
    @ApiModelProperty("转入-工序组名称")
    @TableField("in_process_group_name")
    private String inProcessGroupName;
    @ApiModelProperty("转入-工序单位主键")
    @TableField("in_process_unit_id")
    private String inProcessUnitId;
    @ApiModelProperty("转入-工序单位名称")
    @TableField("in_process_unit_name")
    private String inProcessUnitName;
    @ApiModelProperty("转入-工序单位精度")
    @TableField("in_process_unit_accuracy")
    private Integer inProcessUnitAccuracy;
    @ApiModelProperty("转入-工序单位舍入方式")
    @TableField("in_process_unit_round_off_type")
    private Integer inProcessUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转入数量")
    @TableField("in_transfer_number")
    private BigDecimal inTransferNumber;

    /**
     * @see com.lets.platform.model.mes.enums.processTransfer.TransferDataSourceEnum
     */
    @ApiModelProperty("数据来源[1：MES]")
    @TableField("data_source")
    private String dataSource;
    @TableField(exist = false)
    private String dataSourceName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("转移数量")
    @TableField(exist = false)
    private BigDecimal transferNumber;
    @ApiModelProperty("工序单位")
    @TableField(exist = false)
    private String processUnitName;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private String isMateialDemand;
    @ApiModelProperty("倒冲领料单主键")
    @TableField("generate_reverse_picking_order_id")
    private String generateReversePickingOrderId;

    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;


    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("备注1")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("备注2")
    @TableField(exist = false)
    private String remark2;
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

    @ApiModelProperty("扩展字段1")
    @TableField(exist = false)
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField(exist = false)
    private String extField2;

    @ApiModelProperty("扩展字段3")
    @TableField(exist = false)
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField(exist = false)
    private String extField4;

    @ApiModelProperty("扩展字段5")
    @TableField(exist = false)
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField(exist = false)
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField(exist = false)
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField(exist = false)
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField(exist = false)
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField(exist = false)
    private String extField10;


    public BigDecimal inTransferNumberNotNull() {
        if (Objects.isNull(inTransferNumber)) {
            return BigDecimal.ZERO;
        } else {
            return inTransferNumber;
        }
    }
}
