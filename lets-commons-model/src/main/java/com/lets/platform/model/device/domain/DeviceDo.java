package com.lets.platform.model.device.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * 设备
 *
 * @version 1.0
 * @ClassName DeviceDo
 * @author: DING WEI
 * @create: 2021/05/11 09:07
 **/
@Data
public class DeviceDo extends BaseDo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String deviceName;

    private String assetsCode;

    private String useDept;
    private String useDeptName;

    private String maintenanceDept;

    private String maintainGrade;

    private String internetStatus;

    private String deviceGrade;

    private String assetsStatus;

    private String factoryModeId;
    private String factoryModeCode;
    private String factoryParentModeCode;
    private String factoryModeName;
    private String factoryModeType;

    private String installAddress;

    private String modelId;
    private String modelName;

    private String typeId;
    private String typeName;
    private String typeClassify;

    private String controllerId;

    private String manufacturerId;

    private String supplierId;

    private Long purchaseTime;

    private String purchaseAmount;

    private Long admissionTime;

    private Long warrantyTime;

    private String remark;

    private String deviceImages;

    private String instructionManual;

    private String acceptanceReport;

    private String tenancyId;

    private String excludeId;

    private String source;
    private String toleranceValue;

    private Long lastSpotTime;
    private Long lastMaintainTime;

    private String energyType;

    private String totalPower;

    private String magnification;

    private BigDecimal meterRange;
    private BigDecimal pointDiffValue;
    private BigDecimal value;

    private String machineIp;
    private Long latelyLoginTime;
    private String latelyLoginUser;
    private String latelyLoginUserName;
    private String gatewayId;
    private String gatewayName;
    private String catalogue;
    private boolean isMainDevice;

    /** NC程序主目录 */
    private String ncMainUri;
    /** NC程序子目录 */
    private String ncSubUri;

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
