package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Etl输出组件 查询对象
 * @author: DING WEI
 * @date: 2022/6/25 16:14
 */
@Data
@ApiModel("Etl输出组件 查询对象")
public class EtlComposeOutputQuery extends PageQuery {

    @ApiModelProperty("输出组件主键")
    private String id;
    @ApiModelProperty(hidden = true)
    private String unId;

    @ApiModelProperty("etl设计主键")
    private String designId;

    @ApiModelProperty("xml节点主键")
    private String xmlId;

    /**
     * 类型[1表]
     * @see com.lets.platform.model.common.enums.EtlComposeOutputTypeEnum
     */
    @ApiModelProperty("类型[1表]")
    private String type;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("数据源")
    private String datasourceId;

    @ApiModelProperty("表名称")
    private String tableName;

    @ApiModelProperty("更新方式[1数据附加，2数据覆盖]")
    private String updateType;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
