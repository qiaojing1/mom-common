package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @description: 日志实体
 * @author: DING WEI
 * @date: 8/17/21 10:41 AM
 */
@Data
@TableName("common_log")
public class LogDo extends BaseEntity implements Serializable{

    private static final long serialVersionUID = 5756899973275190650L;

    @ColumnWidth(50)
    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @OrderBy(sort = 0)
    @ExcelProperty("操作时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人姓名")
    @TableField(value = "create_user_name", fill = FieldFill.INSERT)
    @ExcelProperty("操作账号")
    @ColumnWidth(50)
    private String createUserName;

    @ApiModelProperty("请求IP")
    @TableField("request_ip")
    @ExcelProperty("IP地址")
    @ColumnWidth(50)
    private String requestIp;

    @ApiModelProperty("所属菜单名称")
    @TableField("belong_menu_name")
    @ExcelProperty("功能菜单")
    @ColumnWidth(50)
    private String belongMenuName;

    @ApiModelProperty("触发事件")
    @TableField("trigger_event")
    @ExcelProperty("触发事件")
    @ColumnWidth(50)
    private String triggerEvent;

    @ApiModelProperty("调用参数")
    @TableField("request_parameter")
    @ColumnWidth(50)
    private String requestParameter;


    @ApiModelProperty("异常信息")
    @TableField("exception")
    @ExcelProperty("返回信息")
    @ColumnWidth(50)
    private String exception;

    @ApiModelProperty("业务名称")
    @TableField("name")
    @ExcelIgnore
    /** 业务名称 */
    private String name;
    @ApiModelProperty("日志类型")
    @TableField("type")
    @ExcelIgnore
    /** 日志类型:登录日志;系统日志; */
    private String type;
    @ApiModelProperty("所属菜单")
    @TableField("belong_menu")
    @ExcelIgnore
    private String belongMenu;




    @ApiModelProperty("请求地址")
    @TableField("request_url")
    @ExcelIgnore
    private String requestUrl;

    @ApiModelProperty("请求方法类型")
    @TableField("request_type")
    @ExcelIgnore
    private String requestType;

    @ApiModelProperty("调用类")
    @TableField("request_class")
    @ExcelIgnore
    private String requestClass;

    @ApiModelProperty("调用方法")
    @TableField("request_method")
    @ExcelIgnore
    private String requestMethod;






    @ApiModelProperty("消耗时间")
    @TableField("consume_time")
    @ExcelIgnore
    private Long consumeTime;

    @ApiModelProperty("是否成功")
    @TableField("success")
    @ExcelIgnore
    private boolean success;


    @ApiModelProperty("mac地址")
    @TableField(exist = false)
    @ExcelIgnore
    private String macAddress;


}
