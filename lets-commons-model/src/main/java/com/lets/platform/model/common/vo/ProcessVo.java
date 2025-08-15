package com.lets.platform.model.common.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

/**
 * 工序定义Vo
 */
@Data
@ApiModel("工序定义反参")
public class ProcessVo extends BaseDo {

    @ApiModelProperty(value = "工序编码")
    private String code;
    @ApiModelProperty(value = "工序名称")
    private String name;

    @ApiModelProperty(value = "准备时长")
    private String readyDuration;

    @ApiModelProperty(value = "标准工时")
    private String standardDuration;

    @ApiModelProperty(value = "报工方式")
    private String reportWay;
    @ApiModelProperty(value = "报工方式名称")
    private String reportWayName;

    @ApiModelProperty(value = "质检标准")
    private String checkStandard;
    @ApiModelProperty(value = "质检标准编码")
    private String checkStandardCode;
    @ApiModelProperty(value = "质检标准名称")
    private String checkStandardName;
    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(value = "状态名称")
    private String statusName;
    @ApiModelProperty(value = "设备id")
    private String deviceId;
    public BigDecimal getStandardDurationNotBlank() {
        if (StringUtils.isBlank(this.standardDuration)) {
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(this.standardDuration);
        }
    }
}
