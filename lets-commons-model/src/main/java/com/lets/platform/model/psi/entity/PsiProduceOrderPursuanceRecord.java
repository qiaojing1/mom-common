package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonHmiSettings;
import com.lets.platform.model.mes.entity.MesProduceOrder;
import com.lets.platform.model.psi.vo.ExternalBarcodeVo;
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
 * @since 2024-11-04
 */
@Getter
@Setter
@TableName("psi_produce_order_pursuance_record")
@ApiModel(value = "PsiProduceOrderPursuanceRecord对象", description = "生产工单-执行记录(工位机)")
public class PsiProduceOrderPursuanceRecord extends BaseEntity {

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
    @ApiModelProperty("类型[1:生产配料、2:半成品生产、3:生产执行-开工报工、3-1:扫码上料、3-2:扫码执行、3-3:扫码装箱]")
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

    @ApiModelProperty("扫码-批次号")
    @TableField("scan_batch_number")
    private String scanBatchNumber;

    @ApiModelProperty("关联条码主键")
    @TableField("relation_id")
    private String relationId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private PsiMaterialBarcode relationBarcode;

    @ApiModelProperty("扫码-源单主键/上工人员主键")
    @TableField("scan_order_id")
    private String scanOrderId;
    @ApiModelProperty("扫码-源单编码/上工人员名称")
    @TableField("scan_order_code")
    private String scanOrderCode;
    @ApiModelProperty("扫码-源单明细主键/上工人员账号")
    @TableField("scan_order_detail_id")
    private String scanOrderDetailId;

    @ApiModelProperty("扫码-生产单元")
    @TableField("scan_factory_mode_id")
    private String scanFactoryModeId;
    @ApiModelProperty("扫码-生产单元编码")
    @TableField("scan_factory_mode_code")
    private String scanFactoryModeCode;
    @ApiModelProperty("扫码-生产单元名称")
    @TableField("scan_factory_mode_name")
    private String scanFactoryModeName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("扫码数量、装箱数量、报工数量、总时长")
    @TableField("number")
    private BigDecimal number;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工作时长")
    @TableField(exist = false)
    private BigDecimal workDuration;
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

    @ApiModelProperty("生成物料条码主键/容器条码主键")
    @TableField("generate_barcode_id")
    private String generateBarcodeId;
    @ApiModelProperty("生成物料条码/容器条码")
    @TableField("generate_barcode")
    private String generateBarcode;
    @ApiModelProperty("生成物料条码物料主键/容器主键")
    @TableField("generate_material_id")
    private String generateMaterialId;
    @ApiModelProperty("生成物料条码物料编码/容器编码")
    @TableField("generate_material_code")
    private String generateMaterialCode;
    @ApiModelProperty("生成物料条码物料名称/容器名称")
    @TableField("generate_material_name")
    private String generateMaterialName;
    @ApiModelProperty("生成物料条码物料类型")
    @TableField("generate_material_type")
    private String generateMaterialType;
    @ApiModelProperty("生成物料条码物料规格")
    @TableField("generate_material_specs")
    private String generateMaterialSpecs;

    @ApiModelProperty("调用第三方接口返回信息")
    @TableField(exist = false)
    private List<Map<String, String>> extResult;

    @ApiModelProperty(value = "外部码", hidden = true)
    @TableField(exist = false)
    private List<ExternalBarcodeVo> externalBarcodeList;

    @ApiModelProperty(value = "工位机", hidden = true)
    @TableField(exist = false)
    private CommonHmiSettings hmiSettings;

    @ApiModelProperty("人员生产报表")
    @TableField(exist = false)
    private List<MesProduceOrder> produceOrderList;
    @ApiModelProperty("上下工记录")
    @TableField(exist = false)
    private List<PsiProduceOrderPursuanceRecord> upDownWorkList;

    @ApiModelProperty("扫码执行-无需计数")
    @TableField(exist = false)
    private Boolean notNeedCount;

    @ApiModelProperty("外部码地址")
    @TableField(exist = false)
    private String externalAddress;

    /**
     * @see com.lets.platform.common.pojo.enums.YesOrNo
     */
    @ApiModelProperty("是否确认[YN]")
    @TableField("confirm")
    private String confirm;

    @ApiModelProperty("生产工单-扩展字段;目前在胜捷用来存点位值")
    @TableField("ext1")
    private String ext1;

    @ApiModelProperty("是否装箱完成[YN]")
    @TableField("scan_packing")
    private String scanPacking;


    @TableField(exist = false)
    private String barcode;
    @ApiModelProperty("物料ID")
    @TableField(exist = false)
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;

    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;

    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;

    @ApiModelProperty("点位值")
    @TableField(exist = false)
    private String itemKeys;
    @TableField(exist = false)
    private String itemKeys1;
    @TableField(exist = false)
    private String recordId;
    @ApiModelProperty("装箱状态[Y已装箱N未装箱]")
    @TableField(exist = false)
    private String packingStatus;
    @TableField(exist = false)
    private String packingStatusName;

    @ApiModelProperty("是否仅记录的数据")
    @TableField("record_only")
    private Integer recordOnly;

    @ApiModelProperty("是否来自自动报工")
    @TableField(exist = false)
    private Boolean autoReport;

    @ApiModelProperty("是否来自扫码校验报工")
    @TableField(exist = false)
    private Boolean fromScanCodeCheckReport;
}
