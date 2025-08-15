package com.lets.platform.model.common.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @description: 日志实体
 * @author: DING WEI
 * @date: 8/17/21 10:41 AM
 */
@Data
@TableName("common_log")
public class LogDoVo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 5756899973275190650L;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人姓名")
    private String createUserName;

    @ApiModelProperty("请求IP")
    private String requestIp;

    @ApiModelProperty("所属菜单名称")
    private String belongMenuName;

    @ApiModelProperty("触发事件")
    private String triggerEvent;

    @ApiModelProperty("调用参数")
    private String requestParameter;

    @ApiModelProperty("异常信息")
    private String exception;

    @ApiModelProperty("业务名称")
    /** 业务名称 */
    private String name;
    @ApiModelProperty("日志类型")
    /** 日志类型:登录日志;系统日志; */
    private String type;
    @ApiModelProperty("所属菜单")
    private String belongMenu;


    @ApiModelProperty("请求地址")
    private String requestUrl;

    @ApiModelProperty("请求方法类型")
    private String requestType;

    @ApiModelProperty("调用类")
    private String requestClass;

    @ApiModelProperty("调用方法")
    private String requestMethod;

    @ApiModelProperty("消耗时间")
    private Long consumeTime;

    @ApiModelProperty("是否成功")
    private boolean success;


    @ApiModelProperty("mac地址")
    private String macAddress;

    @ApiModelProperty("处理时长")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal solvedTime;

    @ApiModelProperty("处理后工单状态")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String afterOperateOrderStatus;

    @ApiModelProperty("工单操作名称")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String operateName;


}
