package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 设备锁机控制-日志
 * @author DING WEI
 * @since 2024-02-22
 */
@Getter
@Setter
@TableName("mes_produce_job_unlock_log")
@ApiModel(value = "MesProduceJobUnlockLog对象", description = "设备锁机控制-日志")
public class MesProduceJobUnlockLog extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("码")
    @TableField("code")
    private String code;

    /**
     * @see com.lets.platform.model.mes.enums.MesUnlockCodeTypeEnum
     */
    @ApiModelProperty("扫码类型")
    @TableField("type")
    private String type;

    /**
     * @see com.lets.platform.model.base.enums.ProduceJobUnlockProductTypeEnum
     */
    @ApiModelProperty("产品类型[1当日首件2换型第一件3其他]")
    @TableField("product_type")
    private Integer productType;

    @ApiModelProperty("作业主键")
    @TableField("job_order_id")
    private String jobOrderId;
    @ApiModelProperty("作业编号")
    @TableField("job_order_code")
    private String jobOrderCode;
    @ApiModelProperty("作业单明细主键")
    @TableField("job_order_detail_id")
    private String jobOrderDetailId;

    @ApiModelProperty("任务清单主键")
    @TableField("singleton_process_id")
    private String singletonProcessId;
    @ApiModelProperty("任务清单编码")
    @TableField("singleton_process_code")
    private String singletonProcessCode;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("工艺路线-工序")
    @TableField("route_process_id")
    private String routeProcessId;
    @ApiModelProperty("工艺路线主键")
    @TableField("route_id")
    private String routeId;
    @ApiModelProperty("工艺路线名称")
    @TableField("route_name")
    private String routeName;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;
    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("标准工时")
    @TableField("standard_time")
    private Integer standardTime;

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

    @ApiModelProperty("物料主键(上料)")
    @TableField("scan_material_id")
    private String scanMaterialId;
    @ApiModelProperty("物料编码(上料)")
    @TableField("scan_material_code")
    private String scanMaterialCode;
    @ApiModelProperty("物料名称(上料)")
    @TableField("scan_material_name")
    private String scanMaterialName;
    @ApiModelProperty("物料规格型号(上料)")
    @TableField("scan_material_specs")
    private String scanMaterialSpecs;
    @ApiModelProperty("供应商代码(物料号分割出来的)")
    @TableField("scan_supplier_code")
    private String scanSupplierCode;
    @ApiModelProperty("序列号(物料号分割出来的)")
    @TableField("scan_serial_number")
    private String scanSerialNumber;
    @ApiModelProperty("批号(物料号分割出来的)")
    @TableField("scan_batch_number")
    private String scanBatchNumber;
    @ApiModelProperty("生产日期(物料号分割出来的)")
    @TableField("scan_product_time")
    private String scanProductTime;
    @ApiModelProperty("版本号(物料号分割出来的)")
    @TableField("scan_version")
    private String scanVersion;

    @ApiModelProperty("是否成功[0失败1成功]")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("采集器主键")
    @TableField("collector_id")
    private String collectorId;
    @ApiModelProperty("采集器编码")
    @TableField("collector_code")
    private String collectorCode;
    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;
    @ApiModelProperty("扫码时间")
    @TableField("scan_time")
    private LocalDateTime scanTime;
    @ApiModelProperty("扫码时间(毫秒)")
    @TableField(exist = false)
    private Long scanTimeAsMillis;

    @ApiModelProperty("加工开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;
    @ApiModelProperty("加工开始人员")
    @TableField("start_user")
    private String startUser;
    @ApiModelProperty("加工开始人员名称")
    @TableField("start_user_name")
    private String startUserName;
    @ApiModelProperty("报工时间")
    @TableField("report_time")
    private LocalDateTime reportTime;
    @ApiModelProperty("报工人员")
    @TableField("report_user")
    private String reportUser;
    @ApiModelProperty("报工人员名称")
    @TableField("report_user_name")
    private String reportUserName;

    @ApiModelProperty("自动线主键")
    @TableField("auto_line_id")
    private String autoLineId;

    @ApiModelProperty("关联控制中心主键")
    @TableField("relation_control_id")
    private String relationControlId;
}
