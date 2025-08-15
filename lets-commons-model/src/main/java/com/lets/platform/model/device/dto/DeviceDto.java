package com.lets.platform.model.device.dto;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.device.enums.AssetsStatusEnum;
import com.lets.platform.model.device.enums.InternetStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * 设备传参对象
 *
 * @version 1.0
 * @ClassName DeviceDto
 * @author: DING WEI
 * @create: 2021/05/11 09:07
 **/
@Data
@ApiModel("设备传参对象")
public class DeviceDto {

    @NotBlank(message = "DeviceDto.id", groups = {Update.class})
    @ApiModelProperty("设备主键[U]")
    private String id;

    @Length(min = 1, max = 20, message = "DeviceDto.deviceName", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "设备名称", required = true)
    private String deviceName;

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "DeviceDto.code", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "设备编码", required = true)
    private String code;

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "DeviceDto.assetsCode", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "资产编码", required = true)
    private String assetsCode;

    @NotBlank(message = "DeviceDto.useDept", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "使用部门", required = true)
    private String useDept;

    @NotBlank(message = "DeviceDto.maintenanceDept", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "维保部门", required = true)
    private String maintenanceDept;

    @Length(max = 10, message = "DeviceDto.maintainGrade", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "保养等级", required = true)
    private String maintainGrade;

    @ValidatedEnum(enumClass = InternetStatusEnum.class, required = true, message = "DeviceDto.internetStatus", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "物联状态", required = true)
    private String internetStatus;

//    @ValidatedEnum(enumClass = DeviceGradeEnum.class, message = "设备等级[A、B、C]", groups = {Save.class, Update.class})
    @ApiModelProperty("设备等级")
    private String deviceGrade;

    @ValidatedEnum(enumClass = AssetsStatusEnum.class, message = "DeviceDto.assetsStatus", groups = {Save.class, Update.class})
    @ApiModelProperty("资产状态")
    private String assetsStatus;

    @NotBlank(message = "DeviceDto.factoryModeId", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "所属生产单元", required = true)
    private String factoryModeId;

    @Length(max = 40, message = "DeviceDto.installAddress", groups = {Save.class, Update.class})
    @ApiModelProperty("安装位置")
    private String installAddress;

    @NotBlank(message = "DeviceDto.modelId", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "设备型号", required = true)
    private String modelId;

    @NotBlank(message = "DeviceDto.typeId", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "设备类型", required = true)
    private String typeId;

    @NotBlank(message = "DeviceDto.controllerId", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "控制器", required = true)
    private String controllerId;

//    @NotBlank(message = "设备生产厂商不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "生产厂商", required = true)
    private String manufacturerId;

//    @NotBlank(message = "设备供应商不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "供应厂商", required = true)
    private String supplierId;

    @ApiModelProperty("购置日期")
    private Long purchaseTime;

    @ApiModelProperty("购置金额")
    @Pattern(regexp = GlobalConstant.GREATER_THAN_ZERO_TWO_POINT_1_20, message = "DeviceDto.purchaseAmount", groups = {Save.class, Update.class})
    private String purchaseAmount;

    @ApiModelProperty("入场时间")
    private Long admissionTime;

    @ApiModelProperty("质保日期")
    private Long warrantyTime;

    @Length(max = 200, message = "DeviceDto.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("设备图片")
    private String deviceImages;

    @ApiModelProperty("能源分项")
    private String energyType;

    @ApiModelProperty("是否总表")
    private String totalPower;

    @ApiModelProperty("倍率")
    private String magnification;

    @ApiModelProperty("使用说明书")
    private String instructionManual;

    @ApiModelProperty("验收报告")
    private String acceptanceReport;
    @ApiModelProperty("容差值")
    private String toleranceValue;

    @ApiModelProperty("表计量程")
    private BigDecimal meterRange;
    @ApiModelProperty("点位差值")
    private BigDecimal pointDiffValue;
    @ApiModelProperty("网关id")
    private String gatewayId;
    @ApiModelProperty("nc主程序目录")
    private String ncMainUri;
    @ApiModelProperty("nc子程序目录")
    private String ncSubUri;

}
