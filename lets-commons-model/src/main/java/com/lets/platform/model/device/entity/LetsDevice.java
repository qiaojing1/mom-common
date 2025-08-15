package com.lets.platform.model.device.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;

/**
 * 设备
 *
 * @author FZY
 * @since 2023-03-14
 */
@Data
@TableName("lets_device")
@Alias("device_lets_device")
public class LetsDevice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 设备主键
     */
    @TableId(value = "device_id", type = IdType.INPUT)
    private String deviceId;

    /**
     * 设备编码
     */
    private String deviceCode;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 资产编码
     */
    private String assetsCode;

    /**
     * 使用部门
     */
    private String useDept;

    /**
     * 维保部门
     */
    private String maintenanceDept;

    /**
     * 保养等级
     */
    private String maintainGrade;

    /**
     * 物联状态[0未联网,1已联网]
     */
    private String internetStatus;

    /**
     * 设备等级[A、B、C]
     */
    private String deviceGrade;

    /**
     * 资产状态[1使用中、2封存中、3调拨中、4委外中、5场外调拨、6已报废、7已处置]
     */
    private String assetsStatus;

    /**
     * 安装位置
     */
    private String installAddress;

    /**
     * 设备型号
     */
    private String modelId;

    /**
     * 设备类型
     */
    private String typeId;

    /**
     * 控制器
     */
    private String controllerId;

    /**
     * 生产厂商
     */
    private String manufacturerId;

    /**
     * 供应厂商
     */
    private String supplierId;

    /**
     * 购置日期
     */
    private Long purchaseTime;

    /**
     * 购置金额
     */
    private BigDecimal purchaseAmount;

    /**
     * 入场时间
     */
    private Long admissionTime;

    /**
     * 质保日期
     */
    private Long warrantyTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 设备图片
     */
    private String deviceImages;

    /**
     * 使用说明书
     */
    private String instructionManual;

    /**
     * 验收报告
     */
    private String acceptanceReport;

    /**
     * 租户主键
     */
    private String tenancyId;

    /**
     * 是否删除[N否Y是]
     */
    private String deleted;

    /**
     * 工厂建模id
     */
    private String factoryModeId;

    /**
     * 上次点检时间
     */
    private Long lastSpotTime;

    /**
     * 上次保养时间
     */
    private Long lastMaintainTime;

    /**
     * 容差值
     */
    private String toleranceValue;

    /**
     * 能源分项
     */
    private String energyType;

    /**
     * 是否总表
     */
    private String totalPower;

    /**
     * 倍率
     */
    private String magnification;

    /**
     * 表计量程
     */
    private BigDecimal meterRange;

    /**
     * 点位前后差值(绝对值)
     */
    private BigDecimal pointDiffValue;

    /**
     * 网关id
     */
    private String gatewayId;

    /**
     * dnc默认目录
     */
    private String ncMainUri;

    /**
     * NC子程序目录
     */
    private String ncSubUri;
}
