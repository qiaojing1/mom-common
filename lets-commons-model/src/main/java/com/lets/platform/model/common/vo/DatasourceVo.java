package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 数据源 展示对象
 * @author: DING WEI
 * @date: 2022/5/12 10:15
 */
@Data
@ApiModel("数据源 展示对象")
public class DatasourceVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("数据源名称")
    private String name;

    /**
     * 数据库类型[1mysql，2oracle，3sqlserver]
     * @see com.lets.platform.model.common.enums.DatasourceTypeEnum
     */
    @ApiModelProperty("数据库类型[1mysql，2oracle，3sqlserver]")
    private String type;
    private String typeName;

    @ApiModelProperty("数据源IP地址")
    private String serverIp;

    @ApiModelProperty("数据源端口号")
    private Integer serverPort;

    @ApiModelProperty("数据库名称")
    private String dbName;

    @ApiModelProperty("驱动")
    private String driverName;

    @ApiModelProperty("数据源地址")
    private String serverUrl;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("(ORACLE连接方式)")
    private String connectType;

    @ApiModelProperty("ORACLE服务名或sid")
    private String serviceName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("状态 0:禁用 1:启用")
    private String status;

    @ApiModelProperty("是否删除[n否y是]")
    private String deleted;

    @ApiModelProperty("租户")
    private String tenancyId;

}