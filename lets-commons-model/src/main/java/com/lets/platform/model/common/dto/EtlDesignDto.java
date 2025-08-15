package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Etl涉及资源 数据传输对象
 * @author: DING WEI
 * @date: 2022/6/24 11:01
 */
@Data
@ApiModel("Etl涉及资源 数据传输对象")
public class EtlDesignDto {

    @NotBlank(message = "etlDesign.id", groups = {Save.class, Update.class})
    @ApiModelProperty("主键")
    private String id;

    @NotBlank(message = "etlDesign.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    private String name;

    @NotBlank(message = "etlDesign.content", groups = {Save.class, Update.class})
    @ApiModelProperty("xml")
    private String content;

}
