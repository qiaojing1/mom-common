package com.lets.platform.model.mes.vo;

import com.lets.platform.model.mes.entity.MesProduceJobSingletonProcess;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 产线监控设备 展示对象
 * @author: DING WEI
 * @date: 2024/8/6 13:55
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductionLineMonitorDeviceVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @see com.lets.platform.model.common.enums.MessageSubjectEnum
     */
    private String type;

    @ApiModelProperty("是否自动线明细")
    private Boolean isAutoLineDetail;

    @ApiModelProperty("设备主键")
    private String deviceId;
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("扫码内容")
    private String scanCodeContent;
    /**
     * @see com.lets.platform.model.mes.enums.MesUnlockCodeTypeEnum
     */
    @ApiModelProperty("扫码类型")
    private String scanCodeType;
    private String scanCodeTypeName;

    @ApiModelProperty("扫码时间")
    private LocalDateTime scanCodeTime;

    @ApiModelProperty("设备锁机状态[锁机、解锁]")
    private String lockStatus;

    @ApiModelProperty("设备扫码状态")
    private String scanUnlockStatus;
    @ApiModelProperty("扫码结果")
    private String scanCodeResult;

    @ApiModelProperty("单件工序任务清单主键")
    private String singletonProcessId;
    @ApiModelProperty("单件工序任务清单")
    private MesProduceJobSingletonProcess singletonProcess;

    @ApiModelProperty("预警消息")
    private String noticeMessage;
    @ApiModelProperty("报警消息")
    private String warningMessage;
}
