package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 数据源
 * @author DING WEI
 * @since 2024-01-16
 */
@Getter
@Setter
@TableName("common_datasource")
@ApiModel(value = "CommonDatasource对象", description = "数据源")
public class CommonDatasource extends BaseEntity {

    @ApiModelProperty("数据源名称")
    @TableField("name")
    private String name;

    /**
     * @see com.lets.platform.model.common.enums.DatasourceTypeEnum
     */
    @ApiModelProperty("数据库类型[1MySQL,2ORACLE,3Sqlserver]")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("数据源服务ip地址")
    @TableField("server_ip")
    private String serverIp;

    @ApiModelProperty("端口号（从0到65535）")
    @TableField("server_port")
    private Integer serverPort;

    @ApiModelProperty("数据库名称")
    @TableField("db_name")
    private String dbName;

    @ApiModelProperty("驱动")
    @TableField("driver_name")
    private String driverName;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty("密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("数据源地址")
    @TableField("server_url")
    private String serverUrl;

    @ApiModelProperty("(oracle连接方式)1-SID,2-SERVICE,3-TNS")
    @TableField("connect_type")
    private String connectType;

    @ApiModelProperty("oracle服务名或SID")
    @TableField("service_name")
    private String serviceName;

    @ApiModelProperty("是否可以连接[0否,1是]")
    @TableField("can_connection")
    private Integer canConnection;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("状态 0:禁用 1:启用")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean needCheck;
}
