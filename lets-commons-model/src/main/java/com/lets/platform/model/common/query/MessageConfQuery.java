package com.lets.platform.model.common.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 消息配置查询参数
 *
 * @version 1.0
 * @ClassName MessageConfQuery
 * @author: QIAO
 * @create: 2021/08/17 15:13
 **/
@Data
@ApiModel("消息配置查询参数")
public class MessageConfQuery {
    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @ApiModelProperty("消息类型")
    private String configType;
    @ApiModelProperty("配置状态")
    private String configStatus;
}
