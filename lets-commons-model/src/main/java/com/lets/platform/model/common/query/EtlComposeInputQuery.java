package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Etl输入组件 查询对象
 * @author: DING WEI
 * @date: 2022/6/25 14:11
 */
@Data
@ApiModel("Etl输入组件 查询对象")
public class EtlComposeInputQuery extends PageQuery {

    @ApiModelProperty("输入组件主键")
    private String id;
    @ApiModelProperty(hidden = true)
    private String unId;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("设计资源主键")
    private String designId;

    @ApiModelProperty("XML节点主键")
    private String xmlId;

    @ApiModelProperty("输入组件类型")
    private String type;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
