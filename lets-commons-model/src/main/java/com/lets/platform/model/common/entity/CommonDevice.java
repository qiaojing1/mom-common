package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.device.enums.DataSourceEnum;
import com.lets.platform.model.device.enums.DeviceAssetStatusEnum;
import com.lets.platform.model.device.enums.InternetStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 设备台账
 *
 * @author DING WEI
 * @since 2023-10-30
 */
@Getter
@Setter
@TableName("common_device")
@ApiModel(value = "CommonDevice对象", description = "设备台账")
public class CommonDevice extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @ApiModelProperty(value = "台账类型[1空压机台账,2照明台账,3仪表台账,4设备台账]", hidden = true)
    @TableField("type")
    @ExcelIgnore
    private String type;

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "CommonDevice.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelProperty(value = "设备编码", index = 0)
    private String code;

    @Length(min = 1, max = 20, message = "CommonDevice.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelProperty(value = "设备名称", index = 1)
    private String name;

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "CommonDevice.assetsCode", groups = {Save.class, Update.class})
    @ApiModelProperty("资产编码")
    @TableField("assets_code")
    @ExcelProperty(value = "资产编码", index = 2)
    private String assetsCode;

    @NotBlank(message = "CommonDevice.typeId", groups = {Save.class, Update.class})
    @ApiModelProperty("设备类型")
    @TableField("type_id")
    @ExcelIgnore
    private String typeId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备类型", index = 3)
    private String typeName;

    /**
     * @see com.lets.platform.model.device.enums.TypeClassifyEnum
     */
    @TableField(exist = false)
    @ExcelProperty(value = "设备类型分类", index = 4)
    private String typeClassifyName;
    @TableField(exist = false)
    @ExcelIgnore
    private String typeClassify;

    @NotBlank(message = "CommonDevice.modelId", groups = {Save.class, Update.class})
    @ApiModelProperty("设备型号")
    @TableField("model_id")
    @ExcelIgnore
    private String modelId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备型号", index = 5)
    private String modelName;

    @ExcelIgnore
    @TableField("servo_axes_number")
    private Integer servoAxesNumber;
    @ExcelProperty(value = "伺服轴数", index = 6)
    @ColumnWidth(40)
    @TableField(exist = false)
    private String servoAxesNumberStr;

    @ExcelIgnore
    @TableField("spindles_number")
    private Integer spindlesNumber;
    @ColumnWidth(40)
    @ExcelProperty(value = "主轴数", index = 7)
    @TableField(exist = false)
    private String spindlesNumberStr;

    @ExcelIgnore
    @TableField("spindles_maximum_speed")
    private Integer spindlesMaximumSpeed;
    @ExcelProperty(value = "主轴最高转速", index = 8)
    @ColumnWidth(40)
    @TableField(exist = false)
    private String spindlesMaximumSpeedStr;

    @ApiModelProperty("控制器")
    @TableField("controller_id")
    @ExcelIgnore
    private String controllerId;
    @TableField(exist = false)
    @ExcelProperty(value = "控制器", index = 9)
    private String controllerName;
    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("控制器品牌")
    private String controllerBrand;
    @TableField(exist = false)
    @ExcelIgnore
    private BigDecimal hourFactor;

    @ApiModelProperty("使用部门")
    @TableField("use_org_id")
    @ExcelIgnore
    private String useOrgId;
    @TableField(exist = false)
    @ExcelProperty(value = "使用部门", index = 10)
    private String useOrgName;

    @ApiModelProperty("维保部门")
    @TableField("maintenance_org_id")
    @ExcelIgnore
    private String maintenanceOrgId;
    @TableField(exist = false)
    @ExcelProperty(value = "维保部门", index = 11)
    private String maintenanceOrgName;

    @ValidatedEnum(enumClass = InternetStatusEnum.class, required = true, message = "CommonDevice.internetStatus", groups = {Save.class, Update.class})
    @ApiModelProperty("物联状态[0未联网,1已联网]")
    @TableField("internet_status")
    @ExcelIgnore
    private String internetStatus;
    @TableField(exist = false)
    @ExcelProperty(value = "物联状态", index = 12)
    private String internetStatusName;

    @ApiModelProperty("设备负荷时间")
    @TableField("device_load_time")
    @ExcelIgnore
    private BigDecimal deviceLoadTime;
    @TableField(exist = false)
    @ExcelProperty(value = "设备负荷时间", index = 13)
    private String deviceLoadTimeStr;
    @ApiModelProperty("设备等级 A、B、C")
    @TableField("device_level")
    @ExcelProperty(value = "设备等级", index = 14)
    private String deviceLevel;

    @ExcelIgnore
    @ApiModelProperty("启用产量统计[0:否,1:是]")
    @TableField("enable_yield_stat")
    private Integer enableYieldStat;
    @ExcelProperty(value = "启用产量统计", index = 15)
    @TableField(exist = false)
    private String enableYieldStatName;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    @ExcelIgnore
    private String factoryModeId;
    @TableField(exist = false)
    @ExcelIgnore
    private String factoryModeCode;
    @TableField(exist = false)
    @ExcelProperty(value = "所属生产单元", index = 16)
    private String factoryModeName;

    @ApiModelProperty("所归属的车间生产单元")
    @TableField(exist = false)
    @ExcelIgnore
    private String workshopFactoryModeId;
    @TableField(exist = false)
    @ExcelIgnore
    private String workshopFactoryModeCode;
    @TableField(exist = false)
    @ExcelIgnore
    private String workshopFactoryModeName;

    @Length(max = 20, message = "CommonDevice.installAddress", groups = {Save.class, Update.class})
    @ApiModelProperty("安装位置")
    @TableField("install_address")
    @ExcelProperty(value = "安装位置", index = 17)
    private String installAddress;

    @ApiModelProperty("生产厂商")
    @TableField("manufacturer_id")
    @ExcelIgnore
    private String manufacturerId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备生产商", index = 18)
    private String manufacturerName;

    @ApiModelProperty("供应厂商")
    @TableField("supplier_id")
    @ExcelIgnore
    private String supplierId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备供应商", index = 19)
    private String supplierName;

    @ApiModelProperty("购置日期")
    @TableField("purchase_time")
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime purchaseTime;
    @ExcelProperty(value = "购置日期", index = 20)
    @TableField(exist = false)
    private String purchaseTimeStr;

    @ApiModelProperty("购置金额")
    @TableField("purchase_amount")
    @ExcelIgnore
    private BigDecimal purchaseAmount;
    @TableField(exist = false)
    @ExcelIgnore
    private String purchaseAmountStr;

    @ApiModelProperty("入场时间")
    @TableField("admission_time")
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime admissionTime;
    @TableField(exist = false)
    @ExcelProperty(value = "入场日期", index = 21)
    private String admissionTimeStr;

    @ApiModelProperty("质保日期")
    @TableField("warranty_time")
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime warrantyTime;
    @TableField(exist = false)
    @ExcelProperty(value = "质保日期", index = 22)
    private String warrantyTimeStr;

    @ValidatedEnum(enumClass = YesOrNo.class, message = "CommonDevice.totalPower", groups = {Save.class, Update.class})
    @ApiModelProperty("是否总表")
    @TableField("total_power")
    @ExcelIgnore
    private String totalPower;
    @TableField(exist = false)
    @ExcelIgnore
    private String totalPowerName;

    @ValidBigDecimal(message = "CommonDevice.meterRange", min = "1.00", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("表计量程")
    @TableField("meter_range")
    @ExcelIgnore
    private BigDecimal meterRange;

    @ValidBigDecimal(message = "CommonDevice.magnification", min = "1.00", max = "9999999999.999", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("倍率")
    @TableField("magnification")
    @ExcelIgnore
    private BigDecimal magnification;


    @ApiModelProperty("所属节点")
    @TableField("node_id")
    @ExcelIgnore
    private String nodeId;
    @TableField(exist = false)
    @ExcelIgnore
    private String nodeType;
    @TableField(exist = false)
    @ExcelIgnore
    private String nodeName;

    @ApiModelProperty("所属分组")
    @TableField("group_id")
    @ExcelIgnore
    private String groupId;
    @TableField(exist = false)
    @ExcelIgnore
    private String groupName;

    @ValidatedEnum(enumClass = DataSourceEnum.class, message = "CommonDevice.dataSource", groups = {Save.class, Update.class})
    @ApiModelProperty("数据来源[1采集,2计算]")
    @TableField("data_source")
    @ExcelIgnore
    private String dataSource;
    @TableField(exist = false)
    @ExcelIgnore
    private String dataSourceName;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    @ExcelIgnore
    private String enclosureIds;
    @Size(max = 20, message = "[附件]不能超过20个", groups = {Save.class, Update.class})
    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonFile> enclosureFileList;

    @Length(max = 200, message = "CommonDevice.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty(value = "备注", index = 23)
    private String remark;

    @ApiModelProperty("折旧年限")
    @TableField("period_depreciation")
    @ExcelIgnore
    private Integer periodDepreciation;
    @TableField(exist = false)
    @ExcelProperty(value = "折旧年限", index = 24)
    private String periodDepreciationStr;

    @ApiModelProperty("残值率")
    @TableField("residual_rate")
    @ExcelIgnore
    private Integer residualRate;
    @TableField(exist = false)
    @ExcelProperty(value = "残值率", index = 25)
    private String residualRateStr;

    @ApiModelProperty("吨位")
    @TableField("tonnage")
    @ExcelIgnore
    private Integer tonnage;
    @TableField(exist = false)
    @ExcelProperty(value = "吨位", index = 26)
    private String tonnageStr;

    @ApiModelProperty("设备状态")
    @TableField("status")
    @ExcelIgnore
    private String status;
    @TableField(exist = false)
    @ExcelIgnore
    private String statusName;
    @TableField(exist = false)
    @ExcelIgnore
    private String statusColor;
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @TableField(exist = false)
    @ExcelIgnore
    private CommonDeviceFormula deviceFormula;

    @ApiModelProperty("是否启用锁机功能")
    @TableField("enable_lock")
    @ExcelIgnore
    private Integer enableLock;
    @TableField(exist = false)
    @ExcelIgnore
    private String enableLockName;
    @ApiModelProperty("设备锁机状态[锁机、解锁]")
    @TableField("lock_status")
    @ExcelIgnore
    private String lockStatus;
    @ApiModelProperty("扫码解锁状态")
    @TableField(exist = false)
    @ExcelIgnore
    private String scanUnlockStatus;
    @ApiModelProperty("设备实时状态")
    @TableField(exist = false)
    @ExcelIgnore
    private String realtimeStatus;

    /**
     * @see DeviceAssetStatusEnum
     */
    @ApiModelProperty("设备资产状态")
    @TableField("asset_status")
    @ExcelIgnore
    private String assetStatus;
    @TableField(exist = false)
    @ExcelIgnore
    private String assetStatusName;

    @TableField(exist = false)
    @ApiModelProperty("试压属性")
    @ExcelIgnore
    private List<CommonDeviceChannelMeters> channelMeters;

    @TableField(exist = false)
    @ApiModelProperty("容差值")
    @ExcelIgnore
    private List<CommonToleranceValue> toleranceValues;

    @TableField(exist = false)
    @ApiModelProperty("备件清单")
    @ExcelIgnore
    private List<CommonDeviceSpareParts> spareParts;

    @TableField(exist = false)
    @ApiModelProperty("数据配置")
    @ExcelIgnore
    private List<CommonDeviceDataSetting> dataSettings;

    @TableField(exist = false)
    @ApiModelProperty("限定操作员")
    @ExcelIgnore
    private List<CommonDeviceOperator> operatorList;
    @TableField(exist = false)
    @ApiModelProperty("限定操作员数量")
    @ExcelIgnore
    private Integer operatorNum;

    @ApiModelProperty("额定功率")
    @ExcelProperty(value = "额定功率", index = 27)
    @TableField(exist = false)
    private String ratedPowerStr;
    @ExcelIgnore
    @TableField("rated_power")
    private BigDecimal ratedPower;

    /**
     * DNC属性
     */
    @ApiModelProperty("启用DNC功能")
    @TableField("is_dnc")
    @ExcelProperty(value = "是否启用DNC", index = 28)
    private String isDNC;
    @ApiModelProperty("程序执行方式")
    @TableField("execute_method")
    @ExcelProperty(value = "程序执行方式", index = 29)
    private String executeMethod;
    @ApiModelProperty("在线加工 存放路径")
    @TableField("path")
    @ExcelProperty(value = "存放路径", index = 30)
    private String path;
    @ApiModelProperty("本地加工 主程序目录")
    @ExcelProperty(value = "主程序目录", index = 31)
    @TableField("main_uri")
    private String mainUri;
    @ApiModelProperty("本地加工 子程序目录")
    @TableField("sub_uri")
    @ExcelProperty(value = "子程序目录", index = 32)
    private String subUri;
    @ApiModelProperty("是否清除本地程序")
    @TableField("is_clear")
    @ExcelProperty(value = "是否清除本地程序", index = 33)
    private String isClear;
    @ApiModelProperty("是否选中本地程序")
    @TableField("is_choose")
    @ExcelProperty(value = "是否选中本地程序", index = 34)
    private String isChoose;
    @ApiModelProperty("hmi主键")
    @TableField("hmi_id")
    @ExcelIgnore
    private String hmiId;
    @TableField(exist = false)
    @ExcelProperty(value = "HMI编码", index = 35)
    private String hmiCode;
    @ApiModelProperty("hmi名称")
    @TableField("hmi_Name")
    @ExcelIgnore
    private String hmiName;

    @ApiModelProperty("最大波动率")
    @TableField("wave_rate")
    @ExcelIgnore
    private BigDecimal waveRate;

    @ApiModelProperty("固定容差值")
    @TableField("fixed_tolerance")
    @ExcelIgnore
    private BigDecimal fixedTolerance;
    @ExcelIgnore
    @TableField(exist = false)
    private List<CommonFile> commonFileList;

    @ApiModelProperty("设备图片")
    @TableField("image_id")
    @ExcelIgnore
    private String imageId;
    @TableField(exist = false)
    @ExcelIgnore
    private CommonFile imageFile;

    @ExcelIgnore
    @ApiModelProperty("工序主键")
    @TableField(exist = false)
    private String processId;
    @ExcelIgnore
    @ApiModelProperty("工序编码")
    @TableField(exist = false)
    private String processCode;
    @ExcelIgnore
    @ApiModelProperty("工序名称")
    @TableField(exist = false)
    private String processName;

    @ExcelIgnore
    @ApiModelProperty("生成点检复检单标识[生成时间]")
    @TableField("repeat_inspect_spot_sign")
    private LocalDateTime repeatInspectSpotSign;
    @ExcelIgnore
    @ApiModelProperty("生成保养复检单标识[生成时间]")
    @TableField("repeat_inspect_main_sign")
    private LocalDateTime repeatInspectMainSign;

    @ExcelIgnore
    @Length(max = 50, message = "[软件版本]非必填；长度1-50，中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("软件版本")
    @TableField("software_version")
    private String softwareVersion;
    @ExcelIgnore
    @Length(max = 50, message = "[硬件版本]非必填；长度1-50，中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("硬件版本")
    @TableField("hardware_version")
    private String hardwareVersion;
    @ExcelIgnore
    @Length(max = 50, message = "[控制器序列号]非必填；长度1-50，中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("控制器序列号")
    @TableField("controller_serial_number")
    private String controllerSerialNumber;

    @ExcelIgnore
    @ApiModelProperty("源单id")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ExcelIgnore
    @ApiModelProperty("源单明细id")
    @TableField("source_order_detail_id")
    private String sourceOrderDetailId;

    @ExcelIgnore
    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    /**
     * 设备资产信息
     */
    @ApiModelProperty("是否启用资产管理[0否1是]")
    @TableField("enable_asset_mge")
    @ExcelIgnore
    private Integer enableAssetMge;
    @TableField(exist = false)
    @ExcelIgnore
    private String enableAssetMgeName;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("资产管理信息")
    private CommonDeviceAssets deviceAssets;

    @ExcelIgnore
    @ApiModelProperty("开线时间")
    @TableField("start_line_time")
    private LocalDateTime startLineTime;
    @ExcelIgnore
    @ApiModelProperty("开线时间是否变化")
    @TableField(exist = false)
    private Boolean startLineTimeChange;

    @ExcelIgnore
    @ApiModelProperty("开工时间")
    @TableField("start_work_time")
    private LocalDateTime startWorkTime;

    @ExcelIgnore
    @ValidBigDecimal(message = "[理论产量]正浮点数，小数位数3位，取值范围[1.000-9999999999.999]", min = "1.00", max = "9999999999.999", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("理论产量")
    @TableField("theoretical_yield")
    private BigDecimal theoreticalYield;
    @ExcelIgnore
    @ValidBigDecimal(message = "[理论节拍]正浮点数，小数位数3位，取值范围[0.001-9999999999.999]", min = "0.001", max = "9999999999.999", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("理论节拍")
    @TableField("theoretical_beat")
    private BigDecimal theoreticalBeat;

    @ExcelIgnore
    @ApiModelProperty("生产单位")
    @TableField("produce_unit_id")
    private String produceUnitId;
    @ExcelIgnore
    @ApiModelProperty("生产单位名称")
    @TableField("produce_unit_name")
    private String produceUnitName;
    @ExcelIgnore
    @ApiModelProperty("生产单位精度")
    @TableField("produce_unit_accuracy")
    private Integer produceUnitAccuracy;
    @ExcelIgnore
    @ApiModelProperty("生产单位舍入方式")
    @TableField("produce_unit_round_off_type")
    private Integer produceUnitRoundOffType;

    @ExcelIgnore
    @ApiModelProperty("负荷时长")
    @TableField(exist = false)
    private BigDecimal loadDuration;
    @ExcelIgnore
    @TableField("source_status")
    private String sourceStatus;
    @ExcelIgnore
    @TableField("target_status")
    private String targetStatus;
    @ExcelIgnore
    @TableField("time")
    private Integer time;
}
