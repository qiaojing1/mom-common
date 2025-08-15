package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * 系统参数入参
 *
 * @version 1.0
 * @ClassName SysParamDto
 * @author: Qiao
 * @create: 2021/09/01 17:50
 **/
@Data
@ApiModel("系统参数入参")
public class ParamDto {

    @NotBlank(message = "ParamDto.id", groups = {Update.class})
    private String id;

    @ApiModelProperty(value = "系统参数名称",required = true)
    @Length(min = 1, max = 20, message = "ParamDto.name", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty(value = "系统参数编码",required = true)
    @Length(min = 1, max = 50, message = "ParamDto.code", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty(value = "系统参数值",required = true)
    @Length(min = 1, max = 20, message = "ParamDto.value", groups = {Save.class, Update.class})
    private String value;

    @ApiModelProperty("JSON类型的值")
    private String jsonValue;

    @ApiModelProperty(value = "系统参数备注")
    @Length(max = 50, message = "ParamDto.remark", groups = {Save.class, Update.class})
    private String remark;
}