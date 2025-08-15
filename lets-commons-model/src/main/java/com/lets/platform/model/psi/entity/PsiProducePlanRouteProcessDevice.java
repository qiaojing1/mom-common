package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 计划订单-工艺路线-明细-工序信息-加工设备-副本
 * @author DING WEI
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("psi_produce_plan_route_process_device")
@ApiModel(value = "PsiProducePlanRouteProcessDevice对象", description = "计划订单-工艺路线-明细-工序信息-加工设备-副本")
public class PsiProducePlanRouteProcessDevice extends BaseEntity {

    @ApiModelProperty("计划订单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("计划订单明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("工艺路线主键")
    @TableField("route_id")
    private String routeId;

    @ApiModelProperty("工艺路线明细主键")
    @TableField("route_detail_id")
    private String routeDetailId;

    @ApiModelProperty("工艺路线-工序关联主键")
    @TableField("route_process_id")
    private String routeProcessId;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("设备类型")
    @TableField("device_type_id")
    private String deviceTypeId;

    @ApiModelProperty("设备类型名称")
    @TableField("device_type_name")
    private String deviceTypeName;

    @ApiModelProperty("设备型号")
    @TableField("device_model_id")
    private String deviceModelId;

    @ApiModelProperty("设备型号名称")
    @TableField("device_model_name")
    private String deviceModelName;
}
