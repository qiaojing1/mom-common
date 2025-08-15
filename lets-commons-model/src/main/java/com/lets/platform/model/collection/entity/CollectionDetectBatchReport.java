package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.lets.platform.model.mes.valid.ProduceOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 批量试验报告
 * </p>
 *
 * @author csy
 * @since 2024-02-27
 */
@Getter
@Setter
@TableName("collection_detect_batch_report")
@ApiModel(value = "CollectionDetectBatchReport对象", description = "批量试验报告")
public class CollectionDetectBatchReport extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("生产令号")
    @TableField(value = "lrp_no")
    private String lrpNo;

    @ApiModelProperty("报告日期")
    @TableField(value = "report_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime reportDate;

    @ApiModelProperty("产品")
    @TableField(value = "valve_type_id")
    private String valveTypeId;

    @ApiModelProperty("产品")
    @TableField(value = "valve_type_name")
    private String valveTypeName;

    @ApiModelProperty("型号")
    @TableField(value = "model")
    private String model;

    @ApiModelProperty("压力标准")
    @TableField(value = "pressure_standard_id")
    private String pressureStandardId;

    @ApiModelProperty("压力标准")
    @TableField(value = "pressure_standard_name")
    private String pressureStandardName;

    @ApiModelProperty("压力标准")
    @TableField(value = "test_standard_id")
    private String testStandardId;

    @ApiModelProperty("压力标准")
    @TableField(value = "test_standard_name")
    private String testStandardName;

    @ApiModelProperty("口径")
    @TableField(value = "caliber")
    private String caliber;

    @ApiModelProperty("压力")
    @TableField("pressure")
    private String pressure;

    @ApiModelProperty("泄露等级")
    @TableField(value = "leakage_level_id")
    private String leakageLevelId;

    @ApiModelProperty("泄露等级")
    @TableField(value = "leakage_level_name")
    private String leakageLevelName;

    @ApiModelProperty("总图号")
    @TableField(value = "draw_no")
    private String drawNo;

    @ApiModelProperty("试压工单号")
    @TableField(value = "detect_order_code")
    private String detectOrderCode;

    @ApiModelProperty("试压工单id")
    @TableField(value = "detect_order_id")
    private String detectOrderId;

    @ApiModelProperty("试验员")
    @TableField(value = "operator")
    private String operator;

    @ApiModelProperty("检验员")
    @TableField(value = "inspector")
    private String inspector;

    @ApiModelProperty("审核员")
    @TableField(value = "auditor", updateStrategy = FieldStrategy.IGNORED)
    private String auditor;

    @ApiModelProperty("审核员")
    @TableField(value = "auditor_name", updateStrategy = FieldStrategy.IGNORED)
    private String auditorName;

    @ApiModelProperty("抽压试压")
    @TableField(value = "detect_type")
    private String detectType;

    @ApiModelProperty("阀门名称")
    @TableField(value = "product_name")
    private String productName;

    @ApiModelProperty("试验结果")
    @TableField(value = "test_result")
    private String testResult;
    @TableField(exist = false)
    private String testResultName;

    @ApiModelProperty("test_type")
    @TableField(value = "test_type")
    private String testType;
    @TableField(exist = false)
    private String testTypeName;

    @ApiModelProperty("详情页样式")
    @TableField("style")
    private String style;
    @ApiModelProperty("清单号")
    @TableField("list_no")
    private String listNo;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @TableField("list_no_and_draw_no")
    private String listNoAndDrawNo;

    @TableField("product_name_and_model")
    private String productNameAndModel;

    @TableField("order_status")
    private String orderStatus;
    @TableField(exist = false)
    private String orderStatusName;
    @TableField(value = "audit_time", updateStrategy = FieldStrategy.IGNORED)
    private LocalDateTime auditTime;

    @TableField("issue_status")
    private String issueStatus;
    @TableField(exist = false)
    private String issueStatusName;


    @ApiModelProperty("阀门名称")
    @TableField("valve_name")
    private String valveName;

    @ApiModelProperty("客户名称")
    @TableField("customer_name")
    private String customerName;

    @ApiModelProperty("客户类型")
    @TableField("customer_model")
    private String customerModel;

    @ApiModelProperty("阀杆材质")
    @TableField("stem_material")
    private String stemMaterial;

    @ApiModelProperty("阀芯材质")
    @TableField("spool_material")
    private String spoolMaterial;

    @ApiModelProperty("阀座材质")
    @TableField("seat_material")
    private String seatMaterial;

    @ApiModelProperty("连接标准")
    @TableField("link_standard")
    private String linkStandard;

    @TableField(exist = false)
    private String isMovement;
    @TableField(exist = false)
    private String isEscape;

    @ApiModelProperty("数量")
    @TableField(value = "number")
    private Integer number;

    @ApiModelProperty("表头")
    @TableField(exist = false)
    private List<String> allProjectHeader;

    @ApiModelProperty("标准值")
    @TableField(exist = false)
    private Map<String, Map<String, String>> standards;

    @ApiModelProperty("实际值")
    @TableField(exist = false)
    private List<Map<String, Object>> result;

    @ApiModelProperty("总数")
    @TableField(exist = false)
    private Integer total;

    @TableField("meter_no")
    private String meterNo;

    @TableField("unqualified_handle_order")
    private String unqualifiedHandleOrder;

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

}
