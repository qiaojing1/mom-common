package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Etl设计资源另存为 数据传输对象
 * @author: DING WEI
 * @date: 2022/7/7 19:15
 */
@Data
@ApiModel("Etl设计资源另存为 数据传输对象")
public class DesignSaveAsDto {

    @NotBlank(message = "designSaveAs.designId")
    @ApiModelProperty("设计资源主键")
    private String designId;

    @NotBlank(message = "designSaveAs.saveAsName")
    @ApiModelProperty("另存为名称")
    private String saveAsName;

}
