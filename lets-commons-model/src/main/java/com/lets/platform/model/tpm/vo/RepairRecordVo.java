package com.lets.platform.model.tpm.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 维修记录
 * @author: zhangweiyan
 * @date: 2025/05/09 18:11
 */
@Data
@ApiModel("维修记录")
public class RepairRecordVo {
    private String id;

    @ApiModelProperty("设备id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("设备等级")
    private String deviceLevel;

    @ApiModelProperty("设备类型id")
    private String deviceTypeId;

    @ApiModelProperty("设备类型")
    private String deviceTypeName;

    @ApiModelProperty("设备型号id")
    private String deviceModelId;

    @ApiModelProperty("设备型号")
    private String deviceModelName;

    @ApiModelProperty("生产单元id")
    private String factoryModeId;

    @ApiModelProperty("生产单元名称")
    private String factoryModeName;

    @ApiModelProperty("维修人员id")
    private String repairUserId;

    @ApiModelProperty("维修人员")
    private String repairUserName;

    @ApiModelProperty("协助人员id")
    private String dispatchAssistUserId;

    @ApiModelProperty("协助人员名称")
    private String dispatchAssistUserName;

    @ApiModelProperty("维修完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime repairEndTime;

    @ApiModelProperty("故障类型")
    private String typeId;

    @ApiModelProperty("故障类型")
    private String typeName;

    @ApiModelProperty("故障现象")
    private String callRepairContent;

    @ApiModelProperty("故障分析")
    private String reasonAnalysis;

    @ApiModelProperty("维修指导")
    private String repairContent;

    @ApiModelProperty("维修单号")
    private String repairCode;

    @ApiModelProperty("报修文件")
    private String enclosureIds;

    @ApiModelProperty("报修文件列表")
    private List<CommonFile> fileList;
}