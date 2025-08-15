package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 数据源 查询对象
 * @author: DING WEI
 * @date: 2022/5/12 10:15
 */
@Data
@ApiModel("数据源 查询对象")
public class DatasourceQuery extends PageQuery {

    @ApiModelProperty("主键")
    private String id;
    @ApiModelProperty(hidden = true)
    private String excludeId;

    @ApiModelProperty("数据源名称")
    private String name;
    @ApiModelProperty("数据源名称(模糊查询)")
    private String nameLike;

    /**
     * 数据库类型[1mysql，2oracle，3sqlserver]
     * @see com.lets.platform.model.common.enums.DatasourceTypeEnum
     */
    @ApiModelProperty("数据库类型[1mysql，2oracle，3sqlserver]")
    private String type;

    @ApiModelProperty("数据源IP地址")
    private String serverIp;

    @ApiModelProperty("数据源端口号")
    private Integer serverPort;

    @ApiModelProperty("数据库名称")
    private String dbName;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("(oracle连接方式)")
    private String connectType;

    @ApiModelProperty("ORACLE服务名或sid")
    private String serviceName;

    @ApiModelProperty("状态 0:禁用 1:启用")
    private String status;

    @ApiModelProperty("是否删除[N否Y是]")
    private String deleted;

    @ApiModelProperty(value = "租户", hidden = true)
    private String tenancyId;

}