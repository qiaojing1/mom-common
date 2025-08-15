package com.lets.platform.model.common.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Etl组件字段列表查询对象
 * @author: DING WEI
 * @date: 2022/7/5 10:08
 */
@Data
@ApiModel("Etl组件字段列表 查询对象")
public class EtlComposeFieldQuery {

    @ApiModelProperty("设计资源主键")
    private String designId;

    @ApiModelProperty("节点XML主键")
    private List<String> xmlId;

}
