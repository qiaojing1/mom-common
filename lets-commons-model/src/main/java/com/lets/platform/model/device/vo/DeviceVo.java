package com.lets.platform.model.device.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * 设备
 *
 * @version 1.0 @ClassName DeviceVo
 * @author: DING WEI
 * @create: 2021/05/12 14:24
 */
@Data
public class DeviceVo extends BaseDo {

    private String deviceName;

    private String assetsCode;

    private String useDept;
    private String useDeptName;

    private String maintenanceDept;
    private String maintenanceDeptName;

    private String maintainGrade;

    private String internetStatus;
    private String internetStatusName;

    private String deviceGrade;

    private String assetsStatus;
    private String assetsStatusName;

    @ApiModelProperty("生产单元id")
    private String factoryModeId;

    @ApiModelProperty("生产单元名称")
    private String factoryModeName;

    @ApiModelProperty("单级生产单元名称")
    private String singleFactoryModeName;

    private String installAddress;

    private String modelId;
    private String modelName;

    private String typeId;
    private String typeName;

    private String controllerId;

    private String manufacturerId;

    private String supplierId;

    private Long purchaseTime;

    private String purchaseAmount;

    private Long admissionTime;

    private Long warrantyTime;

    private String remark;

    private String deviceImages;
    private CommonFile deviceImagesFile;

    private String instructionManual;
    private CommonFile instructionManualFile;

    private String acceptanceReport;
    private CommonFile acceptanceReportFile;

    private String tenancyId;
    private Integer count;
    private String toleranceValue;

    @ApiModelProperty("能源分项")
    private String energyType;

    @ApiModelProperty("是否总表")
    private String totalPower;

    @ApiModelProperty("倍率")
    private String magnification;

    private String typeClassify;

    private Long lastSpotTime;
    private Long lastMaintainTime;

    @ApiModelProperty("表计量程")
    private BigDecimal meterRangeBig;
    private String meterRange;
    @ApiModelProperty("点位差值")
    private BigDecimal pointDiffValueBig;
    private String pointDiffValue;

    @ApiModelProperty("工位机IP")
    private String machineIp;
    @ApiModelProperty("最近登录日期")
    private Long latelyLoginTime;
    @ApiModelProperty("最近登录人员")
    private String latelyLoginUser;
    private String latelyLoginUserName;
    @ApiModelProperty("网关id")
    private String gatewayId;
    @ApiModelProperty("nc主程序目录")
    private String ncMainUri;
    @ApiModelProperty("nc子程序目录")
    private String ncSubUri;
    private boolean isMainDevice;

    public Set<String> getAllDept() {
        Set<String> allDept = new HashSet<>();
        if (StringUtils.isNotBlank(useDept)) {
            allDept.add(useDept);
        }
        if (StringUtils.isNotBlank(maintenanceDept)) {
            allDept.add(maintenanceDept);
        }
        return allDept;
    }
}
