package com.lets.platform.model.common.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 系统参数反参
 *
 * @version 1.0
 * @ClassName SysParamVo
 * @author: Qiao
 * @create: 2021/09/01 17:50
 **/
@Data
@ApiModel("系统参数入参")
public class ParamVo extends BaseDo {
    private String id;
    @ApiModelProperty(value = "系统参数名称")
    private String name;
    @ApiModelProperty(value = "系统参数编码")
    private String code;
    @ApiModelProperty(value = "系统参数值")
    private String value;

//    @JsonSerialize(using = JSONColSerializer.class)
    // 加了上面的注解,返回 前端的是序列化好的对象,List或者Map;不加的话,返回的就是一个字符串
    private String jsonValue;
    @ApiModelProperty(value = "系统参数备注")
    private String remark;
    private String tenancyId;
    private String status;
}
