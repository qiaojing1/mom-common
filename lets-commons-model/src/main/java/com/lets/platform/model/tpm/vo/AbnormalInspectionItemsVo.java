package com.lets.platform.model.tpm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 异常点检|保养项目|巡检项目分析
 * @author: zhangweiyan
 * @date: 2024/12/23 11:55
 */
@Data
@ApiModel("异常点检|保养项目|巡检项目分析")
public class AbnormalInspectionItemsVo {

    @ApiModelProperty("序号")
    private Integer lineNumber;

    @ApiModelProperty("明细id")
    private String id;

    @ApiModelProperty("单头id")
    private String orderId;

    @ApiModelProperty("巡检范围")
    private String parentName;

    @ApiModelProperty("巡检路线")
    private String routeName;

    @ApiModelProperty("设备id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("生产单元")
    private String productUnitName;

    @ApiModelProperty("点检|保养|巡检单号")
    private String code;

    @ApiModelProperty("点检|保养|巡检时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime inspectionTime;

    @ApiModelProperty("点检|保养|巡检人员")
    private String inspectionUserName;

    @ApiModelProperty("点检|保养|巡检项目")
    private String itemName;

    @ApiModelProperty("点检|保养|巡检结果")
    private String result;

}
