package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.base.BaseDo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * 工序定义Dto
 */
@Data
@ApiModel("工序定义入参")
public class ProcessDto extends BaseDo {
    @NotBlank(message = "ProcessDto.id", groups = {Update.class})
    private String id;
    @ApiModelProperty(value = "工序编码",required = true)
    private String code;
    @ApiModelProperty(value = "工序名称",required = true)
    @Length(min = 1, max = 20, message = "ProcessDto.name", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty(value = "准备时长")
    @Length(min = 1, max = 20, message = "ProcessDto.readyDuration", groups = {Save.class, Update.class})
    private String readyDuration;

    @ApiModelProperty(value = "标准工时")
    @Length(min = 1, max = 20, message = "ProcessDto.standardDuration", groups = {Save.class, Update.class})
    private String standardDuration;

    @ApiModelProperty(value = "报工方式")
    @Length(min = 1, max = 20, message = "ProcessDto.reportWay",  groups = {Save.class, Update.class})
    private String reportWay;

    @ApiModelProperty(value = "质检标准")
    @Length(min = 1, max = 20, message = "ProcessDto.checkStandard",  groups = {Save.class, Update.class})
    private String checkStandard;

    @ApiModelProperty(hidden = true)
    private String status;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    private String menuCode;

    @ApiModelProperty(value = "关联设备")
    private List<ProcessDeviceRelationDto> processDeviceRelations;

}
