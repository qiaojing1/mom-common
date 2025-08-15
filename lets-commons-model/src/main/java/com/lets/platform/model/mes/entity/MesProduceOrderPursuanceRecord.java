package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonHmiSettings;
import com.lets.platform.model.psi.entity.PsiMaterialBarcode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * 生产工单-执行记录(工位机)
 * @author DING WEI
 * @since 2024-10-21
 */
@Getter
@Setter
@TableName("mes_produce_order_pursuance_record")
@ApiModel(value = "MesProduceOrderPursuanceRecord对象", description = "生产工单-执行记录(工位机)")
public class MesProduceOrderPursuanceRecord extends BaseEntity {

    @ApiModelProperty("生产工单-单据主键")
    @TableField("order_id")
    private String orderId;
    @ApiModelProperty("生产工单-单据编码")
    @TableField("order_code")
    private String orderCode;
    @ApiModelProperty("生产工单-明细主键")
    @TableField("detail_id")
    private String detailId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String produceDetailId;

    @ApiModelProperty("工位机主键")
    @TableField("hmi_id")
    private String hmiId;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元编码")
    @TableField(exist = false)
    private String factoryModeCode;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;
    @ApiModelProperty("配料生产单元")
    @TableField("batching_factory_mode_id")
    private String batchingFactoryModeId;
    @ApiModelProperty("配料生产单元编码")
    @TableField(exist = false)
    private String batchingFactoryModeCode;
    @ApiModelProperty("配料生产单元名称")
    @TableField("batching_factory_mode_name")
    private String batchingFactoryModeName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PursuanceRecordTypeEnum
     */
    @ApiModelProperty("类型[1:生产配料、2:半成品生产、3:生产执行]")
    @TableField("type")
    private String type;

    @ApiModelProperty("容器主键")
    @TableField("container_id")
    private String containerId;
    @ApiModelProperty("容器编码")
    @TableField("container_code")
    private String containerCode;
    @ApiModelProperty("容器名称")
    @TableField("container_name")
    private String containerName;

    @ApiModelProperty("扫码时间")
    @TableField("scan_time")
    private LocalDateTime scanTime;
    @ApiModelProperty("扫码内容")
    @TableField("scan_code_content")
    private String scanCodeContent;
    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PursuanceScanCodeTypeEnum
     */
    @ApiModelProperty("扫码-码类型[1:物料条码2:周转箱码]")
    @TableField("scan_code_type")
    private String scanCodeType;
    @ApiModelProperty("扫码-物料主键")
    @TableField("scan_material_id")
    private String scanMaterialId;
    @ApiModelProperty("扫码-物料编码")
    @TableField("scan_material_code")
    private String scanMaterialCode;
    @ApiModelProperty("扫码-物料名称")
    @TableField("scan_material_name")
    private String scanMaterialName;
    @ApiModelProperty("扫码-物料规格型号")
    @TableField("scan_material_specs")
    private String scanMaterialSpecs;
    @ApiModelProperty("扫码-物料类型")
    @TableField("scan_material_type")
    private String scanMaterialType;

    @ApiModelProperty("关联条码主键")
    @TableField("relation_id")
    private String relationId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private PsiMaterialBarcode relationBarcode;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("扫码数量、装箱数量、报工数量")
    @TableField("number")
    private BigDecimal number;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField("rich_number")
    private BigDecimal richNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField("poor_number")
    private BigDecimal poorNumber;
    @ApiModelProperty(value = "产量", hidden = true)
    @TableField(exist = false)
    private BigDecimal output;

    @ApiModelProperty("开工时间、开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;
    @ApiModelProperty("报工时间、结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("是否开工")
    @TableField(exist = false)
    private Boolean pursuanceStartWork;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("调用第三方接口返回信息")
    @TableField(exist = false)
    private List<Map<String, String>> extResult;

    @ApiModelProperty(value = "外部码", hidden = true)
    @TableField(exist = false)
    private List<String> externalBarcodeList;

    @ApiModelProperty(value = "工位机", hidden = true)
    @TableField(exist = false)
    private CommonHmiSettings hmiSettings;
}
